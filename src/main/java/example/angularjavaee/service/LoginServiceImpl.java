package example.angularjavaee.service;

import javax.enterprise.context.RequestScoped;

/**
 * ログイン画面のサービスクラス.
 * @author ko-aoki
 */
@RequestScoped
public class LoginServiceImpl implements LoginService{

    /**
     * ログイン処理を行います.
     * @param userId
     * @param password
     * @return
     */
    public String login(String userId, String password) {
        return "ok";
    }

}
