/*
Write a Java program to create a class called "GymMembership" with attributes
for member name, membership type, and duration. Create a subclass 
"PremiumMembership" that adds attributes for personal trainer availability
and spa access. Implement methods to calculate membership fees and check
for special offers based on membership type.
*/

public class GymMembership {
    String Name;
    String MembershipType;
    String Duration;

    public GymMembership(String Name, String MembershipType, String Duration) {
        this.Name = Name;
        this.MembershipType = MembershipType;
        this.Duration = Duration;
    }

    void specialOffers(){
        if(MembershipType == "Premium"){
            System.out.println("Valid offers are :");
            System.out.println("offer 1 :");
            System.out.println("Offer 2 :");
        }else{
            System.out.println("No offer applicable");
        }
    }
    void fees(){
        if (MembershipType == "Premium") {
            System.out.println("5000/month");
        }else{
            System.out.println("3000/month");
        }
    }
    

}

