package needs;

public class Youthfulness extends Need {
    public Youthfulness(int initialValue) {
        super(initialValue);
    }

    @Override
    public int step() {
        return 2;
    }

    @Override
    public void decrease() {
        super.decrease();
        if (value < 0) {
            value=0;
        }
    }
}
