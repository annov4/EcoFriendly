import java.io.IOException;
import java.util.List;

public interface ParsingUser {
    List<User> parseUser(String filePath, List<User> users) throws IOException;
}