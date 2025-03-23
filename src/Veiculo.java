abstract class Veiculo {
    public   String marca;
    public  String modelo;
    public  String ano;

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void exibirInfo();
}




