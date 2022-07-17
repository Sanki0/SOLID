package NoSolid.SRP;
import java.util.Random;

public class GeneradorIDEmpleado {
    static String empId;
    public static String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        empId = empFirstName.substring(0,1)+random;
        return empId;
    }
}