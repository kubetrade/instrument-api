package com.kubetrade.instrument;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class InstrumentService {

    private InstrumentRepository instrumentRepository;
    private InstrumentMapper instrumentMapper;
    private InstrumentLegMapper instrumentLegMapper;

    public InstrumentService(InstrumentRepository instrumentRepository, InstrumentMapper instrumentMapper, InstrumentLegMapper instrumentLegMapper) {
        this.instrumentRepository = instrumentRepository;
        this.instrumentMapper = instrumentMapper;
        this.instrumentLegMapper = instrumentLegMapper;
    }

    public List<Instrument> findAll() {
        return instrumentRepository.findAll().stream()
                .map(instrumentMapper::toDomain)
                .collect(Collectors.toList());
    }

    public Optional<Instrument> findById(Integer id) {
        return instrumentRepository.findByIdOptional(id).map(instrumentMapper::toDomain);
    }

    @Transactional
    public Instrument save(Instrument instrument) {
        InstrumentEntity entity = instrumentMapper.toEntity(instrument);
        instrumentRepository.persist(entity);
        return instrumentMapper.toDomain(entity);
    }

    @Transactional
    public Instrument update(Instrument instrument) {
        if (instrument.getInstrumentId() == null) {
            throw new ServiceException("Instrument does not have a instrumentId");
        }
        Optional<InstrumentEntity> optional = instrumentRepository.findByIdOptional(instrument.getInstrumentId());
        if (optional.isEmpty()) {
            throw new ServiceException(String.format("No Instrument found for instrumentId[%s]", instrument.getInstrumentId()));
        }
        InstrumentEntity entity = optional.get();
        entity.setSecurityType(instrument.getSecurityType());
        entity.setExchange(instrument.getExchange());
        entity.setContractSymbol(instrument.getContractSymbol());
        entity.setSymbol(instrument.getSymbol());
        entity.setUomQuantity(instrument.getUomQuantity());
        entity.setUom(instrument.getUom());
        entity.setSettlementType(instrument.getSettlementType());
        entity.setCurrency(instrument.getCurrency());
        entity.setMmy(instrument.getMmy());
        entity.setMaturityDate(instrument.getMaturityDate());
        entity.setInstrumentLegs(instrument.getInstrumentLegs().stream().map(instrumentLegMapper::toEntity).collect(Collectors.toList()));
        instrumentRepository.persist(entity);
        return instrumentMapper.toDomain(entity);
    }

}
