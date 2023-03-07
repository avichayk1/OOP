public class FigTree extends Tree {


    FigTree(int height, Season season) {
        super(height,season,null,false);
        this.fruit=checkFruitSeason(this.season);
        this.leavesColor=checkLeavsColorsSeason(this.season);
    }

    @Override
    public String toString() {
        return "Fig tree. " + super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        this.height=checkHeight(this.season);
        this.leavesColor=checkLeavsColorsSeason(this.season);
        this.fruit=checkFruitSeason(this.season);

    }
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
        public boolean checkFruitSeason(Season season) {
            switch (season) {
                case SUMMER:
                    return true;
                default:
                    return false;
            }
        }
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
