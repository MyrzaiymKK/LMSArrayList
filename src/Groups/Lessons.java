package Groups;

public class Lessons {
    private int id;
    private String lessonsName;
    private String tascdescription;

    public Lessons() {
    }

    public Lessons(int id, String lessonsName, String tascdescription) {
        this.id = id;
        this.lessonsName = lessonsName;
        this.tascdescription = tascdescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLessonsName() {
        return lessonsName;
    }

    public void setLessonsName(String lessonsName) {
        this.lessonsName = lessonsName;
    }

    public String getTascdescription() {
        return tascdescription;
    }

    public void setTascdescription(String tascdescription) {
        this.tascdescription = tascdescription;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "id=" + id +
                ", lessonsName='" + lessonsName + '\'' +
                ", tascdescription='" + tascdescription + '\'' +
                '}';
    }
}
