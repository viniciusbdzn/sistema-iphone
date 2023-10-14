package iphone;

import iphone.navegador.Navegador;
import iphone.reprodutor.ReprodutorMusical;
import iphone.telefone.AparelhoTelefonico;

public class IphoneApp implements Navegador, ReprodutorMusical, AparelhoTelefonico{
	//métodos do AparelhoTelefonico
	@Override
	public void ligar() {
		System.out.println("Aparelho telefonico fazendo ligação!");
	}
	@Override
	public void atender() {
		System.out.println("Aparelho telefonico atendendo ligação!");
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Aparelho telefonico iniciando correio de voz!");
	}
	
	//métodos do ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Reprodutor tocando música!");
	}
	@Override
	public void pausar() {
		System.out.println("Reprodutor pausando música!");
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Reprodutor selecionando música!");
	}
	
	//métodos do Navegador
	@Override
	public void exibirPagina() {
		System.out.println("Navegador exibindo página!");
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Navegador adicionando nova aba!");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Navegador atualizando página!");
	}
	
	
}
