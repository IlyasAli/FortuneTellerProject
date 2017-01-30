import java.util.Scanner;

public class FortuneTeller {

private static final String Scanner = null; 

	public static void main(String[] args) {
	
		int retire = 0; 
		int savings = 0; 
		String siblings;
		String location = null;
		String transportation = null; 
		
		Scanner sc = new Scanner(System.in);
		
		String name = "firstname + lastname";
		
		System.out.println("What is your full name ?");
		
		name = sc.nextLine();
		
		System.out.print(name);
	
		System.out.println(" How old are you ? ");
	
	int age = 0;
	
	boolean even = age == 2;
	if (age == 2) {
		System.out.print("10 years");
	}else{
		System.out.print("15 years");
		
		System.out.println(" When is your birthday ? ");
		String month1 = "January";
		String month2 = "Febuary";
		String month3 = "March";
		String month4 = "April";
		String month5 = "May";
		String month6 = "June";
		String month7 = "July";
		String month8 = "August";
		String month9 = "Septemeber";
		String month10 = "October";
		String month11 = "Novemver";
		String month12 = "December";
		
		
        if (name.contains(month1.substring(0, 1))){
        month1 = ("5000"); 
            System.out.print(" with 5000 in the bank" );
            
        }else if (name.contains(month1.substring(1, 2))){
        	month1 = ("15000");
            System.out.print(" with 11000 in the bank");
            
        }else if (name.contains(month1.substring(2, 3))){
        	month1 = ("25000");
            System.out.print(" with 25000 in the bank");
            
        }else if (name.contains(month1.substring(3, 4))){
        	month11 = ("40000");
            System.out.print(" with 0 in the bank");
            
  
            System.out.println(" witch of the ROYGBIV colors is your favorite ?");
            String roygbiv = scanner.next();
            roygbiv.toLowerCase(); 
        
            System.out.println("\n Please enter the firstletter of your favorite color ?"
                    + " \nR for Red \nO for Orange \nY for Yellow"
                    + "\nG for Green \nB for Blue \nI for Indigo \nV for Violet");
            color = scanner.next().toUpperCase();
            transportation = roygbiv.equals("yes"); 
            
            String = transportation;
           
            if (color.equals("R")); {
                transportation = "Car";   
            }else if (color.equals("O")); {
                    transportation = "Plane";
            }else if (color.equals("Y")); {
                    transportation = "Bike";
            }else if (color.equals("V")); {
                    transportation = "Motorcylcle";
            }else if (color.equals("B,G")); {
                    transportation = "Boat";
            }else if (color.equals("I")); {
                    transportation = "Skateboard";
            	
                    break;
                    
            case "R": transportation = "Car";
            break;
                
            case "O": transportation = "Plane";
            break;
            
            case "Y": transportation = "Bike";
            break;
            
            case "B,G": transportation = "Boat";
            break;
            
            case "I": transportation = "Skateboard";
            break;
            
            case "V": transportation = "Motorcycle";
            break;
            	
	Scanner sc5 = new Scanner(System.in);
		String numberofSiblings;
		System.out.println("How many siblings do you have ? ");
	numberofSiblings = sc5.nextLine();
	System.out.println();
	
	String siblings[] = new String[5];
	siblings[0] =("Houston");
	siblings[1] =("Seattle");
	siblings[2] =("Columbus");
	siblings[3] =("Miami");
	siblings[4] =("Denver");
	


		System.out.println( name + " will retire in " + " years with " + savings
				+ " in the bank, a vacation home in " + siblings + " and a " + transportation + ". ");	
	
	}
		}
}

