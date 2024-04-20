package com.iyaovo.paper.foreground.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.iyaovo.paper.common.api.CommonPage;
import com.iyaovo.paper.foreground.domain.dto.CartInfoDto;
import com.iyaovo.paper.foreground.domain.entity.CartInfo;
import com.iyaovo.paper.foreground.domain.entity.GoodsInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ICartInfoService extends IService<CartInfo> {

    /**
     * 添加商品到购物车
     */
    void addGoodsToCart(CartInfoDto cartInfoDto);

    /**
     * 删除购物车中的商品
     */
    void deleteGoodsFromCart(Integer goodsId);

    /**
     * 更改商品数量
     */
    void changeGoodsNumber(Integer goodsId,Integer goodsNumber);

    /**
     * 结算
     */
    void settleAccounts(List<CartInfoDto> cartInfoDtoList);


}
