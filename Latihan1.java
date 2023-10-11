import java.util.Scanner;
public class Latihan1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        String kelamin;

        for(int i = 1; i <=3; i++){
        System.out.println("masukkan nama :");
        nama = input.nextLine();
        System.out.println("masukkan jenis kelamin :");
        kelamin = input.nextLine();
        
        if(kelamin.equalsIgnoreCase("perempuan")){
            System.out.print("nama anda :" + nama + "jenis kelamin" + kelamin);
        }
    }
    input.close();

    }
        
    
}