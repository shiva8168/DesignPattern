public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee e1 = EmployeeFactory.getEmployee(
                "ANDROID");
        System.out.println(e1.getSalary());
        Employee e2 = EmployeeFactory.getEmployee(
                "WEB");
        System.out.println(e2.getSalary());

    }

}
