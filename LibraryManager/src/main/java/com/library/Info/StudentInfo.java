package com.library.Info;

import java.util.List;

import com.library.model.Student;

public interface StudentInfo {
	public void saveStudent(Student student);
	public List<Student>getStudentList();

}
