package com.mridul.hospital.hospitalmutimodule.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class AccountCompositeKey implements Serializable {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "staff_Id")
    private Integer staffId;
}
