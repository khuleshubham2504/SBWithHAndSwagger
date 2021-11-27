package com.csi.dao;

import com.csi.model.Student;

import java.util.List;

public interface StudentDao {

    public void saveData(Student student);
    public List<Student> getDataByAnyName(Student student);
}
