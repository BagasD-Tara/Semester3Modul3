import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TugasLab4Test {

    @Test
    void testFindMin_skenario1() {
        int result = TugasLab4.findMin(1, 2, 3);
        assertEquals(1, result, "Seharusnya nilai minimum adalah 1");
    }

    @Test
    void testFindMin_skenario2() {
        int result = TugasLab4.findMin(-1, -2, -3);
        assertEquals(-3, result, "Seharusnya nilai minimum adalah -3");
    }

    @Test
    void testFindMin_skenario3() {
        int result = TugasLab4.findMin(0, 0, 1);
        assertEquals(0, result, "Seharusnya nilai minimum adalah 0");
    }
}