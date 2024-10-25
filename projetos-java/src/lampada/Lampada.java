package lampada;

public class Lampada {
    private String tipo;
    private String voltagem;
    private String cor;
    private String marca;
    private String preco;
    private String potencia;
    private String status;
    
    public Lampada(String tipo, String voltagem, String cor, String marca, String preco, String potencia,
            String status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return "Tipo: "+tipo+"- Voltagem: "+voltagem+"- Cor: "+cor+" - Preço: "+preco+"- Potência:"+potencia;
    }
   
}