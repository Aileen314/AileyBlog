package live.ailey.mapper;

import live.ailey.domain.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhotoMapper {
    List<Photo> getList();

}
