package ejemplos.comportamiento.chain;

public interface Chain {

    void setNextChain(Chain nextChain);
    int calculate(Numbers request);
}
