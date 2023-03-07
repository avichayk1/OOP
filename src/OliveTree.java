public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN,false);
        this.fruit=checkFruitSeason(this.season);
    }

    @Override
    public String toString() {
        return "Olive tree. " + super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        this.fruit=checkFruitSeason(this.season);
        this.height=checkHeight(this.season);
    }
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
    public boolean checkFruitSeason(Season season) {
        switch (season) {
            case FALL:
                return true;
            default:
                return false;
        }
    }
}
