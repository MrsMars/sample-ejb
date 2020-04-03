package wasdev.ejb.it;

import static org.junit.Assert.*;

import org.apache.commons.httpclient.HttpException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

public class EndpointIT {

    private static String URL;

    @BeforeClass
    public static void init() {
        URL = "http://localhost:9080/ejb-war";
    }

    @Test
    public void testServlet() throws IOException, HttpException {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(URL);

            int statusCode = client.executeMethod(method);
            assertEquals("HTTP GET failed", HttpStatus.SC_OK, statusCode);

            String response = method.getResponseBodyAsString();
            assertTrue("Unexpected response body", response.contains("Hello EJB World."));

    }
}
