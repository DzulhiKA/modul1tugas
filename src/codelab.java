import  java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class codelab {

    public static void main(String[] args) {
        //VARIABEL
        String nama;
        char jenisKelamin;
        String tanggalLahir;

    //OBJEK DARI CLASS SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Nama                            :");
        nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L)    :");
        jenisKelamin = input.next().charAt(0);
        input.nextLine();
        System.out.print("Tanggal Lahir (YYYY-MM-DD)       :");
        tanggalLahir = input.next();

        LocalDate lahir = LocalDate.parse(tanggalLahir);
        LocalDate hariIni = LocalDate.now();
        Period periode = Period.between(lahir, hariIni);
        int umur = periode.getYears();
        int bulan = periode.getMonths();

        if (jenisKelamin == 'P' || jenisKelamin == 'p'){
            System.out.println("Nama            :"+nama);
            System.out.println("Jenis Kelamin   : Perempuan");
            System.out.printf("Umur             :"+ umur +" Tahun"+ bulan +" bulan");
        } else if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            System.out.println("Nama            :"+nama);
            System.out.println("Jenis Kelamin   : Laki laki");
            System.out.printf("Umur             :"+ umur +" Tahun "+ bulan +" bulan");
        }else {
            System.out.println("Input Jenis Kelamin tidak valid");
        }

    }
}
