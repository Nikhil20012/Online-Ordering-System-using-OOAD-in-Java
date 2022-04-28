package Entity;

import Database.Database;

public class Member {
    private String userId;
    private String password;

    public String getPassword(String userId) {
        Database database = new Database();
        password = database.getMemberPwd(userId);

        return password;
    }
  
}
