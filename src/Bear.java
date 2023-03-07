public class Bear extends Animal {
    private String sleep;
    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
        this.sleep=checkSleepSeason(this.getCurrentSeason());
    }
    @Override
    public String toString() {
        return "Bear. " + this.sleep + super.TOString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        checkSeason(this.getCurrentSeason());
    }
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

