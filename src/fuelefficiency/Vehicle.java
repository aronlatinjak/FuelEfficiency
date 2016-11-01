package fuelefficiency;

//ABSTRACT CLASS, ONLY METHOD MUST BE OVERWRITTEN
public abstract class Vehicle 
{
    double efficiency;
    double distance;
    
    /**
     * Constructor
     * Pre: None
     * Post: Initializes variables
     */
    public Vehicle()
    {
        efficiency = 0;
        distance = 0;
    }
    
    //METHOD MUST BE OVERWRITTEN
    public abstract double getDistance(double litres);
}