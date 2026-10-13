package com.latihan;

public class ValidasiPendaftaran {

    public boolean validasi(String nama, int umur, String email, boolean setujuSyarat) {

        if (nama == null || nama.isEmpty()) {
            return false;
        }

        if (umur < 17) {
            return false;
        }

        if (email == null || !email.contains("@")) {
            return false;
        }

        if (!setujuSyarat) {
            return false;
        }

        return true;
    }
}