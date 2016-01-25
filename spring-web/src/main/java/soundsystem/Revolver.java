package soundsystem;

import org.springframework.stereotype.Component;

public class Revolver implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Playing Revolver");
	}

}
