package arrayTest;

public class Hockey extends Players {
	long  playerID;
	public long idOfPlayer(){
		
		return this.playerID;
	}
	public  String playerName(String nameOfPlayer){
		this.nameOfPlayer = nameOfPlayer;
		return nameOfPlayer;
	}
}
