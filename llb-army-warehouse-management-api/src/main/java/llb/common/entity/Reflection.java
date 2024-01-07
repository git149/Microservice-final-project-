package llb.common.entity;


import llb.common.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//记录
public class Reflection extends BasePojo {
    private String doing;
    private String type;
    private String typeString;
    private String goods;
    private Object goodsObj;
    private String num;
    private String user;
    private User userObj;
    private String touser;
    private User touserObj;

    private String serviceModular = "system-provider-other";
    private String modular = "Reflection";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;

    public void setType(String type) {
        this.type = type;
        switch (type){
            case "Food":
                this.typeString = "食品物资";
                break;
            case "Loaded":
                this.typeString = "被装物资";
                break;
            case "Treat":
                this.typeString = "医疗物资";
                break;
            case "Other":
                this.typeString = "其他物资";
                break;
            case "Apparatus":
                this.typeString = "器械物资";
                break;
        }
    }


}
