import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;


public class Dashboard{
    
    private static final Logger LOGGER = Logger.getLogger(Dashboard.class.getName());
    
    static void showScore(String[] rolls){
        
    try{
        int playerScore = calculateScore(rolls);
        System.out.println("This player has " + playerScore + " points.");
    } catch (BowlingException e) {
        LOGGER.severe("Failed to load score! \n\t " + e.getMessage());
    }

        
    }
    
    private static int calculateScore(String[] rolls) throws BowlingException{
        List<Frame> frames = new ArrayList<Frame>();
  
        for(int i=0; i< rolls.length; i++){
            if(!FrameValidator.isFrame(rolls[i])){
                throw new BowlingException(rolls[i] + "Is not legal frame value");
            }
            
            if(i==9 && !FrameValidator.isValidFramesNumber(rolls[i], rolls.length)){
                throw new BowlingException(rolls[i] + "Is not legal frame number");
            }
            
            Frame frame = Framefactory.create(rolls[i]);
         
            frames.add(frame);
          
            if(i >= 1){
                  frames.get(i-1).complete(frame.getThisRoundScore(), Round.FIRST);
            }
              
            if(i>1){
                  frames.get(i-2).complete(frame.getThisRoundScore(), Round.SECOND);
            }
        }
        
        System.out.println("player frames: " + frames);
        return frames.stream().limit(10).reduce(0, (partialFrameResult, frame) -> partialFrameResult + frame.getscore(), Integer::sum);
    }
}