package life.ailey.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import life.ailey.domain.Photo;
import life.ailey.mapper.PhotoMapper;
import life.ailey.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhotoServiceImpl extends ServiceImpl<PhotoMapper, Photo> implements IPhotoService {

    @Autowired
    private PhotoMapper photoMapper;

    @Override
    @Transactional
    public List<Photo> getList() {
        QueryWrapper<Photo> queryWrapper = new QueryWrapper<Photo>();
        List<Photo> list = this.baseMapper.selectList(queryWrapper);
        return list;
    }
}
