public class escolha {
  private String textoDigitado;
  private String textoMostrado;
  private capitulo proximo;

  public escolha(String textoDigitado, String textoMostrado, capitulo proximo) {
    this.textoDigitado = textoDigitado;
    this.textoMostrado = textoMostrado;
    this.proximo = proximo;
  }

  public String getTextoDigitado() {
    return textoDigitado;
  }

  public String getTextoMostrado() {
    return textoMostrado;
  }

  public capitulo getProximo() {
    return proximo;
  }

}