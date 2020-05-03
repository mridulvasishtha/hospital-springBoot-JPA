package com.mridul.hospital.hospitalmutimodule.enums;

public enum ESpeciality {
    CARDIOLOGIST("Heart"), PHYSIOLOGIST("Normal Doctor"),
    NEUROLOGIST("Doctor for neurons"), DENTIST("Teeth");
    final private String getCause;

    ESpeciality(String value) {
        this.getCause = value;
    }

    public String getCause() {
        return getCause;
    }
}
