enum FrameType {
    STRIKE("X"),
    SQUARE("/"),
    MISS("-");
    
    private String type;
    
    FrameType(String type){
        this.type = type;
    }
    
    public String getType() {
    return type;
    }
    
    public static FrameType valueOfString(String name){
    for(FrameType frame : values()){
      if(frame.getType().equals(name)){
        return frame;
      }
    }

    throw new IllegalArgumentException(name + " is not a valid frame");
  }
    
}