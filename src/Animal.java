/**
 * The Animal class represents an animal and implements the Seasonable and Comparable interfaces.
 */
public abstract class Animal implements Seasonable,Comparable{
    /** The weight of the animal. */
    protected int weight;
    /** The weight of the animal. */
    private Season season;
    /** The color of the animal. */
    protected Color color;
    /**
     * Constructs an Animal with the given weight, season, and color.
     *
     * @param weight The weight of the animal.
     * @param season The current season of the animal.
     * @param color The color of the animal.
     */
    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }
    /**
     * Returns the current season of the animal.
     *
     * @return The current season of the animal.
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }
    /**
     * Changes the current season of the animal to the next one in the Season enum.
     */
    @Override
    public void changeSeason() {
        this.season=( Season.values()[(season.ordinal() + 1) % Season.values().length] );
    }

    /**
     * Compares the weight of this animal with another animal.
     *
     * @param o The other animal to compare with.
     * @return 1 if this animal is heavier, -1 if it's lighter, and 0 if they have the same weight.
     */
    @Override
    public int compareTo(Object o) {
        if (this.weight >((Animal) o).weight) {
            return 1;
        }else if(this.weight <((Animal) o).weight)
            return -1;
        return 0;
    }
    /**
     *
     * @return A String representation of the animal's weight and color.
     */
    public String TOString(){
        return "My weight is: " + this.weight + " and my color is: " + this.color;
    }
}
