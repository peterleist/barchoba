import java.io.*;

public class Main{
    public static void main(String args[]){
       Node root = null;
    
    try {
        FileInputStream fileIn = new FileInputStream("tree.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        root = (Question) in.readObject();
        in.close();
        fileIn.close();
    } catch (Exception e) {
        //TODO: handle exception
    }
   
        root.run();
    
    try {
        FileOutputStream fileOut =
        new FileOutputStream("tree.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(root);
        out.close();
        fileOut.close();
        System.out.printf("Serialized data is saved in /tmp/employee.ser");
    } catch (Exception e) {
        //TODO: handle exception
    }

    }
}