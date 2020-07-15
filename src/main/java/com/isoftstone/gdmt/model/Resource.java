package com.isoftstone.gdmt.model;

import java.io.Serializable;

public class Resource implements Serializable {
    private String menu_id;

    private String dir_code;

    private String dir_name;

    private Integer dir_level_number;

    private String dir_type;

    private String resource_id;

    private String parent_id;

    private String isitem;

    private Integer dir_order;

    private String status;

    private String flag;

    private String menu_group_id;

    private String locale;

    private String res_uuid;

    private String realid;

    private String istransfer;

    private String menu_type;

    private Resource1 parent;

    public Resource1 getParent() {
        return parent;
    }

    public void setParent(Resource1 parent) {
        this.parent = parent;
    }

    private static final long serialVersionUID = 1L;

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    public String getDir_code() {
        return dir_code;
    }

    public void setDir_code(String dir_code) {
        this.dir_code = dir_code;
    }

    public String getDir_name() {
        return dir_name;
    }

    public void setDir_name(String dir_name) {
        this.dir_name = dir_name;
    }

    public Integer getDir_level_number() {
        return dir_level_number;
    }

    public void setDir_level_number(Integer dir_level_number) {
        this.dir_level_number = dir_level_number;
    }

    public String getDir_type() {
        return dir_type;
    }

    public void setDir_type(String dir_type) {
        this.dir_type = dir_type;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getIsitem() {
        return isitem;
    }

    public void setIsitem(String isitem) {
        this.isitem = isitem;
    }

    public Integer getDir_order() {
        return dir_order;
    }

    public void setDir_order(Integer dir_order) {
        this.dir_order = dir_order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMenu_group_id() {
        return menu_group_id;
    }

    public void setMenu_group_id(String menu_group_id) {
        this.menu_group_id = menu_group_id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getRes_uuid() {
        return res_uuid;
    }

    public void setRes_uuid(String res_uuid) {
        this.res_uuid = res_uuid;
    }

    public String getRealid() {
        return realid;
    }

    public void setRealid(String realid) {
        this.realid = realid;
    }

    public String getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(String istransfer) {
        this.istransfer = istransfer;
    }

    public String getMenu_type() {
        return menu_type;
    }

    public void setMenu_type(String menu_type) {
        this.menu_type = menu_type;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Resource [menu_id=" + menu_id + ", dir_code=" + dir_code + ", dir_name=" + dir_name
                + ", dir_level_number=" + dir_level_number + ", dir_type=" + dir_type + ", resource_id=" + resource_id
                + ", parent_id=" + parent_id + ", isitem=" + isitem + ", dir_order=" + dir_order + ", status=" + status
                + ", flag=" + flag + ", menu_group_id=" + menu_group_id + ", locale=" + locale + ", res_uuid="
                + res_uuid + ", realid=" + realid + ", istransfer=" + istransfer + ", menu_type=" + menu_type
                + ", parent=" + parent + "]";
    }


}