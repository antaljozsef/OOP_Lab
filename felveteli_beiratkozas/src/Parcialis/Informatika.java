package Parcialis;

import java.util.ArrayList;

public class Informatika {
    ArrayList<Diak> felvetelizok;

    public Informatika(){
        this.felvetelizok = new ArrayList<>();
    }

    public void ujBeiratkozo(Diak diak){
        felvetelizok.add(diak);
    }

    public int felvetelizokSzama(){
        return felvetelizok.size();
    }

    public double felvetelizokAtlaga(){
        double sum = 0;

        for (Diak d: felvetelizok) {
            sum += d.atlag();
        }

        sum/= felvetelizok.size();

        return sum;
    }

    public void listazOsszes(){
        for (Diak d: felvetelizok) {
            System.out.println(d.toString());
        }
    }

    public void listazAtlag(double atlag){
        for (Diak d: felvetelizok) {
            if (atlag < d.atlag())
                System.out.println(d);
        }
    }
}
