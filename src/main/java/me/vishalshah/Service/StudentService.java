package me.vishalshah.Service;

import me.vishalshah.DAO.StudentDAO;
import me.vishalshah.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDAO student;

    public Collection<Student> getAllStudents() {
        return student.getAllStudents();
    }
}
