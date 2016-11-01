package fuelefficiency;

public class Car extends Vehicle
{
    /**
     * Constructor
     * Pre: None
     * Post: Initializes variables
     */
    public Car()
    {
        super();
        efficiency = 0.094; 
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
