package fuelefficiency;

public class Motorcycle extends Vehicle
{
    /**
     * Constructor
     * Pre: None
     * Post: Initializes variables
     */
    public Motorcycle()
    {
        super();
        efficiency = 0.063; 
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