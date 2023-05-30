public class IMC {
   
    String Nom,CC,edad;
    private double  Peso, altura,Resultado;

    public IMC() {
    }

    public IMC(String Nom, String CC, String edad, double Peso, double altura) {
        this.Nom = Nom;
        this.CC = CC;
        this.edad = edad;
        this.Peso = Peso;
        this.altura = altura;
    }

    
    
    public IMC(double Peso, double altura) {
        this.Peso = Peso;
        this.altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    public String Calcular()
    {
     String resultado = "";
     double aux = Peso/(altura * altura);
     if(aux > 30){
        resultado = "Este es su IMC: " + aux + " Tienes obseidad ";   
     }
     else if(aux > 25.0)
     {
        resultado = "Este es su IMC: " + aux + " Estas Sobrepeso";   
     }
     else if(aux > 18.5)
     {
        resultado = "Este es su IMC: " + aux + " Tienes un peso ideal";   
     }
     else
     {
       resultado ="Este es su IMC: " + aux + " Estas bajo de peso";   
     }
        
       
     return resultado;  
    }
    
    

    void getAltura(Double Altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getPeso(Double peso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

