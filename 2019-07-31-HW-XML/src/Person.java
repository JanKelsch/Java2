public class Person {
    private String name;
    private String gender;
    private Address address;

    public Person(String name, String gender, Address address) {
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", gender = " + gender + ", \n" + address;
    }
}
