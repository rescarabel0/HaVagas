package br.edu.ifsp.ads.pdm.havagas;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Pessoa {
    @Nullable
    private String nome;
    @Nullable
    private String email;
    @Nullable
    private Boolean emailAtt;
    @Nullable
    private String telefone;
    @Nullable
    private String celular;
    @Nullable
    private String sexo;
    @Nullable
    private String dataNascimento;
    @Nullable
    private String formacao;
    @Nullable
    private String anoFormatura;
    @Nullable
    private String anoConclusaoGraduacaoEspecializacao;
    @Nullable
    private String anoConclusaoMestradoDoutorado;
    @Nullable
    private String instituicaoGraduacaoEspecializacao;
    @Nullable
    private String instituicaoMestradoDoutorado;
    @Nullable
    private String tituloMonografia;
    @Nullable
    private String orientador;
    @Nullable
    private String vagasInteresse;

    public Pessoa(@Nullable String nome, @Nullable String email, @Nullable Boolean emailAtt, @Nullable String telefone, @Nullable String celular, @Nullable String sexo, @Nullable String dataNascimento, @Nullable String formacao, @Nullable String anoFormatura, @Nullable String anoConclusaoGraduacaoEspecializacao, @Nullable String anoConclusaoMestradoDoutorado, @Nullable String instituicaoGraduacaoEspecializacao, @Nullable String instituicaoMestradoDoutorado, @Nullable String tituloMonografia, @Nullable String orientador, @Nullable String vagasInteresse) {
        this.nome = nome;
        this.email = email;
        this.emailAtt = emailAtt;
        this.telefone = telefone;
        this.celular = celular;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.anoFormatura = anoFormatura;
        this.anoConclusaoGraduacaoEspecializacao = anoConclusaoGraduacaoEspecializacao;
        this.anoConclusaoMestradoDoutorado = anoConclusaoMestradoDoutorado;
        this.instituicaoGraduacaoEspecializacao = instituicaoGraduacaoEspecializacao;
        this.instituicaoMestradoDoutorado = instituicaoMestradoDoutorado;
        this.tituloMonografia = tituloMonografia;
        this.orientador = orientador;
        this.vagasInteresse = vagasInteresse;
    }

    public Pessoa() {
    }

    @Nullable
    public String getNome() {
        return nome;
    }

    public void setNome(@Nullable String nome) {
        this.nome = nome;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public Boolean getEmailAtt() {
        return emailAtt;
    }

    public void setEmailAtt(@Nullable Boolean emailAtt) {
        this.emailAtt = emailAtt;
    }

    @Nullable
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(@Nullable String telefone) {
        this.telefone = telefone;
    }

    @Nullable
    public String getCelular() {
        return celular;
    }

    public void setCelular(@Nullable String celular) {
        this.celular = celular;
    }

    @Nullable
    public String getSexo() {
        return sexo;
    }

    public void setSexo(@Nullable String sexo) {
        this.sexo = sexo;
    }

    @Nullable
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@Nullable String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Nullable
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(@Nullable String formacao) {
        this.formacao = formacao;
    }

    @Nullable
    public String getAnoFormatura() {
        return anoFormatura;
    }

    public void setAnoFormatura(@Nullable String anoFormatura) {
        this.anoFormatura = anoFormatura;
    }

    @Nullable
    public String getAnoConclusaoGraduacaoEspecializacao() {
        return anoConclusaoGraduacaoEspecializacao;
    }

    public void setAnoConclusaoGraduacaoEspecializacao(@Nullable String anoConclusaoGraduacaoEspecializacao) {
        this.anoConclusaoGraduacaoEspecializacao = anoConclusaoGraduacaoEspecializacao;
    }

    @Nullable
    public String getAnoConclusaoMestradoDoutorado() {
        return anoConclusaoMestradoDoutorado;
    }

    public void setAnoConclusaoMestradoDoutorado(@Nullable String anoConclusaoMestradoDoutorado) {
        this.anoConclusaoMestradoDoutorado = anoConclusaoMestradoDoutorado;
    }

    @Nullable
    public String getInstituicaoGraduacaoEspecializacao() {
        return instituicaoGraduacaoEspecializacao;
    }

    public void setInstituicaoGraduacaoEspecializacao(@Nullable String instituicaoGraduacaoEspecializacao) {
        this.instituicaoGraduacaoEspecializacao = instituicaoGraduacaoEspecializacao;
    }

    @Nullable
    public String getInstituicaoMestradoDoutorado() {
        return instituicaoMestradoDoutorado;
    }

    public void setInstituicaoMestradoDoutorado(@Nullable String instituicaoMestradoDoutorado) {
        this.instituicaoMestradoDoutorado = instituicaoMestradoDoutorado;
    }

    @Nullable
    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(@Nullable String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    @Nullable
    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(@Nullable String orientador) {
        this.orientador = orientador;
    }

    @Nullable
    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(@Nullable String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }

    @NonNull
    @Override
    public String toString() {
        return "Pessoa: {\n" +
                "nome='" + nome + '\'' +
                ",\n email='" + email + '\'' +
                ",\n emailAtt=" + emailAtt +
                ",\n telefone='" + telefone + '\'' +
                ",\n celular='" + celular + '\'' +
                ",\n sexo='" + sexo + '\'' +
                ",\n dataNascimento='" + dataNascimento + '\'' +
                ",\n formacao='" + formacao + '\'' +
                ",\n anoFormatura=" + anoFormatura +
                ",\n anoConclusaoGraduacaoEspecializacao=" + anoConclusaoGraduacaoEspecializacao + '\'' +
                ",\n anoConclusaoMestradoDoutorado=" + anoConclusaoMestradoDoutorado + '\'' +
                ",\n instituicaoGraduacaoEspecializacao='" + instituicaoGraduacaoEspecializacao + '\'' +
                ",\n instituicaoMestradoDoutorado='" + instituicaoMestradoDoutorado + '\'' +
                ",\n tituloMonografia='" + tituloMonografia + '\'' +
                ",\n orientador='" + orientador + '\'' +
                ",\n vagasInteresse='" + vagasInteresse + '\'' +
                '}';
    }
}
