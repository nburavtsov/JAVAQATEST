import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test

    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(1000 , true);
        //System.out.println(expected + " == ? == " + actual);
        Assertions.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegistered() {
        BonusService service = new BonusService();
        long amount = 100;
        boolean registered = false;
        long expected = 1;
        long actual = service.calculate(amount,registered);
        Assertions.assertEquals(expected,actual);


    }

}
