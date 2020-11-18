package ross.example.consuming.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.tempuri.AddResponse;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        CalculatorClient calculatorClient = new CalculatorClient();

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath("org.tempuri");

        calculatorClient.setMarshaller(marshaller);
        calculatorClient.setUnmarshaller(marshaller);
//
        AddResponse addResponse = calculatorClient.addNumbers(4,3);
//
        System.out.println("Response is: " + addResponse.toString());


    }

}
