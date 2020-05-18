package main;

public class House {
	
	private String roofType;
	private int numberOfBedrooms;
	private int numberOfBathrooms;
	private double lotArea;

	/*This constructor is used to assign values from when the object is instantiated to the local
	variables in this class.*/
	public House(String roofType, int numOfBedrooms, int numOfBathrooms, double lotArea) {
		this.roofType = roofType;
		this.numberOfBedrooms = numOfBedrooms;
		this.numberOfBathrooms = numOfBathrooms;
		this.lotArea = lotArea;
	}
	
	public void printDetails() {
		System.out.println("Roof type : " + this.roofType);
		System.out.println("Number of bedrooms : " + this.numberOfBedrooms);
		System.out.println("Number of bathrooms : " + this.numberOfBathrooms);
		System.out.println("Lot Area : " + this.lotArea + " sqm");
	}

}
