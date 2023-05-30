import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float sumPrice = 0;
        boolean isTotal = false;
        boolean isIntCheck = false;
        int friendsNum = 0;
        String sumLine = "";

        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте!\nНа какое количество человек Вы бы хотели разделить чек? ");

        while (!isIntCheck){
            if(scanner.hasNextInt()){
                friendsNum = scanner.nextInt();
                if(friendsNum >= 2){
                    isIntCheck = true;
                } else {
                    System.out.println("Введено некорректное значение: \"Введите количество человек больше одного\"");
                }
            } else {
                System.out.println("Введено некорректное значение: \"Указывайте количество человек используя цифры\"");
                scanner.next();
            }
        }
        scanner.nextLine();

        System.out.println("Делим чек на: " + friendsNum);
        calc.calc(scanner, isTotal, sumPrice, sumLine, friendsNum);
    }
}