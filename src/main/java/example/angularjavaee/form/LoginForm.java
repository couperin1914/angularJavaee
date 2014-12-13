package example.angularjavaee.form;

import java.util.List;

/**
 * ログイン画面のformクラス.
 * @author ko-aoki
 */
public class LoginForm {

    /** ユーザID */
    private String userId;
    
    /** パスワード */
    private String password;
            
    /** メッセージリスト */
    private List<String> messages;
    /** 実行結果 */
    private String result;

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the messages
     */
    public List<String> getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

}
