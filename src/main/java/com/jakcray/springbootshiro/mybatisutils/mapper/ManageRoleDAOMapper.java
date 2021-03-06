package com.jakcray.springbootshiro.mybatisutils.mapper;

import com.jakcray.springbootshiro.mybatisutils.dao.ManageRoleDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.ManageRoleDAOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ManageRoleDAOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int countByExample(ManageRoleDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int deleteByExample(ManageRoleDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String idmanageRole);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int insert(ManageRoleDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int insertSelective(ManageRoleDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    List<ManageRoleDAO> selectByExample(ManageRoleDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    ManageRoleDAO selectByPrimaryKey(String idmanageRole);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ManageRoleDAO record, @Param("example") ManageRoleDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ManageRoleDAO record, @Param("example") ManageRoleDAOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ManageRoleDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manage_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ManageRoleDAO record);
}