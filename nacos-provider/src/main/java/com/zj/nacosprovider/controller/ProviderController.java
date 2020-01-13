/**
 * Copyright (C), 2020
 * FileName: ProviderController
 * Author:   zhangjian
 * Date:     2020/1/10 16:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.nacosprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    Logger logger= LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name",defaultValue = "zj",required = false) String name){
        logger.info(name);
        return "hi "+name;
    }
}
