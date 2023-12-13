package service.impl;

import Dtabase.DataBase;
import Groups.Group;
import Groups.Lessons;
import service.LessonService;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class LessonsImpl implements LessonService {
    @Override
    public String addnewLessonToGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String name = scanner.nextLine();
        for (Group group : DataBase.groups) {
            if(group.getGroupName().equalsIgnoreCase(name)){
                Lessons lessons1 = new Lessons();
                lessons1.setId(MyGenerator.generatorLesson());
                System.out.println("Write name of Lesson: ");
                String namee = scanner.nextLine();
                lessons1.setLessonsName(namee);
                System.out.println("Write discription of lesson: ");
                String disc = scanner.nextLine();
                lessons1.setTascdescription(disc);
                group.lessons.add(lessons1);
                return "Successfully!";
            }

        }
        return "not found";
    }

    @Override
    public Lessons getByName(String name) {
        for (Group group : DataBase.groups) {
            for (Lessons lesson : group.lessons) {
                if (lesson.getLessonsName().equalsIgnoreCase(name)){
                    return lesson;
                }
            }
        }
        return null;
    }

    @Override
    public ArrayList<Lessons> getAllLesByGroupName() {
        ArrayList<Lessons> linm = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String namee = scanner.nextLine();
        for (Group group : DataBase.groups) {
            if (group.getGroupName().equalsIgnoreCase(namee)) {
                return group.lessons;
            }
        }
        return null;
    }

    @Override
    public String deletelessonById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write id of lesson: ");
        int idd = scanner.nextInt();
        for (Group group : DataBase.groups) {
            group.lessons.removeIf(lessons -> lessons.getId() == idd);
            return "successfulle";
        }
        return "myndai id jok";
    }
}
