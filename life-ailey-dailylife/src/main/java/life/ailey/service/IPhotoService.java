package life.ailey.service;

import com.baomidou.mybatisplus.extension.service.IService;
import life.ailey.domain.Photo;

import java.util.List;

public interface IPhotoService extends IService<Photo> {

    List<Photo> getList();
}
