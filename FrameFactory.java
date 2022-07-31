

class Framefactory {
    
    static final int STRIKE_DEFAULT_VALUE = 10;
    
    private static Framefactory INSTANCE;
    
    private Framefactory(){
        
    }
    
    static Framefactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Framefactory();
        }
        return INSTANCE;
    }
    
    static Frame create(String value){
        
        String[] array = value.split("");
        String frameType = value.length() == 1 ? array[0]:array[1];
        int frameScore = value.length() == 1 ? STRIKE_DEFAULT_VALUE:Integer.parseInt(array[0]);
        Frame frame;
        switch(FrameType.valueOfString(frameType)){
            case STRIKE:
            frame = new Strike(frameScore);
            break;
            case SQUARE:
            frame = new Square(frameScore);
            break;
            case MISS:
            frame = new Miss(frameScore);
            break;
            default:
            frame = null;
            break;
        }
        return frame;
    }
}