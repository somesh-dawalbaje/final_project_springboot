package com.example.demo1;

import org.springframework.stereotype.Component;

@Component
public class app {
	String name;
	int version;
	
	public app() {
		name="amazon";
		version=10;
	}

	@Override
	public String toString() {
		return "app [name=" + name + ", version=" + version + "]";
	}
	
}
