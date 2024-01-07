package llb.common.entity;

import llb.common.BaseGoods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//被装
public class Other extends BaseGoods {
    //尺码
    private String size;
    //种类
    private String type;

    private String serviceModular = "system-provider-other";
    private String modular = "Other";
    private String PAYMENT_URL = "/"+ serviceModular + "/" + modular;
}
