package me.sseob;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("seob") // properties file에서 사용될 key 값
public class SeobProperties {
	
	String name;
	int howLong;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHowLong() {
		return howLong;
	}

	public void setHowLong(int howLong) {
		this.howLong = howLong;
	}
}
