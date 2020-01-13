/**
 * Copyright (C), 2020
 * FileName: ConfigClientController
 * Author:   zhangjian
 * Date:     2020/1/11 22:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.nacosconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macro on 2019/9/11.
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info:zj123}")
    private String username;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "configInfo:"+username;
    }
}

