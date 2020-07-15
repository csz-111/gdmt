package com.isoftstone.gdmt.model;

import java.util.List;

public class Node {
    private String id;
    private String name;
    private String pid;
    private boolean hasChildren = true;
    private List<Node> children;

    public Node() {
    }

    public Node(String id, String name, String pid, boolean hasChildren, List<Node> children) {
        super();
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.hasChildren = hasChildren;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    @Override
    public String toString() {
        return "Node [id=" + id + ", name=" + name + ", pid=" + pid + ", hasChildren=" + hasChildren + ", children="
                + children + "]";
    }

}
