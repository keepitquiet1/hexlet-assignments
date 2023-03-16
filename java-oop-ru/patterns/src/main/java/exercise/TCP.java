package exercise;
import java.util.List;
import java.util.ArrayList;
import java.util.Connection;
import java.util.Disconnected;
public interface TCP {
    String getCurrentState();
    void connect();
    void disconnect();
    void write(String str);
}
