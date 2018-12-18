package com.jakcray.springbootshiro.mybatisutils.dao;

import java.util.Date;

public class PermissionDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.idpermission
     *
     * @mbggenerated
     */
    private String idpermission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.context
     *
     * @mbggenerated
     */
    private String context;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.descr
     *
     * @mbggenerated
     */
    private String descr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.idmodule
     *
     * @mbggenerated
     */
    private String idmodule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.addtime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.ts
     *
     * @mbggenerated
     */
    private Date ts;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.idpermission
     *
     * @return the value of permission.idpermission
     *
     * @mbggenerated
     */
    public String getIdpermission() {
        return idpermission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.idpermission
     *
     * @param idpermission the value for permission.idpermission
     *
     * @mbggenerated
     */
    public void setIdpermission(String idpermission) {
        this.idpermission = idpermission == null ? null : idpermission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.name
     *
     * @return the value of permission.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.name
     *
     * @param name the value for permission.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.context
     *
     * @return the value of permission.context
     *
     * @mbggenerated
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.context
     *
     * @param context the value for permission.context
     *
     * @mbggenerated
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.descr
     *
     * @return the value of permission.descr
     *
     * @mbggenerated
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.descr
     *
     * @param descr the value for permission.descr
     *
     * @mbggenerated
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.idmodule
     *
     * @return the value of permission.idmodule
     *
     * @mbggenerated
     */
    public String getIdmodule() {
        return idmodule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.idmodule
     *
     * @param idmodule the value for permission.idmodule
     *
     * @mbggenerated
     */
    public void setIdmodule(String idmodule) {
        this.idmodule = idmodule == null ? null : idmodule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.addtime
     *
     * @return the value of permission.addtime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.addtime
     *
     * @param addtime the value for permission.addtime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.ts
     *
     * @return the value of permission.ts
     *
     * @mbggenerated
     */
    public Date getTs() {
        return ts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.ts
     *
     * @param ts the value for permission.ts
     *
     * @mbggenerated
     */
    public void setTs(Date ts) {
        this.ts = ts;
    }
}