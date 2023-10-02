import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class VoucherTestControl {
    @Test
    void test1() {
        assertEquals("invalid input", new Voucher("electron", -1000).verifyValue());
    }

    @Test
    void test2() {
        assertEquals(0, Double.parseDouble(new Voucher("food", 5000).verifyValue()));
    }

    @Test
    void test3() {
        assertEquals(0.05, Double.parseDouble(new Voucher("electron", 5000).verifyValue()));
    }

    @Test
    void test4() {
        assertEquals(0, Double.parseDouble(new Voucher("clothing", 10000).verifyValue()));
    }

    @Test
    void test5() {
        assertEquals(0.1, Double.parseDouble(new Voucher("electron", 600000).verifyValue()));
    }

    @Test
    void test6() {
        assertEquals(0.05, Double.parseDouble(new Voucher("clothing", 700000).verifyValue()));
    }

    @Test
    void test7() {
        assertEquals(0.15, Double.parseDouble(new Voucher("electron", 2000000).verifyValue()));
    }

    @Test
    void test8() {
        assertEquals(0.1, Double.parseDouble(new Voucher("clothing", 3000000).verifyValue()));
    }

    @Test
    void test9() {
        assertEquals(0, Double.parseDouble(new Voucher("clothing", 9000000).verifyValue()));
    }
}
