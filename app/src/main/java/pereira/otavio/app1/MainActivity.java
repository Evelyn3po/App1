package pereira.otavio.app1;
//importando as classes
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//definindo a classe MainActivity que estende a classe AppCompatActivity
public class MainActivity extends AppCompatActivity {

    //o método OnCreate é chamada quando a Activity é iniciada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Define o layout da atividade
        setContentView(R.layout.activity_main);
        //realiza uma referência para o botão enviar
        Button btnEnviar= findViewById(R.id.btnEnviar);
        // Define um listener para o botão enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // realiza uma referência ao EditText para entrada de texto do layout
                EditText etDigitAqui=findViewById(R.id.etDigiteAqui);
                // realiza o texto inserido pelo usuário no EditText
                String texto= etDigitAqui.getText().toString();
                // Cria uma nova intenção para chamar a próxima atividade
                Intent intent=new Intent(MainActivity.this,NextActivity.class);
                // Adiciona o texto inserido pelo usuário como um extra para a intenção
                intent.putExtra("texto",texto);
                // Inicia a próxima atividade
                startActivity(intent);
            }
        });

    }
}