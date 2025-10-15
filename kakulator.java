import java.util.Scanner;

public class kakulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Penjumlahan tambah = new Penjumlahan();
        Pengurangan kurang = new Pengurangan();
        Perkalian   kali   = new Perkalian();
        Pembagian bagi     = new Pembagian();
        Kuadrat  kuadratku =new Kuadrat();
        Akar Akarku = new Akar();


        input.close();
    }

}


class Penjumlahan {
    public Penjumlahan() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== PENJUMLAHAN ===");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }
}



class Pengurangan {
    public Pengurangan() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== PENGURANGAN ===");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasil);
    }


}

class Perkalian {
    public Perkalian(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== PERKALIAN ===");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasil);
    }
}

class Pembagian {
    public Pembagian(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== PEMBAGIAN ===");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        int hasil = angka1 / angka2;
        System.out.println("Hasil pembagian: " + hasil);
    }
}

class Kuadrat {
    public Kuadrat(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== KUADRAT ===");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        int hasil = angka1*angka1;
        System.out.println("Hasil Kuadrat: " + hasil);
    }
}

class Akar {
    public Akar(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n=== AKAR ===");

        System.out.print("Masukan angka : ");
        double r =input.nextDouble();

        double hasil = Math.sqrt(r);
        System.out.println("hasil akar dari " + r + "adalah" + hasil);
        
}
}



    
        
    

    

