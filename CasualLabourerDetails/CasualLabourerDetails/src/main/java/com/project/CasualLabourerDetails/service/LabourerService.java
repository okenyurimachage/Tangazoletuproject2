package com.project.CasualLabourerDetails.service;

import com.project.CasualLabourerDetails.exception.UserNotFoundException;
import com.project.CasualLabourerDetails.model.Labourer;
import com.project.CasualLabourerDetails.repository.LabourerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class LabourerService {
    private final LabourerRepository labourerRepository;

    @Autowired
    public LabourerService(LabourerRepository labourerRepository) {
        this.labourerRepository = labourerRepository;
    }

    public Labourer addLabourer(Labourer labourer) {
        labourer.setWorktagcode(UUID.randomUUID().toString());
        return labourerRepository.save(labourer);
    }

    public List<Labourer> findAllLabourers() {
        return labourerRepository.findAll();
    }

    public Labourer updateLabourer(Labourer labourer) {
        return labourerRepository.save(labourer);
    }

    public Labourer  findLabourerById(Long id) {
        return labourerRepository.findLabourerById(id)
                .orElseThrow(() ->  new UserNotFoundException("Labourer with id " + id + " was not found"));
    }

    public void deleteLabourer(Long id){
        labourerRepository.deleteLabourerById(id);
    }

    }