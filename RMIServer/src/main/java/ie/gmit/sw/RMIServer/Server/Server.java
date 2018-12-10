//Colm Woodlock G00341460
package ie.gmit.sw.RMIServer.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		//Create a ne car hire implementation
		RmiInterface carBookingService = new CarHireImpl();
		
		//Start the registry on port 1099
		LocateRegistry.createRegistry(1099);
		
		//Bind to service
		Naming.rebind("carbooking", (Remote) carBookingService);
	}
}
