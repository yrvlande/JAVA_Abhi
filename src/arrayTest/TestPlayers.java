package arrayTest;

import simplePrograms.TextIO;

public class TestPlayers {

	public static void main (String[] args){
		
		Players player = new Players();
		player.playerContainer = new Players[5];
		player.playerContainer[0] = new Cricket();
		player.playerContainer[1] = new Football();
		player.playerContainer[2] = new Hockey();
		player.playerContainer[3] = new Hockey();
		player.playerContainer[4] = new Football();
		
		for(int i=0; i< player.playerContainer.length; i++){
			
			player.playerContainer[i].idOfPlayer();
			System.out.println("Please Enter the player name");
			String name = TextIO.getlnString();
			player.playerContainer[i].playerName(name);
		    }
		for(int i=0; i< player.playerContainer.length; i++){
			System.out.println("Below are player Name and ID");
		
			 System.out.println("Name " + player.playerContainer[i].nameOfPlayer +"- ID "+ player.playerContainer[i].playerID);
			 player.playerID++;
		
		}
		
		
	}
	
}
