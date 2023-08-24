public class escolha {
  
    private capitulo proximo;
  private String textoEscrito;
  private String textoApresentado;

  public escolha(String textoEscrito, String textoApresentado, capitulo proximo) {
    this.textoEscrito = textoEscrito;
    this.textoApresentado = textoApresentado;
    this.proximo = proximo;
  }
  public String getTextoEscrito() {
    return textoEscrito;
  }
  public String getTextoApresentado() {
    return textoApresentado;
  }
  public capitulo getProximo() {
    return proximo;
  }
}