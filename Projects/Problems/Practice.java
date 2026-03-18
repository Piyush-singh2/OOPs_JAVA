
public class Practice {

        public static void main(String[] args) {
        PremiumMembership Ram = new PremiumMembership("Piyush", "yes", "Ram", "Premium", "6 months");
        Ram.specialOffers();
        GymMembership Shyam = new GymMembership("Shyam", "Standard", "6 months");
        Shyam.specialOffers();
        Shyam.fees();
        Ram.fees();
}
}
