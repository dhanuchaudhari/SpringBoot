package com.codekul.SpringMorning.jpa.controller;


import com.codekul.SpringMorning.jpa.Entity.Student;
import com.codekul.SpringMorning.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
     @Autowired
     private StudentRepository studentRepository;

     @PostMapping("saveStudent")
     public String saveStudent(@RequestBody Student student) {
          studentRepository.save(student);
          return "studentSaved";
     }

    @PostMapping("saveStudents")
    public String saveStudent(@RequestBody List<Student> students){
        studentRepository.saveAll(students);
        return "students saved..";
    }

     @GetMapping("getStudent")
     public List<Student> getStudent() {
          return studentRepository.findAll();
     }

//               @GetMapping("findById/{Id}")
//     public Optional<Student> findById(@PathVariable int Id) {
//                    return studentRepository.findById(Id);
//               }
//
     @GetMapping("getById/{Id}")
   public Student getStudentBYId(@PathVariable int Id){
        return  studentRepository.getReferenceById(Id);
     }
  //  @GetMapping("getById/{id}")
//    public Student getStudentById(@PathVariable Integer id){
//        return studentRepository.getById(id);
//    }

   @PutMapping("update")
     public String updateStudent(@RequestBody Student student){
          Student student1 =studentRepository.getReferenceById(student.getId());
          student1.setId(student.getId());
          student1.setCity(student.getCity());
          student1.setName(student.getName());
          student1.setMob_no(student.getMob_no());
          studentRepository.save(student1);
          return "record update";
     }
  //  @DeleteMapping("delete/{id}")
//    public String deleteStudent(@PathVariable("id") Integer id){
//        studentRepository.deleteById(id);
//        return "record deleted";
//    }

    @DeleteMapping("deleteByIds/{id}")
    public String deleteStudent(@PathVariable("id") List<Integer> id){
        studentRepository.deleteAllById(id);
        return "records deleted";
    }

}

