package Avaliacoes.TrabalhoPratico;

import java.io.*;

public class FileManager {
    public void salvarObjeto(String fileName, Object objeto) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(objeto);
        } catch (IOException e) {
            System.err.println("Erro ao salvar objeto: " + e.getMessage());
        }
    }

    public Object lerObjeto(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler objeto: " + e.getMessage());
            return null;
        }
    }
}