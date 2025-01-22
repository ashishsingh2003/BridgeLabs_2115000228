public class Seventh {
    public static void main(String[] args) {
        
        double radiusKm = 6378;

        
        double kmToMilesFactor = 0.621371;

        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMilesFactor, 3);

        
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and in cubic miles is " + volumeMiles3);
    }
}
