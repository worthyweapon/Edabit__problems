package easy;

public class ShuffleTheName {

//	public static String swap(String fName) {
//        String[] names = fName.trim().split("\\s+");
//        //if (names.length >= 2) {
//            String firstName = names[0];
//            String lastName = names[names.length - 1];
//            return lastName + " " + firstName;
        //} else {
        //    return fName; // If there's only one name, return the original string
        //}
//    }
//
//    public static void main(String[] args) {
//        String fName1 = "John Doe";
//        System.out.println("Original name 1: " + fName1);
//        System.out.println("Swapped name 1: " + swap(fName1));
//
// }
    
    public static void main(String[] args) 
    {
    	ShuffleTheName swap = new ShuffleTheName();
    	swap.swapping("Subha Shini");
    	
	}
    public String swapping(String name)
    {
    	String[] split= name.trim().split("\\s");
    		//Trim and split the name based on spaces
    	String Fname = split[0];
    		//Have name which in index 0 as Fname
    	String Lname = split[split.length-1];
    		//Have name which in index last index-1 as Lname
    	String Full_name = Lname + " " + Fname;
    		//Store full name in reverse order
    	System.out.println(Full_name);
		return Full_name;
    	
    }

}
