package needs;

public abstract class Need {

    public static final int DEFAULT_STEP = 1;

    int value;

    public Need(int initialValue) {
        this.value = initialValue;
    }

    public int getValue() {
        return value;
    }

    public int step() {
        return DEFAULT_STEP;
    }

    public void increase() {
        value+=step();
    }

    public void decrease() {
        value-=step();
    }
}
