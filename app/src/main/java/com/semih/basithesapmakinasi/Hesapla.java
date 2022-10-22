package com.semih.basithesapmakinasi;

public class Hesapla {
    private double gelenSayi1, gelenSayi2;

    public Hesapla(double gelenSayi1, double gelenSayi2) {
        this.gelenSayi1 = gelenSayi1;
        this.gelenSayi2 = gelenSayi2;
    }

    public double toplam() {
        return gelenSayi1 + gelenSayi2;
    }

    public double fark() {
        return gelenSayi1 - gelenSayi2;
    }

    public double bolme() {
        return gelenSayi1 / gelenSayi2;
    }

    public double carpma() {
        return gelenSayi1 * gelenSayi2;
    }
}

