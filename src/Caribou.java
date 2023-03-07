/**
 * The Caribou class represents a type of animal that can change its color and migration behavior based on the current season.
 */
public class Caribou extends Animal {

    private String  migration="";
    /**
     * Constructs a Caribou object with the given weight and season, and sets its color and migration behavior based on the season.
     *
     * @param weight the weight of the Caribou
     * @param season the current season
     */
    Caribou(int weight, Season season) {
        super(weight, season,null );
        //this.migration=checkMigrationSeason(season);
        this.color=checkColorSeason(season);
    }

    /**
     * Returns a string representation of the Caribou, including its migration behavior and weight.
     *
     * @return a string representation of the Caribou
     */
    @Override
    public String toString() {
        return "Caribou: " + this.migration + super.TOString();
    }
    /**
     * Changes the season of the Caribou and updates its color and migration behavior accordingly.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        checkSeason();
    }
    /**
     * Checks the current season of the Caribou and updates its color and migration behavior accordingly.
     */
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
    /**
     * Returns the migration behavior of the Caribou based on the given season.
     *
     * @param season the current season
     * @return the migration behavior of the Caribou based on the given season
     */
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
    }    /**
     * Returns the color of the Caribou based on the given season.
     *
     * @param season the current season
     * @return the color of the Caribou based on the given season
     */
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