package com.kubetrade.instrument;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InstrumentRepository implements PanacheRepositoryBase<InstrumentEntity, Integer> {
}
