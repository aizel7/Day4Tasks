import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        String[] colorsArray = {"white","yellow","green","red","grey","black","blue"};
        ArrayList<String> colors = new ArrayList<String>();
        for (int i = 0; i < colorsArray.length; i++) {
            colors.add(colorsArray[i]);
        }
        colors.remove(2);
        colors.add("brown");
        colors.add(0,"pink");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        ArrayList<String> colorsSublist = new ArrayList<String>(colors.subList(2,5));
        for (int i = 0; i < colorsSublist.size(); i++) {
            System.out.println(colorsSublist.get(i));
        }
    }
} 
