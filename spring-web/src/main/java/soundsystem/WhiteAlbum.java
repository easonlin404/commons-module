package soundsystem;

import org.springframework.stereotype.Component;

public class WhiteAlbum implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Playing WhiteAlbum");
	}

	@Override
	public void playTrack(int track) {
		// TODO Auto-generated method stub
		
	}

}
