package cn.com.cyg.controller;

import cn.com.cyg.pojo.Freshman;
import cn.com.cyg.repository.FreshmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private FreshmanRepository freshmanRepository;

    @GetMapping("/toStudentExam")
    public String toStudentExam(){
        return "redirect:/teacher/studentExam";
    }

    @RequestMapping("/studentExam")
    public String studentExam(Model model){
        List<Freshman> students = freshmanRepository.findAll();
        model.addAttribute("students",students);
        return "studentexam";
    }

    @PostMapping("/findStudent")
    public String findStudent(String name, Model model){
        List<Freshman> freshmen = freshmanRepository.findByCondition(name);
        model.addAttribute("freshman",freshmen);
        return "showonefreshman";
    }
}
