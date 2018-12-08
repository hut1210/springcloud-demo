package com.springcloud.servicefeign.feigninterface

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(value = "service-hi")
public interface HiInterface {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHiFromClientOne();
}