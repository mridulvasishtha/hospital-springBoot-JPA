package com.mridul.hospital.hospitalmutimodule.controller;

import com.mridul.hospital.hospitalmutimodule.model.Doctor;
import com.mridul.hospital.hospitalmutimodule.service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/doc")
public class DoctorController {
    final private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
    @ResponseBody
    @RequestMapping(value="/getDoctor/{dname}")
    public Doctor getDoctorByName(@PathVariable("dname") String name){
      return doctorService.getDoctorByName(name);
    }

    @ResponseBody
    @RequestMapping(value="/getSurname/{dname}")
    public String getDoctorSurname(@PathVariable("dname") String name){
        return doctorService.getDoctorSurname(name);
    }


    @ResponseBody
    @RequestMapping(value="/addDoctor/{firstName}")
    public Doctor addDoctor(@PathVariable("firstName")String firstName, @RequestParam(value="lastName",required=false)String lastName,
                            @RequestParam(value="phone",required=false)String phone,
                            @RequestParam(value="staffId")Integer staffId, @RequestParam(value="type",required = false)String type,
                            @RequestParam(value="speciality",required=false)String speciality){
        return doctorService.addDoctor(firstName,lastName,phone,staffId,type,speciality);
    }

    @ResponseBody
    @RequestMapping(value="/removeDoctor/{firstName}")
    public String removeDoctor(@PathVariable("firstName")String firstName){
        return doctorService.removeDoctor(firstName);
    }
}
