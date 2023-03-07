/**
 * The Bear class represents a bear and extends the Animal class.
 */
public class Bear extends Animal {
    /** The sleep state of the bear. */
    private String sleep;
    /**
     * Constructs a Bear with the given weight and season.
     *
     * @param weight The weight of the bear.
     * @param season The current season of the bear.
     */
    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
        this.sleep=checkSleepSeason(this.getCurrentSeason());
    }
    /**
     *
     * @return A String representation of the bear.
     */
    @Override
    public String toString() {
        return "Bear. " + this.sleep + super.TOString();
    }
    /**
     * Changes the current season of the bear to the next one in the Season enum and updates its weight and sleep state.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        checkSeason(this.getCurrentSeason());
    }
    /**
     * Updates the weight and sleep state of the bear based on the current season.
     *
     * @param season The current season of the bear.
     */
    public void checkSeason(Season season) {
        switch (season) {
            case FALL:
                this.weight = (int)Math.round(1.25 * this.weight);
                this.sleep="";
                break;
            case SPRING:
                this.weight = (int)Math.round (0.75 * this.weight);
                this.sleep="";
                break;
            case SUMMER:
                this.weight =(int)Math.round ( (1.33333) * this.weight);
                this.sleep="";
                break;
            case WINTER:
                this.weight = (int)Math.round (0.8 * this.weight);
                this.sleep="I am sleeping. ";
                break;
            default:
                break;
        }
    }
    /**
     * Returns the sleep state of the bear based on the current season.
     *
     * @param season The current season of the bear.
     * @return The sleep state of the bear.
     */
    public String checkSleepSeason(Season season) {
        switch (season) {
            case FALL:
                return this.sleep="";
            case SPRING:
                return this.sleep="";
            case SUMMER:
                return  this.sleep="";
            case WINTER:
                return this.sleep="I am sleeping. ";
            default:
                return "";
        }
    }
}

