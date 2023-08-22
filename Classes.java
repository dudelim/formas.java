class Forma {
  public String cor;

  public Forma(String cor) {
    this.cor = cor;
  }

  public void MostrarCor() {
    System.out.println("Cor: " + cor);
  }

  public double CalcularArea() {
    return 0;
  }
}

class Quadrado extends Forma {
  public double lado;

  public Quadrado(String cor, double lado) {
    super(cor);
    this.lado = lado;
  }

  public double CalcularArea() {
    System.out.println("Cáculo específico de quadrado");
    return lado * lado;
  }
}

class Circulo extends Forma {
  public double raio;

  public Circulo(String cor, double raio) {
    super(cor);
    this.raio = raio;
  }

  public double CalcularArea() {
    System.out.println("Cáculo específico de círculo");
    return 3.14 * raio * raio;
  }
}

class Triangulo extends Forma {
  public double base;
  public double altura;

  public Triangulo(String cor, double base, double altura) {
    super(cor);
    this.base = base;
    this.altura = altura;
  }

  public double CalcularArea() {
    System.out.println("Cáculo específico de triângulo");
    return (base * altura)/2;
  }
}
