import java.util.Scanner;
public class WhileKelipatan29{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah = 0;
        int kelipatan; 
        int counter = 0;
        int i;
        
        System.out.print("Masukkan bilangan kelipatan (1-9) :");
        kelipatan = scan.nextInt();
        i=1;
        while ( i <=50 ){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
                
            } 
            i++;
        }
        
        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n",kelipatan, counter);
         System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
          
         scan.close();
        
    }
}
