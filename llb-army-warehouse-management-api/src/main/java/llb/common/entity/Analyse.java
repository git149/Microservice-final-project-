package llb.common.entity;


import llb.common.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//数据分析
public class Analyse extends BasePojo {
    private String filed;
    private String countNum;
    private String sumNum;
    private String tableName;
    private String user;
    private String touser;
    private String goods;
    private String where;
    private String type;

    private String serviceModular = "system-provider-other";
    private String modular = "Analyse";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;
}
