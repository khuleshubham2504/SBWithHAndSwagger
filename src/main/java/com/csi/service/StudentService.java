package com.csi.service;

import com.csi.model.Student;

import java.util.List;

public interface StudentService {
    public void saveData(Student student);
    public List<Student> getDataByAnyName(Student student);
}
