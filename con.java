public class emp {
    private String name;
    private int id;

    private emp(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public emp(String name, int id, int someOtherValue) {
        this(name, id);
    }
    public void printInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
    public static void main(String[] args) {
        emp obj1 = new emp("sai", 1);
        emp obj2 = new emp("Asubash", 2);
        emp obj3 = new emp("nikki", 3);
        emp obj4 = new emp("mouni", 4);
        emp obj5 = new emp("venky", 5);
        obj1.printInfo();
        obj2.printInfo();
        obj3.printInfo();
        obj4.printInfo();
        obj5.printInfo();

        emp emp1 = new emp("Emp1", 101);
        emp emp2 = new emp("Emp2", 102);
        emp emp3 = new emp("Emp3",103);
        emp1.printInfo();
        emp2.printInfo();
        emp3.printInfo();
    }
}
__________________________
output:
Name: sai, ID: 1
Name: Asubash, ID: 2
Name: nikki, ID: 3
Name: mouni, ID: 4
Name: venky, ID: 5
Name: Emp1, ID: 101
Name: Emp2, ID: 102
Name: Emp3, ID: 103

=== Code Execution Successful ===