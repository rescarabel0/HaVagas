package br.edu.ifsp.ads.pdm.havagas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.ads.pdm.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.mainSv);

        activityMainBinding.celularCb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) activityMainBinding.celularEt.setVisibility(View.VISIBLE);
            else activityMainBinding.celularEt.setVisibility(View.GONE);
        });

        activityMainBinding.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case (0):
                    case (1): {
                        clearFormacaoForm();
                        activityMainBinding.gradEspecLl.setVisibility(View.GONE);
                        activityMainBinding.mestDocLl.setVisibility(View.GONE);
                        activityMainBinding.anoFormaturaEt.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (2):
                    case (3): {
                        clearFormacaoForm();
                        activityMainBinding.mestDocLl.setVisibility(View.GONE);
                        activityMainBinding.anoFormaturaEt.setVisibility(View.GONE);
                        activityMainBinding.gradEspecLl.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (4):
                    case (5): {
                        clearFormacaoForm();
                        activityMainBinding.gradEspecLl.setVisibility(View.GONE);
                        activityMainBinding.anoFormaturaEt.setVisibility(View.GONE);
                        activityMainBinding.mestDocLl.setVisibility(View.VISIBLE);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        activityMainBinding.limparBtn.setOnClickListener(this::clearForm);

        activityMainBinding.salvarBtn.setOnClickListener(view -> {
            var pessoa = new Pessoa(
                    activityMainBinding.nomeEt.getText().toString(),
                    activityMainBinding.emailEt.getText().toString(),
                    activityMainBinding.emailAttCb.isChecked(),
                    activityMainBinding.telefoneEt.getText().toString(),
                    activityMainBinding.celularEt.getText().toString(),
                    ((RadioButton) findViewById(activityMainBinding.sexoRg.getCheckedRadioButtonId())).getText().toString(),
                    activityMainBinding.birthdateEt.getText().toString(),
                    ((TextView) activityMainBinding.formacaoSp.getSelectedView()).getText().toString(),
                    activityMainBinding.anoFormaturaEt.getText().toString(),
                    activityMainBinding.anoConclusaoEt.getText().toString(),
                    activityMainBinding.anoConclusao2Et.getText().toString(),
                    activityMainBinding.instituicaoEt.getText().toString(),
                    activityMainBinding.instituicao2Et.getText().toString(),
                    activityMainBinding.monografiaEt.getText().toString(),
                    activityMainBinding.orientadorEt.getText().toString(),
                    activityMainBinding.vagasEt.getText().toString()
            );

            Toast.makeText(this, pessoa.toString(), Toast.LENGTH_SHORT).show();
        });
    }

    private void clearForm(View view) {
        activityMainBinding.nomeEt.setText("");
        activityMainBinding.emailEt.setText("");
        activityMainBinding.emailAttCb.setChecked(false);
        activityMainBinding.telefoneEt.setText("");
        activityMainBinding.celularCb.setChecked(false);
        activityMainBinding.celularEt.setText("");
        activityMainBinding.sexoRg.check(R.id.masculino_rb);
        activityMainBinding.birthdateEt.setText("");
        activityMainBinding.vagasEt.setText("");
        activityMainBinding.formacaoSp.setSelection(0);
        clearFormacaoForm();

        view.scrollTo(0, 0);
    }

    private void clearFormacaoForm() {
        activityMainBinding.anoFormaturaEt.setText("");
        activityMainBinding.anoConclusaoEt.setText("");
        activityMainBinding.anoConclusao2Et.setText("");
        activityMainBinding.orientadorEt.setText("");
        activityMainBinding.monografiaEt.setText("");
        activityMainBinding.instituicaoEt.setText("");
        activityMainBinding.instituicao2Et.setText("");
    }
}