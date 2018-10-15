package com.xiejin.二叉树;

public class Node {

    @Override
    public String toString() {
        return "Node [data=" + data + ", lChild=" + lChild + ", rChild=" + rChild + "]";
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Node getlChild() {
        return lChild;
    }
    public void setlChild(Node lChild) {
        this.lChild = lChild;
    }
    public Node getrChild() {
        return rChild;
    }
    public void setrChild(Node rChild) {
        this.rChild = rChild;
    }
    public Node(String data, Node lChild, Node rChild) {
        super();
        this.data = data;
        this.lChild = lChild;
        this.rChild = rChild;
    }
    private String data;
    private Node lChild;
    private Node rChild;


}
