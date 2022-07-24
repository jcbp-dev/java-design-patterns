package mx.developer.jcbp.structural.facade;

import mx.developer.jcbp.structural.facade.subsystems.Mobile;

public class ClientFacadePatternExample {
	public static void main(String[] args) {

        MobileFacade facade = new MobileFacade();
        Mobile mobile = facade.on();

        System.out.println("---------------");

        facade.off(mobile);
    }
}
