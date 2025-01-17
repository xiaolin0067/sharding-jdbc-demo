package com.zlin.shardingjdbcdemo.dao;

import com.zlin.shardingjdbcdemo.model.OrderDO;
import com.zlin.shardingjdbcdemo.model.OrderDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    long countByExample(OrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int deleteByExample(OrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int insert(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int insertSelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    List<OrderDO> selectByExample(OrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    OrderDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int updateByExampleSelective(@Param("record") OrderDO record, @Param("example") OrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int updateByExample(@Param("record") OrderDO record, @Param("example") OrderDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int updateByPrimaryKeySelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_1
     *
     * @mbg.generated Sat Aug 28 19:57:04 CST 2021
     */
    int updateByPrimaryKey(OrderDO record);
}