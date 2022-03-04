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
@RequestMapping("/freshman")
public class FreshmanController {

    @Autowired
    private FreshmanRepository freshmanRepository;

    @GetMapping("/toCheck")
    public String toCheck(){
        return "check";
    }

    @GetMapping("/toFreshmanInfo")
    public String toFreshmanInfo(){
        return "freshmaninfo";
    }

    @PostMapping("/checkIn")
    public String checkIn(Freshman freshman){
        freshmanRepository.save(freshman);
        return "success";
    }

}