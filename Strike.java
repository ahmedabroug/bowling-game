public class Strike implements Frame{

    private int scoreForThisRound;
    private int scoreForNextFirstRound;
    private int scoreForNextSecondRound;
    
    Strike(int scoreForThisRound){
        this.scoreForThisRound=scoreForThisRound;
    }
    
    @Override
    public int getscore(){
        return 10+scoreForNextFirstRound+scoreForNextSecondRound;
    }
    
    @Override
    public int getThisRoundScore(){
        return this.scoreForThisRound;
    }
    @Override
    public void complete(int score, Round round){
        switch(round){
            case FIRST:
                scoreForNextFirstRound = score;
                break;
            case SECOND:
                scoreForNextSecondRound = score;
                break;
            default:
                break;
        }
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(getscore());
    }
}