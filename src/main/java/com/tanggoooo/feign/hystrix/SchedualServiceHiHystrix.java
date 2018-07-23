package com.tanggoooo.feign.hystrix;

import com.tanggoooo.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHi() {
        return "sorry,please to relate provide,to get same help";
    }
}
