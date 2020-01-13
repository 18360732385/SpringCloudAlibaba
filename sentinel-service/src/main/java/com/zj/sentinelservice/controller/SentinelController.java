/**
 * Copyright (C), 2020
 * FileName: SentinelController
 * Author:   zhangjian
 * Date:     2020/1/13 14:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zj.sentinelservice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @GetMapping("/hi")
    @SentinelResource(value="hi",blockHandler = "handleException")
    public String hi(@RequestParam(value = "name",defaultValue = "zj",required = false)String name){

        return "hi "+name;
    }

    public String handleException(BlockException exception){
        return "默认的失败策略";
    }

}
