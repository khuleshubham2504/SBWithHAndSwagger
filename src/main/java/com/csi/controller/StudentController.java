package com.csi.controller;


import com.csi.model.Student;
import com.csi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Student student){
        studentService.saveData(student);
        return ResponseEntity.ok("Data saved successfully");
    }

    @PostMapping("/getdatabyanyname")
    public ResponseEntity< List<Student>> getDataByAnyName(@RequestBody Student student){
        return  ResponseEntity.ok(studentService.getDataByAnyName(student));
    }
}
