package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;

public class MainClass {
	public static void main(String[] args) {
	
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(Course.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        
        c1.setCourseId(1);
        c1.setCourseName("Java");
        
        c2.setCourseId(2);
        c2.setCourseName("Python");
        
        c3.setCourseId(3);
        c3.setCourseName("Testing");
        
        List<Course> courses1 = new ArrayList<>();
        courses1.add(c1);
        courses1.add(c2);

        List<Course> courses2 = new ArrayList<>();
        courses2.add(c1);
        courses2.add(c3);
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setStudentId(101);
        s1.setName("Ganesh");
        s1.setCourses(courses1);
        
        s2.setStudentId(102);
        s2.setName("Rahul");
        s2.setCourses(courses2);
        
        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        
        List<Student> list2 = new ArrayList<>();
        list2.add(s1);
        
        List<Student> list3 = new ArrayList<>();
        list3.add(s2);
        c3.setStudents(list3);

        c1.setStudents(list1);
        c2.setStudents(list2);
        c3.setStudents(list3);
        
        ss.persist(c1);
        ss.persist(c2);
        ss.persist(c3);
        
        ss.persist(s1);
        ss.persist(s2);
        
        System.out.println("Inserted");
        
        tr.commit();
        ss.close();
	}
}
