package com.cts.connect_project.service;
import java.util.List;

import com.cts.connect_project.bean.Batch;
import com.cts.connect_project.bean.Login;
import com.cts.connect_project.bean.Register;
public interface RegisterService {
       public boolean registerUser(Register bean);
       public List<Register> getAllTeachers();
       public List<Register> getAllStudents();
       public Register findTeacher(String userid);
       public Register findStudent(String userid);
       public Batch findBatch(String userid);
}

