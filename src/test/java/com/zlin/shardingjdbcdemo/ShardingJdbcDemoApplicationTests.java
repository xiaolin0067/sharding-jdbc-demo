package com.zlin.shardingjdbcdemo;

import com.zlin.shardingjdbcdemo.dao.OrderDOMapper;
import com.zlin.shardingjdbcdemo.model.OrderDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Resource
    private OrderDOMapper orderDOMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testOrder() {
        OrderDO order = new OrderDO();
        order.setUserId(19);
        order.setId(1);
        order.setOrderAmount(BigDecimal.TEN);
        order.setOrderStatus(1);

        orderDOMapper.insert(order);
    }
}
