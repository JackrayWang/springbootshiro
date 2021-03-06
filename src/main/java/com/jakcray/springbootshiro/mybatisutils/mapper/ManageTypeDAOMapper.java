package com.jakcray.springbootshiro.mybatisutils.mapper;

import com.jakcray.springbootshiro.mybatisutils.dao.ManageTypeDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.ManageTypeDAOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ManageTypeDAOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int countByExample(ManageTypeDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int deleteByExample(ManageTypeDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String idmanagetype);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int insert(ManageTypeDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int insertSelective(ManageTypeDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    List<ManageTypeDAO> selectByExample(ManageTypeDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    ManageTypeDAO selectByPrimaryKey(String idmanagetype);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ManageTypeDAO record, @Param("example") ManageTypeDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ManageTypeDAO record, @Param("example") ManageTypeDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ManageTypeDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table managetype
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ManageTypeDAO record);
}