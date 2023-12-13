package service;

import Groups.Lessons;

import java.util.ArrayList;

public interface LessonService {
 String addnewLessonToGroup();
  Lessons getByName(String name);
  ArrayList<Lessons>getAllLesByGroupName();
  String deletelessonById();

}
