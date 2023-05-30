public class Notas {

   private double t1,t2,t3,t4,p1,p2,DF;
   private String nom;
    public Notas() {
    }

    public Notas(String nom,double t1, double t2, double t3, double t4, double p1, double p2) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.p1 = p1;
        this.p2 = p2;
        this.nom = nom;
    }

    public double getT1() {
        return t1;
    }

    public double getT2() {
        return t2;
    }

    public double getT3() {
        return t3;
    }

    public double getT4() {
        return t4;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public String getNom() {
        return nom;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    public void setT3(double t3) {
        this.t3 = t3;
    }

    public void setT4(double t4) {
        this.t4 = t4;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String Calcular(){
        String Aux = "";
        Aux = "El resultado es: " + (((t1 * 0.15)+(t2 * 0.15)+(t3 * 0.15)+(t4 * 0.15)+(p1 * 0.2)+(p2 * 0.2)));
        return Aux;
    }

    public double getDF() {
        DF = ((t1 * 0.15)+(t2 * 0.15)+(t3 * 0.15)+(t4 * 0.15)+(p1 * 0.2)+(p2 * 0.2));
        return DF;
    }
}
