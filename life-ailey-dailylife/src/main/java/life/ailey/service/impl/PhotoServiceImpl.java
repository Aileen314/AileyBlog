package life.ailey.service.impl;

import life.ailey.domain.Photo;
import life.ailey.mapper.PhotoMapper;
import life.ailey.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhotoServiceImpl implements IPhotoService {

    @Autowired
    private PhotoMapper photoMapper;

    @Override
    @Transactional
    public List<Photo> getList() {
        List<Photo> list = photoMapper.getList();
        return list;
    }
}
