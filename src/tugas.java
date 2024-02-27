import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println("1. Login Sebagai Mahsiswa");
            System.out.println("2. Login Sebagai Admin");
            System.out.println((char)27+"[01;31m 3. Exit"+(char)27+"[00;00m");
            System.out.print("Pilihan Anda    :");
            pilihan = input.nextInt();
            input.nextLine();

            //Fungsi Memilih
            switch (pilihan) {
                case 1:
                    loginMahasiswa(input);
                    break;
                case 2:
                    loginAdmin(input);
                    break;
                case 3:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println((char)27+"[01;31m pilihan tidak valid. silahkan pilih (1,2,3)"+(char)27+"[00;00m");
                    break;
            }
        }
        input.close();
    }
    public static void loginMahasiswa(Scanner input){
        System.out.print("Masukkan NIM    :");
        String nim = input.nextLine();

        if (nim.length() >= 15){
            System.out.println((char)27+"[01;32m Berhasil Login Mahasiswa"+(char)27+"[00;00m");
        }else{
            System.out.println((char)27+"[01;31m NIM yang anda masukkan salah"+(char)27+"[00;00m");
        }
    }
    public static void loginAdmin(Scanner input){

        String adminUsername = "admin";
        String adminPassword = "admin";

        System.out.print("Masukkan Username admin :");
        String username = input.nextLine();
        System.out.print("Masukkan Password admin :");
        String password = input.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)){
            System.out.println((char)27+"[01;32m Login admin berhasil"+(char)27+"[00;00m");
        }else{
            System.out.println((char)27+"[01;31m Username dan Passwor salah"+(char)27+"[00;00m");
        }
    }
}
