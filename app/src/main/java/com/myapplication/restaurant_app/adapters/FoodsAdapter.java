package com.myapplication.restaurant_app.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.restaurant_app.R;
import com.myapplication.restaurant_app.delegates.FoodsItemDelegate;
import com.myapplication.restaurant_app.views.holders.FoodsViewHolder;

public class FoodsAdapter extends RecyclerView.Adapter<FoodsViewHolder> {

    private FoodsItemDelegate mFoodsItemDelegate;

    public FoodsAdapter(FoodsItemDelegate foodsItemDelegate) {
        mFoodsItemDelegate = foodsItemDelegate;
    }

    @NonNull
    @Override
    public FoodsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_foods, viewGroup, false);
        return new FoodsViewHolder(itemView, mFoodsItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodsViewHolder foodsViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
