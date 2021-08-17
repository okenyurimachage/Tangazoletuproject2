package com.project.CasualLabourerDetails.repository;

import com.project.CasualLabourerDetails.model.Labourer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LabourerRepository extends JpaRepository<Labourer, Long> {

    Optional<Labourer> findLabourerById(Long id);

    void deleteLabourerById(Long id);
}
