/*
 * NAME:     Aron Latinjak
 * DATE:     11/01/16
 * FILENAME: FuelEfficiency.java
 * PURPOSE:  To calculate distances traveled by certain vehicles.
 */

package fuelefficiency;

public class FuelEfficiency 
{    
    public static void main(String[] args) 
    {
        double litres;
        litres = 50.0;
        
        System.out.println("On 50.0L of gas the vehicles can drive:");
        System.out.println("");
        
        //Create an array of vehicles
        Vehicle vehicleArray[] = new Vehicle[4];
        
        //Create an array of strings for vehicles
        String vehicleNames[] = new String[4];
       
        //Fill the arrays
        vehicleArray[0] = new Truck();
        vehicleArray[1] = new Car();
        vehicleArray[2] = new HybridCar();
        vehicleArray[3] = new Motorcycle();    
        
        vehicleNames[0] = "Truck: ";
        vehicleNames[1] = "Car: ";
        vehicleNames[2] = "Hybrid Car:  ";
        vehicleNames[3] = "Motorcycle: ";
            
        //Display all distances traveled by each vehicle
        for (int i = 0; i < 4; i ++)
        {    
            System.out.print(vehicleNames[i]);
            System.out.print(vehicleArray[i].getDistance(litres));
            System.out.println(" km");
        }
    }
}   