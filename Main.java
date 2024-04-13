import helper.GenericHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        User user1 = new User("Mohamed" , 7 );
        User user2 = new User("Hamza" , 8 );
        User user3 = new User("asmma" , 8 );
        User user4 = new User("Sana"  , 10 );

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        GenericHelper.showDetails(userList);
    }
}
