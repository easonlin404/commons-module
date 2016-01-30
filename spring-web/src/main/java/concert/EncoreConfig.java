package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class EncoreConfig {
	
	@Bean
	public EncoreableIntroducer encoreableIntroducer() {
		return new EncoreableIntroducer();
	}
	
	@Bean
	public Performance performance(){
		return new PerformanceImpl();
	}
}
