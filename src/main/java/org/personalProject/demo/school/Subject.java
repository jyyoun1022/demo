package org.personalProject.demo.school;

import lombok.Getter;
import lombok.Setter;
import org.personalProject.demo.utils.Define;

import java.util.ArrayList;

@Getter
@Setter
public class Subject {

    private String subjectName; //과목이름
    private int subjectId;  //과목 고유 번호
    private int gradeType;  //학점 평가 정책

    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;    //학점 평가 정책은 기본으로 A,B 방식을 사용함
    }

    public void register(Student student){
        studentList.add(student);
    }
}
