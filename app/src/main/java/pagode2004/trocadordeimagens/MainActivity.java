package pagode2004.trocadordeimagens;
// Gabriel Fernandes Justino & Lucas Froes Belinassi
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgEscudo;
    private Button btnTimao;
    private Button btnFla;
    private Button btnAtletico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgEscudo = (ImageView) findViewById(R.id.imgEscudo);
        btnTimao = (Button) findViewById(R.id.btnTimao);
        btnFla = (Button) findViewById(R.id.btnFla);
        btnAtletico = (Button) findViewById(R.id.btnAtletico);

        EscutadorBotao eb = new EscutadorBotao();

        btnTimao.setOnClickListener(eb);
        btnAtletico.setOnClickListener(eb);
        btnFla.setOnClickListener(eb);
    }
    private class EscutadorBotao implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button b = (Button) view;
            switch ( b.getId() ) {
                case R.id.btnTimao:
                    imgEscudo.setImageResource(R.drawable.timao);
                    break;
                case R.id.btnFla:
                    imgEscudo.setImageResource(R.drawable.fla);
                    break;
                case R.id.btnAtletico:
                    imgEscudo.setImageResource(R.drawable.atl);
                    break;
            }
        }
    }
}