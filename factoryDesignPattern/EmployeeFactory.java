public class EmployeeFactory {
    public static Employee getEmployee(String employeeType) {
        if (employeeType == null) {
            return null;
        }
        if (employeeType.equalsIgnoreCase("ANDROID")) {
            return new AndroidDeveloper();
        } else if (employeeType.equalsIgnoreCase("WEB")) {
            return new WebDevelope();
        }
        return null;
    }
}
