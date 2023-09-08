
public class Senhas
{
    private static int senhaAtual = 1;
    private int minhaSenha;
    
    public Senhas(int minhaSenha)
    {
        this.senhaAtual+= senhaAtual;
        this.minhaSenha = minhaSenha;
    }
    
    public static int getSenhaAtual(){
        return senhaAtual;
    }
    
    public int getMinhaSenha(){
        return minhaSenha;
    }

}
