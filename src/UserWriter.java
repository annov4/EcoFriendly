import java.io.IOException;
import java.util.List;

public interface UserWriter {
    void writerUser(List<User> users) throws IOException;
}
