package abstractfactoryppb;

public class PermissaoNTFS implements Permissao {

    @Override
    public String exibirPermissao() {
        return "muitas permissoes";
    }
    @Override
    public String alterarPermissao() {
        return "permissoes NTFS alteradas";
    }
}
