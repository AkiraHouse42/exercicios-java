package controle;

public class Controle {
    private String codigo;
    private String marca;
    private String btu;
    private String defeito;
    private String tipoDefeito;
    
    public Controle(String codigo, String marca, String btu, String
    defeito, String tipoDefeito) {
    this.codigo = codigo;
    this.marca = marca;
    this.btu = btu;
    this.defeito = defeito;
    this.tipoDefeito = tipoDefeito;
    }
    public String getCodigo() {
    return codigo;
    }
    public void setCodigo(String codigo) {
    this.codigo = codigo;
    }
    public String getMarca() {
    return marca;
    }
    public void setMarca(String marca) {
    this.marca = marca;
    }
    public String getBtu() {
    return btu;
    }
    public void setBtu(String btu) {
    this.btu = btu;
    }
    public String getDefeito() {
    return defeito;
    }
    public void setDefeito(String defeito) {
    this.defeito = defeito;
    }
    public String getTipoDefeito() {
    
    return tipoDefeito;
    }
    public void setTipoDefeito(String tipoDefeito) {
    this.tipoDefeito = tipoDefeito;
    }
    public void exibirInfo(){
    System.out.println("Codigo: " + codigo);
    System.out.println("Marca: " + marca);
    System.out.println("BTU: " + btu);
    System.out.println("Defeitos: " + defeito);
    }
    public String toString(){
    return "Codigo: "+codigo+" - Marca: "+marca+" - BTU: "+btu+" - Defeito: "+defeito+ " - Tipo de Defeito: " + tipoDefeito;
    }
    }