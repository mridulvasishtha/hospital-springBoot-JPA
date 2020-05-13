package com.mridul.hospital.hospitalmutimodule.service;

import com.mridul.hospital.hospitalmutimodule.config.ExternalCall;
import com.mridul.hospital.hospitalmutimodule.model.AddStaffRequestModel;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    private final ExternalCall externalCall;

    public StaffService(ExternalCall externalCall) {
        this.externalCall = externalCall;
    }

    public String addStaff(AddStaffRequestModel addStaffRequestModel) {
        System.out.println("Inside hospital");
        return externalCall.postVerbRequest(addStaffRequestModel, "staff/add");
    }
}