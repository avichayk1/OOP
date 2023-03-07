public class FigTree extends Tree {

    /**
     * Constructs a new FigTree with the given height and season.
     *
     * @param height the height of the tree.
     * @param season the current season.
     */
    FigTree(int height, Season season) {
        super(height,season,null,false);
        this.fruit=checkFruitSeason(this.season);
        this.leavesColor=checkLeavsColorsSeason(this.season);
    }
    /**
     * Returns a string representation of the FigTree object.
     *
     * @return a string representation of the FigTree object.
     */
    @Override
    public String toString() {
        return "Fig tree. " + super.toString();
    }
    /**
     * Changes the current season of the tree and updates its height, leaves color, and fruit.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        this.height=checkHeight(this.season);
        this.leavesColor=checkLeavsColorsSeason(this.season);
        this.fruit=checkFruitSeason(this.season);

    }    /**
     * Checks the height of the tree based on the current season.
     *
     * @param season the current season.
     * @return the new height of the tree.
     */
    public int checkHeight(Season season){
        switch (season) {
            case FALL:
                return this.height+=20;
            case SPRING:
                return this.height += 30;
            case SUMMER:
                return this.height += 30;
            case WINTER:
                return this.height += 20;
            default:
                return 0;
                }
            }
    /**
     * Checks if the tree is producing fruit in the current season.
     *
     * @param season the current season.
     * @return true if the tree is producing fruit, false otherwise.
     */
        public boolean checkFruitSeason(Season season) {
            switch (season) {
                case SUMMER:
                    return true;
                default:
                    return false;
            }
        }
    /**
     * Checks the color of the leaves based on the current season.
     *
     * @param season the current season.
     * @return the color of the leaves.
     */
    public Color checkLeavsColorsSeason(Season season){
        switch (season) {
            case FALL:
                return Color.YELLOW;
            case SPRING:
                return Color.GREEN;
            case SUMMER:
                return Color.GREEN;
            default:
                return null;
        }
    }
    }
