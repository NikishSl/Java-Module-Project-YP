public class FormatEnd {
    public String formatEnd(float endStr){
        String rubles = "";
        int fullPart = (int) endStr;
        int lastOne = fullPart % 10;
        int lastTwo = fullPart % 100;

        if (lastTwo >= 11 && lastTwo <=19){
            rubles = "рублей";
        } else if(lastOne == 1) {
            rubles = "рубль";
        } else if(lastOne >= 2 && lastOne <= 4){
            rubles = "рубля";
        } else {
            rubles = "рублей";
        }
        return String.format("%.2f",endStr) + " " + rubles;
    }
}
