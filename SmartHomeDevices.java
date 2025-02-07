import java.util.*;
class Device{
   int deviceId;
   String status;
   Device(int deviceId,String status)
   {
       this.deviceId=deviceId;
	   this.status=status;
   }
}
class Thermostat extends Device{
    String temperatureSetting;
    public Thermostat(int deviceid,String status,String temperatureSetting )
	{
	    super(deviceid,status);
		this.temperatureSetting=temperatureSetting;
	}
	public void displayInfo()
	{
	    System.out.println(this.deviceId);
		System.out.println(this.status);
		System.out.println(this.temperatureSetting);
		
	}
}
public class SmartHomeDevices{
     public static void main(String[] args)
	 {
	     Thermostat thermo=new Thermostat(1,"activated","23");
		 thermo.displayInfo();
		 
	 }
}
