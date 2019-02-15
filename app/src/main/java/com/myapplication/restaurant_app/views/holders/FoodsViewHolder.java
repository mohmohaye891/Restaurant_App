package com.myapplication.restaurant_app.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.myapplication.restaurant_app.delegates.FoodsItemDelegate;

public class FoodsViewHolder extends RecyclerView.ViewHolder {

    private FoodsItemDelegate mDelegate;

    public FoodsViewHolder(@NonNull View itemView, @NonNull FoodsItemDelegate foodsItemDelegate) {
        super(itemView);

        mDelegate = foodsItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDelegate.onTapFoodsItem();
            }
        });
    }
}
