import java.util.Scanner;
import java.util.Random;

public class AdministraSenhas
{
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Informe o tamanho do vetor de senhas: ");
    int tamanhoVetor = scanner.nextInt();
    Senhas[] senhas = new Senhas[tamanhoVetor];
    
    Random senhaRandom = new Random();

    for (int i = 0; i < tamanhoVetor; i++){
        //para cada posição do tamanhoVetor preciso adicionar um senha randomica
        senhas[i] = new Senhas(senhaRandom.nextInt(Integer.MAX_VALUE)); 
        
        System.out.println("Senha da posição " + i +": " + senhas[i].getMinhaSenha());
    }
    
    
    }
}
