package ross.example.consuming.demo;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.Add;
import org.tempuri.AddResponse;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse addNumbers(int num1, int num2) {
        String uri = "http://www.dneonline.com/calculator.asmx";

        Add addRequest = new Add();

        addRequest.setIntA(num1);
        addRequest.setIntB(num2);

        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(uri, addRequest);
        return addResponse;
    }
}
