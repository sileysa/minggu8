public class Mahasiswa {

    String nim, nama, prodi;
    Mahasiswa[] dataMahasiswa = new Mahasiswa[10];
    int idx = 0;

    Mahasiswa(){
    }

    Mahasiswa(String nim, String nm, String prd) {
        this.nim = nim;
        nm = nama;
        prd = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }

    void sequentialSearching(String cari){
        int posisi = -1;
        for (int i = 0; i < idx; i++) {
            if (dataMahasiswa[i].nim == cari) {
                posisi = i;
                break;
            }
        }
    }
}