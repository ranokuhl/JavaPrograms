public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getfullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty()) {
            return lastName;
        }

        return firstName + " " + lastName;
    }


    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full name " + person.getfullName());
        System.out.println("Teen is: " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("Full name " + person.getfullName());
        System.out.println("Teen is: " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full name " + person.getfullName());

    }
}
