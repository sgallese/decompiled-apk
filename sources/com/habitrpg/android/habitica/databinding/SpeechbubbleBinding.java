package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.Typewriter;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class SpeechbubbleBinding implements a {
    public final Button completeButton;
    public final LinearLayout confirmationButtons;
    public final ImageView continueIndicator;
    public final Button dismissButton;
    public final TextView namePlate;
    public final ImageView npcImageView;
    private final FrameLayout rootView;
    public final Typewriter textView;

    private SpeechbubbleBinding(FrameLayout frameLayout, Button button, LinearLayout linearLayout, ImageView imageView, Button button2, TextView textView, ImageView imageView2, Typewriter typewriter) {
        this.rootView = frameLayout;
        this.completeButton = button;
        this.confirmationButtons = linearLayout;
        this.continueIndicator = imageView;
        this.dismissButton = button2;
        this.namePlate = textView;
        this.npcImageView = imageView2;
        this.textView = typewriter;
    }

    public static SpeechbubbleBinding bind(View view) {
        int i10 = R.id.completeButton;
        Button button = (Button) b.a(view, R.id.completeButton);
        if (button != null) {
            i10 = R.id.confirmation_buttons;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.confirmation_buttons);
            if (linearLayout != null) {
                i10 = R.id.continue_indicator;
                ImageView imageView = (ImageView) b.a(view, R.id.continue_indicator);
                if (imageView != null) {
                    i10 = R.id.dismissButton;
                    Button button2 = (Button) b.a(view, R.id.dismissButton);
                    if (button2 != null) {
                        i10 = R.id.name_plate;
                        TextView textView = (TextView) b.a(view, R.id.name_plate);
                        if (textView != null) {
                            i10 = R.id.npc_image_view;
                            ImageView imageView2 = (ImageView) b.a(view, R.id.npc_image_view);
                            if (imageView2 != null) {
                                i10 = R.id.textView;
                                Typewriter typewriter = (Typewriter) b.a(view, R.id.textView);
                                if (typewriter != null) {
                                    return new SpeechbubbleBinding((FrameLayout) view, button, linearLayout, imageView, button2, textView, imageView2, typewriter);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SpeechbubbleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SpeechbubbleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.speechbubble, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
