public class escolha {
    private String texto;
    private capitulo proximo;

    public escolha(String texto, capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }

    public String getTexto() {
        return texto;
    }

    public capitulo getProximo() {
        return proximo;
    }
}
