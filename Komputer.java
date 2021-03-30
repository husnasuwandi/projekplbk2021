public class Komputer implements LineInOut, OnOff { 
    public Komputer (){
    }

    public void transmitData() { 
        System.out.println("Proyektor hidup, data Berhasil Ditampilkan");
    } 
    
    public void pressed() { 
        System.out.println("Menghubungkan ke proyektor");
        System.out.println("Loading...");
    }
}
