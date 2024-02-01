import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int f = 0;

        while (f > -460){
            convertToC(getInput());
        }

    }

    static int getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the temp in Fahrenheit");
        int f = input.nextInt();
        return f;
    }

    static double convertToC(int f){
        double newTemp = (f-32)*5/9;
        System.out.println(newTemp);
        return newTemp;
    }
    //static int displayC(){

   // }

}