package SRP;

public class SeniorityChecker {
    public static String checkSeniority(double experienceInYears){
        return  experienceInYears > 5 ?"senior":"junior";
    }
}