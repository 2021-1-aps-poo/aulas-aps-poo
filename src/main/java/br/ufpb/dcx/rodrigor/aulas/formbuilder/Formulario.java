package br.ufpb.dcx.rodrigor.aulas.formbuilder;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Formulario {

    private String titulo;
    private String descricao;
    private Map<String,Campo> campos = new LinkedHashMap<>();

    public Formulario(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void add(Campo campo) {
        campos.put(campo.getId(),campo);
    }

    public Campo getCampo(String id) {
        return campos.get(id);
    }

    public List<Campo> getCampos(){
        return (List)campos.values();
    }

}
