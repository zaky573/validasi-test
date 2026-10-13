package com.latihan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidasiPendaftaranTest {

    ValidasiPendaftaran validasi = new ValidasiPendaftaran();

    // Test Case 1: Nama kosong
    @Test
    void testNamaKosong() {
        boolean hasil = validasi.validasi("", 20, "test@gmail.com", true);
        assertFalse(hasil);
    }

    // Test Case 2: Umur kurang dari 17
    @Test
    void testUmurKurang() {
        boolean hasil = validasi.validasi("Budi", 15, "test@gmail.com", true);
        assertFalse(hasil);
    }

    // Test Case 3: Email tidak valid
    @Test
    void testEmailTidakValid() {
        boolean hasil = validasi.validasi("Budi", 20, "testgmail.com", true);
        assertFalse(hasil);
    }

    // Test Case 4: Tidak menyetujui syarat
    @Test
    void testTidakSetujuSyarat() {
        boolean hasil = validasi.validasi("Budi", 20, "test@gmail.com", false);
        assertFalse(hasil);
    }

    // Test Case 5: Semua data benar
    @Test
    void testDataValid() {
        boolean hasil = validasi.validasi("Budi", 20, "test@gmail.com", true);
        assertTrue(hasil);
    }
}