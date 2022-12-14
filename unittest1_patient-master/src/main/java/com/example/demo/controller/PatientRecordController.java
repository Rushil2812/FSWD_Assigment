package com.example.demo.controller;

import com.example.demo.model.PatientRecord;
import com.example.demo.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PatientRecordController {

    @Autowired
    PatientRecordRepository patientRecordRepository;

    @GetMapping("/patient")
    public List<PatientRecord> showAll(){
        return patientRecordRepository.findAll();
    }

    @GetMapping()
    public String getWelcome()
    {
        return "<h1>Welcome Here<h1>";
    }
    @PostMapping("/patient")
    public String addStudent(@RequestBody PatientRecord patient){
            patientRecordRepository.save(patient);
            return "Record saved Successfully";

    }

    @DeleteMapping("/patient/{id}")
    public String deleteStudent(@PathVariable Long id) {
        boolean studentExist =patientRecordRepository.existsById(id);
        if(studentExist) {
            patientRecordRepository.deleteById((id));
            return "Deleted Successfully";
        }
        else {
            return "Record Doesn't exist";
        }
    }

    @PutMapping("/patient/{id}")
    public String updateStudent(@RequestBody PatientRecord patient, @PathVariable Long id) {
        PatientRecord studentObj = patientRecordRepository.findById((id)).get();
        studentObj.setName(patient.getName());
        studentObj.setAge(patient.getAge());
        studentObj.setAddress(patient.getAddress());
        patientRecordRepository.save(studentObj);
//        studentRepository.save(studentObj);
        return "Record is updated";
    }

    @GetMapping("/patient/{id}")
    public PatientRecord getStudent(@PathVariable Long id) {
        return patientRecordRepository.findById((id)).get();
    }
}
