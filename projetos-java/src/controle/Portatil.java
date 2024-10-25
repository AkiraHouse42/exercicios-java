package controle;

public class Portatil extends Controle{
    private String voltagem;
    private String cor;
    public Portatil(String codigo, String marca, String btu, String
    defeito, String tipoDefeito, String voltagem,
    
    String cor) {
    super(codigo, marca, btu, defeito, tipoDefeito);
    this.voltagem = voltagem;
    this.cor = cor;
    }
    public String getVoltagem() {
    return voltagem;
    }
    public void setVoltagem(String voltagem) {
    this.voltagem = voltagem;
    }
    public String getCor() {
    return cor;
    }
    public void setCor(String cor) {
    this.cor = cor;
    }
    public void exibirInfo(){
    super.exibirInfo();
    
    System.out.println("Voltagem: " + voltagem);
    System.out.println("Cor: " + cor);
    }
    public String toString(){
    return super.toString()+ " - Voltagem: "+voltagem+" - Cor: "+cor;
    }
    }
