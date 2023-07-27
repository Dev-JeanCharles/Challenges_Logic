import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Random rd = new Random();


    public static void main(String[] args) {

        Atividade_1 atividade1 = new Atividade_1();
        atividade1.atividade(rd.nextInt(0,1000),rd.nextInt(0,1000));

    }
}