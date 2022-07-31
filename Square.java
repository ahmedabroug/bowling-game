public class Square implements Frame{
    
    private int scoreForThisRound;
    private int scoreForNextFirstRound;
    
    Square(int scoreForThisRound){
        this.scoreForThisRound=scoreForThisRound;
    }
    
    @Override
    public int getscore(){
        return 10+scoreForNextFirstRound;
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