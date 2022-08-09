package com.example.pruebatv;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;

import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;

import com.squareup.picasso.Picasso;

public class CardPresenter extends Presenter {
    static class ViewHolder extends Presenter.ViewHolder {
        private ImageCardView mCardView;

        public ViewHolder(View view) {
            super(view);
            mCardView = (ImageCardView) view;
        }

        public ImageCardView getCardView() {
            return mCardView;
        }

        public void updateCardViewHolder(Context context, String link) {
            Picasso.with(context).load(link).resize(210, 210).centerCrop().into(mCardView.getMainImageView());
        }
    }

    @Override
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        ImageCardView cardView = new ImageCardView(parent.getContext());
        cardView.setFocusable(true);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        Movie movie = (Movie) item;
        if (!TextUtils.isEmpty(movie.getPoster())) {
            ((ViewHolder) viewHolder).mCardView.setTitleText(movie.getTitulo());
            ((ViewHolder) viewHolder).mCardView.setMainImageDimensions(210, 210);
            ((ViewHolder) viewHolder).updateCardViewHolder(((ViewHolder) viewHolder).getCardView().getContext()
                    , movie.getPoster());

        }
    }

    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
    }
    @Override
    public void onViewAttachedToWindow(Presenter.ViewHolder viewHolder){

    }

}