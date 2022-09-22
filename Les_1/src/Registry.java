import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("registry")
public class Registry {
    @Autowired
    @Qualifier("user")
    private User user;

    @Autowired
    @Qualifier("archive")
    private Archive archive;

    String giveDirection(){
        Random random = new Random();
        return archive.getUserFile(user) + " room #" + random.nextInt(10);
    }
}
