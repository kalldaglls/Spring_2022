import org.springframework.stereotype.Component;

@Component("archive")
public class Archive {
//    private String userFile;

    public String getUserFile(User user) {
        String card = user.getName() + " card";
        return card;
    }
}
