import java.util.Scanner;

public class Calc {
    public void calc(Scanner scanner, boolean isTotal, float sumPrice, String sumLine, int friendsNum){
        float positionPrice = 0;
        FormatEnd formatEnd = new FormatEnd();

        while (!isTotal){

            System.out.println("Введите любой символ для продолжения добавления или завершить, для окончания ввода товаров.");
            String endLine = scanner.nextLine().trim();

            if(endLine.equalsIgnoreCase("Завершить")){
                isTotal = true;
            } else {
                System.out.println("Введите название товара:");
                String nameLine = scanner.nextLine().trim();
                System.out.println("Введите цену товара:");

                boolean isFlCheck = false;
                while (!isFlCheck){
                    if(scanner.hasNextFloat()){
                        positionPrice = scanner.nextFloat();
                        if(positionPrice > 0){
                            isFlCheck = true;
                        } else {
                            System.out.println("Введено некорректное значение: \"Цена не может быть ниже 0\"");
                        }
                    } else {
                        System.out.println("Введено некорректное значение: \"Указывайте цену используя цифры\"");
                        scanner.next();
                    }
                }
                scanner.nextLine();
                sumPrice += positionPrice;
                sumLine += "\n" +nameLine;
                System.out.println("Товар доавлен.");
            }
        }
        String sumPriceEnd = formatEnd.formatEnd(sumPrice);
        float eachFriend = sumPrice/friendsNum;
        String eachFriendPay = formatEnd.formatEnd(eachFriend);
        System.out.println("Сумма чека: " + sumPriceEnd + "\nС человека: " + eachFriendPay + "\nДобавленные товары: " + sumLine);
    }
}
