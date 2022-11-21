package br.com.ada.aula_221118.model;

public class Album extends Mercadoria {

  public String genero;
  public String musicos_banda;
  public String selo;

  public Album(String nome, Double preco, String genero, String musicos_banda, String selo) {
    super(nome, preco);
    this.genero = genero;
    this.musicos_banda = musicos_banda;
    this.selo = selo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getMusicos_banda() {
    return musicos_banda;
  }

  public void setMusicos_banda(String musicos_banda) {
    this.musicos_banda = musicos_banda;
  }

  public String getSelo() {
    return selo;
  }

  public void setSelo(String selo) {
    this.selo = selo;
  }

  
  
}
