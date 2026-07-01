package com.hospital;

import org.springframework.stereotype.Component;

@Component("skinSpecialist")
public class SkinSpecialist implements Specialist {

	@Override
	public String book() {
		return "Book for skin specialist.";
	}
}
