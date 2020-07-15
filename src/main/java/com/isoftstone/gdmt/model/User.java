package com.isoftstone.gdmt.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class User {
    /* 用户主键 */
    private String user_uuid;
    /* 用户id */
    private String id;
    /* 用户名 */
    private String username;
    /* 密码 */
    private String password;
    /*邮箱 */
    private String email;
    /* 手机号 */
    private String mobile;
    /*是否停用 0 否 1 是*/
    private Integer enabled;
    /* 部门 */
    private Organization organ;

    private String organ_uuid;
    /* 岗位 */
    private List<Duty> duties;
    /* 昵称 */
    private String nice_name;
    /* 是否为管理员 0否1是 */
    private Integer is_admin;
    /* 注册时间 */
    private Date registerdate;
    /* 最后登录时间*/
    private Date lastlogintime;
    /* 密保问题 */
    private String pwdque;
    /*密报答案 */
    private String pwdans;
    /* 备注 */
    private String remark;
    /* */
    private String status = "0";
    /* 操作时间*/
    private Timestamp modtime;
    /* 操作人ID */
    private String modifierid;
    /* 是否阳光用户 0否1是 */
    private Integer is_sum;


    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String user_uuid, String id, String username, String password, String email, String mobile,
                Integer enabled, Organization organ, String organ_uuid, List<Duty> duties, String nice_name,
                Integer is_admin, Date registerdate, Date lastlogintime, String pwdque, String pwdans, String remark,
                String status, Timestamp modtime, String modifierid, Integer is_sum) {
        super();
        this.user_uuid = user_uuid;
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.enabled = enabled;
        this.organ = organ;
        this.organ_uuid = organ_uuid;
        this.duties = duties;
        this.nice_name = nice_name;
        this.is_admin = is_admin;
        this.registerdate = registerdate;
        this.lastlogintime = lastlogintime;
        this.pwdque = pwdque;
        this.pwdans = pwdans;
        this.remark = remark;
        this.status = status;
        this.modtime = modtime;
        this.modifierid = modifierid;
        this.is_sum = is_sum;
    }

    public String getUser_uuid() {
        return user_uuid;
    }

    public void setUser_uuid(String user_uuid) {
        this.user_uuid = user_uuid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Organization getOrgan() {
        return organ;
    }

    public void setOrgan(Organization organ) {
        this.organ = organ;
    }

    public String getOrgan_uuid() {
        return organ_uuid;
    }

    public void setOrgan_uuid(String organ_uuid) {
        this.organ_uuid = organ_uuid;
    }

    public List<Duty> getDuties() {
        return duties;
    }

    public void setDuties(List<Duty> duties) {
        this.duties = duties;
    }

    public String getNice_name() {
        return nice_name;
    }

    public void setNice_name(String nice_name) {
        this.nice_name = nice_name;
    }

    public Integer getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Integer is_admin) {
        this.is_admin = is_admin;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getPwdque() {
        return pwdque;
    }

    public void setPwdque(String pwdque) {
        this.pwdque = pwdque;
    }

    public String getPwdans() {
        return pwdans;
    }

    public void setPwdans(String pwdans) {
        this.pwdans = pwdans;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getModtime() {
        return modtime;
    }

    public void setModtime(Timestamp modtime) {
        this.modtime = modtime;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public Integer getIs_sun() {
        return is_sum;
    }

    public void setIs_sun(Integer is_sun) {
        this.is_sum = is_sun;
    }

    @Override
    public String toString() {
        return "User [user_uuid=" + user_uuid + ", id=" + id + ", username=" + username + ", password=" + password
                + ", email=" + email + ", mobile=" + mobile + ", enabled=" + enabled + ", organ=" + organ
                + ", organ_uuid=" + organ_uuid + ", duties=" + duties + ", nice_name=" + nice_name + ", is_admin="
                + is_admin + ", registerdate=" + registerdate + ", lastlogintime=" + lastlogintime + ", pwdque="
                + pwdque + ", pwdans=" + pwdans + ", remark=" + remark + ", status=" + status + ", modtime=" + modtime
                + ", modifierid=" + modifierid + ", is_sum=" + is_sum + "]";
    }

}
