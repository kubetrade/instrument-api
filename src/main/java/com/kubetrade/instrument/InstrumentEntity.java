package com.kubetrade.instrument;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "Instrument")
@Table(name = "instrument")
public class InstrumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_id")
    private Integer instrumentId;

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

    @Column(name = "uom_quantity", nullable = false)
    @NotNull
    private BigDecimal uomQuantity;

    @Column(name = "uom", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private UOM uom;

    @Column(name = "settlement_type", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private SettlementType settlementType;

    @Column(name = "currency", nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "mmy", nullable = false)
    @NotEmpty
    private String mmy;

    @Column(name = "maturity_date", nullable = false)
    @NotNull
    private LocalDate maturityDate;

    @OneToMany(
            mappedBy = "instrument",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<InstrumentLegEntity> instrumentLegs = new ArrayList<>();

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

    public List<InstrumentLegEntity> getInstrumentLegs() {
        return instrumentLegs;
    }

    public void setInstrumentLegs(List<InstrumentLegEntity> instrumentLegs) {
        this.instrumentLegs = instrumentLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentEntity that = (InstrumentEntity) o;
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
