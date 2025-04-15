public class Penilaian {

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    Penilaian() {
    }

    Penilaian(Mahasiswa mhs, MataKuliah matkul, double tugas, double uts, double uas, double akhir) {
        mhs = mahasiswa;
        matkul = mataKuliah;
        tugas = nilaiTugas;
        uts = nilaiUTS;
        uas = nilaiUAS;
        akhir = nilaiAkhir;
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    void tampilNilai() {
        mahasiswa.tampilMahasiswa();
        mataKuliah.tampilMatakuliah();
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}