/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan52;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class PBO10119913Latihan52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Manusia manusia1 = new Manusia();
        Mahasiswa mahasiswa = new Mahasiswa();
        Dosen dosen = new Dosen();

        dosen.setNip("4122789930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMata_kuliah("PBO");

        mahasiswa.setNim("10110269");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");

        System.out.println("NIP DOSEN : "+ dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println();

        System.out.println("NIM MAHASISWA : "+ mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
