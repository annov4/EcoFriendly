import java.io.IOException;
import java.util.List;

public interface UserReader {
    List<User> readerUser(List<User> users) throws IOException;
}