/**
 * A classe `MainActivity` representa a atividade principal do aplicativo, onde os usuários podem acessar
 * eventos e realizar ações como visualizar detalhes de eventos e fazer logout.
 *
 * Exemplo de uso:
 * ```java
 * // Crie uma intenção para iniciar a atividade principal
 * Intent intent = new Intent(contexto, MainActivity.class);
 * startActivity(intent);
 * ```
 *
 * @author Daniel Santos, Erick Do Coni, Felipe  Brito, Jeferson Moraes e Yan Vitorio
 * @version 1.0
 * @since 2023-10-11
 */
package com.jeff.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * A classe `MainActivity` é a atividade principal do aplicativo e lida com a navegação para eventos e
 * ação de logout.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Método chamado quando a atividade é criada. Ele infla o layout associado à atividade principal,
     * configura botões e define ouvintes de clique para cada botão.
     *
     * @param savedInstanceState Um objeto Bundle contendo o estado anteriormente salvo da atividade,
     *                           caso exista. Pode ser nulo.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referências aos botões
        Button btnEvents = findViewById(R.id.btnEvents);
        Button btnLogout = findViewById(R.id.btnLogout);

        // Configurar o ouvinte de clique para o botão "Eventos"
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para o botão Eventos
                // Suponha que você tenha informações do evento
                String eventTitle = "UCSAL DAY";
                String eventAddress = "Endereço: Rua XYZ, Número 123";
                String eventDateTime = "Data e Hora: 01/01/2024, 10:00 AM";
                String eventAddress1 = "Endereço: Rua Felix, Número 550";
                String eventDateTime1 = "Data e Hora: 01/01/2024, 11:00 AM";

                // Criar uma Intent para abrir a tela de detalhes do evento
                Intent intent = new Intent(MainActivity.this, EventDetailActivity.class);

                // Passar informações do evento como extras na Intent
                intent.putExtra("event_title", eventTitle);
                intent.putExtra("event_address", eventAddress);
                intent.putExtra("event_date_time", eventDateTime);
                intent.putExtra("event_address1", eventAddress1);
                intent.putExtra("event_date_time1", eventDateTime1);

                // Iniciar a Activity de detalhes do evento
                startActivity(intent);
            }
        });

        // Configurar o ouvinte de clique para o botão "Logout"
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para o botão Logout
                Toast.makeText(MainActivity.this, "Saindo do aplicativo", Toast.LENGTH_SHORT).show();
                finish(); // Fecha a atividade e volta à tela anterior ou encerra o aplicativo
            }
        });
    }
}
