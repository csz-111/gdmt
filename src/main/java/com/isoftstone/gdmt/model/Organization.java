package com.isoftstone.gdmt.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Organization {
    /* 主键 */
    private String organ_uuid;
    /* 组织编码 */
    private String organ_code;
    /* 组织名称 */
    private String organ_name;
    /* 组织类型 */
    private String organ_type;
    /* 是否在用 */
    private String in_use;
    /* 父组织id */
    private String parent_uuid;
    /* 状态 */
    private String status;
    /* 操作人 */
    private String modifierid;
    /* 修改时间 */
    private Timestamp modtime = new Timestamp(new Date().getTime());
    /* 描述 */
    private String description;
    /* 组织账号编码 */
    private String account_code;
    /* 简称 */
    private String shortname;

    private List<Organization> children;

    private Organization parent;

    public Organization() {
        super();
    }

    public Organization(String organ_uuid, String organ_code, String organ_name, String organ_type, String in_use,
                        String parent_uuid, String status, String modifierid, Timestamp modtime, String description,
                        String account_code, String shortname) {
        super();
        this.organ_uuid = organ_uuid;
        this.organ_code = organ_code;
        this.organ_name = organ_name;
        this.organ_type = organ_type;
        this.in_use = in_use;
        this.parent_uuid = parent_uuid;
        this.status = status;
        this.modifierid = modifierid;
        this.modtime = modtime;
        this.description = description;
        this.account_code = account_code;
        this.shortname = shortname;
    }

    public Organization(String organ_uuid, String organ_code, String organ_name, String organ_type, String in_use,
                        String parent_uuid, String status, String modifierid, Timestamp modtime, String description,
                        String account_code, String shortname, List<Organization> children, Organization parent) {
        super();
        this.organ_uuid = organ_uuid;
        this.organ_code = organ_code;
        this.organ_name = organ_name;
        this.organ_type = organ_type;
        this.in_use = in_use;
        this.parent_uuid = parent_uuid;
        this.status = status;
        this.modifierid = modifierid;
        this.modtime = modtime;
        this.description = description;
        this.account_code = account_code;
        this.shortname = shortname;
        this.children = children;
        this.parent = parent;
    }

    public String getOrgan_uuid() {
        return organ_uuid;
    }

    public void setOrgan_uuid(String organ_uuid) {
        this.organ_uuid = organ_uuid;
    }

    public String getOrgan_code() {
        return organ_code;
    }

    public void setOrgan_code(String organ_code) {
        this.organ_code = organ_code;
    }

    public String getOrgan_name() {
        return organ_name;
    }

    public void setOrgan_name(String organ_name) {
        this.organ_name = organ_name;
    }

    public String getOrgan_type() {
        return organ_type;
    }

    public void setOrgan_type(String organ_type) {
        this.organ_type = organ_type;
    }

    public String getIn_use() {
        return in_use;
    }

    public void setIn_use(String in_use) {
        this.in_use = in_use;
    }

    public String getParent_uuid() {
        return parent_uuid;
    }

    public void setParent_uuid(String parent_uuid) {
        this.parent_uuid = parent_uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid;
    }

    public Timestamp getModtime() {
        return modtime;
    }

    public void setModtime(Timestamp modtime) {
        this.modtime = modtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public List<Organization> getChildren() {
        return children;
    }

    public void setChildren(List<Organization> children) {
        this.children = children;
    }

    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Organization [organ_uuid=" + organ_uuid + ", organ_code=" + organ_code + ", organ_name=" + organ_name
                + ", organ_type=" + organ_type + ", in_use=" + in_use + ", parent_uuid=" + parent_uuid + ", status="
                + status + ", modifierid=" + modifierid + ", modtime=" + modtime + ", description=" + description
                + ", account_code=" + account_code + ", shortname=" + shortname + ", children=" + children + ", parent="
                + parent + "]";
    }

}