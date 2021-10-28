package me.sseob;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SeobProperties.class) //Properties mapping class
public class SeobConfiguration {

	@Bean
	@ConditionalOnMissingBean //Seob bean이 없을 때 아래 Bean을 생성한다.
	public Seob seob(SeobProperties properties) {
		Seob seob = new Seob();
		seob.setHowLong(properties.getHowLong());
		seob.setName(properties.getName());
		return seob;
	}
}
