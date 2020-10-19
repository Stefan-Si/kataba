package com.qfedu.controller;

import com.qfedu.service.UserService;
import com.qfedu.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: kataba
 *
 * @author: stefan si
 * time: 2020/10/19 17:36
 * description:
 */
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectAll.do")
    public R All(){
        return  userService.All();
    }
}
