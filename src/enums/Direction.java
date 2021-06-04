package enums;

public enum Direction{
	
	NORTH,SOUTH,EAST,WEST;
	
	public static void main (String [] args){
	Direction a = Direction.NORTH;
	System.out.println(a.ordinal());
	System.out.println(a);
	System.out.println(Direction.NORTH);
	
	
}
}
