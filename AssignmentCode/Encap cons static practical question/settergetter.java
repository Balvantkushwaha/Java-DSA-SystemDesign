//3.Use a private keyword for a variable and use setter and getter methods to initialise print the values.
class settergetter{
    private String name;
    private int age;

    public settergetter() {
        // Default constructor
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        settergetter obj = new settergetter();
        obj.setName("John");
        obj.setAge(25);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
