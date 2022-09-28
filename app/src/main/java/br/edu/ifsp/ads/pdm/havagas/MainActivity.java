package br.edu.ifsp.ads.pdm.havagas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.ads.pdm.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.mainSv);

        amb.celularCb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) amb.celularEt.setVisibility(View.VISIBLE);
            else amb.celularEt.setVisibility(View.GONE);
        });

        amb.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case (0):
                    case (1): {
                        clearFormacaoForm();
                        amb.gradEspecLl.setVisibility(View.GONE);
                        amb.mestDocLl.setVisibility(View.GONE);
                        amb.anoFormaturaEt.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (2):
                    case (3): {
                        clearFormacaoForm();
                        amb.mestDocLl.setVisibility(View.GONE);
                        amb.anoFormaturaEt.setVisibility(View.GONE);
                        amb.gradEspecLl.setVisibility(View.VISIBLE);
                        break;
                    }
                    case (4):
                    case (5): {
                        clearFormacaoForm();
                        amb.gradEspecLl.setVisibility(View.GONE);
                        amb.anoFormaturaEt.setVisibility(View.GONE);
                        amb.mestDocLl.setVisibility(View.VISIBLE);
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        amb.limparBtn.setOnClickListener(this::clearForm);

        amb.salvarBtn.setOnClickListener(view -> {
            var pessoa = new Pessoa(
                    amb.nomeEt.getText().toString(),
                    amb.emailEt.getText().toString(),
                    amb.emailAttCb.isChecked(),
                    amb.telefoneEt.getText().toString(),
                    amb.celularEt.getText().toString(),
                    amb.masculinoRb.isChecked() ? "Masculino" : "Feminino",
                    amb.birthdateEt.getText().toString(),
                    ((TextView) amb.formacaoSp.getSelectedView()).getText().toString(),
                    amb.anoFormaturaEt.getText().toString(),
                    amb.anoConclusaoEt.getText().toString(),
                    amb.anoConclusao2Et.getText().toString(),
                    amb.instituicaoEt.getText().toString(),
                    amb.instituicao2Et.getText().toString(),
                    amb.monografiaEt.getText().toString(),
                    amb.orientadorEt.getText().toString(),
                    amb.vagasEt.getText().toString()
            );

            Toast.makeText(this, pessoa.toString(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        var nome = amb.nomeEt.getText().toString();
        var email = amb.emailEt.getText().toString();
        var emailAttCbChecked = amb.emailAttCb.isChecked();
        var celularCbChecked = amb.celularCb.isChecked();
        var telefone = amb.telefoneEt.getText().toString();
        var celular = amb.celularEt.getText().toString();
        var masculinoRbChecked = amb.masculinoRb.isChecked();
        var formacao = amb.formacaoSp.getSelectedItemPosition();
        var anoFormatura = amb.anoFormaturaEt.getText().toString();
        var anoConclusao = amb.anoConclusaoEt.getText().toString();
        var anoConclusao2 = amb.anoConclusao2Et.getText().toString();
        var instituicao = amb.instituicaoEt.getText().toString();
        var instituicao2 = amb.instituicao2Et.getText().toString();
        var monografia = amb.monografiaEt.getText().toString();
        var orientador = amb.orientadorEt.getText().toString();
        var vagas = amb.vagasEt.getText().toString();

        bundle.putString("nome", nome);
        bundle.putString("email", email);
        bundle.putBoolean("emailAtt", emailAttCbChecked);

        bundle.putString("telefone", telefone);
        bundle.putBoolean("celularCb", celularCbChecked);
        bundle.putString("celular", celular);

        bundle.putBoolean("masculino", masculinoRbChecked);

        bundle.putInt("formacaoPosition",formacao);

        bundle.putString("anoFormatura", anoFormatura);
        bundle.putString("anoConclusao", anoConclusao);
        bundle.putString("anoConclusao2", anoConclusao2);
        bundle.putString("instituicao", instituicao);
        bundle.putString("instituicao2", instituicao2);
        bundle.putString("monografia", monografia);
        bundle.putString("orientador", orientador);
        bundle.putString("vagas", vagas);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        var nome = savedInstanceState.getString("nome");
        var email = savedInstanceState.getString("email");
        var emailAtt = savedInstanceState.getBoolean("emailAtt");

        var telefone = savedInstanceState.getString("telefone");
        var celularCb = savedInstanceState.getBoolean("celularCb");
        var celular = savedInstanceState.getString("celular");

        var masculino = savedInstanceState.getBoolean("masculino");

        var formacaoPosition = savedInstanceState.getInt("formacaoPosition");

        var anoFormatura = savedInstanceState.getString("anoFormatura");
        var anoConclusao = savedInstanceState.getString("anoConclusao");
        var anoConclusao2 = savedInstanceState.getString("anoConclusao2");
        var instituicao = savedInstanceState.getString("instituicao");
        var instituicao2 = savedInstanceState.getString("instituicao2");
        var monografia = savedInstanceState.getString("monografia");
        var orientador = savedInstanceState.getString("orientador");
        var vagas = savedInstanceState.getString("vagas");

        amb.nomeEt.setText(nome);
        amb.emailEt.setText(email);
        amb.emailAttCb.setChecked(emailAtt);

        amb.telefoneEt.setText(telefone);
        amb.celularCb.setChecked(celularCb);
        amb.celularEt.setText(celular);

        amb.masculinoRb.setChecked(masculino);

        amb.formacaoSp.setSelection(formacaoPosition);
        amb.anoFormaturaEt.setText(anoFormatura);
        amb.anoConclusaoEt.setText(anoConclusao);
        amb.anoConclusao2Et.setText(anoConclusao2);
        amb.instituicaoEt.setText(instituicao);
        amb.instituicao2Et.setText(instituicao2);
        amb.monografiaEt.setText(monografia);
        amb.orientadorEt.setText(orientador);
        amb.vagasEt.setText(vagas);
    }

    private void clearForm(View view) {
        amb.nomeEt.setText("");
        amb.emailEt.setText("");
        amb.emailAttCb.setChecked(false);
        amb.telefoneEt.setText("");
        amb.celularCb.setChecked(false);
        amb.celularEt.setText("");
        amb.sexoRg.check(R.id.masculino_rb);
        amb.birthdateEt.setText("");
        amb.vagasEt.setText("");
        amb.formacaoSp.setSelection(0);
        clearFormacaoForm();

        view.scrollTo(0, 0);
    }

    private void clearFormacaoForm() {
        amb.anoFormaturaEt.setText("");
        amb.anoConclusaoEt.setText("");
        amb.anoConclusao2Et.setText("");
        amb.orientadorEt.setText("");
        amb.monografiaEt.setText("");
        amb.instituicaoEt.setText("");
        amb.instituicao2Et.setText("");
    }
}