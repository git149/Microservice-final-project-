package llb.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//公共基类对象
public class BasePojo {

    private String id;
    private String isDel;
    private String time;
    //页数
    private Integer page = 1;
    //条数
    private Integer rows = 5;



}
