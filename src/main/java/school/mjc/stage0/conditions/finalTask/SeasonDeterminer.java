package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String season;

        if (monthNumber >= 1 && monthNumber <= 12) {
            season = switch (monthNumber) {
                case 12, 1, 2 -> "Winter";
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                case 9, 10, 11 -> "Autumn";
                default -> "Wrong month number";
            };
            System.out.println(season);
        } else {
            System.out.println("Wrong month number");
        }
    }
}
