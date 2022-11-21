package br.com.ada.aula_221118.model;

public abstract class Mercadoria {

  protected String nome;
  protected Double preco;
  
  public Mercadoria(String nome, Double preco) {

    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

}
