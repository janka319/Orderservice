package de.neuefische.rem_21_3.objects;

public class Student {

    public static final int UNDEFINED = -1;

    private final String name;
    private int id = UNDEFINED;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }
}
