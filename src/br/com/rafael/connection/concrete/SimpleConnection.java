package br.com.rafael.connection.concrete;

import br.com.rafael.connection.abstract_.Connection;
import br.com.rafael.node.abstract_.AbstractNode;

public class SimpleConnection extends Connection {
    private int value;

    public SimpleConnection(AbstractNode firstNode, int value, AbstractNode secondNode) {
        super(firstNode, secondNode);
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
