package abstractfactoryppb;

public class FabricaSistemaLinux implements FabricaAbstrata {

    @Override
    public Permissao CreatePermissao() {
        return new PermissaoFAT32();
    }

    @Override
    public Gui CreateGui() {
        return new GuiGNOME();
    }
}
