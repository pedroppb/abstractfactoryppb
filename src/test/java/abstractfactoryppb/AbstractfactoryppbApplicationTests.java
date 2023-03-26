package abstractfactoryppb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AbstractfactoryppbApplicationTests {

	@Test
	void deveExibirPermissaoFAT32() {
		FabricaAbstrata fabrica = new FabricaSistemaLinux();
		Usuario usuario = new Usuario(fabrica);
		assertEquals("poucas permissoes", usuario.exibirPermissao());
	}
	@Test
	void deveAlterarPermissaoFAT32() {
		FabricaAbstrata fabrica = new FabricaSistemaLinux();
		Usuario usuario = new Usuario(fabrica);
		assertEquals("permissoes fat32 alteradas", usuario.alterarPermissao());
	}
	@Test
	void deveIniciarInterfaceLinux() {
		FabricaAbstrata fabrica = new FabricaSistemaLinux();
		Usuario usuario = new Usuario(fabrica);
		assertEquals("interface GNOME", usuario.Exibir());
	}
	@Test
	void deveExibirPermissaoNTFS() {
		FabricaAbstrata fabrica = new FabricaSistemaWindows();
		Usuario usuario = new Usuario(fabrica);
		assertEquals("muitas permissoes", usuario.exibirPermissao());
	}
	@Test
	void deveAlterarPermissaoNTFS() {
		FabricaAbstrata fabrica = new FabricaSistemaWindows();
		Usuario usuario = new Usuario(fabrica);
		assertEquals("permissoes NTFS alteradas", usuario.alterarPermissao());
	}
	@Test
	void deveIniciarInterfaceWindows() {
		FabricaAbstrata fabrica = new FabricaSistemaWindows();
		Usuario usuario = new Usuario(fabrica);
		assertEquals("interface AERO", usuario.Exibir());
	}
}
