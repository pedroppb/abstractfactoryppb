package abstractfactoryppb;

public class PermissaoFAT32 implements Permissao {

    @Override
    public String exibirPermissao() {
        return "poucas permissoes";
    }
    @Override
    public String alterarPermissao() {
        return "permissoes fat32 alteradas";
    }
}
