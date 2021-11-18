public class Main {
    public static void main(String[] args) {
        Tetap karT1 = new Tetap("Agung",500000.0,5000000.0);
        Tetap karT2 = new Tetap("Made",400000.0,4500000.0);
        Kontrak karK1 = new Kontrak("Komang",8,130000.0);
        Kontrak karK2 = new Kontrak("Ketut",7,100000.0);

        Departemen dep = new Departemen("Departemen");
        dep.addKaryawan(karT1);
        dep.addKaryawan(karT2);
        dep.addKaryawan(karK1);
        dep.addKaryawan(karK2);


        dep.displayAll();

        System.out.println();

        dep.displayTetap();

        System.out.println();

        dep.displayKontrak();

    }
}