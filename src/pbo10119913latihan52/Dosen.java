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
public class Dosen extends Manusia {
    private String nip, mata_kuliah;

   public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }


    public void mengajarApa() {
        System.out.printf("Saya %s umur %d tahun sedang mengajar matakuliah %s%n", nama, umur, mata_kuliah);
    }

    public void setMata_kuliah(String mata_kuliah) {
        this.mata_kuliah = mata_kuliah;
    }

    public String getMata_kuliah() {
        return mata_kuliah;
    }

    //override method
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
