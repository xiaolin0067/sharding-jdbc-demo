package com.zlin.shardingjdbcdemo;

import com.zlin.shardingjdbcdemo.dao.AreaDOMapper;
import com.zlin.shardingjdbcdemo.dao.OrderDOMapper;
import com.zlin.shardingjdbcdemo.model.AreaDO;
import com.zlin.shardingjdbcdemo.model.AreaDOExample;
import com.zlin.shardingjdbcdemo.model.OrderDO;
import com.zlin.shardingjdbcdemo.model.OrderDOExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Resource
    private OrderDOMapper orderDOMapper;

    @Resource
    private AreaDOMapper areaDOMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testOrder() {
        OrderDO order = new OrderDO();
        order.setUserId(20);
        order.setId(2);
        order.setOrderAmount(BigDecimal.TEN);
        order.setOrderStatus(1);

        orderDOMapper.insert(order);
    }

    @Test
    public void testSelectOrder() {
        OrderDOExample example = new OrderDOExample();
        example.createCriteria().andIdEqualTo(2);
        List<OrderDO> orderDOS = orderDOMapper.selectByExample(example);
        orderDOS.forEach(e -> System.out.println(e.toString()));
    }

    @Test
    public void testGlobal(){
        AreaDO area = new AreaDO();
        area.setId(1);
        area.setName("上海");
        areaDOMapper.insert(area);
    }

    @Test
    public void selectGlobal() {
        AreaDOExample example = new AreaDOExample();
        example.createCriteria().andIdEqualTo(1);
        List<AreaDO> areaDOS = areaDOMapper.selectByExample(example);
        areaDOS.forEach(e -> System.out.println(e.toString()));
    }
}
