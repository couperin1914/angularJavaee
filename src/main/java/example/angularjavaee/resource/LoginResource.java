package example.angularjavaee.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import example.angularjavaee.form.LoginForm;
import example.angularjavaee.service.LoginService;
import java.util.Arrays;
import javax.enterprise.context.RequestScoped;

/**
 * ログイン画面のリソースクラス
 * @author ko-aoki
 */
@RequestScoped
@Path("login")
public class LoginResource {

    @Inject
    private LoginService loginService;

    /**
     * ログイン処理を行います.
     * @param userId
     * @param password
     * @return
     */
    @GET
    @Path("{userId},{password}")
    @Produces("application/json")
    public LoginForm login(@PathParam("userId") String userId, @PathParam("password") String password) {
        LoginForm loginForm = new LoginForm();
        loginForm.setResult(loginService.login(userId, password));
        loginForm.setMessages(Arrays.asList("ログインしました。"));
        return loginForm;
    }

}
