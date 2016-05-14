import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TamagotchiTest {

    Tamagotchi tamagotchi;
    NeedsConfiguration needsConfiguration;

    @Before
    public void setUp() throws Exception {
        needsConfiguration = new NeedsConfiguration();
        needsConfiguration.setHungriness(100);
        needsConfiguration.setFullness(100);
        needsConfiguration.setHappiness(100);
        needsConfiguration.setTiredness(100);
        needsConfiguration.setYouthfulness(100);

        tamagotchi = new Tamagotchi(needsConfiguration);
    }

    @Test
    public void testWhenIFeedItThenItsHungrinessDecrease() {
        int previousHungriness = tamagotchi.getHungriness();

        tamagotchi.feed();

        int actualHungriness = tamagotchi.getHungriness();

        Assert.assertTrue(actualHungriness < previousHungriness);
    }

    @Test
    public void testWhenIFeedItThenItsFullnessIncrease() {
        int previousFullness = tamagotchi.getFullness();

        tamagotchi.feed();

        int actualFullness = tamagotchi.getFullness();

        Assert.assertTrue(actualFullness > previousFullness);
    }

    @Test
    public void testWhenIPlayWithItThenItsHappinessIncrease() {
        int previousHappiness = tamagotchi.getHappiness();

        tamagotchi.play();

        int actualHappiness = tamagotchi.getHappiness();

        Assert.assertTrue(actualHappiness > previousHappiness);
    }

    @Test
    public void testWhenIPlayWithItThenItsTirednessIncrease() {
        int previousTiredness = tamagotchi.getTiredness();

        tamagotchi.play();

        int actualTiredness = tamagotchi.getTiredness();

        Assert.assertTrue(actualTiredness > previousTiredness);
    }

    @Test
    public void testWhenIPutItToBedThenTirednessDecrease() {
        int previousTiredness = tamagotchi.getTiredness();

        tamagotchi.putToBed();

        int actualTiredness = tamagotchi.getTiredness();

        Assert.assertTrue(actualTiredness < previousTiredness);
    }

    @Test
    public void testWhenIMakeItPoopThenItsFullnessDecrease() {
        int previousFullness = tamagotchi.getFullness();

        tamagotchi.poop();

        int actualFullness = tamagotchi.getFullness();

        Assert.assertTrue(actualFullness < previousFullness);
    }

    @Test
    public void testWhenTimePassesThenTirednessIncrease() {
        int previousTiredness = tamagotchi.getTiredness();

        tamagotchi.tick();

        int actualTiredness = tamagotchi.getTiredness();

        Assert.assertTrue(actualTiredness > previousTiredness);
    }

    @Test
    public void testWhenTimePassesThenHungrinessIncrease() {
        int previousHungriness = tamagotchi.getHungriness();

        tamagotchi.tick();

        int actualHungriness = tamagotchi.getHungriness();

        Assert.assertTrue(actualHungriness > previousHungriness);
    }

    @Test
    public void testWhenTimePassesThenHappinessDecrease() {
        int previousHappiness = tamagotchi.getHappiness();

        tamagotchi.tick();

        int actualHappiness = tamagotchi.getHappiness();

        Assert.assertTrue(actualHappiness < previousHappiness);
    }

    @Test
    public void testWhenTimePassesThenYouthfulnessDecreaseInDouble() {
        int previousYouthfulness = tamagotchi.getYouthfulness();
        int decreaseValue = 2;

        tamagotchi.tick();

        int actualYouthfulness = tamagotchi.getYouthfulness();

        Assert.assertEquals(actualYouthfulness, previousYouthfulness-decreaseValue);
    }

    @Test
    public void testYouthfulnessIsNeverLowerThanZero() {
        needsConfiguration.setYouthfulness(2);
        tamagotchi = new Tamagotchi(needsConfiguration);

        tamagotchi.tick();
        tamagotchi.tick();

        Assert.assertEquals(0, tamagotchi.getYouthfulness());
    }

}