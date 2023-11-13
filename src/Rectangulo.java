public class Rectangulo extends Figura {
    double l1;
    double l2;
    double area;

    public Rectangulo(double lado1, double lado2){
        l1 = lado1;
        l2 = lado2;
    }

    public double Area(){
        area = l1*l2;
        System.out.println("Rectangle:  " + area);
        return area;
    }

}