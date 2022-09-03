public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(1000 , true);
        System.out.println(expected + " == ? == " + actual);

        amount = 1_000_000;
        registered = true;
        expected = 500;
        actual = service.calculate(1_000_000,false);
        System.out.println(expected + " == ? == " + actual);

        amount = 100;
        registered = false;
        expected = 1;
        actual = service.calculate(200,false);
        System.out.println(expected + " == ? == " + actual);

        amount = 400_000;
        registered = false;
        expected = 1;
        actual = service.calculate(400_000, false);

        //System.out.println(expected + "==?=="+actual);
    }
}