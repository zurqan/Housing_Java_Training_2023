package basic.session2;

public class IfApplicaction {

    public static void main(String[] args) {

        int number =100;

        if(number <20){
            System.out.println("Number less than 20");
            System.out.println("Another statement");
        }else{
            System.out.println("Number is GT or Eq 20");
        }

        if(number <20){
            System.out.println("Number less than 20");
        }



        if(number <20){
            System.out.println("Number less than 20");
            System.out.println("Another statement");

        }else if(number == 20){
            System.out.println("Number is Eq 20");
        }else {
            System.out.println("Number is GT 20");
        }

    }
}
