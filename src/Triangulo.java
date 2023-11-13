public class Triangulo extends Figura {
    double base;
    double altura;
    double area;
    public Triangulo(double b, double a){
        base = b;
        altura = a;
    }

    public double Area(){
        area = base*altura;
        area = area/2;
        System.out.println("Triangle:   " + area);
        return area;
    }

}
