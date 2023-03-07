/**
 * This interface represents an object that can change with the seasons.
 */
public interface Seasonable {
    /**
     * Returns the current season for this object.
     *
     * @return the current season for this object.
     */
    Season getCurrentSeason();
    /**
     * Changes the season for this object and updates its properties accordingly.
     */
    void changeSeason();
}

