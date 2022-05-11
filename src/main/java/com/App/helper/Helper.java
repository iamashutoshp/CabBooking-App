package com.App.helper;

import org.springframework.stereotype.Component;

import com.App.entity.Location;

@Component
public class Helper {
	public int getDistance(Location a,Location b) {
		int x=a.getX()-b.getX();
		int y=a.getY()-b.getY();
		return (int)Math.sqrt(x*x+y*y);
	}
}
