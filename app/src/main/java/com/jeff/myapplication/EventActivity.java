/**
 * A classe `EventActivity` é uma atividade que estende `AppCompatActivity` e é usada para exibir
 * informações detalhadas sobre um evento específico. Esta atividade é responsável por inflar o
 * layout associado à visualização de detalhes do evento.
 *
 * Exemplo de uso:
 * ```java
 * // Crie uma intenção para iniciar a atividade de evento
 * Intent intent = new Intent(contexto, EventActivity.class);
 * startActivity(intent);
 * ```
 *
 * @author Daniel Santos, Erick Do Coni, Felipe  Brito, Jeferson Moraes e Yan Vitorio
 * @version 1.0
 * @since 2023-10-11
 */
package com.jeff.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * A classe `EventActivity` representa uma atividade que exibe informações detalhadas sobre um evento.
 */
public class EventActivity extends AppCompatActivity {

    /**
     * Método chamado quando a atividade é criada. Ele infla o layout associado à visualização de
     * detalhes do evento.
     *
     * @param savedInstanceState Um objeto Bundle contendo o estado anteriormente salvo da atividade,
     *                           caso exista. Pode ser nulo.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }
}
