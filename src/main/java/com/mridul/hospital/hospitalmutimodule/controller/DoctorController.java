package com.mridul.hospital.hospitalmutimodule.controller;

import com.mridul.hospital.hospitalmutimodule.model.Doctor;
import com.mridul.hospital.hospitalmutimodule.service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping(value="/addDoctor/{firstName}/{lastName}/{phone}/{staffId}/{type}/{speciality}")
    public Doctor addDoctor(@PathVariable("firstName")String firstName,@PathVariable("lastName")String lastName,@PathVariable("phone")String phone,
                            @PathVariable("staffId")Integer staffId,@PathVariable("type")String type,@PathVariable("speciality")String speciality){
        System.out.println("Ayya si");
        return doctorService.addDoctor(firstName,lastName,phone,staffId,type,speciality);
    }

    @ResponseBody
    @RequestMapping(value="/removeDoctor/{firstName}")
    public String removeDoctor(@PathVariable("firstName")String firstName){
        System.out.println("Ayya si");
        return doctorService.removeDoctor(firstName);
    }
}
