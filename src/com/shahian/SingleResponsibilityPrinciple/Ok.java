package com.shahian.SingleResponsibilityPrinciple;

import com.shahian.model.Student;
import com.shahian.model.Teacher;



public class Ok {
    public void university() {
        Student student = new Student();
        student.setId(10);
        student.setName("shahian");
        student.setAge("38");
        student.setMajor("software");

        Teacher teacher = new Teacher();
        teacher.setId(10);
        teacher.setName("ahmadi");
        teacher.setCourse("java");
        Registration(student);
        ChooseUniversityCourse(teacher, student);

    }
    private void Registration(Student student) {
        System.out.println("Registration in university");
        System.out.println(
                "student with  id  " + student.getId() + " " +
                        "and name : " + student.getName() +
                        " in  major : " + student.getMajor() +
                        " registered IN University"
        );
    }
    private void ChooseUniversityCourse(Teacher teacher, Student student) {
        System.out.println("Choosing a university course");
        System.out.println(
                "student with  id  " + student.getId() + " " +
                        "choose the  : " + teacher.getCourse() +
                        " with teacher's name  : " + teacher.getName()

        );
    }


}
