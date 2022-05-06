package br.com.rafael.connection.concrete;

import br.com.rafael.connection.abstract_.Connection;
import br.com.rafael.node.abstract_.AbstractNode;

import java.util.ArrayList;
import java.util.List;

public class MultipleConnection extends Connection {
    private final List<Integer> values;

    {
        values = new ArrayList<>();
    }

    public MultipleConnection(AbstractNode firstNode, int value, AbstractNode secondNode) {
        super(firstNode, secondNode);
        this.values.add(value);
    }

    /**
     * Returns the value of the cheapest connection
     * between firstNode and secondNode.
     * @return the value of the cheapest connection between firstNode and secondNode
     */
    @Override
    public int getValue() {
        int value = values.get(0);
        for (int i : values) {
            if (i < value) {
                value = i;
            }
        }
        return value;
    }

    public int getValueOfConnection(int connectionIndex) {
        if (connectionIndex < 0 || connectionIndex >= values.size()) {
            throw new IllegalArgumentException("invalid connection index: " + connectionIndex);
        }
        return values.get(connectionIndex);
    }

    public void addConnection(int connectionValue) {
        this.values.add(connectionValue);
    }

    public int removeConnection(int connectionIndex) {
        if (connectionIndex < 0 || connectionIndex >= values.size()) {
            throw new IllegalArgumentException("invalid connection index: " + connectionIndex);
        }
        return values.remove(connectionIndex);
    }
}
