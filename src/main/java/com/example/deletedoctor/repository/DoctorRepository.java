// File: src/main/java/com/example/deletedoctor/repository/DoctorRepository.java
package com.example.deletedoctor.repository;

import com.example.deletedoctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}