package Bank;

public class PiggyBank implements Measurable{
    private int one;
    private int five;
    private int ten;
    private int size;

    public void addOne(int n) {
        this.one = n;
    }

    public void addFive(int n) {
        this.five = n;
    }

    public void addTen(int n) {
        this.ten = n;
    }

    public double getMeasure() {
        if(size < one + five + ten) {
            if (one == size) {
                return one * 1;
            }else if(one < size && one + five >= size) {
                int minusFiveSize = (one + five) - size;
                return (one * 1) + (minusFiveSize * 5);
            }else{
                int minusTenSize = (one + five + ten) - size;
                return (one * 1) + (five * 5) + (minusTenSize + 10);
            }
        }else{
            return (one * 1) + (five * 5) + (ten * 10);
        }
    }
    public PiggyBank(int size) {
        this.size = size;
    }
}
