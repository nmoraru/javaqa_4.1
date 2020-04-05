public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceInKopek = 20_001_99;
        int miles = service.calculate(priceInKopek);
        System.out.println(miles);
    }
}
