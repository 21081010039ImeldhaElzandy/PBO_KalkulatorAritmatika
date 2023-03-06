package kalkulatoraritmatika;
import java.util.Scanner;
public class KalkulatorAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pertama, kedua, ketiga, keempat, hasil;
        char operasi1, operasi2, operasi3;

        System.out.print("Angka Pertama = ");
        pertama = input.nextInt();
        System.out.print("Pilih Operasi Hitung (+ - * / %) = ");
        operasi1 = input.next().charAt(0);

        System.out.print("Angka Kedua = ");
        kedua = input.nextInt();
        System.out.print("Pilih Operasi Hitung (+ - * / %) = ");
        operasi2 = input.next().charAt(0);

        System.out.print("Angka Ketiga = ");
        ketiga = input.nextInt();
        System.out.print("Pilih Operasi Hitung (+ - * / %) = ");
        operasi3 = input.next().charAt(0);
        
        System.out.print("Angka Keempat = ");
        keempat = input.nextInt();

        switch (operasi1) {
            case '+':
                hasil=pertama+kedua;
                break;
            case '-':
                hasil=pertama-kedua;
                break;
            case '*':
                hasil=pertama*kedua;
                break;
            case '/':
                if(kedua == 0) {
                    System.out.println("TIDAK DAPAT DIBAGI DENGAN 0");
                    return;
                } 
                else {
                    hasil=pertama/kedua;
                    break;
                }
            case '%':
                hasil=pertama%kedua;
                break;
            default:
                System.out.println("PILIHAN YANG ANDA PILIH SALAH");
                return;
        }

        switch (operasi2) {
            case '+':
                hasil += ketiga;
                break;
            case '-':
                hasil -= ketiga;
                break;
            case '*':
                hasil *= ketiga;
                break;
            case '/':
                if (ketiga == 0) {
                    System.out.println("TIDAK DAPAT DIBAGI DENGAN 0");
                    return;
                } 
                else {
                    hasil /= ketiga;
                    break;
                }
            case '%':
                hasil %= ketiga;
                break;
            default:
                System.out.println("PILIHAN YANG ANDA PILIH SALAH");
                return;
        }

        switch (operasi3) {
            case '+':
                hasil += keempat;
                break;
            case '-':
                hasil -= keempat;
                break;
            case '*':
                hasil *= keempat;
                break;
            case '/':
                if (keempat == 0) {
                    System.out.println("TIDAK DAPAT DIBAGI DENGAN 0");
                    return;
                } 
                else {
                    hasil /= keempat;
                    break;
                }
            case '%':
                hasil %= keempat;
                break;
            default:
                System.out.println("PILIHAN YANG ANDA PILIH SALAH");
                return;
        }
        System.out.println("Hasil = " + hasil);
    }
}
