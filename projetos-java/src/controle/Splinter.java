package controle;

public class Splinter extends Controle{
    private String tipos;
    private String tamanho;
    public Splinter(String codigo, String marca, String btu, String
    defeito, String tipoDefeito, String tipos,
    
    String tamanho) {
    super(codigo, marca, btu, defeito, tipoDefeito);
    this.tipos = tipos;
    this.tamanho = tamanho;
    }
    public String getModelo() {
    return tipos;
    }
    public void setModelo(String tipos) {
    this.tipos = tipos;
    }
    public String getTamanho() {
    return tamanho;
    }
    public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
    
    }
    public void exibirInfo(){
    super.exibirInfo();
    System.out.println("Modelo: " +tipos);
    System.out.println("Tamanho: " + tamanho);
    }
    public String toString(){
    return super.toString()+ " - Tipo: "+tipos+" - Tamanho: "+tamanho;
    }
    }
