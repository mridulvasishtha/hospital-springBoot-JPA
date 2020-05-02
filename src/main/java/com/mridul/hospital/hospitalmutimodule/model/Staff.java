package com.mridul.hospital.hospitalmutimodule.model;

import com.mridul.hospital.hospitalmutimodule.enums.EDisease;
import com.mridul.hospital.hospitalmutimodule.enums.EStaff;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Getter
@Setter
public class Staff extends Person {
    @Column(name="staff_Id")
    private Integer staffId;
}
