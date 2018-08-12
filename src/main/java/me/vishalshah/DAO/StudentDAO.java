package me.vishalshah.DAO;

import me.vishalshah.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Vishal", "Computer Science"));
                put(2, new Student(2, "Sonia", "Biology"));
                put(3, new Student(3, "Lebron", "Basketball"));

            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }
}
