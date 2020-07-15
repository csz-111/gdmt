package com.isoftstone.gdmt.model;

import java.io.Serializable;

public class Resource1 implements Serializable {
    private String res_uuid;

    private String id;

    private String res_id;

    private String res_name;

    private String res_url;

    private String res_type;

    private String parent_uuid;

    private String order;

    private static final long serialVersionUID = 1L;

    public String getRes_uuid() {
        return res_uuid;
    }

    public void setRes_uuid(String res_uuid) {
        this.res_uuid = res_uuid;
    }

    public String getRes_id() {
        return res_id;
    }

    public void setRes_id(String res_id) {
        this.res_id = res_id;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public String getRes_url() {
        return res_url;
    }

    public void setRes_url(String res_url) {
        this.res_url = res_url;
    }

    public String getRes_type() {
        return res_type;
    }

    public void setRes_type(String res_type) {
        this.res_type = res_type;
    }

    public String getParent_uuid() {
        return parent_uuid;
    }

    public void setParent_uuid(String parent_uuid) {
        this.parent_uuid = parent_uuid;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Resource1 [res_uuid=" + res_uuid + ", id=" + id + ", res_id=" + res_id + ", res_name=" + res_name
                + ", res_url=" + res_url + ", res_type=" + res_type + ", parent_uuid=" + parent_uuid + ", order="
                + order + "]";
    }


}