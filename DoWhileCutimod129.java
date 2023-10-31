import java.util.Scanner;
public class DoWhileCuti29{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int JatahCuti, JumlahHari;
        String konfirmasi;
        
        
        System.out.print("jatah cuti :");
        JatahCuti = sc.nextInt();

        do{
            System.out.println("apakah anda mengambil cuti (y/t)");
            konfirmasi = sc.next();

           if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("jumlah hari :");
                JumlahHari = sc.nextInt();
                
                

                if (JumlahHari <= JatahCuti){
                    JatahCuti -= JumlahHari;
                    System.out.println("sisa jatah cuti :"  + JatahCuti);

                }else{
                    System.out.println("sisa jatah cuti anda melebihi sisa jatah cuti.");
                    break;
                }
  

            }
        
          
        }while (JatahCuti > 0);
    }
}