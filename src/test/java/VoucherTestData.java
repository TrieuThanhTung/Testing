import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VoucherTestData {
    @Test
    void test1() {
        assertEquals("invalid input", new Voucher("clothing", -1000).verifyValue());
    }

    @Test
    void test2() {
        assertEquals(0.05, Double.parseDouble(new Voucher("electron", 100000).verifyValue()));
    }

    @Test
    void test3() {
        assertEquals(0.1, Double.parseDouble(new Voucher("electron", 750000).verifyValue()));
    }

    @Test
    void test4() {
        assertEquals(0.15, Double.parseDouble(new Voucher("electron", 2400000).verifyValue()));
    }

    @Test
    void test5() {
        assertEquals(0, Double.parseDouble(new Voucher("food", 10000).verifyValue()));
    }

    @Test
    void test6() {
        assertEquals(0, Double.parseDouble(new Voucher("clothing", 150000).verifyValue()));
    }

    @Test
    void test7() {
        assertEquals(0.05, Double.parseDouble(new Voucher("clothing", 800000).verifyValue()));
    }

    @Test
    void test8() {
        assertEquals(0.1, Double.parseDouble(new Voucher("clothing", 3000000).verifyValue()));
    }
}
