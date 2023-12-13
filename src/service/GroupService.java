package service;

import Groups.Group;

import java.util.ArrayList;

public interface GroupService {
    void addnewGroup();
    ArrayList<Group> getGroup(String name);
    String updateGroup();
    ArrayList<Group> getAllGroup();

}
