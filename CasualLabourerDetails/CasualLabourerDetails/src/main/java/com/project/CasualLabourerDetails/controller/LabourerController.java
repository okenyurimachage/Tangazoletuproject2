package com.project.CasualLabourerDetails.controller;

import com.project.CasualLabourerDetails.model.Labourer;
import com.project.CasualLabourerDetails.service.LabourerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/labourer")
public class LabourerController {

    private final LabourerService labourerService;

    public LabourerController(LabourerService labourerService) {
        this.labourerService = labourerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Labourer>> getAllLabourers () {
        List<Labourer> labourers = labourerService.findAllLabourers();
        return new ResponseEntity<>(labourers, HttpStatus.OK);
    }

        @GetMapping("/find/{id}")
        public ResponseEntity<Labourer> getLabourerById (@PathVariable("id") Long id) {
            Labourer labourer = labourerService.findLabourerById(id);
            return new ResponseEntity<>(labourer, HttpStatus.OK);
        }

        @PostMapping("/add")
        public ResponseEntity<Labourer> addLabourer(@RequestBody Labourer labourer) {
            Labourer newLabourer = labourerService.addLabourer(labourer);
            return new ResponseEntity<>(newLabourer, HttpStatus.CREATED);
        }

        @PutMapping("/update")
        public ResponseEntity<Labourer> updateLabourer(@RequestBody Labourer labourer) {
            Labourer updateLabourer = labourerService.updateLabourer(labourer);
            return new ResponseEntity<>(updateLabourer, HttpStatus.OK);
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<?> deleteLabourer(@PathVariable("id") Long id) {
            labourerService.deleteLabourer(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

