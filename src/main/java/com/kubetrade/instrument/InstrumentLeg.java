package com.kubetrade.instrument;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class InstrumentLeg {

    private Integer instrumentLegId;

    @NotNull
    private Instrument instrument;

    @NotNull
    private SecurityType securityType;

    @NotEmpty
    private String exchange;

    @NotEmpty
    private String contractSymbol;

    @NotEmpty
    private String symbol;

    @NotEmpty
    private String mmy;

    @NotNull
    private Side side;

    public Integer getInstrumentLegId() {
        return instrumentLegId;
    }

    public void setInstrumentLegId(Integer instrumentLegId) {
        this.instrumentLegId = instrumentLegId;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
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

    public String getMmy() {
        return mmy;
    }

    public void setMmy(String mmy) {
        this.mmy = mmy;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentLeg that = (InstrumentLeg) o;
        return Objects.equals(instrumentLegId, that.instrumentLegId) && Objects.equals(instrument, that.instrument) && securityType == that.securityType && Objects.equals(exchange, that.exchange) && Objects.equals(contractSymbol, that.contractSymbol) && Objects.equals(symbol, that.symbol) && Objects.equals(mmy, that.mmy) && side == that.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentLegId, instrument, securityType, exchange, contractSymbol, symbol, mmy, side);
    }

    @Override
    public String toString() {
        return "InstrumentLegEntity{" +
                "instrumentLegId=" + instrumentLegId +
                ", securityType=" + securityType +
                ", exchange='" + exchange + '\'' +
                ", contractSymbol='" + contractSymbol + '\'' +
                ", symbol='" + symbol + '\'' +
                ", mmy='" + mmy + '\'' +
                ", side=" + side +
                '}';
    }
    
}
