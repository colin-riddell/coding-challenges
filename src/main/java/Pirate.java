public class Pirate implements Comparable<Pirate>{
    private String firstName;
    private String lastName;

    public Pirate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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


    @Override
    public int compareTo(Pirate p) {
        return p.getFirstName().compareTo(this.firstName);
    }
}
