import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            DataOutputStream dos = new DataOutputStream(pos);
            dos.writeInt(101);
            dos.writeUTF("Alice Johnson");
            dos.writeDouble(3.8);
            dos.writeInt(102);
            dos.writeUTF("Bob Smith");
            dos.writeDouble(3.5);
            dos.close();
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            DataInputStream dis = new DataInputStream(pis);
            while (true) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (EOFException e) {
            System.out.println("End of data stream.");
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);
            
            writer.start();
            reader.start();
            
            writer.join();
            reader.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error in piped communication: " + e.getMessage());
        }
    }
}

