package io.operon;

import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.Exchange;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AppTest extends CamelTestSupport {
/*
    @Test
    public void testCamelOperonComponent() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMinimumMessageCount(1);
        List<Exchange> exchanges = mock.getExchanges();
        mock.await();
        for (Exchange ex : exchanges) {
            String messageBody = ex.getIn().getBody(String.class);
            assertTrue(messageBody.startsWith("\""));
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                from("timer://foo?period=10000")
                  .setBody(constant("Select: -> http:{\"url\": \"https://api.chucknorris.io/jokes/random\"}"))
                  .to("operon://quotes1")
                  .log("Setting initial value :: " + simple("${body}"))
                  .setHeader("initialValue", simple("${body}"))
                  .setBody(constant("Select: $.body.value"))
                  .to("operon://quotes2")
                  .to("mock:result");
            }
        };
    }
*/
}
