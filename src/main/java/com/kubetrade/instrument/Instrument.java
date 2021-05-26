package com.kubetrade.instrument;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Instrument {

    private Integer instrumentId;

    @NotNull
    private SecurityType securityType;

    @NotEmpty
    private String exchange;

    @NotEmpty
    private String contractSymbol;

    @NotEmpty
    private String symbol;

    @NotNull
    private BigDecimal uomQuantity;

    @NotNull
    private UOM uom;

    @NotNull
    private SettlementType settlementType;

    @NotNull
    private Currency currency;

    @NotEmpty
    private String mmy;

    @NotNull
    private LocalDate maturityDate;

    private List<InstrumentLeg> instrumentLegs = new ArrayList<>();

    public Integer getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Integer instrumentId) {
        this.instrumentId = instrumentId;
    }

    public SecurityType getSecurityType() {
        return securityType;
    }

    public void setSecurityType(SecurityType securityType) {
        this.securityType = securityType;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getContractSymbol() {
        return contractSymbol;
    }

    public void setContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getUomQuantity() {
        return uomQuantity;
    }

    public void setUomQuantity(BigDecimal uomQuantity) {
        this.uomQuantity = uomQuantity;
    }

    public UOM getUom() {
        return uom;
    }

    public void setUom(UOM uom) {
        this.uom = uom;
    }

    public SettlementType getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(SettlementType settlementType) {
        this.settlementType = settlementType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getMmy() {
        return mmy;
    }

    public void setMmy(String mmy) {
        this.mmy = mmy;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public List<InstrumentLeg> getInstrumentLegs() {
        return instrumentLegs;
    }

    public void setInstrumentLegs(List<InstrumentLeg> instrumentLegs) {
        this.instrumentLegs = instrumentLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(instrumentId, that.instrumentId) && securityType == that.securityType && Objects.equals(exchange, that.exchange) && Objects.equals(contractSymbol, that.contractSymbol) && Objects.equals(symbol, that.symbol) && Objects.equals(uomQuantity, that.uomQuantity) && uom == that.uom && settlementType == that.settlementType && currency == that.currency && Objects.equals(mmy, that.mmy) && Objects.equals(maturityDate, that.maturityDate) && Objects.equals(instrumentLegs, that.instrumentLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentId, securityType, exchange, contractSymbol, symbol, uomQuantity, uom, settlementType, currency, mmy, maturityDate, instrumentLegs);
    }

    @Override
    public String toString() {
        return "InstrumentEntity{" +
                "instrumentId=" + instrumentId +
                ", securityType=" + securityType +
                ", exchange='" + exchange + '\'' +
                ", contractSymbol='" + contractSymbol + '\'' +
                ", symbol='" + symbol + '\'' +
                ", uomQuantity=" + uomQuantity +
                ", uom=" + uom +
                ", settlementType=" + settlementType +
                ", currency=" + currency +
                ", mmy='" + mmy + '\'' +
                ", maturityDate=" + maturityDate +
                ", instrumentLegs=" + instrumentLegs +
                '}';
    }
}
