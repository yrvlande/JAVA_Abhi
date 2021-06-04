package other;

public enum RandomEnum {

    StartHere("Start Here"),
    StopHere("Stop Here");

    private String value;

    RandomEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }

    public static RandomEnum getEnum(String value) {
        if(value == null)
            throw new IllegalArgumentException();
        for(RandomEnum v : values())
            if(value.equalsIgnoreCase(v.getValue())) return v;
        throw new IllegalArgumentException();
    }
    
    public static void main (String [] args){
    	System.out.println(RandomEnum.getEnum("Start Here"));
    	System.out.println("Hi");
    	
    }
}