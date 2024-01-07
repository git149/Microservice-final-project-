package llb.common.entity;

import llb.common.BaseGoods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//器械
public class Apparatus extends BaseGoods {

    private String type;
    private String maintenance;
    private String usage;
    private User usageObj;
    private String num1;
    private String num2;

    private String serviceModular = "system-provider-other";
    private String modular = "Apparatus";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;

}
