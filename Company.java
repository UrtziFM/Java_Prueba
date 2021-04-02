public class Company {

    public static void main(String[] args) throws Exception {
        Profile profile1 = new Profile("Jon", 40, "Bilbao");
        Profile profile2 = new Profile("Maider", 39, "Basauri");
        profile1.getProfile();
        profile2.getProfile();
        do {
            System.out.println("Hello World");
        } while(profile1.employeeName == "Maider");
    }
    
}
