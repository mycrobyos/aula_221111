package br.com.ada.aula_221118.model;

public class Brinquedo extends Mercadoria {

  public String tipo;

  public Brinquedo(String nome, Double preco, String tipo) {
    super(nome, preco);
    this.tipo = tipo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  
}
