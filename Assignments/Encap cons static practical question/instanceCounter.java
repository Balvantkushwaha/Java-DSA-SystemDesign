// 1. Create a class that keeps track of the number of instances created. Implement a static variable and method to accomplish this.
class InstanceCounter {
    private static int count = 0; // Static variable to keep track of instances

    public InstanceCounter() {
        count++; // Increment count when a new instance is created
    }

    public static int getInstanceCount() {
        return count; // Return the number of instances
    }

    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
    }
}
