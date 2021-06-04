package enums;

public class WayToGo {
	Direction point;
	//Initialize the point variable
	
	public WayToGo (Direction point){
		this.point = point;
	}
	
	public void directionToGo(){
		 switch(point){
		case NORTH:
			System.out.println("Its right direction");
			break;
		
		case SOUTH:
			System.out.println("Its wrong direction");
			break;
			default: 
				System.out.println("Direction not in Dictionary");
				break;
		}
		
	}
	
	public static void main (String [] args){
	    
		WayToGo firstWay = new WayToGo(Direction.NORTH);
		WayToGo firstWay1 = new WayToGo(Direction.EAST);
		firstWay.directionToGo();
		firstWay1.directionToGo();
		System.out.println("Where exactly Resided "  + Direction.WEST.ordinal());
	}
}
