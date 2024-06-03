import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import subclasses.Balance;

import java.util.Arrays;

class WeigherWeigh3Test {

    Weigher weigher = new Weigher();

    @Test
     void convertWeightToBinary_when5_mustReturn100() {
        int[] BINARY_ARRAY = {1, 0, 0};
        int WEIGHT = 5;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);

        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    @Test
    void convertWeightToBinary_when10_mustReturn010() {
        int[] BINARY_ARRAY = {0, 1, 0};
        int WEIGHT = 10;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);
        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    @Test
    void convertWeightToBinary_when15_mustReturn010() {
        int[] BINARY_ARRAY = {1, 1, 0};
        int WEIGHT = 15;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);
        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    @Test
    void convertWeightToBinary_when20_mustReturn001() {
        int[] BINARY_ARRAY = {0, 0, 1};
        int WEIGHT = 20;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);
        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    @Test
    void convertWeightToBinary_when25_mustReturn101() {
        int[] BINARY_ARRAY = {1, 0, 1};
        int WEIGHT = 25;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);
        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    @Test
    void convertWeightToBinary_when30_mustReturn110() {
        int[] BINARY_ARRAY = {0, 1, 1};
        int WEIGHT = 30;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);
        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    @Test
    void convertWeightToBinary_when35_mustReturn111() {
        int[] BINARY_ARRAY = {1, 1, 1};
        int WEIGHT = 35;

        int [] returnedArray = Weigher.convertWeightToBinaryIndexes(WEIGHT);
        for (int i=0; i<BINARY_ARRAY.length-1; i++)
            Assertions.assertEquals(BINARY_ARRAY[i], returnedArray[i]);
    }

    //Test cases for loadWeights
    @Test
    void loadWeight_when100_mustReturn5() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {1, 0, 0};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(1, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(5, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(5)));
    }

    @Test
    void loadWeight_when010_mustReturn10() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {0, 1, 0};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(1, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(10, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(10)));
    }

    @Test
    void loadWeight_when110_mustReturn5and10() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {1, 1, 0};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(2, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(15, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(5, 10)));
    }

    @Test
    void loadWeight_when001_mustReturn20() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {0, 0, 1};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(1, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(20, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(20)));
    }

    @Test
    void loadWeight_when101_mustReturn5and20() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {1, 0, 1};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(2, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(25, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(5, 20)));
    }

    @Test
    void loadWeight_when011_mustReturn10and20() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {0, 1, 1};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(2, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(30, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(10, 20)));
    }

    @Test
    void loadWeight_when111_mustReturn5and10and20() {
        Balance balance = new Balance(1);
        int[] INDEXES_ARRAY = {1, 1, 1};

        Weigher.loadWeights(INDEXES_ARRAY, balance);
        Assertions.assertEquals(3, balance.getWeightTray().getWeights().size());
        Assertions.assertEquals(35, balance.getWeightTray().getTotalWeight());
        Assertions.assertTrue(balance.getWeightTray().getWeights().containsAll(Arrays.asList(5, 10, 20)));
    }

    // Test cases for weight samples
    @Test
    void weigh_whenSample4g_mustReturn5() {
        int SAMPLE_WEIGHT = 4;
        int EXPECTED_WEIGHT = 5;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample5g_mustReturn5() {
        int SAMPLE_WEIGHT = 5;
        int EXPECTED_WEIGHT = 5;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample6g_mustReturn10() {
        int SAMPLE_WEIGHT = 6;
        int EXPECTED_WEIGHT = 10;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample10g_mustReturn10() {
        int SAMPLE_WEIGHT = 10;
        int EXPECTED_WEIGHT = 10;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample11g_mustReturn15() {
        int SAMPLE_WEIGHT = 11;
        int EXPECTED_WEIGHT = 15;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample15_mustReturn15() {
        int SAMPLE_WEIGHT = 15;
        int EXPECTED_WEIGHT = 15;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample16_mustReturn20() {
        int SAMPLE_WEIGHT = 16;
        int EXPECTED_WEIGHT = 20;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample20_mustReturn20() {
        int SAMPLE_WEIGHT = 20;
        int EXPECTED_WEIGHT = 20;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample21_mustReturn25() {
        int SAMPLE_WEIGHT = 21;
        int EXPECTED_WEIGHT = 25;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample25_mustReturn25() {
        int SAMPLE_WEIGHT = 25;
        int EXPECTED_WEIGHT = 25;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample26_mustReturn30() {
        int SAMPLE_WEIGHT = 26;
        int EXPECTED_WEIGHT = 30;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample30_mustReturn30() {
        int SAMPLE_WEIGHT = 30;
        int EXPECTED_WEIGHT = 30;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample31_mustReturn35() {
        int SAMPLE_WEIGHT = 31;
        int EXPECTED_WEIGHT = 35;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample35_mustReturn35() {
        int SAMPLE_WEIGHT = 35;
        int EXPECTED_WEIGHT = 35;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample36_mustReturnMinus1() {
        int SAMPLE_WEIGHT = 36;
        int EXPECTED_WEIGHT = -1;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample40_mustReturnMinus1() {
        int SAMPLE_WEIGHT = 40;
        int EXPECTED_WEIGHT = -1;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh3(SAMPLE_WEIGHT));
    }

}