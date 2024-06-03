package subclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Balance {

    private Tray sampleTray;
    private Tray weightTray;
    private List<Integer> weightsShelf = new ArrayList<>(Arrays.asList(5 , 10, 20));

    public Balance(Integer sampleWeight) {

        this.sampleTray = new Tray();
        sampleTray.addWeight(sampleWeight);
        this.weightTray = new Tray();
    }

    public Boolean addWeightToWeightTray(Integer index) {

        return this.weightTray.addWeight(weightsShelf.get(index));
    }

    public Boolean removeWeightToWeightTray(Integer index) {

        return this.weightTray.removeWeight(weightsShelf.get(index));
    }

    public Boolean isOverWeight() {

        return (sampleTray.getTotalWeight() > weightTray.getTotalWeight());
    }

    public Tray getWeightTray() {
        return weightTray;
    }

}
