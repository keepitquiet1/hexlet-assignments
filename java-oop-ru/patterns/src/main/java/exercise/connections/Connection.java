package exercise.connections;

public interface Connection {
    // BEGIN
    public interface Connection {
    void connect();
    void disconnect();
    void write(String str);
    String state();

}
    // END
}
