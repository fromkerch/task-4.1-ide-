public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int spentRubles = 20;
        int miles = service.calculate(price, spentRubles);
        System.out.println(miles);
    }
}
