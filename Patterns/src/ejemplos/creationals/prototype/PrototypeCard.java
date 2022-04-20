package ejemplos.creationals.prototype;

public interface PrototypeCard extends Cloneable{

    PrototypeCard clone() throws CloneNotSupportedException;

    void getCard();
}
