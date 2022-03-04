package cn.com.cyg.controller;

import cn.com.cyg.pojo.User;
import cn.com.cyg.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/toShowAllUsers")
    public String toAdmin(){
        return "redirect:/admin/showAllUsers";
    }
    @RequestMapping("/showAllUsers")
    public String showAllUsers(Model model, User user){
        List<User> users = adminRepository.findAll();
        model.addAttribute("userList",users);
        return "showallusers";
    }
    @GetMapping("/delById/{id}")
    public String delById(@PathVariable("id") int id){
        try {
            adminRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return "redirect:/admin/showAllUsers";
    }
    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") int id,Model model){
        User user = adminRepository.findById(id).get();
        System.out.println(user);
        model.addAttribute("u",user);
        System.out.println(model);
        return "updateUser";
    }

    @PostMapping("/updateById")
    public String updateById(User user){
        adminRepository.updateById(user);
        return "redirect:/admin/showAllUsers";
    }

    @GetMapping("/toAdd")
    public String toAddUser(User user){
        return "adduser";
    }

    @PostMapping("/addUser")
    public String addUser(User user){
        System.out.println(user);
        adminRepository.save(user);
        return "redirect:/admin/showAllUsers";
    }

    @PostMapping("/findByName")
    public String findByName(String account,Model model){
        /*User u = adminRepository.findByAccount(account);
        model.addAttribute("oneuser",u);*/
        List<User> users =adminRepository.findByCondition(account);
        model.addAttribute("users",users);
        return "showoneuser";
    }
}
