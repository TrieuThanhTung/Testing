import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoucherTest {

    @Test
    void test1() {
        assertEquals("invalid input", new Voucher("food", -1000).verifyValue());
    }

    @Test
    void test2() {
        assertEquals(0, Double.parseDouble(new Voucher("food", 150000).verifyValue()));
    }

    @Test
    void test3() {
        assertEquals("invalid input", new Voucher("electron", -1500).verifyValue());
    }

    @Test
    void test4() {
        assertEquals(0.05, Double.parseDouble(new Voucher("electron", 300000).verifyValue()));
    }

    @Test
    void test5() {
        assertEquals(0.1, Double.parseDouble(new Voucher("electron", 700000).verifyValue()));
    }

    @Test
    void test6() {
        assertEquals(0.15, Double.parseDouble(new Voucher("electron", 3000000).verifyValue()));
    }

    @Test
    void test7() {
        assertEquals(new Voucher("electron", 8000000).verifyValue(), Double.toString(0));
        assertEquals(0, Double.parseDouble(new Voucher("electron", 8000000).verifyValue()));
    }

    @Test
    void test8() {
        assertEquals("invalid input", new Voucher("clothing", -2000).verifyValue());
    }

    @Test
    void test9() {
        assertEquals(0, Double.parseDouble(new Voucher("clothing", 400000).verifyValue()));
    }


    @Test
    void test10() {
        assertEquals(0.05, Double.parseDouble(new Voucher("clothing", 900000).verifyValue()));
    }

    @Test
    void test11() {
        assertEquals(0.1, Double.parseDouble(new Voucher("clothing", 2000000).verifyValue()));
    }

    @Test
    void test12() {
        assertEquals(0, Double.parseDouble(new Voucher("clothing", 12000000).verifyValue()));
    }
}
