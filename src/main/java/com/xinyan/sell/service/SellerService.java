package com.xinyan.sell.service;


import com.xinyan.sell.po.SellerInfo;

/**
 * 卖家端
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
