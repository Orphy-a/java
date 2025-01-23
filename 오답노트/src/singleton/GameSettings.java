package singleton;

public class GameSettings {
	
	private static GameSettings instance;
	
	private int soundVolume;
	private int graphicsQuality;
	
	
	public GameSettings() {
		this.soundVolume = 5;
		this.graphicsQuality = 5;
	}
	
	public static GameSettings getInstance(){
		if(instance == null) {
			instance = new GameSettings();
		}
		
		return instance;
		
	}
	
	
	
}
