import java.util.regex.Pattern;

public class FrameValidator{
    
    
    static boolean isFrame(String value){
        return isStrike(value) || isSquare(value) || isMiss(value);
    }
    
    static boolean isValidFramesNumber(String lastFrame, int framesSize){
        return (isStrike(lastFrame) && framesSize == 12) || (isSquare(lastFrame) && framesSize == 11) || (isMiss(lastFrame) && framesSize == 10);
    }
    
    static boolean isStrike(String value){
        return FrameType.STRIKE.getType().equals(value);
    }
    
    static boolean isSquare(String value){
        String squarePattern = "[0-9][/]$";
        return Pattern.matches(squarePattern, value);
    }
    
    static boolean isMiss(String value){
        String missPattern = "[0-9][-]$";
        return Pattern.matches(missPattern, value);
    }
}