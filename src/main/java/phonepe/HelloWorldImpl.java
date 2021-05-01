
package phonepe;

import javax.jws.WebService;

@WebService(endpointInterface = "phonepe.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

