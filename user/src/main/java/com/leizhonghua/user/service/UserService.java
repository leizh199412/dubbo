package com.leizhonghua.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leizhonghua.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    ProviderService providerService;

    public String getMessage(){
        return providerService.getMessage();
    }
}
