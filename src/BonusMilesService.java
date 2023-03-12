public class BonusMilesService {
    public int calculate(int price) {

        int mileRubles = 20;
        int miles = price / mileRubles;
        return miles;
    }
}
