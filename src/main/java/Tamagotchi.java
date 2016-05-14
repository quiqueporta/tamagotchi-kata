import needs.*;

public class Tamagotchi {

    private Hungriness hungriness;
    private Fullness fullness;
    private Happiness happiness;
    private Tiredness tiredness;
    private Youthfulness youthfulness;

    public Tamagotchi(NeedsConfiguration needsConfiguration) {
        hungriness = new Hungriness(needsConfiguration.getHungriness());
        fullness = new Fullness(needsConfiguration.getFullness());
        happiness = new Happiness(needsConfiguration.getHappiness());
        tiredness = new Tiredness(needsConfiguration.getTiredness());
        youthfulness = new Youthfulness(needsConfiguration.getYouthfulness());
    }

    public int getHungriness() {
        return hungriness.getValue();
    }

    public int getFullness() {
        return fullness.getValue();
    }

    public int getHappiness() {
        return happiness.getValue();
    }

    public int getTiredness() {
        return tiredness.getValue();
    }

    public int getYouthfulness() {
        return youthfulness.getValue();
    }

    public void feed() {
        hungriness.decrease();
        fullness.increase();
    }

    public void play() {
        happiness.increase();
        tiredness.increase();
    }

    public void putToBed() {
        tiredness.decrease();
    }

    public void poop() {
        fullness.decrease();
    }

    public void tick() {
        tiredness.increase();
        hungriness.increase();
        happiness.decrease();
        youthfulness.decrease();
    }

}
