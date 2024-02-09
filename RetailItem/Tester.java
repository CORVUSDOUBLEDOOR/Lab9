package RetailItem;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("title = ");
        String title = kb.nextLine();
        System.out.print("artist = ");
        String artist = kb.nextLine();
        System.out.print("retailPrice = ");
        double retailPrice = kb.nextDouble();
        CompactDisc objectC = new CompactDisc(title, artist, retailPrice);
        System.out.print("title = ");
        String titleM = kb.next();
        System.out.print("runningTime = ");
        int runningTime = kb.nextInt();
        System.out.print("retailPrice = ");
        double retailPriceM = kb.nextDouble();
        DvdMovie objectM = new DvdMovie(titleM, runningTime, retailPriceM);
        System.out.println("Item #1 : " + objectC.getTitle());
        showPrice(objectC);
        System.out.println("Item #2 : " + objectM.getTitle());
        showPrice(objectM);
    }
    private static void showPrice(RetailItem item){
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    }
}
