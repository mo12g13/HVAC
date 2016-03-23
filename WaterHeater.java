import java.util.Date;

/**
 * Created by Momo Johnson on 3/17/2016.
 */
public class WaterHeater extends ServiceCall{

    protected String  ageOfWaterHeater;
    protected static final double HEATER_FEE = 20;




    public WaterHeater(String serviceAddress, String problemDescription, Date date, String ageOfWaterHeater) {
        super(serviceAddress, problemDescription, date);
        this.ageOfWaterHeater = ageOfWaterHeater;
    }

    public String getModel() {
        return ageOfWaterHeater;
    }

    public void setModel(String ageOfWaterHeater) {
        this.ageOfWaterHeater = ageOfWaterHeater;
    }


    @Override
    public String toString() {

        //These statements use the Java ternary operator
        //This says "if resolvedDate == null, then set resolvedDate to "Unresolved". Otherwise, set resolvedDate to resolvedDate.toString()
        //Same logic as an if-else statment, but more consise if the condition is simple and the if statment's task is
        //to set the value of a variable based on a condition being true or false.
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + HEATER_FEE);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;

    }


}
