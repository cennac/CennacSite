package com.cennac.ccsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Cennac on 2015/7/26.
 */
@Controller
@RequestMapping("ueditor")
public class UeditorController {
    @RequestMapping("edit")
    public String edit(){
        return "ueditor";
    }
}
