public class Elemen {
    public String name;
    public int jamSibuk;

    public Elemen(String name) {
        /*Consturctor superclass adalah bentuk dari DOWNCASTING,
         * karena ia adalah referensi bagi subclassnya.Yang mana artinya,
         * jika super class dibuatkan constructor,maka subclass juga harus dibuatkan
         * constructornya,jika tidak maka akan error*/
        this.name = name;
    }
}

class Dosen extends Elemen {

    /* extends salah satu bentuk awalan dari pembentukan POLYMORPHISME */

    private int jumlahHariKerja;

    public Dosen(String name, int jumlahHariKerja) {
        super(name);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void tunjukan() {
        System.out.println(name + " adalah seorang dosen dengan jam sibuk " + jamSibuk);
    }
}

class Mahasiswa extends Elemen {
    private int sks;

    public Mahasiswa(String name, int sks) {
        super(name);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void tunjukan() {
        System.out.println(name + " adalah seorang mahasiswa dengan jam sibuk " + jamSibuk);
    }
}

class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String name, int sks, int jamNgasdos) {
        super(name, sks);
        jamSibuk = jamSibuk + jamNgasdos;

    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void tunjukan() {

        /*method tunjukan() adalah bentuk UPCASTING,
         * karena mengubah referensi methodnya sendiri,dan tidak mengambil isi method
         * atau referensi dari class induknya */

        System.out.println(name + " adalah seorang asisten dosen dengan jam sibuk " + jamSibuk);
    }
}