package pro.sky;

import java.util.Objects;

public class Student {
    //Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student));
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getAge(), student.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
