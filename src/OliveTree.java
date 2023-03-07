/**
 * A subclass of Tree representing an Olive tree.
 */
public class OliveTree extends Tree {
    /**
     * Constructs a new OliveTree with the given height and season.
     *
     * @param height the height of the tree.
     * @param season the current season.
     */
    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN,false);
        this.fruit=checkFruitSeason(this.season);
    }
    /**
     * Returns a string representation of the OliveTree object.
     *
     * @return a string representation of the OliveTree object.
     */
    @Override
    public String toString() {
        return "Olive tree. " + super.toString();
    }
    /**
     * Changes the current season of the tree and updates its height and fruit.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        this.fruit=checkFruitSeason(this.season);
        this.height=checkHeight(this.season);
    }
    /**
     * Checks the height of the tree based on the current season.
     *
     * @param season the current season.
     * @return the new height of the tree.
     */
    public int checkHeight(Season season){
        switch (season) {
            case FALL:
                return this.height+=5;
            case SPRING:
                return this.height += 10;
            case SUMMER:
                return this.height += 10;
            case WINTER:
                return this.height += 5;
            default:
                return 0;
        }
    }
    /**
     * Checks the height of the tree based on the current season.
     *
     * @param season the current season.
     * @return the new height of the tree.
     */
    public boolean checkFruitSeason(Season season) {
        switch (season) {
            case FALL:
                return true;
            default:
                return false;
        }
    }
}
