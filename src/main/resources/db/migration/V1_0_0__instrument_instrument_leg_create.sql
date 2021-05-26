CREATE TABLE instrument
(
    instrument_id   SERIAL PRIMARY KEY,
    security_type   TEXT    NOT NULL,
    exchange        TEXT    NOT NULL,
    contract_symbol TEXT    NOT NULL,
    symbol          TEXT    NOT NULL,
    uom_quantity    DECIMAL NOT NULL,
    uom             TEXT    NOT NULL,
    settlement_type TEXT    NOT NULL,
    currency        TEXT    NOT NULL,
    mmy             TEXT    NOT NULL,
    maturity_date   DATE    NOT NULL
);
ALTER SEQUENCE instrument_instrument_id_seq RESTART 1000000;

CREATE TABLE instrument_leg
(
    instrument_leg_id SERIAL PRIMARY KEY,
    instrument_id     INTEGER NOT NULL,
    security_type     TEXT    NOT NULL,
    exchange          TEXT    NOT NULL,
    contract_symbol   TEXT    NOT NULL,
    symbol            TEXT    NOT NULL,
    mmy               TEXT    NOT NULL,
    side              TEXT    NOT NULL,
    CONSTRAINT fk_instrument FOREIGN KEY (instrument_id) REFERENCES instrument (instrument_id)
);
ALTER SEQUENCE instrument_leg_instrument_leg_id_seq RESTART 1000000;

