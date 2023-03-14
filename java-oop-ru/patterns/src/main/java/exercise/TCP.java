package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public interface TCP {
    String getCurrentState();
    void connect();
    void disconnect();
    void write(String str);
}
