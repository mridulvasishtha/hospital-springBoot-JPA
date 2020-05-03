package com.mridul.hospital.hospitalmutimodule.model;

import com.mridul.hospital.hospitalmutimodule.enums.EDisease;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="patient")
@Getter
@Setter
public class Patient extends Person {
    @Enumerated(EnumType.STRING)
    @Column(name="disease")
    private EDisease disease;

    @Column(name="admitted")
    private Date admission;

    @Column(name="discharged")
    private Date discharged;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "patientId", fetch = FetchType.LAZY)
    //@Column(name="prescriptionId")
    private Set<Prescription> prescriptionSet=new HashSet<>();

}
