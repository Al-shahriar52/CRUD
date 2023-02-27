package com.springboot.crudoperation.Service;

import com.springboot.crudoperation.Entity.Student;
import com.springboot.crudoperation.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public List<Student> getProducts() {
        return studentRepository.findAll();
    }

    public Student getProductById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student getProductByName(String name) {
        return studentRepository.findByDepartment(name);
    }

    public String deleteProduct(int id) {
        studentRepository.deleteById(id);
        return "product removed !! " + id;
    }

    public Student updateProduct(Student product) {
        Student existingProduct = studentRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setAge(product.getAge());
        existingProduct.setDepartment(product.getDepartment());
        return studentRepository.save(existingProduct);
    }

}
