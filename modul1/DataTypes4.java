import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes4{
 public static void main(String [] args){

 String namaDepan = "Linda";
 String namaBelakang = "Oktaviyani";
 int usia = 19;
 int targetTahunKuliah = 4;
 double ipk = 3.89764512;
 char nilaiAbjad = 'A';
 boolean cantik = true;
 
 System.out.print("Input nama depan : ");
 namaDepan = scanner.nextLine();
 System.out.print("Input usia: ");
 usia = scanner.nextInt();
 System.out.print("Input IPK : ");
 ipk =  scanner.nextDouble();
 System.out.print("");
 System.out.print("Input nilai abjad : ");
 nilaiAbjad = scanner.next().charAt(0);
 System.out.print("Cantik? : ");
 cantik = scanner.nextBoolean();

 System.out.println("===============OUTPUT===============");
 System.out.println("Nama Depan : "+ namaDepan);
 System.out.println("Nama Belakang : "+ namaBelakang);
 System.out.println("Usia : "+usia);
 System.out.println("Targer kuliah : "+ targetTahunKuliah + " tahun");
 System.out.println("IPK : "+ ipk); 
 System.out.println("Nilai PBO : "+ nilaiAbjad);
 System.out.println("Cantik : "+ cantik);

 JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaBelakang);
 }
}