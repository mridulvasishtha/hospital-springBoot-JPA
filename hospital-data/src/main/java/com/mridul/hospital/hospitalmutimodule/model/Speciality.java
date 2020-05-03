package com.mridul.hospital.hospitalmutimodule.model;

import com.mridul.hospital.hospitalmutimodule.enums.ESpeciality;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="speciality")
@NoArgsConstructor
public class Speciality extends BaseEntity{
    public Speciality(ESpeciality specialities, String description) {
        this.specialities = specialities;
        this.description = description;
    }

    @Enumerated(EnumType.STRING)
    @JoinColumn(name="speciality")
    private ESpeciality specialities;

    private String description;
}
