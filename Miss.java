public class Miss implements Frame{
    
    private int scoreForThisRound;
    
    Miss(int scoreForThisRound){
        this.scoreForThisRound=scoreForThisRound;
    }
    
    @Override
    public int getscore(){
        return scoreForThisRound;
    }
    
    @Override
    public int getThisRoundScore(){
        return this.scoreForThisRound;
    }
    
    @Override
    public void complete(int score, Round round){
        //do nothing method
            switch(round){
            case FIRST:
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