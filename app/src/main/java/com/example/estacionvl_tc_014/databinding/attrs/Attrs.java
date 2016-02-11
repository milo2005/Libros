package com.example.estacionvl_tc_014.databinding.attrs;

import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.graphics.Typeface;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by EstacionVL-TC-014 on 11/02/16.
 */
public class Attrs {

    @BindingAdapter("app:imgUrl")
    public static void loadImage(ImageView img, String url){
        Uri uri = Uri.parse(url);
        Picasso.with(img.getContext()).load(uri).into(img);

    }

    @BindingAdapter("app:fontTxt")
    public static void loadFont(TextView txt, String name){
        Typeface typeface = Typeface.createFromAsset(txt.getContext().getAssets()
                ,"fonts/"+name+".ttf");
        txt.setTypeface(typeface);
    }


}
