public class Circulo extends Figura {
    double r;
    double area;

    public Circulo(double radio){
        r = radio;
    }

    public double Area(){
        area = r * r * Math.PI;
        System.out.println("Circulo:     " + area);
        return area;
    }

}
