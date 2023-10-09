package com.example.mprcw.service;

import com.example.mprcw.data.Student;
import com.example.mprcw.data.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void saveStudent(Student student){
        studentRepository.saveStudent(student);

    }
    public Student getStudentById(UUID id){
        return studentRepository.getStudentById(id);
    }
}
