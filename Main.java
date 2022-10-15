import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input_new = new Scanner(System.in);
        String[] nama = new String[4];
        String[] nim = new String[4];
        int[] nilai = new int[4];
        boolean[] status = new boolean[4];
        char[] grade = new char[4];
        for(int i = 0; i < 4; i++){
            System.out.print("NIM   : ");
            nim[i] = input_new.nextLine();
            System.out.print("Nama  : ");
            nama[i] = input_new.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = input_new.nextInt();
            input_new.nextLine();
            if(nilai[i] >=80 && nilai[i] < 100){
                grade[i] = 'A';
                System.out.println("Grade : A");
            }else if(nilai[i] >= 70 && nilai[i] < 80){
                grade[i] = 'B';
                System.out.println("Grade : B");
            }else if(nilai[i] >= 60 && nilai[i] < 70){
                grade[i] = 'C';
                System.out.println("Grade : C");
            }else if(nilai[i] >= 50 && nilai[i] < 70){
                grade[i] = 'D';
                System.out.println("Grade : D");
            }else{
                grade[i] = 'E';
                System.out.println("Grade : E");
            }
            if(grade[i] == 'D' || grade[i] == 'E'){
                status[i] = false;
            }else{
                status[i] = true;
            }
            for(int j = 0; j < 30; j++){
                System.out.print("=");
            }
            System.out.println("\n");
        }
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setMhs(nama, nim, grade, nilai, status);
        System.out.println("Jumlah mahasiswa : 4");
        System.out.print("Jumlah mahasiswa yang lulus : " + mahasiswa.jmlLulus(true));
        mahasiswa.mhsLulus(true);
        System.out.print("Jumlah mahasiswa yang lulus : " + mahasiswa.jmlLulus(false));
        mahasiswa.mhsLulus(false);
        System.out.print("Jumlah mahasiswa dengan nilai A : " + mahasiswa.jmlNilai('A'));
        mahasiswa.mhsNilai('A');
        System.out.print("Jumlah mahasiswa dengan nilai B : " + mahasiswa.jmlNilai('B'));
        mahasiswa.mhsNilai('B');
        System.out.print("Jumlah mahasiswa dengan nilai D : " + mahasiswa.jmlNilai('D'));
        mahasiswa.mhsNilai('E');
        mahasiswa.mhsRata();
        input_new.close();
    }
}