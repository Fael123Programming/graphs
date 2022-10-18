package br.com.rafael.node.concrete;

import br.com.rafael.node.abstract_.AbstractNode;

public class Node implements AbstractNode {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
