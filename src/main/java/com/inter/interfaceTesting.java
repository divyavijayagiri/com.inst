package com.inter;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pojo.Student;

public interface interfaceTesting {
	public boolean user(Student stu);
	public boolean login(Student stu);

}
