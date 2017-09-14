package cursoandroid.com.qualserie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView imagemExibicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent secondActivity = new Intent(this, Main2Activity.class);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imagemExibicao = (ImageView) findViewById(R.id.imagemExibiId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgres = progress;
                if(valorProgres == 1){
                    imagemExibicao.setImageResource(R.drawable.pouco);
                }else if (valorProgres == 2){
                    imagemExibicao.setImageResource(R.drawable.medio);
                }else if (valorProgres == 3){
                    imagemExibicao.setImageResource(R.drawable.muito);
                }else if (valorProgres == 4){
                    startActivity(secondActivity);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
