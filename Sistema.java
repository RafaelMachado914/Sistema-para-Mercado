import java.util.Scanner;

public class Sistema{

public static Scanner input = new Scanner(System.in);

public static void cadastreProduto(){

    for(int i=0;i<10;i++){
      System.out.print("Informe o " + (i+1)+ "° Produto: ");
      String Produto = input.nextLine();
      System.out.println("Informe o valor do produto: ");
      float preco = Float.parseFloat(input.nextLine());
      System.out.println("");
}
}

public static void chamarMenu(){

    System.out.print("Selecione o uma das opçoes: ");
    System.out.print("");
    System.out.println("1- Vender");
    System.out.println("2- Reposição de estoque");
    System.out.println("3- Relatorio de estoque");
    System.out.println("4- Relatorio de Vendas");
    System.out.println("5- Sair");

    int opcoes=Integer.parseInt(input.nextLine());    
}
    public static void main(String[] args) {

cadastreProduto();
chamarMenu();


}}