package com.isoftstone.gdmt.model;

public class TbRRoleOrgan {
    private String dutyid;

    private String name;

    //private String organUuid;
    private Organization organization;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public TbRRoleOrgan(String dutyid, String name) {
        this.dutyid = dutyid;
        this.name = name;
    }

    public TbRRoleOrgan() {
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    private Role role;

    public String getDutyid() {
        return dutyid;
    }

    public void setDutyid(String dutyid) {
        this.dutyid = dutyid == null ? null : dutyid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

}