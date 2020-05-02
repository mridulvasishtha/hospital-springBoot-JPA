package com.mridul.hospital.hospitalmutimodule.model;

import com.mridul.hospital.hospitalmutimodule.enums.EStaff;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Doctor extends Staff {
    @Enumerated(EnumType.STRING)
    @Column(name = "staff_type")
    private EStaff staffType;
    @ManyToMany(cascade = CascadeType.PERSIST,fetch=FetchType.EAGER)
    @JoinTable(name = "Doctor_speciality_binding", joinColumns = @JoinColumn(name = "doctor_id")
            , inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    public Doctor(String firstName, String lastName, String phone, Integer staffId, EStaff staffType) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phone);
        this.setStaffId(staffId);
        this.setStaffType(staffType);
    }

    public Doctor(String firstName, String lastName, String phone, Integer staffId, EStaff staffType,Set speciallities) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phone);
        this.setStaffId(staffId);
        this.setStaffType(staffType);
        this.setSpecialities(speciallities);
    }

}