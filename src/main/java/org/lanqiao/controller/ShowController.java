package org.lanqiao.controller;

import org.lanqiao.bean.Action;
import org.lanqiao.bean.User;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by 1111 on 2017/9/1.
 */
@Controller
@RequestMapping("/user")
public class ShowController {
    @Autowired
    IUserService userService;
    @RequestMapping("/hello.do")
    public String hello(Model model){
       /* List<User> userList=userService.getAllUser();
        model.addAttribute("user",userList);*/
        return "redirect:/index.jsp";
    }
    @RequestMapping("/mess.do")
    @ResponseBody
    public String mess(Action action){
        return action.toString();
    }
    @RequestMapping("/all.do")
    public ModelAndView show(){
        ModelAndView modelAndView=new ModelAndView("show");
        List<User> userList=userService.getAllUser();
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }
    @RequestMapping("/condition.do")
    //@ResponseBody
    public ModelAndView getUserByCondition(User user){
        ModelAndView modelAndView=new ModelAndView("show");
        List<User> userList=userService.getUserByCondition(user);
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }
    @RequestMapping("/update.do")
    public  String updateUserById(User user){
         int row=userService.updateUserById(user);
         System.out.println("row"+row);
         return "result";
    }
    @RequestMapping("/del.do")
    public String delUserById(int id){
        userService.delUserById(id);
        return "show";
    }
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public List<User> showAll(){
        List<User> userList=userService.getAllUser();
        return userList;
    }
    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
         User user=userService.getUserById(id);
         return user;
    }
    @RequestMapping(value ="",method = RequestMethod.POST)
    @ResponseBody
    public int addUser(@RequestBody User user){
        return  userService.addUser(user);
    }
    @RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int delUserById(@PathVariable Integer id){
        return  userService.delUserById(id);
    }

    @RequestMapping(value ="",method = RequestMethod.PUT)
    @ResponseBody
    public int updateUser(@RequestBody User user){
        return  userService.updateUserById(user);
    }
   /* @RequestMapping("/show.do")
    public String show(){
        return "forward:/test/condition.do";
    }
*/
}
