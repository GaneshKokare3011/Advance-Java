package com.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Qualifier("heartSpecialist")
	@Autowired
	HeartSpecialist hs;
	
	@Qualifier("skinSpecialist")
	@Autowired
	SkinSpecialist ss;
	
	public HeartSpecialist getHs() {
		return hs;
	}
	public void setHs(HeartSpecialist hs) {
		this.hs = hs;
	}
	public SkinSpecialist getSs() {
		return ss;
	}
	public void setSs(SkinSpecialist ss) {
		this.ss = ss;
	}
}
