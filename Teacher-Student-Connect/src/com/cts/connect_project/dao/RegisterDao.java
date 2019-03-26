package com.cts.connect_project.dao;

import java.util.List;

import com.cts.connect_project.bean.Batch;
import com.cts.connect_project.bean.Register;
import com.cts.connect_project.bean.Resource;

public interface RegisterDao {
       
       public boolean registerUser(Register register);
       public List<Register> getAllTeachers();
       public List<Register> getAllStudents();
       public Register findTeacher(String userid);
       public Register findStudent(String userid);
       public Batch findBatch(String userid);
}
