public class MataKuliah {

    String kodeMK, namaMK;
    int sks;

    MataKuliah() {
    } 

    MataKuliah(String kode, String nMK, int sks) {
        kode = kodeMK;
        nMK = namaMK;
        this.sks = sks;
    }

    void tampilMatakuliah() {
        System.out.println("Kode MK: " + kodeMK + " | Nama MK: " + namaMK + " | SKS: " + sks);
    }
}