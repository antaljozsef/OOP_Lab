package Parcialis;

public class Diak {
    private String vnev;
    private String knev;
    private double eretsegi;
    private double matematika;

    // KONSTRUKTOR

    public Diak(String vnev, String knev, double eretsegi, double matematika){
        this.vnev = vnev;
        this.knev = knev;
        this.eretsegi = eretsegi;
        this.matematika = matematika;
    }

    public Diak(){
        this.vnev = " ";
        this.knev = " ";
        this.eretsegi = 0;
        this.matematika = 0;
    }

    // GETTER

    public String getVnev() {
        return this.vnev;
    }

    public String getKnev() {
        return this.knev;
    }

    public double getEretsegi() {
        return this.eretsegi;
    }

    public double getMatematika() {
        return this.matematika;
    }

    // SETTER

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    public void setEretsegi(double eretsegi) {
        this.eretsegi = eretsegi;
    }

    public void setMatematika(double matematika) {
        this.matematika = matematika;
    }

    // OTHER METHODS

    public double atlag(){
        double atlag = (this.matematika + this.eretsegi)/2;
        return atlag;
    }

    @Override

    public String toString(){
        return this.vnev + " " + this.knev + " " + this.eretsegi + " " + this.matematika + " " + this.atlag();
    }
}
