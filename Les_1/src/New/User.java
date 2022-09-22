package New;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class User {
    private String name = "Andrew";
    @Autowired
    @Qualifier("registry")
    private Registry registry;

//    public User(String name) {
//        this.name = name;
//    }

    public void heal(){
        System.out.println(registry.giveDirection());
    }

    public String getName() {
        return name;
    }
}
