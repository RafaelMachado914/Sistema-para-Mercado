import java.util.Scanner;

public class Sistema{

public static Scanner input = new Scanner(System.in);

public static void cadastreProduto(){

    String[] produtos = new String[10];
    float[] precos = new float[10];

    for(int i=0;i<10;i++){
      System.out.print("Informe o " + (i+1)+ "° Produto: ");
      produtos[i] = input.nextLine();
      System.out.println("Informe o valor do produto: ");
      precos[i] = Float.parseFloat(input.nextLine());
      System.out.println("");
}
}

public static void chamarMenu(float[] vetX){

    System.out.print("Selecione o uma das opçoes: ");
    System.out.print("");
    System.out.println("1- Vender");
    System.out.println("2- Reposição de estoque");
    System.out.println("3- Relatorio de estoque");
    System.out.println("4- Relatorio de Vendas");
    System.out.println("5- Sair");

    int opcoes=Integer.parseInt(input.nextLine());    

    if (opcoes==1) {
        System.out.println("Informe o produto que deseja vender:");
        System.out.println("");
        System.out.println("1-" + vetX[0]);
        System.out.println("2-" + vetX[1]);
        System.out.println("3-" + vetX[2]);
        System.out.println("4-" + vetX[3]);
        System.out.println("5-" + vetX[4]);
        System.out.println("6-" + vetX[5]);
        System.out.println("7-" + vetX[6]);
        System.out.println("8-" + vetX[7]);
        System.out.println("9-" + vetX[8]);
        System.out.println("10-" + vetX[9]);

         int vender = Integer.parseInt(input.nextLine());
         System.out.println("");
         System.out.println("");




    }
}
    public static void main(String[] args) {

cadastreProduto();
chamarMenu();


}}