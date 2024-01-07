package llb.common;


import llb.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseGoods extends BasePojo{
    //名称
    private String name;
    //说明
    private String text;
    //编号
    private String identifier;
    //数量
    private String num;

    //生产地
    private String factory;
    //负责人
    private String user;
    private User userObj;

    //提示信息
    private String prompt;


}
