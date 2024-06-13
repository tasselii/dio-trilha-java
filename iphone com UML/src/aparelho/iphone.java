package aparelho;

public class iphone {
	public static void main(String[] args) {
		celular novoIphone = new celular();
		
		novoIphone.ligar("123456789");
		novoIphone.atender();
		novoIphone.IniciarCorreioDeVoz();

		novoIphone.exibirPagina("www.exemplo.com");
		novoIphone.adicionarNovaAba();
		novoIphone.atualizarPagina();

		novoIphone.tocar();
		novoIphone.pausar();
		novoIphone.selecionarMusica("Minha Música");
	}
}
