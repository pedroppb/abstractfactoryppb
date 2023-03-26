package abstractfactoryppb;
public class FabricaSistemaWindows implements FabricaAbstrata {
    @Override
    public Permissao CreatePermissao() {
        return new PermissaoNTFS();
    }
    @Override
    public Gui CreateGui() {
        return new GuiAero();
    }

}

