
public class Voucher {
    private String typeOfGood;
    private int value;

    public Voucher() {
        typeOfGood = "goods";
        value = 0;
    }

    public Voucher(String typeOfGood, int value) {
        this.typeOfGood = typeOfGood;
        this.value = value;
    }

    public String getTypeOfGood() {
        return typeOfGood;
    }

    public void setTypeOfGood(String typeOfGood) {
        this.typeOfGood = typeOfGood;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String verifyValue() {
        if (this.value < 0) {
            return "invalid input";
        }
        if (this.typeOfGood.equals("electron") || this.typeOfGood.equals("clothing")) {
            if (0 <= value && value < 500000) {
                if (this.typeOfGood.equals("electron")) {
                    return Double.toString(0.05);
                } else {
                    return Double.toString(0);
                }
            } else if (500000 <= value && value < 1000000) {
                if (this.typeOfGood.equals("electron")) {
                    return Double.toString(0.1);
                } else {
                    return Double.toString(0.05);
                }
            } else if (1000000 <= value && value <= 5000000) {
                if (this.typeOfGood.equals("electron")) {
                    return Double.toString(0.15);
                } else {
                    return Double.toString(0.1);
                }
            }
        }
        return Double.toString(0);
    }
}
