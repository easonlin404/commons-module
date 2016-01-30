package soundsystem;

import java.util.ArrayList;
import java.util.List;

public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;

	private List<String> tracks;
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setTracks(List<String> tracks){
		this.tracks = tracks;
	}

	@Override
	public void playTrack(int track) {
		// TODO Auto-generated method stub
		
	}
}
