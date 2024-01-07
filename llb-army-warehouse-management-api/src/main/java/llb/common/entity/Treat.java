package llb.common.entity;

import llb.common.BaseGoods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//医疗
public class Treat extends BaseGoods {
    //保质期
    private String warranty;

    private String serviceModular = "system-provider-other";
    private String modular = "Treat";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;
}
