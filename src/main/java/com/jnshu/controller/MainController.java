package com.jnshu.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.entity.User;
import com.jnshu.service.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class MainController {
    @Autowired
    private UserService userService;
    private static final Logger logger= LogManager.getLogger(MainController.class);


    @RequestMapping("toAddUser")
    public String toAddUser() {
        return "addUser";

    }
@RequestMapping(value = "addUser",method = RequestMethod.POST)
    public String addUser(Model model, @Valid User user,BindingResult bindingResult) throws UnsupportedEncodingException {
    if (bindingResult.hasErrors()) {
List<ObjectError>allErrors = bindingResult.getAllErrors();
for (ObjectError objectError : allErrors){
    System.out.println(new String(objectError.getDefaultMessage().getBytes("ISO-8859-1"),"UTF-8"));
}
model.addAttribute("allErrors",allErrors);
return "error";
    }
    userService.saveUser(user);
    return "redirect:/user/userInfo";
    }




//    @RequestMapping(value = "addUser",method = RequestMethod.POST)
//    public String addUser(Model model,User user) {
//        userService.saveUser(user);
//        model.addAttribute("user", user);
//
//        return "redirect:/user/userInfo";
//    }
//    @RequestMapping(value="/toUpdateUser/{id}",method = RequestMethod.GET)
//    public String toUpdateUser(Model model,@PathVariable long id) {
//        User user = userService.findUserById(id);
//        model.addAttribute("user", user);
//        return "edit";
//    }
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String updateUser(Model model,User user){
        if (userService.updateUser(user)){
            user=userService.findUserById(user.getId());
            model.addAttribute("user",user);
            return "redirect:/user/userInfo";
        }
        return "error";
    }

//    @RequestMapping("userInfo")
//    @ResponseBody
//    public List<User> getAllUser(Model model) {
//        List<User> user = userService.findAll();
//
//        return user;
//    }
    /**
     * 查询学生所有数据
     */
    //分页查询
    @RequestMapping(value = "/userInfo", method =RequestMethod.GET)
    public String getAllUser(Model model, @RequestParam(defaultValue = "1",required = true,value = "pageNo")Integer pageNo)  {
        Integer pageSize=5;//每页显示记录数为5
        PageHelper.startPage(pageNo,pageSize);
        List<User>userList=userService.findAll();//获取所有用户信息
        PageInfo<User>pageInfo=new PageInfo<User>(userList);
        model.addAttribute("pageInfo",pageInfo);
        return "allUser";
    }

//@RequestMapping("userInfo")
//    public String getAllUser(Model model){
//        List<User> user = userService.findAll();
//        model.addAttribute("userList",user);
//        return "allUser";
//    }

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable int id,Model model){
        model.addAttribute("user", userService.findUserById(id));
        return "editUser";
    }

    @RequestMapping(value = "/delUser/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable int id, @Validated User user, BindingResult result) {
        userService.deleteUser(id);
        return "redirect:/user/userInfo";

    }
}
