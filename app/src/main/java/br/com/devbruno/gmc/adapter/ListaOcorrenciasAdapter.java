package br.com.devbruno.gmc.adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.devbruno.gmc.R;
import br.com.devbruno.gmc.activity.AboutActivity;
import br.com.devbruno.gmc.entity.Ocorrencia;

public class ListaOcorrenciasAdapter extends RecyclerView.Adapter<ListaOcorrenciasAdapter.ViewHolder> {

    private List<Ocorrencia> listaOcorrencias;

    public ListaOcorrenciasAdapter(List<Ocorrencia> listaOcorrencias) {
        this.listaOcorrencias = listaOcorrencias;
    }

    @Override
    public ListaOcorrenciasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_ocorrencias_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.ocorrenciaDescricao.setText(this.listaOcorrencias.get(position).getDescricao());
        holder.ocorrenciaTotal.setText(this.listaOcorrencias.get(position).getTotalOcorrenciasFormatado());
        holder.ocorrenciaPosition.setText(String.valueOf(position + 1).concat("°"));

        final int positionOnClick = position;
        holder.listaOcorrenciaItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickItem(v, positionOnClick);
            }
        });
    }

    public void onClickItem(View v, int position) {
        Intent intent = new Intent(v.getContext(), AboutActivity.class);
        intent.putExtra("acao", listaOcorrencias.get(position).getDescricao());
        v.getContext().startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return this.listaOcorrencias.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ocorrenciaDescricao;
        public TextView ocorrenciaTotal;
        public TextView ocorrenciaPosition;
        public CardView listaOcorrenciaItem;

        public ViewHolder(View view) {
            super(view);
            ocorrenciaDescricao = (TextView) view.findViewById(R.id.ocorrencia_descricao_text_view);
            ocorrenciaTotal = (TextView) view.findViewById(R.id.ocorrencia_total_text_view);
            ocorrenciaPosition = (TextView) view.findViewById(R.id.ocorrencia_position);
            listaOcorrenciaItem = (CardView) view.findViewById(R.id.card_view);
        }
    }
}
