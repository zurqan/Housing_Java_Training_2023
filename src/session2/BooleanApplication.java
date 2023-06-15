package session2;

public class BooleanApplication {


    public static void main(String[] args) {

        boolean isActive = true;

        boolean isRunning = false;

        boolean and = isActive && isRunning;
        System.out.println("and = " + and);

        boolean or = isActive || isRunning;
        System.out.println("or = " + or);

        boolean isNotActive = !isActive;
        System.out.println("isNotActive = " + isNotActive);

        boolean anotherAnd = isActive & isRunning;
        System.out.println("anotherAnd = " + anotherAnd);
    }
}
