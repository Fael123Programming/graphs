package br.com.rafael.connection.abstract_;

import br.com.rafael.node.abstract_.AbstractNode;

public abstract class Connection {
    private AbstractNode firstNode, secondNode;

    public Connection(AbstractNode firstNode, AbstractNode secondNode) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
    }

    public AbstractNode getFirstNode() {
        return firstNode;
    }

    public AbstractNode getSecondNode() {
        return secondNode;
    }

    public abstract int getValue();

    public void setFirstNode(AbstractNode firstNode) {
        this.firstNode = firstNode;
    }

    public void setSecondNode(AbstractNode secondNode) {
        this.secondNode = secondNode;
    }

    public String toString() {
        return firstNode.toString() + " ---" + getValue() + "---> " + secondNode.toString();
    }
}
