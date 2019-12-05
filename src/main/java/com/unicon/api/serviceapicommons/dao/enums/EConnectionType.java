package com.unicon.api.serviceapicommons.dao.enums;

public enum EConnectionType {
    SINGLE("SINGLE"),
    SDC("SDC"),
    CMD("CMD");

    private final String value;

    EConnectionType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
