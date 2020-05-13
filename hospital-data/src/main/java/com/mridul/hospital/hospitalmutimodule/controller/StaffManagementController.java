package com.mridul.hospital.hospitalmutimodule.controller;

import com.mridul.hospital.hospitalmutimodule.model.AddStaffRequestModel;
import com.mridul.hospital.hospitalmutimodule.service.StaffService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffManagementController {
    private final StaffService staffService;

    public StaffManagementController(StaffService staffService) {
        this.staffService = staffService;
    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addStaff(@RequestBody @NonNull AddStaffRequestModel addStaffRequestModel) {
        return staffService.addStaff(addStaffRequestModel);
    }
}
