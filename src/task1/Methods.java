package task1;

import java.io.*;

public class Methods {
    static void serialize(File file, Serializable object) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();
        os.close();
    }

    static Serializable deserialize(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable object = (Serializable) ois.readObject();
        ois.close();
        is.close();
        return object;
    }
}
