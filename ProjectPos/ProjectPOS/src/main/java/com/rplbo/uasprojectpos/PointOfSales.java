package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfSales {

    private ArrayList<Barang> arrBarang = new ArrayList<>();

    public PointOfSales(){

    }

    public void inputBarang(Barang barang)
    {
        this.arrBarang.add(barang);
    }

    public void tampilDaftarBarang(){
        System.out.println("Kode Barang \t Nama Barang \t Stok \t Price");
        for(Barang barang : this.arrBarang ){
            System.out.println(barang.getKode() +"\t"+ barang.getNama() +"\t"+ barang.getStok() +"\t  Rp"+barang.getHarga());

        }


    }

    public void checkout(HashMap<Barang,Integer> listBarang, long harga){

        for(Barang barang: listBarang.keySet()){
            int newStock = barang.getStok() - listBarang.get(barang);
            barang.setStok(newStock);
            long tagihan = barang.getHarga()*listBarang.get(barang);
            long kembalian = harga - tagihan;
            System.out.println("Total tagihan: Rp"+tagihan);
            System.out.println("Total bayar: Rp"+harga);
            System.out.println("Total kembalian: Rp"+kembalian);
        }

        }

    }

