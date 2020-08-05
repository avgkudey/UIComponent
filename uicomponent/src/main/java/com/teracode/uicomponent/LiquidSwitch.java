package com.teracode.uicomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.airbnb.lottie.LottieAnimationView;

public class LiquidSwitch extends LinearLayout {
    private LottieAnimationView liquid_switch;


    public LiquidSwitch(Context context) {
        super(context);
    }

    public LiquidSwitch(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    private void init() {
        setOrientation(VERTICAL);
        LayoutInflater.from(getContext()).inflate(R.layout.liquid_switch, this);
        liquid_switch = findViewById(R.id.liquid_switch);
    }
}
