package com.kubetrade.instrument;

import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface InstrumentMapper {

    InstrumentEntity toEntity(Instrument domain);

    Instrument toDomain(InstrumentEntity entity);

}
