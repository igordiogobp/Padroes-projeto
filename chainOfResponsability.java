
public interface PixHandler {
    void handlePix(String key);
}


public abstract class BasePixHandler implements PixHandler {
    private PixHandler nextHandler;

    public void setNextHandler(PixHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handlePix(String key) {
        if (!processKey(key) && nextHandler != null) {
            nextHandler.handlePix(key);
        }
    }

    protected abstract boolean processKey(String key);
}

// Handlers para cada tipo de chaev
public class CpfPixHandler extends BasePixHandler {
    protected boolean processKey(String key) {
        if (key.length() == 11 && key.matches("\\d+")) {
            System.out.println("Chave PIX do CPF: " + key);
            return true;
        }
        return false;
    }
}

public class NomePixHandler extends BasePixHandler {
    protected boolean processKey(String key) {
        if (key.length() >= 3 && key.length() <= 50) {
            System.out.println("Chave PIX do nome: " + key);
            return true;
        }
        return false;
    }
}

public class CopiaColaPixHandler extends BasePixHandler {
    protected boolean processKey(String key) {
        if (key.length() >= 5 && key.length() <= 100) {
            System.out.println("Chave PIX de copia e cola: " + key);
            return true;
        }
        return false;
    }
}

public class Client {
    public static void main(String[] args) {
        PixHandler cpfHandler = new CpfPixHandler();
        PixHandler nomeHandler = new NomePixHandler();
        PixHandler copiaColaHandler = new CopiaColaPixHandler();

        cpfHandler.setNextHandler(nomeHandler);
        nomeHandler.setNextHandler(copiaColaHandler);

        String cpfKey = "12345678901";
        String nomeKey = "John Doe";
        String copiaColaKey = "ABCD1234";
        
        cpfHandler.handlePix(cpfKey);
        cpfHandler.handlePix(nomeKey);
        cpfHandler.handlePix(copiaColaKey);
    }
}
