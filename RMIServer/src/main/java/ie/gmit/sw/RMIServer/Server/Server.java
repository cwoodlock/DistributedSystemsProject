package ie.gmit.sw.RMIServer.Server;

import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) {
		
		//Create a ne car hire implementation
		RmiInterface carBookingService = new CarHireImpl();
		
		//Start the registry on port 1099
		LocateRegistry.createRegistry(1099);
		
		//Bind to service
		Naming.rebind("carbooking", carBookingService);
	}
}
