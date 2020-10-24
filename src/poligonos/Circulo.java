package poligonos;

public class Circulo {
    
    //Propiedades de la clase
    private double radio;
    
    //Generamos los constructores de la clase
    public Circulo(){
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double getArea(){
        return (Math.PI* Math.pow(radio,2));
    }
    
    public double getPerimetro(){
        return 2*Math.PI*radio;
    }
    
}