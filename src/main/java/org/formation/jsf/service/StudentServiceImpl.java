package org.formation.jsf.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.formation.jsf.dao.IStudentDao;
import org.formation.jsf.model.Student;

@Named
public class StudentServiceImpl implements IStudentService, Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private IStudentDao studentDao; 
	
	@PostConstruct
	public void initService() {
		System.out.println(this.getClass().getName() + "Je suis construit");
	}
	
	@Override
	public List<Student> getStudents() throws Exception {
		List<Student> list = new ArrayList<>();
		list = studentDao.getStudents();
		return list;
	}

	@Override
	public void addStudent(Student student) throws Exception {
		studentDao.addStudent(student);
		
	}

	@Override
	public Student getStudent(int id) throws Exception {
		Student student = studentDao.getStudent(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		studentDao.updateStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) throws Exception {
		studentDao.deleteStudent(id);
		
	}

}
