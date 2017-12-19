package com.myself.origin.controller.sys;

import com.myself.origin.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 【name】毛攀攀
 * @author 【date】2017/12/19
 * @author 【时间】10:46
 * @author 【说明】
 * @author 【工程】myself-origin-one
 * @author 【目录】com.myself.origin.controller.sys
 */
@Controller
@RequestMapping("/sys")
public class SysUserController extends BaseController {

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
