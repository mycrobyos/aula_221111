package br.com.ada.aula_221118.model;

public class Livro extends Mercadoria {

  public String genero;
  public String escritor;
  public String editora;

  public Livro(String nome, Double preco, String genero, String escritor, String editora) {
    super(nome, preco);
    this.genero = genero;
    this.escritor = escritor;
    this.editora = editora;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getEscritor() {
    return escritor;
  }

  public void setEscritor(String escritor) {
    this.escritor = escritor;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  
}
