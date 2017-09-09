package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 1111 on 2017/9/2.
 */
@Controller
@RequestMapping("/user1")
public class RegController {
    @RequestMapping("/reg.do")
    public String reg(User user){
        System.out.println(user);
        return "result";
    }
}
