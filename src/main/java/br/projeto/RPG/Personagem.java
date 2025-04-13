  import java.util.Scanner;

  public class Jogador {
      int id=0;
      double saldo_moedas;
      String nome;
      int senha;

      Scanner scan = new Scanner(System.in);
      LinkedList lista = new LinkedList();
      Personagem personagem = new Personagem();
      

      public void cadastrar(){
          System.out.println("digite sua senha agr");
          senha=scan.nextInt();
          System.out.println("digite seu nome agr");
          senha=scan.nextInt();
          id++;
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

      public void criarPersonagem() {
        personagem = new Personagem();  
    
        System.out.println("Digite o nome do personagem:");
        personagem.nome = scan.next();
    
        System.out.println("Digite o nível do personagem:");
        personagem.nivel = scan.nextInt();
    
        personagem.setManaMaxima(); 
        personagem.setVidaMaxima(); 
    
        lista.add(personagem);  
        System.out.println("Personagem criado e adicionado à lista");
        System.out.println(personagem.toString());
    }

    public Personagem selecionar_personagem(){
      int i=0;

      System.out.println("digite o nome do personagem");
      String temp = scan.next();

      while(i<lista.size()){
        i++;
      }
      if(temp.equals(lista.selecionar_index(i))){
        System.out.println("personagem selecionado");
        
        return lista.index(i);
    }else{
      return null;
    }
    }
  }
