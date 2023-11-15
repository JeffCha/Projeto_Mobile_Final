/**
 * A classe `EventDetailActivity` representa uma atividade que exibe detalhes de um evento, incluindo
 * uma lista de eventos relacionados. Esta atividade inclui a capacidade de marcar eventos como favoritos,
 * visualizar detalhes e comprar ingressos para o evento.
 *
 * Exemplo de uso:
 * ```java
 * // Crie uma intenção para iniciar a atividade de detalhes do evento
 * Intent intent = new Intent(contexto, EventDetailActivity.class);
 * startActivity(intent);
 * ```
 *
 * @author Daniel Santos, Erick Do Coni, Felipe  Brito, Jeferson Moraes e Yan Vitorio
 * @version 1.0
 * @since 2023-10-11
 */
package com.jeff.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe `EventDetailActivity` estende `AppCompatActivity` e exibe detalhes de um evento,
 * incluindo uma lista de eventos relacionados e a capacidade de comprar ingressos.
 */
public class EventDetailActivity extends AppCompatActivity {

    /**
     * Status inicial do favorito.
     */
    private boolean isFavorite = false;

    /**
     * Método chamado quando a atividade é criada. Ele infla o layout associado à visualização de detalhes
     * do evento, configura a lista de eventos relacionados e define ouvintes de clique para botões específicos.
     *
     * @param savedInstanceState Um objeto Bundle contendo o estado anteriormente salvo da atividade,
     *                           caso exista. Pode ser nulo.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        // Lista de eventos relacionados
        List<Evento> lista = new ArrayList<>();
        lista.add(new Evento("CoffeBreak", "11/10/2023", R.drawable.event_1));
        lista.add(new Evento("InfoUcsal", "11/10/2023", R.drawable.event_2));
        lista.add(new Evento("Cerimônia de encerramento", "11/10/2023", R.drawable.event_image));

        // Configurar RecyclerView
        RecyclerView recyclerView = findViewById(R.id.detalhe_rv_lista);
        Adapter adapter = new Adapter(this, lista);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Configurar o ouvinte de clique para o botão "Voltar"
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação ao clicar em "Voltar" (fechar a atividade e voltar à tela anterior)
                finish();
            }
        });

        // Configurar o ouvinte de clique para o botão "Comprar Ingresso"
        Button btnBuyTicket = findViewById(R.id.btnBuyTicket);
        btnBuyTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação ao clicar em "Comprar Ingresso" (abrir uma URL de compra)
                String urlCompra = "https://exemplo.com/comprar_ingresso";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlCompra));
                startActivity(browserIntent);
            }
        });
    }
}
