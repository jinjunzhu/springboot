package org.boot.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/23
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public String toUserManage(){
        return "user/userList";
    }
}
