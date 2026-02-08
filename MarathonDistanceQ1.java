import java.util.Scanner;

class MarathonDistanceQ1{
	
	public static void main(String args[]){
		
        // a) & b) Declare and initialize variables
        int miles = 26;
        int yards = 385;
        double kilometers;

        // c) & d) Calculate and save result
        kilometers = (miles + (yards / 1768.0)) * 1.609;
        System.out.println("Total Kilometers: " + kilometers);
    }
}	
		
		