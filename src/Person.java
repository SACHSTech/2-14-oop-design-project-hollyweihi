public class Person {
    private String name;

    /**
     * Construct a Grade Calculator, allowing user to calculate their average and
     * convert them to GPA, Letter Grade, Level Grade.
     * 
     * @param name The name of user
     * 
     * @author Holly Wei
     */

    public Person(String name) {
        this.name = name;
    }

    /**
     * Return user name.
     * 
     * @return user name
     */
    public String getName() {
        return name;
    }

}