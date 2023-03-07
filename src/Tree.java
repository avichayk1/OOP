/**
 * An abstract class representing a tree.
 */
public abstract class Tree implements Comparable, Seasonable {
    /**
     * The height of the tree.
     */
    protected int height;
    /**
     * The current season of the tree.
     */
    protected Season season;
    /**
     * The color of the leaves of the tree.
     */
    protected Color leavesColor;

    /**
     * Whether the tree has fruit or not.
     */
    protected boolean fruit;
    /**
     * Constructor for a Tree object.
     *
     * @param height      the height of the tree
     * @param season      the current season of the tree
     * @param leavesColor the color of the leaves of the tree
     * @param fruit       whether the tree has fruit or not
     */
    Tree(int height, Season season, Color leavesColor, boolean fruit){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        this.fruit = fruit;
    }
    /**
     * Returns the current season of the tree.
     *
     * @return the current season of the tree
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }
    /**
     * Compares the height of this tree to another tree.
     *
     * @param o the other tree to compare to
     * @return 1 if this tree is taller, -1 if it is shorter, and 0 if they are the same height
     */
    @Override
    public int compareTo(Object o) {
        if(this.height>((Tree)o).height)
            return 1;
        else if(this.height<((Tree)o).height)
            return -1;
        return 0;
    }
    /**
     * Changes the season of the tree to the next season in the cycle.
     */
    @Override
    public void changeSeason() {
        this.season=( Season.values()[(season.ordinal() + 1) % Season.values().length] );

    }
    /**
     * Returns a string representation of the tree, including its height, color, and whether it has fruit.
     *
     * @return a string representation of the tree
     */
    @Override
    public String toString() {
        if (this.leavesColor == null){
            return "My height is: " + this.height + " and I have no leaves";
        }
        if (this.fruit){
            return "I give fruit. My height is: " + this.height + " and my color is: " + this.leavesColor;
        }
        return "My height is: " + this.height + " and my color is: " + this.leavesColor;
    }
}
