package com.codekul.SpringMorning.jpa.repository;



import com.codekul.SpringMorning.jpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
