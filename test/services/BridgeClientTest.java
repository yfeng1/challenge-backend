package services;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.*;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class BridgeClientTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void ping_should_return_list_accounts() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/listAccounts");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

}