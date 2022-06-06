package serializacao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes <Estudante> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.setNomeArquivo(nomeArquivo);
    }

    public void serializar(List<Estudante> estudanteList) {

        //List<Estudante> estudantes = new ArrayList<>(estudanteList);
        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {

            fos = new FileOutputStream(getNomeArquivo());
            oos = new ObjectOutputStream(fos);
            oos.writeObject(estudanteList);

        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar arquivo");
                }
            }

        }

    }


    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {

        List<Estudante> estudantes = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(getNomeArquivo());
            ois = new ObjectInputStream(fis);

            estudantes = (List<Estudante>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar arquivo");
                }
            }

            return estudantes;

        }
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}
