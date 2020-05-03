package com.mridul.hospital.hospitalmutimodule.enums;

public enum EDisease {
    FEVER("High Temperature"), JAUNDICE("Red Blood Cell"), MALARIA("Mosquito"), DENGUE("Anophiles Mosquito");
    final private String getCause;

    EDisease(String value) {
        this.getCause = value;
    }

    public String getCause(){
        return getCause;
    }
}
