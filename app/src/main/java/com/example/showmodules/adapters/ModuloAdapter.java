package com.example.showmodules.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.showmodules.R;
import com.example.showmodules.objects.Modulo;

import java.util.List;

public class ModuloAdapter extends RecyclerView.Adapter<ModuloAdapter.ViewHolder> {

    private List<Modulo> modulos;
    private LayoutInflater inflater;
    private Context context;

    public ModuloAdapter(List<Modulo> modulos, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.modulos = modulos;
        this.context = context;
    }

    @NonNull
    @Override
    public ModuloAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cv_modules,null);
        return new ModuloAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(modulos.get(position));
    }


    @Override
    public int getItemCount() {
        return modulos.size();
    }

    public void setItems(List<Modulo>items){modulos = items;}


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView modul,nombreLargo,profe;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            modul = itemView.findViewById(R.id.modul);
            nombreLargo = itemView.findViewById(R.id.nameModul);
            profe = itemView.findViewById(R.id.profe);
        }

        void bindData(final Modulo item){
            modul.setText(item.getModul());
            nombreLargo.setText(item.getNombreLargo());
            profe.setText(item.getProfe());
        }
    }
}
