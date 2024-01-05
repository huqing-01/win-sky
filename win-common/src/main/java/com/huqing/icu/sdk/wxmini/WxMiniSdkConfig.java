package com.huqing.icu.sdk.wxmini;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 微信小程序接口服务
 *
 * @author huqing
 * @date 2024-01-04 20:00:33
 */
@Component
@Data
public class WxMiniSdkConfig {

    //微信小程序登录接口
    @Value("${sdk.wxmini.login-url:}")
    private String wxMiniLoginUrl;
}
