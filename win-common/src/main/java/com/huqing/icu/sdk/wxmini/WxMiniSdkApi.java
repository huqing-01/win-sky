package com.huqing.icu.sdk.wxmini;

import com.huqing.icu.constants.BusinessExceptionEnum;
import com.huqing.icu.exception.BusinessException;
import com.huqing.icu.utils.HttpUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

/**
 * 微信小程序接口服务
 *
 * @author huqing
 * @date 2024-01-04 19:51:17
 */
@Service
public class WxMiniSdkApi {

    private static final Logger logger = LoggerFactory.getLogger(WxMiniSdkApi.class);

    @Autowired
    private HttpUtils httpUtils;
    @Autowired
    private WxMiniSdkConfig wxMiniSdkConfig;

    /**
     * 微信小程序登录接口
     * 文档地址：https://developers.weixin.qq.com/miniprogram/dev/OpenApiDoc/user-login/code2Session.html
     *
     * @param appId
     * @param secret
     * @param jsCode
     * @param grantType
     */
    public void wxMiniLogin(String appId, String secret, String jsCode, String grantType) {
        //授权类型写死
        grantType = "authorization_code";
        Map<String, Object> paramsMap = new TreeMap<>();
        paramsMap.put("appid", appId);
        paramsMap.put("secret", secret);
        paramsMap.put("js_code", jsCode);
        paramsMap.put("grant_type", grantType);
        try {
            httpUtils.sendGet(wxMiniSdkConfig.getWxMiniLoginUrl(), paramsMap);
        } catch (BusinessException e) {
            throw new BusinessException(e.getCode(), e.getMsg());
        } catch (Exception e) {
            throw new BusinessException(BusinessExceptionEnum.THIRD_API_REQUEST_ERROR);
        }
    }


}
