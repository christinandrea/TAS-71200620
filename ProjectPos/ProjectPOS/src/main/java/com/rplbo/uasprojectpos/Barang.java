package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private static int nextNum = 0;
    private String nama;
    private long harga;

    public Barang(String nama, int stok, long harga){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        String[] spl  = nama.split("\\s+");

        if(spl[0].toLowerCase().equals("mouse")){
            nextNum = nextNum+1;
            this.kode = "MS"+"00"+nextNum;
        } else if (spl[0].toLowerCase().equals("keyboard")) {
            nextNum = nextNum+1;
            this.kode = "KB"+"00"+nextNum;
        } else if (spl[0].toLowerCase().equals("headset")) {
            nextNum = nextNum+1;
            this.kode = "HS"+"00"+nextNum;
        }



    }



    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
