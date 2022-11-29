package live.ailey.service.impl;

import live.ailey.domain.Photo;
import live.ailey.mapper.PhotoMapper;
import live.ailey.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements IPhotoService {

    @Autowired
    private PhotoMapper photoMapper;

    public List<Photo> getList() {
        List<Photo> list = photoMapper.getList();
        return list;
    }
}
