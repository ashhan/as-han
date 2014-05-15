
package six;
import java.util.Scanner;
public class Six {
    public static String nrp;
    public static String nama; 
    public static String jurusan;
    public static String fakultas;
    public static String tahun;
    public static int jumlahnrp;
    public boolean stopper = true;
    public Integer n = new Integer(0);
   
  
    public static void awaldata ()
	{ 
	Scanner scan = new Scanner(System.in);
	System.out.println("Masukkan NAMA Anda = ");
	nama = scan.nextLine();
        System.out.println("Masukkan NRP ANDA = ");
        nrp = scan.nextLine();
	}
    
    public static void nrp(){
        jumlahnrp = nrp.length();   
        
        if (jumlahnrp>10) {
            System.out.println("\nPerhatian! Digit NRP yang Anda masukkan berlebihan");
        }else if (jumlahnrp<10) {
            System.out.println("\nPerhatian! Digit NRP yang Anda masukkan kekurangan");
        }else{
            System.out.println();} 
       
        
         char[] data = nrp.toCharArray();

        boolean valid = true;
        for (char c : data) {
            if (!Character.isDigit(c)) {
                valid = false;
                break;
            }
        }
        if (valid) {
            System.out.println();
        } else {
            System.out.println("Input yang anda masukkan bukan angka, harap di ganti!");
        }
     
        tahun   = nrp.substring(2, 4); 
        System.out.println("TAHUN: 20"+tahun); }

         public static Integer fakultas(){
             return new Integer(nrp.substring(0,1));
         }
         
         public static Integer jurusan() {
             return new Integer(nrp.substring(1,2));
         }
       
         public static void listfakultas(){
             
         //daftar fakultas dan jurusan di ITS
             if (fakultas()==1&&jurusan()==1){                                  
                 System.out.println("FAKULTAS: FMIPA\nJURUSAN: FISIKA" );
             } else if (fakultas()==1&&jurusan()==2){
                 System.out.println("FAKULTAS: FMIPA\nJURUSAN: MATEMATIKA" );
             } else if (fakultas()==1&&jurusan()==3){
                 System.out.println("FAKULTAS: FMIPA\nJURUSAN: STATISTIKA" );
             } else if (fakultas()==1&&jurusan()==4){
                 System.out.println("FAKULTAS: FMIPA\nJURUSAN: KIMIA " );
             } else if (fakultas()==1&&jurusan()==5){
                 System.out.println("FAKULTAS: FMIPA\nJURUSAN: BIOLOGI " );
             }
             else if (fakultas()==2&&jurusan()==1){                             
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.MESIN " );
             } else if (fakultas()==2&&jurusan()==2){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.ELEKTRO " );
             } else if (fakultas()==2&&jurusan()==3){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.KIMIA " );
             } else if (fakultas()==2&&jurusan()==4){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.FISIKA " );
             } else if (fakultas()==2&&jurusan()==5){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.INDUSTRI " );
             } else if (fakultas()==2&&jurusan()==7){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.MATERIAL METALURGI " );
             } else if (fakultas()==2&&jurusan()==8){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: MANAJEMEN BISNIS " );
             } else if (fakultas()==2&&jurusan()==9){
                 System.out.println("FAKULTAS: FTI\nJURUSAN: TEK.MULTIMEDIA & JARINGAN " );
             } 
             
             else if (fakultas()==3&&jurusan()==1){                             
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: TEK.SIPIL " );
             } else if (fakultas()==3&&jurusan()==2){
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: ARSITEKTUR " );
             } else if (fakultas()==3&&jurusan()==3){
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: TEK.LINGKUNGAN " );
             } else if (fakultas()==3&&jurusan()==4){
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: DESAIN PRODUK " );
             } else if (fakultas()==3&&jurusan()==5){
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: GEOMATIKA " );
             } else if (fakultas()==3&&jurusan()==6){
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: PWK " );
             } else if (fakultas()==3&&jurusan()==7){
                 System.out.println("FAKULTAS: FTSP\nJURUSAN: TEK.GEOFISIKA " );
             }
             
             else if (fakultas()==4&&jurusan()==1){
                 System.out.println("FAKULTAS: FTK\nJURUSAN: TEK.PERKAPALAN " );  
             } else if (fakultas()==4&&jurusan()==2){
                 System.out.println("FAKULTAS: FTK\nJURUSAN: SISTEM PERKAPALAN " );
             } else if (fakultas()==4&&jurusan()==3){
                 System.out.println("FAKULTAS: FTK\nJURUSAN: TEK.KELAUTAN " );
             } else if (fakultas()==4&&jurusan()==4){
                 System.out.println("FAKULTAS: FTK\nJURUSAN: TRANSPORTASI LAUT " );   
             }
             
             else if (fakultas()==5&&jurusan()==1){
                 System.out.println("FAKULTAS: FTIF\nJURUSAN: TEK.INFORMATIKA " );  
             } else if (fakultas()==5&&jurusan()==2){
                 System.out.println("FAKULTAS: FTIF\nJURUSAN: SISTEM INFORMASI " );
                 
             } else { 
                 System.out.println("Bukan jurusan manapun, input yang dimasukkan salah");
            } 
         }
         
        public static void showdata ()
	{
	System.out.println("------------------------------");
        System.out.println("IDENTITAS KARTU MAHASISWA ANDA");
        System.out.println("------------------------------");
	System.out.printf("NAMA: %s\n",nama);
	System.out.printf("NRP: %s",nrp);
        
        }
        
    public static void main(String[] args) {
        // TODO code application logic here
        awaldata();showdata(); nrp(); listfakultas();
    }}
