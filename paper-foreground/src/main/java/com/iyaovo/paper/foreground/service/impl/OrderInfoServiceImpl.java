/**
 * Copyright (C), 2000-2024, XXX有限公司
 * FileName: OrderInfoServiceImpl
 * Author: 22932
 * Date: 2024/4/13 20:31:28
 * Description:
 * <p>
 * History:
 * <author> 作者姓名
 * <time> 修改时间
 * <version> 版本号
 * <desc> 版本描述
 */
package com.iyaovo.paper.foreground.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iyaovo.paper.common.api.CommonPage;
import com.iyaovo.paper.foreground.domain.entity.OrderInfo;
import com.iyaovo.paper.foreground.mapper.OrderInfoMapper;
import com.iyaovo.paper.foreground.service.IOrderInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OrderInfoServiceImpl
 * @Description: java类描述
 * @Author: 22932
 * @Date: 2024/4/13 20:31:28
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {
   @Override
   public CommonPage<OrderInfo> showOrderInfo(Integer pageNum, Integer pageSize) {
      return null;
   }

   @Override
   public CommonPage<OrderInfo> showOrderInfoByStatus(Integer orderStatus, Integer pageNum, Integer pageSize) {
      return null;
   }
}

