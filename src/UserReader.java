import java.io.IOException;
import java.util.List;

public interface UserReader {
    List<User> readerUser() throws IOException;

}