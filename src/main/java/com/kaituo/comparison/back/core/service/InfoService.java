package com.kaituo.comparison.back.core.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "InfoService",//暴露服务名称
        targetNamespace = "http://service.core.back.comparison.kaituo.com" //命名空间，一般是接口的包名倒序
)
public interface InfoService {
    /**
     * 查询户籍信息
     * @param GMSFHM
     * @return
     */
    public String hjxx(@WebParam(name = "GMSFHM") String GMSFHM);

}
