package Airport;

import java.util.ArrayList;
import java.util.Scanner;

public class Plane {
	
	public Plane(){
		
	}

	//add new plane on distinct arrays that contain the plain Id and Capacity
	public void addPlane(Scanner input , ArrayList<String> allPlanesId , ArrayList<String> allPlanesCap)
	{
		System.out.println("Give a plane ID");
		String planeId = input.nextLine();
		
		System.out.println("Give plane capacity ");
		String cap = input.nextLine();
		
		allPlanesId.add(planeId);
		allPlanesCap.add(cap);		
	}
	
	//add flight information on allFlights array
	public void addFlight(Scanner input , ArrayList<String> allFlights, ArrayList<String> allPlanesId, ArrayList<String> allPlanes, ArrayList<String> allPlanesCap )
	{
		//is false if we don't find the plane Id that the user inputed
		boolean planeFound = false;
		System.out.println("Give a plane ID");
		String SearchedPlaneId = input.nextLine();
		for (int i=0; i<allPlanesId.size(); i++)
		{
			//if the Id is found
			if (SearchedPlaneId.equals(allPlanesId.get(i)))
			{
				//if the user inputs the planes and the flights in the same order then we can retrieve the info from the distinct arrays 
				allPlanes.add(allPlanesId.get(i) + " ("+ allPlanesCap.get(i) +" ppl" + ")");
				
				System.out.println("Give departure airport code: ");
				String depCode = input.nextLine();
				
				System.out.println("Give destination airport code: ");
				String desCode = input.nextLine();
				
				allFlights.add(" (" + depCode + "-"+desCode + ")");
				planeFound = true;
			}
		}
		
		//if the plane Id wasn't found
		if (planeFound == false) {
			System.out.println("The plane doesn't exist in out list");
		}
	}
	
	//prints all distinct planes
	public void printPlanes(ArrayList<String> allPlanesId, ArrayList<String> allPlanesCap)
	{
		for(int i=0; i<allPlanesId.size(); i++)
		{
			System.out.println(allPlanesId.get(i) + " ("+ allPlanesCap.get(i) +" ppl" + ")");
		}
	}
	
	//prints all the flights
	public void printFlights(ArrayList<String> allFlights , ArrayList<String> allPlanes )
	{
		for(int i=0; i<allFlights.size(); i++)
		{
			System.out.println(allPlanes.get(i) + " " + allFlights.get(i));
		}
	}
	
	//prints specific plane information
	public void printPlaneInfo(Scanner input, ArrayList<String> allPlanes, ArrayList<String> allPlanesId)
	{
		System.out.print("Give a plane ID");
		String planeId = input.nextLine();
		for (int i=0; i<allPlanesId.size(); i++)
		{
			if (planeId.equals(allPlanesId.get(i)))
			{
				System.out.println(allPlanes.get(i));
			}
		}	
	}
}