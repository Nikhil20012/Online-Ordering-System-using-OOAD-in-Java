package Control;

import Entity.Member;
import Boundary.MainPage;

public class UserAuthenticationControl {
    private String userId;
    private String password;

    public UserAuthenticationControl(String userId, String password){
        this.userId = userId;
        this.password = password;
    }

    public boolean authenticate(){

       
        String memberPassword;
        
        Member member = new Member();
        memberPassword = member.getPassword(userId);
        

        if( password.equals(memberPassword) ){

            MainPage mainPage = new MainPage();
            mainPage.start();
            mainPage.loginSuccess();

            return true;
        }
        
        return false;
    }

}
