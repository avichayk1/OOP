public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected boolean fruit;
    Tree(int height, Season season, Color leavesColor, boolean fruit){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        this.fruit = fruit;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        if(this.height>((Tree)o).height)
            return 1;
        else if(this.height<((Tree)o).height)
            return -1;
        return 0;
    }

    @Override
    public void changeSeason() {
        this.season=( Season.values()[(season.ordinal() + 1) % Season.values().length] );

    }

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
