package live.ailey.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class PhotoController {

    @GetMapping("/test")
    public String create(@RequestParam("str") String str) {
        System.out.println(str);
        return "输入参数为：" + str;
    }
}
