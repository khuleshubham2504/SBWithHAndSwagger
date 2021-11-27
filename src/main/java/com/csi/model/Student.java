package com.csi.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="stu_info")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="stu_id")
    private int stuId;

    @Column(name="stu_first_name")
    private String stuFirstName;

    @Column(name="stu_last_name")
    private String stuLastName;

    @Column(name="stu_address")
    private String stuAddress;

    @Column(name="stu_contact_number", unique = true)
    private long stuContactNumber;

    @Column(name="stu_email", unique = true)
    private String stuEmail;

    @Column(name="stu_password")
    private String stuPassword;
}
