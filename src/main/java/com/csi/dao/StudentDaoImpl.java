package com.csi.dao;


import com.csi.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void saveData(Student student) {
        Session session= factory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(student);
        transaction.commit();

    }

    @Override
    public List<Student> getDataByAnyName(Student student) {

        Session session= factory.openSession();

        List<Student> stuList= new ArrayList<>();
        List<Student> studentList=session.createQuery("from Student").list();

        for(Student ss:studentList){
            if(ss.getStuId()==student.getStuId()||ss.getStuFirstName().equals(student.getStuFirstName())||ss.getStuLastName().equals(student.getStuLastName())
            ||ss.getStuAddress().equals(student.getStuAddress())||
                    ss.getStuEmail().equals(student.getStuEmail())||
                    ss.getStuContactNumber()==student.getStuContactNumber()){
                stuList.add(ss);
            }
        }
        return stuList;
    }
}
