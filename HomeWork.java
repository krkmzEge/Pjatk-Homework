import java.util.Scanner;

public class HomeWork {
//Question1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal;

        System.out.println("Enter a decimal number : ");
        decimal=sc.nextInt();

        String binary,octal,hexadecimal;

        binary=Integer.toBinaryString(decimal);
        octal=Integer.toOctalString(decimal);
        hexadecimal=Integer.toHexString(decimal);

        System.out.println("Decimal : "+decimal+"  Binary : "+binary+"  Octal : "+octal+"  Hexadecimal "+hexadecimal+" ");
//Question2
        String LiteralA = "A";
        System.out.println(LiteralA);

        String A0 = "A"+0;
        System.out.println(A0);
//Question3
        String Exclamation = "!" + "!";
        char exclam2 = ('!' + '!') ;
        System.out.println(Exclamation+exclam2);
//Question4
        String Character = "\u017b\u00f3\u0142\u0107\n";
        System.out.print(Character);
//Question5
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
//Question6
        int c= 1;
        int d= 2;
        System.out.println(c < d);
        System.out.println(c <= d);
//Question7
        System.out.println(4.0/3);
        //this is an integer division, so the result is 1.3333333. In order to get the correct result, we need to change number to a float. Here is the example
//Question8
        short e = 5, f = 6;
        short g = (short) (e + f);
        System.out.println(g);
//Question9
        long i = 1_500_000_000;
        long l = 1_500_000_000;
        System.out.println(i+l);
//Question10
        int number = 45681;
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 1000) % 10;
        int digit5 = (number / 10000) % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
        System.out.print("decimal: "+digit1+digit2+digit3+digit4+digit5+"\n\n");
//Question11
        int number1 = 10101;
        int digit6 = number1 % 10;
        int digit7 = (number1 / 10) % 10;
        int digit8 = (number1 / 100) % 10;
        int digit9 = (number1 / 1000) % 10;
        int digit10 = (number1 / 10000) % 10;
        System.out.println(digit6);
        System.out.println(digit7);
        System.out.println(digit8);
        System.out.println(digit9);
        System.out.println(digit10);
        System.out.print("binary: "+digit6+digit7+digit8+digit9+digit10+"\n\n");
        //?????????????
//Question12
        int number2 = 5416;
        int digit11 = number2 % 10;
        int digit12 = (number2 / 10) % 10;
        int digit13 = (number2 / 100) % 10;
        int digit14 = (number2 / 1000) % 10;
        System.out.println(digit11);
        System.out.println(digit12);
        System.out.println(digit13);
        System.out.println(digit14);
        System.out.print("octal: "+digit11+digit12+digit13+digit14+"\n\n");
//Question13
        int number3 = 0x1;
        int digit15 = number2 % 10;
        int digit16 = (number3 / 10) % 10;
        int digit17 = (number3 / 100) % 10;
        System.out.println(digit15);
        System.out.println(digit16);
        System.out.println(digit17);
        System.out.print("hexadecimal: "+digit15+digit16+digit17+"\n\n");

    }
}



