package com.kaituo.comparison.back.core.service.impl;

import com.kaituo.comparison.back.core.service.InfoService;

import javax.jws.WebService;


@WebService(serviceName = "InfoService", // 与接口中指定的name一致
        targetNamespace = "http://service.core.back.comparison.kaituo.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.kaituo.comparison.back.core.service.InfoService"// 接口地址
)
public class InfoServiceImpl implements InfoService {

    @Override
    public String hjxx(String GMSFHM) {
        return "查询户籍信息:"+GMSFHM;
    }


}
