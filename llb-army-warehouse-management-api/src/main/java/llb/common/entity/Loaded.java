package llb.common.entity;

import llb.common.BaseGoods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//被装
public class Loaded extends BaseGoods {
    //尺码
    private String size;
    //种类
    private String type;

    private String serviceModular = "system-provider-other";
    private String modular = "Loaded";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;
}
