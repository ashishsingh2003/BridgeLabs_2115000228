public class SpringSeason {
     public void springSeason(int month,int day){
	     // Check if it's spring season
            if ((month == 3 && day >= 20 && day <= 31) || // March 20-31
                (month == 4 && day >= 1 && day <= 30) || // April 1-30
                (month == 5 && day >= 1 && day <= 31) || // May 1-31
                (month == 6 && day >= 1 && day <= 20)) { // June 1-20
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

     }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two arguments");
            return;
        }
            
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            SpringSeason obj=new SpringSeason();
	    obj.springSeason(month,day);
    }
}
