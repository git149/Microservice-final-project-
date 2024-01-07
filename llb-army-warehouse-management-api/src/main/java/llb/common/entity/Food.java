package llb.common.entity;

import llb.common.BaseGoods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//食物
public class Food extends BaseGoods {
    //保质期
    private String warranty;
    private String serviceModular = "system-provider-other";
    private String modular = "Food";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;
}
