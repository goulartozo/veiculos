class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, String ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }


    @Override
    public void exibirInfo() {
        System.out.println("Moto marca: " + marca + "modelo: " + modelo + "ano: " + ano + "Cilindradas" + cilindradas );
    }
}
