package com.myapps.springjaxrs.repositories;

import com.myapps.springjaxrs.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
