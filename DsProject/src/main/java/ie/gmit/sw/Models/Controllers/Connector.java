//Colm Woodlock G00341460
package ie.gmit.sw.Models.Controllers;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import ie.gmit.sw.Models.RMI.Booking;

public class Connector {

	private RmiInterface bookingService;

	public Connector() {
		System.out.println("Entered Connector");

		try {
			this.bookingService = (RmiInterface) Naming.lookup("rmi://localhost:1099/carBookingService");
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("leaving Connector");

	}

}

