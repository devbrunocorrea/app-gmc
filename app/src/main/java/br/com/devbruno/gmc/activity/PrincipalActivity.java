package br.com.devbruno.gmc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.devbruno.gmc.R;
import br.com.devbruno.gmc.adapter.ListaOcorrenciasAdapter;
import br.com.devbruno.gmc.entity.Ocorrencia;

public class PrincipalActivity extends Activity {
    private RecyclerView listaOcorrenciasView;
    private RecyclerView.Adapter listaOcorrenciasAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Ocorrencia> listaOcorrencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);

        setUI();
    }

    private void setUI() {
        listaOcorrenciasView = (RecyclerView) findViewById(R.id.rc_lista_ocorrencias);
        listaOcorrenciasView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        listaOcorrenciasView.setLayoutManager(layoutManager);

        listaOcorrenciasAdapter = new ListaOcorrenciasAdapter(this.getListaOcorrencias());

        listaOcorrenciasView.setAdapter(listaOcorrenciasAdapter);
        listaOcorrenciasView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<Ocorrencia> getListaOcorrencias() {
        listaOcorrencias = new ArrayList<>();
        listaOcorrencias.add(new Ocorrencia("Apoio", 932));
        listaOcorrencias.add(new Ocorrencia("Dano", 752));
        listaOcorrencias.add(new Ocorrencia("Roubo", 637));
        listaOcorrencias.add(new Ocorrencia("Abordagem", 422));
        listaOcorrencias.add(new Ocorrencia("Substância Ilícita", 299));
        listaOcorrencias.add(new Ocorrencia("Ameaça", 291));
        listaOcorrencias.add(new Ocorrencia("Perturbação do Sossego", 291));
        listaOcorrencias.add(new Ocorrencia("Invasão", 273));
        listaOcorrencias.add(new Ocorrencia("Atitude Suspeita", 266));
        listaOcorrencias.add(new Ocorrencia("Furto", 170));

        return listaOcorrencias;
    }
}
