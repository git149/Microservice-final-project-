package llb.common.entity;


import llb.common.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//用户
public class User extends BasePojo {
    private String name;
    private String account;
    private String pw;
    private String sex;
    private String iphone;
    private String lv;
    private String num;

    private String serviceModular = "system-provider-user";
    private String modular = "User";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;

}
