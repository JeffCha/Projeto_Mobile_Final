/**
 * A classe `Evento` representa um evento com informações como título, data e identificador de imagem.
 *
 * Exemplo de uso:
 * ```java
 * // Crie uma instância de Evento
 * Evento evento = new Evento("Meu Evento", "01/01/2023", R.drawable.imagem_evento);
 * ```
 *
 * @author Daniel Santos, Erick Do Coni, Felipe  Brito, Jeferson Moraes e Yan Vitorio
 * @version 1.0
 * @since 2023-10-11
 */
package com.jeff.myapplication;

/**
 * A classe `Evento` representa um evento com informações como título, data e identificador de imagem.
 */
public class Evento {

    /**
     * Título do evento.
     */
    private String titulo;

    /**
     * Data do evento.
     */
    private String data;

    /**
     * Identificador da imagem associada ao evento.
     */
    private int imagem;

    /**
     * Construtor padrão da classe `Evento`.
     */
    public Evento() {
    }

    /**
     * Construtor da classe `Evento` que recebe parâmetros para inicializar as propriedades.
     *
     * @param titulo Título do evento.
     * @param data   Data do evento.
     * @param imagem Identificador da imagem associada ao evento.
     */
    public Evento(String titulo, String data, int imagem) {
        this.titulo = titulo;
        this.data = data;
        this.imagem = imagem;
    }

    /**
     * Obtém o título do evento.
     *
     * @return O título do evento.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do evento.
     *
     * @param titulo O título do evento a ser definido.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém a data do evento.
     *
     * @return A data do evento.
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data do evento.
     *
     * @param data A data do evento a ser definida.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém o identificador da imagem associada ao evento.
     *
     * @return O identificador da imagem associada ao evento.
     */
    public int getImagem() {
        return imagem;
    }

    /**
     * Define o identificador da imagem associada ao evento.
     *
     * @param imagem O identificador da imagem a ser definido.
     */
    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
