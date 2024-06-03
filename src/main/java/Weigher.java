import subclasses.Balance;
import subclasses.IndexedInteger;

import java.util.ArrayList;
import java.util.List;

public class Weigher {

    /**
     * Most intuitive solution. It is used nested if-else conditions while weight is incremented with 5g units.
     * @param weightSample
     * @return
     */
    public static Integer weigh1(Integer weightSample) {

        Balance balance = new Balance(weightSample);

        balance.addWeightToWeightTray(0);
        //In here weightTray weights 5g
        if (!balance.isOverWeight()) {
            return 5;
        } else {
            balance.removeWeightToWeightTray(0);
            balance.addWeightToWeightTray(1);
            //In here weightTray weights 10g
        }
        if (!balance.isOverWeight()) {
            return 10;
        } else {
            balance.addWeightToWeightTray(0);
            //In here weightTray weights 15g
        }
        if (!balance.isOverWeight()) {
            return 15;
        } else {
            balance.removeWeightToWeightTray(0);
            balance.removeWeightToWeightTray(1);
            balance.addWeightToWeightTray(2);
            //In here weightTray weights 20g
        }
        if (!balance.isOverWeight()) {
            return 20;
        } else {
            balance.addWeightToWeightTray(0);
            //In here weightTray weights 25g
        }
        if (!balance.isOverWeight()) {
            return 25;
        } else {
            balance.removeWeightToWeightTray(0);
            balance.addWeightToWeightTray(1);
            //In here weightTray weights 30g
        }
        if (!balance.isOverWeight()) {
            return 30;
        } else {
            balance.addWeightToWeightTray(0);
            //In here weightTray weights 35g
        }
        if (!balance.isOverWeight()) {
            return 35;
        } else {
            return -1;
        }
    }

    /**
     * This solution uses subclasses.IndexedInteger objects to store status for each weight. It is used recursive remainders
     *  to determine quotients which will be used to select a weight.
     *
     * @param weightSample
     *
     * @return
     */
    public static Integer weigh2(Integer weightSample) {

        Balance balance = new Balance(weightSample);

        int weight = 5;
        while (weight <= 35) {
            loadWeights(selectWeights(weight), balance);
            if (!balance.isOverWeight())
                return weight;
            weight += 5;
        }

        return -1;
    }

    /**
     * Optimized solution. Indexes are calculated with unitary increments of binary. In the end the binary string array
     * is reversed.
     *
     * @param weightSample
     * @return
     */
    public static Integer weigh3(Integer weightSample) {

        int WEIGHT_STEP = 5;
        int MAX_WEIGHT = 35;

        Balance balance = new Balance(weightSample);

        int weight = WEIGHT_STEP; //First weight
        while (weight <= MAX_WEIGHT) {

            int[] indexes = convertWeightToBinaryIndexes(weight);
            loadWeights(indexes, balance);
            if (!balance.isOverWeight())
                return weight;

            weight += WEIGHT_STEP;
        }

        return -1;
    }

    public static int[] convertWeightToBinaryIndexes(int weight) {

        int binaryWeight = weight/5;
        String binaryString = Integer.toBinaryString(binaryWeight);
        while (binaryString.length() < 3) {
            binaryString = "0" + binaryString;
        }

        int[] reversedBinary = new int[3];
        for (int i = 0; i < binaryString.length(); i++)
            reversedBinary[i] = Character.getNumericValue(binaryString.charAt(binaryString.length()-1-i));
        return reversedBinary;
    }

    public static void loadWeights(int[] indexes, Balance balance) {

        for (int i=0; i<indexes.length; i++)
            if (indexes[i] == 1)
                balance.addWeightToWeightTray(i);
            else
                balance.removeWeightToWeightTray(i);
    }

    public static void loadWeights(List<IndexedInteger> weights, Balance balance) {

        weights.stream()
                .forEach(ii -> {
                    if (ii.getQuotient() == 1)
                        balance.addWeightToWeightTray(ii.getIndex());
                    else
                        balance.removeWeightToWeightTray(ii.getIndex());
                });
    }

    public static List<IndexedInteger> selectWeights(int weight) {

        //List for measuring weights available
        ArrayList<IndexedInteger> list = new ArrayList<>();
        list.add(new IndexedInteger(20, 2));
        list.add(new IndexedInteger(10, 1));
        list.add(new IndexedInteger(5, 0));

        int remainder = weight;
        for (IndexedInteger ii: list) {
            ii.setQuotient(remainder/ii.getValue());
            remainder %= ii.getValue();
            if (remainder == 0) break;
        }

        return list;
    }

}
