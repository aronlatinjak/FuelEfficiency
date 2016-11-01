package fuelefficiency;

public class HybridCar extends Vehicle
{
    /**
     * Constructor
     * Pre: None
     * Post: Initializes variables
     */
    public HybridCar()
    {
        super();
        efficiency = 0.038; 
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