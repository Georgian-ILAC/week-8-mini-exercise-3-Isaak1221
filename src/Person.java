public class Person {
    private String firstName;
    private String lastName;
    private int heightFeet;
    private int heightInches;

    public Person(String firstName, String lastName, int heightFeet, int heightInches) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "They are " + heightFeet + "'" + heightInches + "\"\n";
    }
}