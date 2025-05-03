public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        String answer = ("This is a Summary of " + name + "'s course grade.");
        return answer; 
    }

}