// Person Class

public class Person {
    private String name;
    private String lastname;
    private String phone;
    private String city;

    // Builder
    public Person(String name, String lastname, String phone, String city) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.city = city;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the lastname
    public String getLastname() {
        return lastname;
    }

    // Getter for the phone
    public String getPhone() {
        return phone;
    }

     // Getter for the city
    public String getCity() {
        return city;
    }
}
