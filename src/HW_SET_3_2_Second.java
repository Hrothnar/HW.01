public class HW_SET_3_2_Second {
    private int num1;
    private int num2;

    public HW_SET_3_2_Second(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HW_SET_3_2_Second that = (HW_SET_3_2_Second) o;
        return (num1 == that.num1 && num2 == that.num2) || (num1 == that.num2 && num2 == that.num1);
    }

    @Override
    public int hashCode() {
        return num1 * num2;
    }

    @Override
    public String toString() {
        return num1 + " * " + num2 + " =";
    }


}


