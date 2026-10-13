class MyResource implements AutoCloseable {

    public MyResource() {
        System.out.println("Resource opened");
    }

    public void use() {
        System.out.println("Using resource");
    }

    public void close() {
        System.out.println("Resource closed");
    }
}

public class ResourceDemo {
    public static void main(String[] args) {

        try (MyResource r = new MyResource()) {
            r.use();
            throw new Exception("Original error");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}