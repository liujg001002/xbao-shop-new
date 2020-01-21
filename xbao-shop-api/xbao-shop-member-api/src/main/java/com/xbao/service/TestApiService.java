package com.xbao.service;

import com.xbao.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/member")
public interface TestApiService {
    @RequestMapping("/test")
    Map<String, Object> test(Integer id, String name);

    @RequestMapping("/testResponseBase")
    ResponseBase testResponseBase();

    @RequestMapping("/testRedis")
    ResponseBase settestRedis(String key, String value);
}
