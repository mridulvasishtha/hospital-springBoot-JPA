package com.mridul.hospital.hospitalmutimodule.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="prescription")
@Getter
@Setter
public class Prescription extends BaseEntity {
    @Column(name="date_of_prescription")
    private Date dateOfPrescription;

    @Column(name="doctor_id")
    private Integer doctorId;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient  patientId;

    @Column(name="prescription")
    private String prescription;
}