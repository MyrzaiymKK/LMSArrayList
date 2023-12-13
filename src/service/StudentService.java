package service;

import Groups.Lessons;
import Groups.Student;

import java.util.ArrayList;

public interface StudentService {
   void addnewStudent();
    String updateStudent();
    ArrayList<Student> getStudentByName();
    ArrayList<Student> getAllStudentByGroupName();
    ArrayList<Lessons> getAllStudentsLesson();
    String deleteStudentByEmail();

}
