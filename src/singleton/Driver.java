package singleton;

public class Driver {

    /*
    How to achieve singleton
    1. make constructor private.
    2. create a private instance variable of the object of Driver
    3. make this variable static and provide a static getDriver method
    4. provide an if condition to initialize the Driver instance variables
            if it is null, then initialize it
            if it is !null, then return the previously initialized driver

      Note: we understand that the single Driver object is also encapsulated
     */

    private static Driver driver; //declared


    private Driver(){
    }

    public static Driver getDriver() {
        if (driver == null) driver = new Driver();
        return driver;
    }
}
