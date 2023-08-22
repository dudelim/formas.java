import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Quadrado quadrado = new Quadrado("Roxo", 4);
    Circulo circulo = new Circulo("Preto", 8);
    Triangulo triangulo = new Triangulo("Laranja", 3, 3);

    ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(circulo);
        formas.add(triangulo);

    for (Forma forma : formas) {
            forma.MostrarCor();
            double area = forma.CalcularArea();
            System.out.println("A área da forma é: " + area);
            System.out.println();
  }
}
}
