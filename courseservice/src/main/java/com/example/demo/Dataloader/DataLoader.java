package com.example.demo.Dataloader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Entity.Course;
import com.example.demo.Repo.courserepo;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(courserepo repo) {

        return args -> {

            Course c1 = new Course();
            c1.setCoursename("Java Full Stack");
            c1.setPrice(35000);
            c1.setDuration_months(6);

            Course c2 = new Course();
            c2.setCoursename("Spring Boot");
            c2.setPrice(18000);
            c2.setDuration_months(3);

            Course c3 = new Course();
            c3.setCoursename("React JS");
            c3.setPrice(15000);
            c3.setDuration_months(2);

            Course c4 = new Course();
            c4.setCoursename("Python");
            c4.setPrice(25000);
            c4.setDuration_months(5);

            Course c5 = new Course();
            c5.setCoursename("AWS");
            c5.setPrice(22000);
            c5.setDuration_months(4);

            repo.save(c1);
            repo.save(c2);
            repo.save(c3);
            repo.save(c4);
            repo.save(c5);

            System.out.println("Sample Course data loaded successfully.");
        };
    }
}