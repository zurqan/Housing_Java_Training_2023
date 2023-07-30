package basic.session2;

public class SwitchApplication {

    public static void main(String[] args) {
        int number =0;

//        switch (number){
//
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1 :
//                System.out.println("One");
//                break;
//            case 2:
//            case 4:
//            case 6:
//                System.out.println("Even");
//                break;
//            default:
//                System.out.println("Number");
//                break;
//
//        }


        switch (number){
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
        }

        String msg = switch (number){
            case 0 -> "Zero";
            case 1 -> "One";
            default -> "default";
        };
        System.out.println("msg = " + msg);

        String msg2 = switch (number){
            case 0 -> {
                System.out.println("Do operation");
                yield "Zero";
            }
            case 1 -> "One";
            case 2,3,4,6 -> "Even";
            default -> "default";
        };
        System.out.println("msg = " + msg);
    }
}
