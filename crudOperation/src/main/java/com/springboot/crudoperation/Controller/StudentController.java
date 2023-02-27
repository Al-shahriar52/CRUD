package com.springboot.crudoperation.Controller;

import com.springboot.crudoperation.Entity.Student;
import com.springboot.crudoperation.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public Student addProduct(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addProducts(@RequestBody List<Student> students) {
        return studentService.saveStudents(students);
    }

    @GetMapping("/products")
    public List<Student> findAllProducts() {
        return studentService.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Student findProductById(@PathVariable int id) {
        return studentService.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Student findProductByName(@PathVariable String name) {
        return studentService.getProductByName(name);
    }

    @PutMapping("/update")
    public Student updateProduct(@RequestBody Student product) {
        return studentService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return studentService.deleteProduct(id);
    }
}