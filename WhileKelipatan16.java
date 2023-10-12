import java.util.Scanner;
/**
 * ForKelipatan16
 */
public class WhileKelipatan16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, total, counter ;
        float rata;
        total = 0;
        counter = 0;
        
        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50){
            if (i % kelipatan == 0) {
                total += i;
                counter++;   
            }
           i++;
        }
        rata = total/counter;
        System.out.printf("Banyak bilangan %d dari i sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata dari kelipatan tersebut adalah : " + rata);
        scan.close();

    }
}
