package org.personalProject.demo.school;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Student {
    private int studentID;//학번
    private String studentName;//이름
    private Subject majorSubject;//필수과목

    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentID, String studentName, Subject majorSubject) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score score){
        scoreList.add(score);
    }

}
