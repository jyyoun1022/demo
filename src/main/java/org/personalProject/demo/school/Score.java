package org.personalProject.demo.school;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Score {

    private int studentId;
    private Subject subject;
    private int point;

    public Score(int studentId, Subject subject, int point) {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Score{" +
                "학번=" + studentId +
                ", subject=" + subject.getSubjectName() +
                ", point=" + point +
                '}';
    }
}
