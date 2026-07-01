package com.hospital;

import org.springframework.stereotype.Component;

@Component("heartSpecialist")
public class HeartSpecialist implements Specialist {

	@Override
	public String book() {
		return "Book for heart specialist.";
	}
}
