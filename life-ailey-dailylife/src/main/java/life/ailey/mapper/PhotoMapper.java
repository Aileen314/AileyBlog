package life.ailey.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import life.ailey.domain.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhotoMapper extends BaseMapper<Photo> {
    List<Photo> getList();

}
