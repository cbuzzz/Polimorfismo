public class GestorFiguras {
    public static void main(String[] args) {
        Figura[] v = new Figura[5];

        v[0] = new Rectangulo(5,3);
        v[1] = new Circulo(2);
        v[2] = new Cuadrado(4);
        v[3] = new Circulo(3);
        v[4] = new Triangulo(2,3);

        double area = 0;

        for(int a =0; a < v.length ; a++) {
            area = v[a].Area() + area;

        }
        //double res = suma(v);


        System.out.println("Suma total: " + area);


    }



}