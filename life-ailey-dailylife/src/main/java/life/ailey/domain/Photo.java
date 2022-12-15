package life.ailey.domain;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "dailylife_photo") // 指明当前类对应的数据库，不写会默认类名为表名
public class Photo {

    private String id;

    private String name;

    private String url;

    @TableLogic
    private Integer delFlag;
}
