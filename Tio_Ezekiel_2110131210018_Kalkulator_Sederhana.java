import java.util.Scanner;

public class Tio_Ezekiel_2110131210018_Kalkulator_Sederhana {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Float bil1, bil2, penjumlahan, pengurangan, perkalian, pembagian;
    String operator;
    // String operator;
    double hasil;
    
    System.out.println("");
    System.out.print("Masukkan bilangan pertama = ");
    bil1 = keyboard.nextFloat();
    System.out.print("Masukkan bilangan kedua   = ");
    bil2 = keyboard.nextFloat();
    
    System.out.println("======================");
    System.out.println(" PILIH JENIS OPERATOR ");
    System.out.println("  + \t\t  *");
    System.out.println("  - \t\t  /");
    System.out.println("======================");
    System.out.print("Ketikkan operator kalkulator yang Anda inginkan = ");
    operator = keyboard.next();

    switch(operator) {
        case "+":
            penjumlahan = bil1 + bil2;
            System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " adalah " + penjumlahan);       
            break;
        case "-":
            pengurangan = bil1 - bil2;
            System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " adalah " + pengurangan);              
            break;
        case "*":
            perkalian = bil1 * bil2;
            System.out.println("Hasil perkalian " + bil1 + " dan " + bil2 + " adalah " + perkalian);       
            break;
        case "/":
            pembagian = bil1 / bil2;
            System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " adalah " + pembagian);           
            break;
        default:
            System.out.println("Jenis operator tidak tersedia dalam list.");

            }
        System.out.println("");
        }
    }

