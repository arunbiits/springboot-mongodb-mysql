package io.arun.learning.springbootmongodbmysql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.arun.learning.springbootmongodbmysql.model.Course;

public interface CourseRepository extends MongoRepository<Course, String>{

}
