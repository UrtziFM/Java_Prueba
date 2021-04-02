public class Profile {
    protected String employeeName;
    public int employeeAge;
    public String employeeCity;

    public Profile(String name, int age, String city) {
        employeeName = name;
        employeeAge = age;
        employeeCity = city;
    }

    public void getProfile() {
        System.out.println("This is " + employeeName);
        System.out.println("It's " + employeeAge);
        System.out.println("And lives in " + employeeCity);
    }
}

