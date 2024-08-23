public class Retangulo {
    private double altura;
    private double largura;
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    public double Area() {
        return altura * largura;
    }
    public double Perimetro() {
        return 2 * (altura + largura);
    }
    public void ExibirInformacoes(){
        System.out.println("Altura: " + this.altura);
        System.out.println("Largura: " + this.largura);
        System.out.println("Area: " + this.Area());
        System.out.println("Perimetro: " + this.Perimetro());
    }

}
