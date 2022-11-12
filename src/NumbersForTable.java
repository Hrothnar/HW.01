public class NumbersForTable {
    public int x;
    public int y;

    public NumbersForTable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumbersForTable that = (NumbersForTable) o;
        return (x == that.x && y == that.y) || (x == that.y && y == that.x);
    }

    @Override
    public int hashCode() {
        return x * y;
    }

    @Override
    public String toString() {
        return x + " * " + y + " =";
    }


}


