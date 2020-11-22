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
public class Mahasiswa extends Manusia {
      public String nim, kelas;

    //getter setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.printf("Saya %s umur %d tahun sedang belajar di kelas %s%n", nama, umur, kelas);
    }

    //override method
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
