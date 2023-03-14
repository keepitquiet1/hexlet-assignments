package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection connection;

    public TcpConnection(String ip, int port) {
        this.connection = new Disconnected(this);
    }
    public String getCurrentState() {
        return this.connection.state();
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void connect() {
        setConnection(new Connected(this));
        this.connection.connect();
    }

    public void disconnect() {
        setConnection(new Disconnected(this));
        this.connection.disconnect();
    }

    public void write(String str) {
        this.connection.write(str);
    }

}

// END
