
class Casa {
    // Atributos
}
interface ConstrutorCasa {
    void reset();
    void construirParedes();
    void construirPorta();
    void construirJanelas();
    void construirTeto();
    Casa getCasa();
}


class ConstrutorCasaSimples implements ConstrutorCasa {
    private Casa casa;
    ConstrutorCasaSimples() {
        this.reset();
    }
    public void reset() {
        this.casa = new Casa();
    }

    public void construirParedes() {
        // ...
    }

    public void construirPorta() {
        // ...
    }

    public void construirTeto() {
        // ...
    }
    public Casa getCasa() {
        return this.casa;
    }
}

class ConstrutorCasaLuxuosa implements ConstrutorCasa {
    private Casa casa;
    ConstrutorCasaLuxuosa() {
        this.reset();
    }

    public void reset() {
        this.casa = new Casa();
    }

    ublic void construirParedes() {
        // ...
    }

    public void construirPorta() {
        // ...
    }

    public void construirTeto() {
        // ...
    }
    public void construirParteLuxuosa() {
        // ...
    }
    public Casa getCasa() {
        return this.casa;
    }
}

class DiretorConstrucao {
    private ConstrutorCasa construtor;
    DiretorConstrucao(ConstrutorCasa construtor) {
        this.construtor = construtor;
    }

    public void construirCasa() {
        this.construtor.reset();
        this.construtor.construirParedes();
        this.construtor.construirPorta();
        this.construtor.construirJanelas();
        this.construtor.construirTeto();
    }
}

public class Main {
    public static void main(String[] args) {
        ConstrutorCasaSimples construtorSimples = new ConstrutorCasaSimples();

        DiretorConstrucao diretor = new DiretorConstrucao(construtorSimples);

        diretor.construirCasa();
        
        Casa casaSimples = construtorSimples.getCasa();
    }
}
