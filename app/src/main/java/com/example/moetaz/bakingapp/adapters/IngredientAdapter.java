package com.example.moetaz.bakingapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.moetaz.bakingapp.R;
import com.example.moetaz.bakingapp.models.RecipeModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by moetaz on 17/10/2017.
 */

public class IngredientAdapter extends RecyclerView.Adapter<IngredientAdapter.MyViewHolder> {

    private Context context;
    private List<RecipeModel.ingredients> ingredientses = new ArrayList<>();


    public IngredientAdapter(Context context,List<RecipeModel.ingredients> ingredientses) {
        this.context = context;
        this.ingredientses = ingredientses;

    }

    @Override
    public IngredientAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredients_row, parent, false);

        IngredientAdapter.MyViewHolder holder=new IngredientAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(IngredientAdapter.MyViewHolder holder, final int position) {
        RecipeModel.ingredients ingredients =ingredientses.get(position);

        holder.textView.setText((position+1)+" -" +ingredients.getIngredient()+" : "+ingredients.getQuantity()+" "+
                ingredients.getMeasure());


    }

    @Override
    public int getItemCount() {
            return ingredientses.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.ingr);

        }
    }
}
