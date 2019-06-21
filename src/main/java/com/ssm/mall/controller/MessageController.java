package com.ssm.mall.controller;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @auther wenlongzhou
 * @date 2019/5/29 10:39
 */

@RestController
@RequestMapping("/message")
public class MessageController {

    @RequestMapping("/sendMessage")
    public Map sendMessage(String phone) throws Exception {
        //产品名称:云通信短信API产品,开发者无需替换
        String product = "Dysmsapi";
        //产品域名,开发者无需替换
        String domain = "dysmsapi.aliyuncs.com";

        // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
        String accessKeyId = "LTAIChobfywrYMTF";
        String accessKeySecret = "f9np2fAAD9inlgj84hDzbOSqAuUEj6";

        String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);

        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phone);
        //必填:短信签名-可在短信控制台中找到
        request.setSignName("淘淘商城");
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode("SMS_166655168");
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        //request.setTemplateParam("{\"name\":\"Tom\", \"code\":\"123\"}");
//        request.setTemplateParam("{\"code\":\"123456\"}");
        request.setTemplateParam("{\"code\":" + verifyCode + "}");

        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode("90997");

        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId("yourOutId");

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        System.out.println("当前的注册的手机号：" + phone + "，验证码：" + verifyCode);
        Map<String, String> map = new HashMap<>();
        map.put("num", phone);
        map.put("code", verifyCode);
        return map;
    }

}
