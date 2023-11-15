/**
 * Classe Adapter para gerenciar e exibir uma lista de eventos em um RecyclerView.
 *
 * Esta classe estende RecyclerView.Adapter e é projetada para funcionar com a classe interna
 * EventoViewHolder para exibir eficientemente uma lista de objetos Evento.
 *
 * Exemplo de uso:
 * ```java
 * // Crie uma instância do Adapter
 * Adapter adapter = new Adapter(contexto, listaDeEventos);
 *
 * // Defina o adaptador para um RecyclerView
 * recyclerView.setAdapter(adapter);
 * ```
 *
 * @author Daniel Santos, Erick Do Coni, Felipe  Brito, Jeferson Moraes e Yan Vitorio
 * @version 1.0
 * @since 2023-10-11
 */
package com.jeff.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.EventoViewHolder> {

    /**
     * Lista de eventos a serem exibidos pelo adaptador.
     */
    private List<Evento> eventos;

    /**
     * Contexto associado ao adaptador.
     */
    private Context contexto;

    /**
     * Constrói um Adapter com o contexto e a lista de eventos fornecidos.
     *
     * @param context   O contexto no qual o adaptador é usado.
     * @param lista     A lista de eventos a ser exibida.
     */
    public Adapter(Context context, List<Evento> lista) {
        this.contexto = context;
        this.eventos = lista;
    }

    /**
     * Cria uma nova instância de EventoViewHolder inflando o layout do pai fornecido.
     *
     * @param parent    O ViewGroup no qual a nova View será adicionada.
     * @param viewType  O tipo da nova View.
     * @return Uma nova instância de EventoViewHolder que contém uma View do tipo fornecido.
     */
    @NonNull
    @Override
    public EventoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.itemlista, parent, false);
        return new EventoViewHolder(view);
    }

    /**
     * Liga os dados da posição especificada às views dentro do EventoViewHolder fornecido.
     *
     * @param holder    O EventoViewHolder para ligar os dados.
     * @param position  A posição do item no conjunto de dados do adaptador.
     */
    @Override
    public void onBindViewHolder(@NonNull EventoViewHolder holder, int position) {
        Evento evento = eventos.get(position);
        holder.setTitulo(evento.getTitulo());
        holder.setData(evento.getData());
        holder.setImagem(evento.getImagem());
    }

    /**
     * Retorna o número total de itens no conjunto de dados mantido pelo adaptador.
     *
     * @return O número total de itens no conjunto de dados do adaptador.
     */
    @Override
    public int getItemCount() {
        return eventos.size();
    }

    /**
     * Classe ViewHolder que representa uma view de item no RecyclerView.
     */
    class EventoViewHolder extends RecyclerView.ViewHolder {

        /**
         * TextView para exibir o título do evento.
         */
        private TextView titulo;

        /**
         * TextView para exibir a data do evento.
         */
        private TextView data;

        /**
         * ImageView para exibir a imagem associada ao evento.
         */
        private ImageView imagem;

        /**
         * Constrói um novo EventoViewHolder.
         *
         * @param itemView A View representando um item no RecyclerView.
         */
        public EventoViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            data = itemView.findViewById(R.id.data);
            imagem = itemView.findViewById(R.id.eventDetailImageView2);
        }

        /**
         * Define o título do evento na TextView correspondente.
         *
         * @param titulo O título do evento.
         */
        public void setTitulo(String titulo) {
            this.titulo.setText(titulo);
        }

        /**
         * Define a data do evento na TextView correspondente.
         *
         * @param data A data do evento.
         */
        public void setData(String data) {
            this.data.setText(data);
        }

        /**
         * Define a imagem do evento na ImageView correspondente.
         *
         * @param imagem O ID do recurso da imagem.
         */
        public void setImagem(int imagem) {
            this.imagem.setImageResource(imagem);
        }
    }
}
