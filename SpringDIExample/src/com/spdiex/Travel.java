package com.spdiex;

public class Travel implements Journey {
	Vehicle vehicle;
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void start() {
		System.out.println("Journey Started");
		vehicle.move();
		
	}
	
}
