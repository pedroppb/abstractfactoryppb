package abstractfactoryppb;

public class Usuario {
    private Permissao Permissao;
    private Gui tela;
    public Usuario (FabricaAbstrata fabrica) {
        this.Permissao = fabrica.CreatePermissao();
        this.tela = fabrica.CreateGui();
    }
   public String exibirPermissao() {
        return this.Permissao.exibirPermissao();
    }
    public String alterarPermissao(){
        return this.Permissao.alterarPermissao();
    }
    public String Exibir(){
        return this.tela.iniciar();
    }
}