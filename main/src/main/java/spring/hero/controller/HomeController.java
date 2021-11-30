package spring.hero.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.hero.entity.model.Doctor;

@RestController
public class HomeController {

    @RequestMapping
    public Doctor index()
    {
        Doctor doctor = new Doctor(1,"hello");
        return doctor;
    }
}
