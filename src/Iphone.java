public class Iphone implements ReprodutorMusical,NavegadorInternet,AparelhoTelefonico{
  @Override
  public void tocarMusica() {
    System.out.println("Tocando música");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Pausando música");
  }

  @Override
  public void selecionarFaixa() {
    System.out.println("Selecionando nova faixa");
  }

  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Nova pagina adicionada");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Recarregando pagina");
  }

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para o número: " + numero);
  }

  @Override
  public void atender() {
   System.out.println("Ligação atendida");

  }

  @Override
  public void iniciarCorreioDeVoz() {
    System.out.println("Iniciando Correio de voz");
  }
}
