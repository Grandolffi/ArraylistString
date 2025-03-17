import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String nomeInserido;
        boolean achou = false;

        System.out.println("Informe um nome: ");
        nomeInserido = in.nextLine();
        while(!nomeInserido.equalsIgnoreCase("fim")){//ignoro maiusculo e minusculo com equalsIgnore case, e comparo se é igual a "fim" o nome inserido
            nomes.add(nomeInserido); //guardo a variavel dentro do ArrayList
            System.out.println("Informe outro nome: ");
            nomeInserido = in.nextLine(); //peço outro nome pra mudar o valor da string e n ficar em um looping
        }
        System.out.println("Informe um nome a ser buscado: ");
        nomeInserido = in.nextLine();
        for(int i =0; i < nomes.size(); i++){
            if(nomes.get(i).equalsIgnoreCase(nomeInserido)){
                System.out.println("Posição: "+ (i));
                achou = true;
            }
        }
        if(!achou){
            System.out.println("O nome não esta no ArrayList");
        }
    }
}