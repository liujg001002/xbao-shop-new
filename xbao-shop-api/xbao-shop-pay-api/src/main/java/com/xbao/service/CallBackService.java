package com.xbao.service;

import com.xbao.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("/callBackService")
public interface CallBackService {

    // 同步通知
    @RequestMapping("/synCallBack")
    ResponseBase synCallBack(@RequestParam Map<String, String> params);

    // 异步通知
    @RequestMapping("/asynCallBack")
    String asynCallBack(@RequestParam Map<String, String> params);

}
