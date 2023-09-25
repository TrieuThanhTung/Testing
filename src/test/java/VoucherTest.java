import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoucherTest {

    @Test
    void test1() {
        assertEquals(new Voucher("food", -1000).verifyValue(), "invalid input");
    }

    @Test
    void test2() {
        assertEquals(new Voucher("food", 150000).verifyValue(), Double.toString(0));
    }

    @Test
    void test3() {
        assertEquals(new Voucher("electron", -1500).verifyValue(), "invalid input");
    }

    @Test
    void test4() {
        assertEquals(new Voucher("electron", 300000).verifyValue(), Double.toString(0.05));
    }

    @Test
    void test5() {
        assertEquals(new Voucher("electron", 700000).verifyValue(), Double.toString(0.1));
    }

    @Test
    void test6() {
        assertEquals(new Voucher("electron", 3000000).verifyValue(), Double.toString(0.15));
    }

    @Test
    void test7() {
        assertEquals(new Voucher("electron", 8000000).verifyValue(), Double.toString(0));
    }

    @Test
    void test8() {
        assertEquals(new Voucher("clothing", -1500).verifyValue(), "invalid input");
    }

    @Test
    void test9() {
        assertEquals(new Voucher("clothing", 300000).verifyValue(), Double.toString(0));
    }

    @Test
    void test10() {
        assertEquals(new Voucher("clothing", 700000).verifyValue(), Double.toString(0.05));
    }

    @Test
    void test11() {
        assertEquals(new Voucher("clothing", 3000000).verifyValue(), Double.toString(0.1));
    }

    @Test
    void test12() {
        assertEquals(new Voucher("clothing", 8000000).verifyValue(), Double.toString(0));
    }
}
