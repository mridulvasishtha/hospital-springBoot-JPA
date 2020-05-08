package com.mridul.hospital.hospitalmutimodule.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Getter
@Setter
public class Staff extends Person {
    @Column(name="staff_Id")
    private Integer staffId;
}
