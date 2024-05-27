# Projeto iPhone Componentes

Este projeto visa modelar e implementar as funcionalidades principais de um iPhone como um exercício de aprendizado em programação orientada a objetos e design de software. As funcionalidades incluídas neste projeto são o Reprodutor Musical, o Aparelho Telefônico e o Navegador na Internet.

## Funcionalidades

### Reprodutor Musical
- Métodos:
  - `tocar()`: Inicia a reprodução de música.
  - `pausar()`: Pausa a música que está tocando.
  - `selecionarMusica(String musica)`: Seleciona uma música para tocar, dado o nome da música.

### Aparelho Telefônico
- Métodos:
  - `ligar(String numero)`: Realiza uma chamada para o número especificado.
  - `atender()`: Atende uma chamada recebida.
  - `iniciarCorreioVoz()`: Inicia o serviço de correio de voz.

### Navegador na Internet
- Métodos:
  - `exibirPagina(String url)`: Carrega e exibe a página da URL especificada.
  - `adicionarNovaAba()`: Abre uma nova aba no navegador.
  - `atualizarPagina()`: Recarrega a página que está atualmente visível.

## Diagrama UML

O diagrama UML abaixo ilustra as interfaces e métodos que descrevem as funcionalidades de cada componente do projeto:

![Diagrama UML do Projeto iPhone](dio-desafio-iphone/image.png)

## Implementação em Java

As interfaces foram implementadas em Java, seguindo o modelo orientado a objetos. Os arquivos fonte estão disponíveis no diretório `src` deste repositório.

