public class Driver {
    public static void main(String[] args) {
        Asdos fair = new Asdos("fairuzi-kun",23,4);
        Dosen raja = new Dosen("Raja OP Damanik",5);
        Asdos angel = new Asdos("Angel-chan",19,7);
        Mahasiswa firman = new Mahasiswa("Firman",20);
        Mahasiswa nid = new Mahasiswa("Nid to pass this sem", 23);
        Dosen nivo = new Dosen("Nivotko",3);

        fair.tunjukan();
        raja.tunjukan();
        angel.tunjukan();
        firman.tunjukan();
        nid.tunjukan();
        nivo.tunjukan();

        int TotJamSibuk = fair.jamSibuk + raja.jamSibuk + 
        angel.jamSibuk + firman.jamSibuk + nid.jamSibuk + nivo.jamSibuk;

        System.out.println("Total jam sibuk elemen fasilkom adalah "+ TotJamSibuk);
    }
}