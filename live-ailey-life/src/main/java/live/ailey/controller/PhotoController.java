package live.ailey.controller;


import live.ailey.domain.Photo;
import live.ailey.pojo.Result;
import live.ailey.service.IPhotoService;
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
        return "输入参数为：" + str;
    }
}
