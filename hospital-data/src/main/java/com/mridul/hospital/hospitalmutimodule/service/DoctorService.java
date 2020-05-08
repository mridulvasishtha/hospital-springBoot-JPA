package com.mridul.hospital.hospitalmutimodule.service;

import com.mridul.hospital.hospitalmutimodule.enums.ESpeciality;
import com.mridul.hospital.hospitalmutimodule.enums.EStaff;
import com.mridul.hospital.hospitalmutimodule.model.Doctor;
import com.mridul.hospital.hospitalmutimodule.model.Speciality;
import com.mridul.hospital.hospitalmutimodule.repo.DoctorRepo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class DoctorService {
    final private DoctorRepo doctorRepo;

    public DoctorService(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }

    public Doctor getDoctorByName(final String docName){
        Optional<Doctor> doctorDetails=doctorRepo.findByFirstName(docName);
        return doctorDetails.get();
    }

    public Doctor addDoctor(String firstName, String lastName, String phone, Integer staffId, String type,String speciality) {
    Speciality sp=new Speciality(ESpeciality.valueOf(speciality),"Speciality added with doctor") ;
    Set<Speciality> set=new HashSet<>();
        set.add(sp);
        Doctor d=new Doctor(firstName,lastName,phone,staffId, EStaff.valueOf(type),set);

        return doctorRepo.save(d);
    }

    public String removeDoctor(String firstName) {
        Optional<Doctor> doctorDetails=doctorRepo.findByFirstName(firstName);

        doctorRepo.delete(doctorDetails.get());
        return "done";
    }

    public String getDoctorSurname(String name) {
        Optional<Doctor> doctorDetails=doctorRepo.findByFirstName(name);
        return doctorDetails.get().getLastName();
    }
}
