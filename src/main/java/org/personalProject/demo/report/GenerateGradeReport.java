//package org.personalProject.demo.report;
//
//import org.personalProject.demo.school.School;
//import org.personalProject.demo.school.Subject;
//
//import java.util.ArrayList;
//
//public class GenerateGradeReport {
//
//
//    School school = School.getInstance();
//
//    public static final String TITLE = " 수강생 학점 \t\t\n";
//    public static final String HEADER = " 이름 | 학번 | 필수과목| 점수 \n";
//    public static final String LINE = "================================\n";
//
//    private StringBuilder buffer = new StringBuffer();
//
//    public String getReport(){
//        ArrayList<Subject> subjectList = school.getSubjectList();
//
//        for(Subject subject : subjectList){
//            makeHeader(subject);
//            makeBody(subject);
//            makeFooter();
//        }
//        return buffer.toString();
//    }
//
//    public void makeHeader(Subject subject){
//        buffer.append(GenerateGradeReport.LINE);
//        buffer.append("\t"+subject.getSubjectName());
//        buffer.append(GenerateGradeReport.TITLE);
//        buffer.append(GenerateGradeReport.HEADER);
//        buffer.append(GenerateGradeReport.LINE);
//    }
//
//    public void makeBody(Subject subject){
//        ArrayList<Student> studentList = new ArrayList<Student>()
//    }
//}
