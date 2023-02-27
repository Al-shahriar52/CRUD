package com.hibernate.onetoonecrud.repository;

import com.hibernate.onetoonecrud.entity.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientDetails,Long> {

}
