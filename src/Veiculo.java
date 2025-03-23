abstract class Veiculo {
    private String marca;
    private String modelo;
    private String ano;

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void exibirInfo();
}




