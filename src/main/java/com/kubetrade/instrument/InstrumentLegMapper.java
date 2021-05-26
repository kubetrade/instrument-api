package com.kubetrade.instrument;

import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface InstrumentLegMapper {

    InstrumentLegEntity toEntity(InstrumentLeg domain);

    InstrumentLeg toDomain(InstrumentLegEntity entity);

}
