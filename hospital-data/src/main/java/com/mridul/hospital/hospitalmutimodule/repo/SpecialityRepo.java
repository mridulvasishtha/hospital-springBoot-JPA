package com.mridul.hospital.hospitalmutimodule.repo;

import com.mridul.hospital.hospitalmutimodule.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepo extends JpaRepository<Speciality, Long> {

}
