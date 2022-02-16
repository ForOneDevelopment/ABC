package com.example.demo.example;

import com.example.demo.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

    private StudentService studentService;
    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/insert")
    public String insert(Model model){
        model.addAttribute("student", new Student());
        return "insert";
    }

    @PostMapping("/insert")
    public String insertSubmit(@ModelAttribute("student") Student student){
        studentService.insert(student);
        return "insertsuc";
    }

}
