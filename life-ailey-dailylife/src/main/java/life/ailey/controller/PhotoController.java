package life.ailey.controller;


import life.ailey.domain.Photo;
import life.ailey.pojo.Result;
import life.ailey.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/life/photo")
public class PhotoController {

    @Autowired
    private IPhotoService photoService;

    @GetMapping("/list")
    public Result<?> getList() {
        List<Photo> list = photoService.getList();
        return Result.OK(list);
    }

    @GetMapping("/test")
    public String create(@RequestParam("str") String str) {
        System.out.println(str);
        boolean undefined = str.contains("undefined");
        System.out.println(undefined);
        return "输入参数为：" + str;
    }
}
