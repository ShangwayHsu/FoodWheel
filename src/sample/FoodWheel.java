package sample;

/**
 * Created by VincentYang on 9/7/15.
 * This is a singleton design pattern
 */
public class FoodWheel {
   //FIELDS
    private FoodWheel instance;

   //CONSTRUCTOR
    private FoodWheel()
    {

    }
    //METHODS
    public FoodWheel getInstance()
    {
        if (instance == null)
        {
            instance = new FoodWheel();
        }
        return instance;
    }

}
