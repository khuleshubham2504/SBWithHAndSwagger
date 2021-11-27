package com.csi.service;


import com.csi.dao.StudentDao;
import com.csi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;
    @Override
    public void saveData(Student student) {
        studentDao.saveData(student);
    }

    @Override
    public List<Student> getDataByAnyName(Student student) {
        return studentDao.getDataByAnyName(student);
    }
}
