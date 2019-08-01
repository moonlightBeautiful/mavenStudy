package com.java1234.controller;


import com.java1234.entity.User;
import com.java1234.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登陆
     *
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(User user, HttpServletRequest request) {
        User resultUser = userService.login(user);
        if (resultUser == null) {
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "账户名或密码错误");
            return "index";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/success.jsp";
        }
    }
}
