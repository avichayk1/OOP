public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;
    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public void changeSeason() {
        this.season=( Season.values()[(season.ordinal() + 1) % Season.values().length] );
    }

    @Override
    public int compareTo(Object o) {
        if (this.weight >((Animal) o).weight) {
            return 1;
        }else if(this.weight <((Animal) o).weight)
            return -1;
        return 0;
    }

    public String TOString(){
        return "My weight is: " + this.weight + " and my color is: " + this.color;
    }
}
