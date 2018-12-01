package Zool;

public class Map {

	//////// Attributes

	public String description;
	public int numberOfTiles;

	///////// Constructors

	public Map() {
		description = "a dark dreary landscape";
		numberOfTiles = 20;
	}

	public Map(String vDesciption, int vNumberOfTiles) {
		this.description = vDesciption;
		this.numberOfTiles = vNumberOfTiles;
	}
	/////// Methods

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfTiles() {
		return numberOfTiles;
	}

	public void setNumberOfTiles(int numberOfTiles) {
		this.numberOfTiles = numberOfTiles;
	}

	public String welcomeToMap() {
		return "You open your eyes to see a vast landscape ahead of you. Either side of you are two stone hell hounds which seem to be emiting a low rumble. You decide it is best not to hang around and so strike out into this unknown land.";
	}

	public String navigate(String playerChoice) {
		return null;
	}

}
