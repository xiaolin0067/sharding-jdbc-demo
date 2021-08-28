package com.zlin.shardingjdbcdemo.dao;

import com.zlin.shardingjdbcdemo.model.AreaDO;
import com.zlin.shardingjdbcdemo.model.AreaDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    long countByExample(AreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int deleteByExample(AreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int insert(AreaDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int insertSelective(AreaDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    List<AreaDO> selectByExample(AreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    AreaDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int updateByExampleSelective(@Param("record") AreaDO record, @Param("example") AreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int updateByExample(@Param("record") AreaDO record, @Param("example") AreaDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int updateByPrimaryKeySelective(AreaDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_area
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    int updateByPrimaryKey(AreaDO record);
}