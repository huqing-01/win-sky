package com.huqing.icu.dto.wxmini;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 微信小程序登录接口的响应结果
 *
 * @author huqing
 * @date 2024-01-04 20:24:32
 */
@Data
public class WxMiniLoginRespDto {

    /**
     * 会话密钥
     */
    @JSONField(name = "session_key")
    private String sessionKey;

    /**
     * 用户在开放平台的唯一标识符，若当前小程序已绑定到微信开放平台账号下会返回
     */
    @JSONField(name = "unionid")
    private String unionId;

    
    private String errmsg;

}
