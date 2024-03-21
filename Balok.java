import java.util.Scanner;

public class Balok extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }

    // Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Getter untuk panjang
    public double getPanjang() {
        return this.panjang;
    }

    // Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Getter untuk lebar
    public double getLebar() {
        return this.lebar;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return this.tinggi;
    }
}
