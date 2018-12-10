//Colm Woodlock G00341460
package ie.gmit.sw.Models.Controllers;

import java.rmi.*;
import java.util.List;

import ie.gmit.sw.Models.RMI.Booking;

public interface RmiInterface extends Remote{
	//Create a car hire
	public void createCarHire(String query) throws RemoteException; 
	
	//Put all the bookings in a list
	public List<Booking> readCarHire() throws RemoteException; 
	
	//Update a car hire
	public void updateCarHire(String query) throws RemoteException; 
	
	//Delete a car hire
	public void deleteCarHire(String query) throws RemoteException; 
}
