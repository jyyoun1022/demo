package org.personalProject.demo.school;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class School {

    private static School instance = new School();

    private static String SCHOOL_NAME = "GOOD SCHOOL";
    private ArrayList<Student> studentList = new ArrayList<>();//등록된 학생
    private ArrayList<Subject> subjectList = new ArrayList<>();//과목 리스트

    public static School getInstance(){
        if(instance == null)
            instance = new School();
        return instance;
    }

}
