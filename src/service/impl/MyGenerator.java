package service.impl;

public class MyGenerator {
    public static int idGroup = 0;
    public static int idStudent = 0;
    public static int idLesson = 0;

    public static int generatorGroup(){
        return (++idGroup);
    }
    public static int generatorStudent(){
        return (++idStudent);
    }
    public static int generatorLesson(){
        return (++idLesson);
    }
}
