import java.io.IOException;
import java.util.List;

public interface UserReader {
    List<User> parseUser(List<User> users) throws IOException;
}