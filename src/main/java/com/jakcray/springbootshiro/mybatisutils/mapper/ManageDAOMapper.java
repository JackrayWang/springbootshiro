package com.jakcray.springbootshiro.mybatisutils.mapper;

import com.jakcray.springbootshiro.mybatisutils.dao.ManageDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.ManageDAOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ManageDAOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int countByExample(ManageDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int deleteByExample(ManageDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String idmanage);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int insert(ManageDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int insertSelective(ManageDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    List<ManageDAO> selectByExample(ManageDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    ManageDAO selectByPrimaryKey(String idmanage);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ManageDAO record, @Param("example") ManageDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ManageDAO record, @Param("example") ManageDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ManageDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ManageDAO record);
}