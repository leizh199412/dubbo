package com.leizhonghua.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String getMessage() {
        return "最后一次";
    }
}
