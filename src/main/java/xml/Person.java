package xml;

/**
 * Created by liux on 17-3-5.
 */
public class Person {
    private IHelloMessage helloMessage;

    public IHelloMessage getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(IHelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }

    public String personSayHello(){
        return this.helloMessage.sayHello();
    }
}