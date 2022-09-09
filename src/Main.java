import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("пишите выражения слитно ");
        String s = scan.nextLine();
        char ch = 0;   int num1, num2;   int summa;
        char[] chars = new char[10];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
            if (chars[i] == '+') {
                ch = '+';
            }if (chars[i] == '-') {
                ch = '-';
            }if (chars[i] == '*') {
                ch = '*';}
            if (chars[i] == '/') {
                ch = '/';
            }
        }
        try {
        String under_charString = String.valueOf(chars);
        String[] blacks = under_charString.split("[+-/*]");
        String number1 = blacks[0];
        String filter = blacks[1];
        String number2 = filter.trim();
        if (Character.isLetter(blacks[0].charAt(0))){
            checkRoman(number1);
            checkRoman(number2);
            num1 = RomanNumbers.romanNumber(number1);
            num2 = RomanNumbers.romanNumber(number2);
            summa = Symbols.symbols(num1, num2, ch);
            System.out.println("Ответ: ");
            String resultRoman = RomeAnswers.romanAnswer(summa);
            System.out.println(number1+ " " + ch + " " + number2 + " = " + resultRoman);
        } else {
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);
            summa = Symbols.symbols(num1, num2, ch);
            System.out.println("Ответ: ");
            System.out.println(num1 + " " + ch + " " + num2 + " = " + summa);
        }
/*            if (num1 < 0 && num2 < 0)
        {
            summa = 0;
        } else {
            }*/
        }catch (Exception e){
            System.out.println("The end");
        }

    }

    public static void checkRoman(String number){
        if (!Character.isLetter(number.charAt(0))){
          throw new RuntimeException("Wrong number");
        }
    }

}


