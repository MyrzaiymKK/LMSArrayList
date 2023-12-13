package Groups;

import java.util.ArrayList;

public class Group {
    private int id;

    private String description;
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Lessons> lessons = new ArrayList<>();
    private String groupName;

    public Group() {
    }

    public Group(int id, String description, ArrayList<Student> students, ArrayList<Lessons> lessons, String groupName) {
        this.id = id;

        this.description = description;
        this.students = students;
        this.lessons = lessons;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lessons> lessons) {
        this.lessons = lessons;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", students=" + students +
                ", lessons=" + lessons +

                '}';
    }
}
