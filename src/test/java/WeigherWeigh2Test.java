import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import subclasses.IndexedInteger;

import java.util.List;

class WeigherWeigh2Test {

    Weigher weigher = new Weigher();

    @Test
    void selectWeighs_whenWeight5_mustReturn001() {

        int WEIGH_TO_SELECT = 5;
        int[] EXPECTED_ARRAY = new int[]{0, 0, 1};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void selectWeighs_whenWeight10_mustReturn010() {

        int WEIGH_TO_SELECT = 10;
        int[] EXPECTED_ARRAY = new int[]{0, 1, 0};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void selectWeighs_whenWeight15_mustReturn011() {

        int WEIGH_TO_SELECT = 15;
        int[] EXPECTED_ARRAY = new int[]{0, 1, 1};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void selectWeighs_whenWeight20_mustReturn100() {

        int WEIGH_TO_SELECT = 20;
        int[] EXPECTED_ARRAY = new int[]{1, 0, 0};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void selectWeighs_whenWeight25_mustReturn101() {

        int WEIGH_TO_SELECT = 25;
        int[] EXPECTED_ARRAY = new int[]{1, 0, 1};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void selectWeighs_whenWeight30_mustReturn101() {

        int WEIGH_TO_SELECT = 30;
        int[] EXPECTED_ARRAY = new int[]{1, 1, 0};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void selectWeighs_whenWeight35_mustReturn101() {

        int WEIGH_TO_SELECT = 35;
        int[] EXPECTED_ARRAY = new int[]{1, 1, 1};
        List<IndexedInteger> selectedWeighs = Weigher.selectWeights(WEIGH_TO_SELECT);

        for (int i =0; i<EXPECTED_ARRAY.length; i++)
            Assertions.assertEquals(EXPECTED_ARRAY[i], selectedWeighs.get(i).getQuotient());
    }

    @Test
    void weigh_whenSample4g_mustReturn5() {
        int SAMPLE_WEIGHT = 4;
        int EXPECTED_WEIGHT = 5;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample5g_mustReturn5() {
        int SAMPLE_WEIGHT = 5;
        int EXPECTED_WEIGHT = 5;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample6g_mustReturn10() {
        int SAMPLE_WEIGHT = 6;
        int EXPECTED_WEIGHT = 10;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample10g_mustReturn10() {
        int SAMPLE_WEIGHT = 10;
        int EXPECTED_WEIGHT = 10;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample11g_mustReturn15() {
        int SAMPLE_WEIGHT = 11;
        int EXPECTED_WEIGHT = 15;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample15_mustReturn15() {
        int SAMPLE_WEIGHT = 15;
        int EXPECTED_WEIGHT = 15;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample16_mustReturn20() {
        int SAMPLE_WEIGHT = 16;
        int EXPECTED_WEIGHT = 20;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample20_mustReturn20() {
        int SAMPLE_WEIGHT = 20;
        int EXPECTED_WEIGHT = 20;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample21_mustReturn25() {
        int SAMPLE_WEIGHT = 21;
        int EXPECTED_WEIGHT = 25;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample25_mustReturn25() {
        int SAMPLE_WEIGHT = 25;
        int EXPECTED_WEIGHT = 25;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample26_mustReturn30() {
        int SAMPLE_WEIGHT = 26;
        int EXPECTED_WEIGHT = 30;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample30_mustReturn30() {
        int SAMPLE_WEIGHT = 30;
        int EXPECTED_WEIGHT = 30;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample31_mustReturn35() {
        int SAMPLE_WEIGHT = 31;
        int EXPECTED_WEIGHT = 35;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample35_mustReturn35() {
        int SAMPLE_WEIGHT = 35;
        int EXPECTED_WEIGHT = 35;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample36_mustReturnMinus1() {
        int SAMPLE_WEIGHT = 36;
        int EXPECTED_WEIGHT = -1;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

    @Test
    void weigh_whenSample40_mustReturnMinus1() {
        int SAMPLE_WEIGHT = 40;
        int EXPECTED_WEIGHT = -1;
        Assertions.assertEquals(EXPECTED_WEIGHT, weigher.weigh2(SAMPLE_WEIGHT));
    }

}