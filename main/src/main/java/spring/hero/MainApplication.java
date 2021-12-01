package spring.hero;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.hero.entity.model.Doctor;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = {"spring.hero.*"})
@EntityScan(basePackages = {"spring.hero.*"})
@EnableJpaRepositories(basePackages = {"spring.hero.*"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);

    }
    @GetMapping
    public String index()
    {
//        Doctor doctor = new Doctor(1,"hello");
        return "doctor";
    }
}


