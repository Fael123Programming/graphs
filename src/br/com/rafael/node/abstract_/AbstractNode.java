package br.com.rafael.node.abstract_;

import java.util.Map;

public interface AbstractNode {
    String getName();

    Map<Integer, AbstractNode> getNeighbourhood();

    default int getDegree() {
        return getNeighbourhood().size();
    }
}
