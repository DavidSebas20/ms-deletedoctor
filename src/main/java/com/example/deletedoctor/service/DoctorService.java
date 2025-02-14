// File: src/main/java/com/example/deletedoctor/service/DoctorService.java
package com.example.deletedoctor.service;

import com.example.deletedoctor.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public boolean deleteDoctor(Long id) {
        if (doctorRepository.existsById(id)) {
            doctorRepository.deleteById(id);
            return true; // Doctor eliminado exitosamente
        }
        return false; // Doctor no encontrado
    }
}