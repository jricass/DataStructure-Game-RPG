import java.util.Scanner;

public class Jogador {
    int id=0;
    double saldo_moedas;
    String nome;
    int senha;

    Scanner scan = new Scanner(System.in);

    public void cadastrar(){
       System.out.println("bem vindo ao cadastro,digite seu id");
         id=scan.nextInt();
         System.out.println("digite sua senha agr");
         senha=scan.nextInt();
         System.out.println("digite seu nome agr");
         senha=scan.nextInt();
    }

    public boolean autenticar(){
        System.out.println("digite seu id");
         int temp=scan.nextInt();
        System.out.println("digite sua senha agr");
          int temp2=scan.nextInt();
           
          if(temp==id && temp2==senha){
            System.out.println("autenticado com sucesso");
            return true;
          }else{
            System.out.println("erro semnha ou id errado");
            return false;
          }

     }
}
