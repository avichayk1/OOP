public class Caribou extends Animal {

    private String  migration="";

    Caribou(int weight, Season season) {
        super(weight, season,null );
        //this.migration=checkMigrationSeason(season);
        this.color=checkColorSeason(season);
    }

    @Override
    public String toString() {
        return "Caribou: " + this.migration + super.TOString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        checkSeason();
    }
    public void checkSeason() {
        switch (this.getCurrentSeason()) {
            case FALL:
                this.migration="";
                break;
            case SPRING:
                this.migration="";
                this.color = Color.BROWN;
                break;
            case SUMMER:
                migration = "I am migrating north. ";
                break;
            case WINTER:
                this.color = Color.WHITE;
                this.migration = "I am migrating south. ";
                break;
            default:
                break;
        }
    }
    public String checkMigrationSeason(Season season){
        switch (season) {
            case SUMMER:
                return  "";
            case WINTER:
                return  "";
            case FALL:
                return  ": I am migrating north. ";
            case SPRING:
                return  "I am migrating south. ";
            default:
                return "";
        }
    }
    public Color checkColorSeason(Season season) {
        switch (season) {
            case SPRING:
                return Color.BROWN;
            case WINTER:
                return Color.WHITE;
            default:
                return Color.BROWN;
        }
    }
}