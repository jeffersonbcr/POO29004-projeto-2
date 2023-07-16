package app;

public class Router extends No{
    public Router(String nome) {
        super(nome);
    }

    @Override
    public void setImagens(int c) {
        Imagens imagens = Imagens.escolherImagem(c);
        switch (imagens) {
            case ROTEADORazul:
                this.imagens = "img/blue-router.png";
                break;
            case ROTEADORverde:
                this.imagens = "img/green-router.png";
                break;
        }
    }

    @Override
    public boolean verificarAssociacoes() {
        return this.associacoes >= 2;
    }
}
