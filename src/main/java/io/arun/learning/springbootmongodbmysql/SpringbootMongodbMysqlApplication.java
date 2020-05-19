package io.arun.learning.springbootmongodbmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.arun.learning.springbootmongodbmysql.model.Course;
import io.arun.learning.springbootmongodbmysql.model.User;
import io.arun.learning.springbootmongodbmysql.repository.CourseRepository;
import io.arun.learning.springbootmongodbmysql.repository.UserRepository;

@SpringBootApplication
public class SpringbootMongodbMysqlApplication implements CommandLineRunner{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Arun", "Kumar", 23);
		userRepository.save(user);
		courseRepository.save(new Course("Java - A new world of programming!"));
	}

}
