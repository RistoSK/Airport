package Airport;

import java.util.Scanner;
import java.util.ArrayList;

public class AirportPanel {
	
	public static void main (String[] args)
	{
			ArrayList <String> allFlights = new ArrayList<String>();
			ArrayList <String> allPlanes = new ArrayList<String>();
			ArrayList <String> allPlanesId = new ArrayList<String>();
			ArrayList <String> allPlanesCap = new ArrayList<String>();
			Scanner input = new Scanner(System.in);
			String item = "";
			Plane plane = new Plane();
		
		do{
			System.out.println("Airport panel \n ------------ \n \n Choose operation: \n [1] Add airplane \n [2] Add flight  \n [x] Exit");
			item = input.nextLine();
		
			switch(item){
				case "1": plane.addPlane(input, allPlanesId, allPlanesCap);
					break;
				case "2": plane.addFlight(input , allFlights , allPlanesId, allPlanes, allPlanesCap);
					break;
				case "x": break;
	
				default: System.out.println("Invalid choise try again");
					 	break;
			}
		}while (!item.equals("x"));
		
		do{
			System.out.println("Flight service \n ------------ \n \n Choose operation: \n [1] Print planes \n [2] Print flights \n [3] Print plane info \n [x] Quit");
			item = input.nextLine();
			switch(item){
				case "1": plane.printPlanes(allPlanesId, allPlanesCap);
						break;
				case "2": plane.printFlights(allFlights , allPlanes);
						break;
				case "3": plane.printPlaneInfo(input, allPlanes , allPlanesId);
			
				case "x": break;

				default: System.out.println("Invalid choise try again");
			 			break;
			}
		}while (!item.equals("x"));	
	}	
}