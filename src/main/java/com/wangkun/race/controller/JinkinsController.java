package com.wangkun.race.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class JinkinsController {

    @PostMapping(value = "/jinkins" ,produces = "application/json")
    @ResponseBody
    public String applyOpenAccount() {
        return System.currentTimeMillis() + "";
    }

}
