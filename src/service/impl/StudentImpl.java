package service.impl;

import Dtabase.DataBase;
import Groups.Group;
import Groups.Lessons;
import Groups.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentImpl implements StudentService {


    @Override
    public void addnewStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Write name of group: ");
        String namm = scanner.nextLine();
        for (Group group : DataBase.groups) {
            if(group.getGroupName().equalsIgnoreCase(namm)){
                Student student = new Student();
                student.setID(MyGenerator.generatorStudent());
                System.out.println("Write firstName: ");
                String name = scanner1.nextLine();
                student.setFirstName(name);
                System.out.println("Write lastName: ");
                String namee = scanner1.nextLine();
                student.setLastName(namee);
                System.out.println("Write email: ");
                String email = scanner1.nextLine();
                student.setEmail(email);
                System.out.println("Write password: ");
                String pass = scanner1.nextLine();
                student.setPassword(pass);
                System.out.println("Write gender: ");
                String gender = scanner.nextLine();
                student.setGender(gender);
                System.out.println("Write groupName: ");
                String nameg = scanner.nextLine();
                student.setGroupName(nameg);
                group.students.add(student);
                System.out.println("Successfully added!");
            }
        }

    }

    @Override
    public String updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of student: ");
        String nam = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Student student : group.students) {
                if(student.getFirstName().equalsIgnoreCase(nam)){
                    System.out.println("Write new name of student: ");
                    student.setFirstName(scanner.nextLine());
                    return "Successfully!";
                }
            }
        }
        return "Not found! ";
    }

    @Override
    public ArrayList<Student> getStudentByName() {
        ArrayList<Student> linkk = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write name student: ");
        String name = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Student student : group.students) {
                if(student.getFirstName().equalsIgnoreCase(name)){
                    linkk.add(student);
                }
            }
        }
        return linkk;
    }

    @Override
    public ArrayList<Student> getAllStudentByGroupName() {
        ArrayList<Student> lik = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String namer = scanner.nextLine();
        for (Group group : DataBase.groups) {
            if(group.getGroupName().equalsIgnoreCase(namer)){
                for (Student student : group.students) {
                    lik.add(student);
                }
            }
        }
        return lik;
    }

    @Override
    public ArrayList<Lessons> getAllStudentsLesson() {
        ArrayList<Lessons> linp = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
        System.out.println("Write name of Student: ");
        String nameg = scanner.nextLine();
        for (Group group : DataBase.groups) {
            for (Student student : group.students) {
                if(student.getFirstName().equalsIgnoreCase(nameg)){
                    for (Lessons lesson : group.lessons) {
                        linp.add(lesson);
                    }
                }
            }
        }
        return linp;
    }

    @Override
    public String deleteStudentByEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email of student: ");
        String email = scanner.nextLine();
        for (Group group : DataBase.groups) {
            group.students.removeIf(student -> student.getEmail().equalsIgnoreCase(email));
            return "successfully";
        }
//        for (int i = 0; i < DataBase.groups.size(); i++) {
//            for (int j = 0; j < DataBase.groups.get(i).students.size(); j++) {
//                if(DataBase.groups.get(i).students.get(i).getEmail().equalsIgnoreCase(email)){
//                    DataBase.groups.get(i).students.remove(DataBase.groups.get(i).students.get(j));
//                    System.out.println("Successfully deleted!");
//                }
//            }
//        }
        return "not found";
    }
}
