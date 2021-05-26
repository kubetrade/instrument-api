package com.kubetrade.instrument;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity(name = "InstrumentLeg")
@Table(name = "instrument_leg")
public class InstrumentLegEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_leg_id")
    private Integer instrumentLegId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instrument_id", nullable = false)
    @NotNull
    private InstrumentEntity instrument;

    @Column(name = "security_type", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private SecurityType securityType;

    @Column(name = "exchange", nullable = false)
    @NotEmpty
    private String exchange;

    @Column(name = "contract_symbol", nullable = false)
    @NotEmpty
    private String contractSymbol;

    @Column(name = "symbol", nullable = false)
    @NotEmpty
    private String symbol;

    @Column(name = "mmy", nullable = false)
    @NotEmpty
    private String mmy;

    @Column(name = "side", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Side side;

    public Integer getInstrumentLegId() {
        return instrumentLegId;
    }

    public void setInstrumentLegId(Integer instrumentLegId) {
        this.instrumentLegId = instrumentLegId;
    }

    public InstrumentEntity getInstrument() {
        return instrument;
    }

    public void setInstrument(InstrumentEntity instrument) {
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
        InstrumentLegEntity that = (InstrumentLegEntity) o;
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
                ", instrument=" + instrument +
                ", securityType=" + securityType +
                ", exchange='" + exchange + '\'' +
                ", contractSymbol='" + contractSymbol + '\'' +
                ", symbol='" + symbol + '\'' +
                ", mmy='" + mmy + '\'' +
                ", side=" + side +
                '}';
    }

}
