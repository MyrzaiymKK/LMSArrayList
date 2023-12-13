import Groups.Lessons;
import Role.Admin;
import service.impl.AdminImpl;
import service.impl.GroupImpl;
import service.impl.LessonsImpl;
import service.impl.StudentImpl;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LessonsImpl serviceL = new LessonsImpl();
        GroupImpl serviceG = new GroupImpl();
        StudentImpl serviceS = new StudentImpl();
        AdminImpl serviceA = new AdminImpl();
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        while (true) {
            System.out.println("""
                    Welcom to LMS
                                        
                    1-> If you registred
                    2-> If you registred but forgot password or email  
                    """);
            switch (scanner.nextLine()) {
                case "1" -> {
                    if (serviceA.voitti(admin) != null) {
                        while (true) {
                            System.out.println("""
                                                    0.Exit
                                                    1.Addnewgroup
                                                    2.Getgroup
                                                    3.Update
                                                    4.Getallgroup
                                                    5.Add new Student to group
                                                    6.Update student
                                                    7.Find student by firstName
                                                    8.Get all students by groupName
                                                    9.Get all students lesson
                                                    10.Delete Student by email
                                                    11.Add new Lesson to group
                                                    12.Get lesson by name
                                                    13.Get all lesson by group name
                                                    14.Delete lesson by ID
                                                    
                                    """);
                            switch (scanner.nextLine()) {
                                case "1" -> {
                                    serviceG.addnewGroup();
                                }
                                case "2" -> {
                                    Scanner scanner1 = new Scanner(System.in);
                                    System.out.println("Write name of group: ");
                                    String name = scanner.nextLine();
                                    System.out.println(serviceG.getGroup(name));
                                }
                                case "3" -> {
                                    System.out.println(serviceG.updateGroup());
                                }
                                case "4" -> {
                                    System.out.println(serviceG.getAllGroup());
                                }
                                case "5" -> {
                                    serviceS.addnewStudent();
                                }
                                case "6" -> {
                                    System.out.println(serviceS.updateStudent());
                                }
                                case "7" -> {
                                    System.out.println(serviceS.getStudentByName());
                                }
                                case "8" -> {
                                    System.out.println(serviceS.getAllStudentByGroupName());
                                }
                                case "9" -> {
                                    System.out.println(serviceS.getAllStudentsLesson());
                                }
                                case "10" -> {
                                    System.out.println(serviceS.deleteStudentByEmail());
                                }
                                case "11" -> {
                                    System.out.println(serviceL.addnewLessonToGroup());
                                }
                                case "12" -> {
                                    Scanner scanner1 = new Scanner(System.in);
                                    System.out.print("Write name of Lesson: ");
                                    String namel = scanner1.nextLine();
                                    Lessons byName = serviceL.getByName(namel);
                                    if (byName == null) System.out.println("Not found lesson! ");
                                    else System.out.println(byName);
                                }
                                case "13" -> {
                                    ArrayList<Lessons> les = serviceL.getAllLesByGroupName();
                                    if (les == null) System.out.println("Not found group! ");
                                    else System.out.println(les);
                                }
                                case "14" -> {
                                    System.out.println(serviceL.deletelessonById());
                                }

                            }
                        }
                    }

                }
            }


        }
    }
}