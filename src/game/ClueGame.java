package game;

import java.util.Map;

public class ClueGame {
	private Map<Character,String> rooms;
	
	public void loadConfigFiles(){
		Board.loadBoardConfig();
	}
}