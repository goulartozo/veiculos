class Carro extends Veiculo{
    private int numDePortas;

    public Carro(String marca, String modelo, String ano, int numDePortas) {
        super(marca, modelo, ano);
        this.numDePortas = numDePortas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro marca: " + marca + "modelo: " + modelo + "ano: " + ano + "Numero de portas" + numDePortas );
    }
}
