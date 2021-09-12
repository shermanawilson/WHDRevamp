package com.whd.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    private final UsersRepository usersDao;

    public UsersController(UsersRepository usersDao) {
        this.usersDao = usersDao;
    }

    @GetMapping("/admin-dashboard")
    public String clientList(Model model) {
        model.addAttribute("users", usersDao.findAll());
        return "admin-dashboard/users";
    }
}
