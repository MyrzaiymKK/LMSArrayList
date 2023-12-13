package service.impl;

import Dtabase.DataBase;
import Groups.Group;
import service.GroupService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GroupImpl implements GroupService {
    @Override
    public void addnewGroup() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Group group1 = new Group();
        group1.setId(MyGenerator.generatorGroup());
        System.out.println("Write group name: ");
        String name = scanner1.nextLine();
        group1.setGroupName(name);
        System.out.println("Write discription of Group: ");
        String disc = scanner1.nextLine();
        group1.setDescription(disc);
        DataBase.groups.add(group1);
        System.out.println("Successfully added! ");
        System.out.println();

    }

    @Override
    public ArrayList<Group> getGroup(String name) {
        ArrayList<Group> link = new ArrayList<>();
        for (Group group : DataBase.groups) {
            if (group.getGroupName().equalsIgnoreCase(name)) {
                link.add(group);
            }
        }
        return link;
    }

    @Override
    public String updateGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write group name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < DataBase.groups.size(); i++) {
            if (DataBase.groups.get(i).getGroupName().equalsIgnoreCase(name)) {
                System.out.println("Write new group name: ");
                DataBase.groups.get(i).setGroupName(scanner.nextLine());
                System.out.println("Successfully updated!");
                return DataBase.groups.get(i).getGroupName();
            } else System.out.println("Not found! ");
        }

        return null;
    }

    @Override
    public ArrayList<Group> getAllGroup() {

        return DataBase.groups;
    }
}
