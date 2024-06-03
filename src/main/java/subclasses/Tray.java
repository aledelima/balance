package subclasses;

import java.util.ArrayList;
import java.util.List;

public class Tray {

    List<Integer> weights;

    public Tray() {
        this.weights = new ArrayList<>();
    }

    public Tray(List<Integer> defaultWeights) {
        this.weights = defaultWeights;
    }

    public boolean addWeight(Integer weight) {

        if (weights.contains(weight))
            return false;

        weights.add(weight);
        return true;
    }

    public boolean removeWeight(Integer weight) {

        if (weights.contains(weight)) {
            weights.remove(weight);
            return true;
        }
        return false;
    }

    public List<Integer> getWeights() {
        return weights;
    }

    public Integer getTotalWeight() {
        return weights.stream().mapToInt(Integer::intValue).sum();
    }
}
