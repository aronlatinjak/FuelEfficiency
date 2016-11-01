package fuelefficiency;

public class Truck extends Vehicle
{
    /**
     * Constructor
     * Pre: None
     * Post: Initializes variables
     */
    public Truck()
    {
        super();
        efficiency = 0.141; 
    }
    
    /**
     * Calculates distance traveled 
     * Pre: litres must be a double
     * Post: distance is returned
     * @param litres
     * @return 
     */
    @Override
    public double getDistance(double litres)
    {
        distance = litres / efficiency;
        return(distance);
    }
}