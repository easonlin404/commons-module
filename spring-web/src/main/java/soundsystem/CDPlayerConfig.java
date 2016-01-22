package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

	@Bean(name = "lonelyHeartsClubBand")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	@Bean
	public CompactDisc randomBeatlesCD() {
		int choice = (int) Math.floor(Math.random() * 4);
		if (choice == 0) {
			return new SgtPeppers();
		} else if (choice == 1) {
			return new WhiteAlbum();
		} else if (choice == 2) {
			return new HardDaysNight();
		} else {
			return new Revolver();
		}
	}
}