package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityFixcharacterBinding implements a {
    public final TextInputLayout editTextWrapper;
    public final TextInputEditText experienceEditText;
    public final View experienceIconBackgroundView;
    public final ImageView experienceIconView;
    public final TextInputEditText goldEditText;
    public final View goldIconBackgroundView;
    public final ImageView goldIconView;
    public final TextInputEditText healthEditText;
    public final View healthIconBackgroundView;
    public final ImageView healthIconView;
    public final TextInputEditText levelEditText;
    public final View levelIconBackgroundView;
    public final ImageView levelIconView;
    public final TextInputEditText manaEditText;
    public final View manaIconBackgroundView;
    public final ImageView manaIconView;
    private final LinearLayout rootView;
    public final TextInputEditText streakEditText;
    public final TextInputLayout streakEditTextWrapper;
    public final View streakIconBackgroundView;
    public final ImageView streakIconView;
    public final Toolbar toolbar;

    private ActivityFixcharacterBinding(LinearLayout linearLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText, View view, ImageView imageView, TextInputEditText textInputEditText2, View view2, ImageView imageView2, TextInputEditText textInputEditText3, View view3, ImageView imageView3, TextInputEditText textInputEditText4, View view4, ImageView imageView4, TextInputEditText textInputEditText5, View view5, ImageView imageView5, TextInputEditText textInputEditText6, TextInputLayout textInputLayout2, View view6, ImageView imageView6, Toolbar toolbar) {
        this.rootView = linearLayout;
        this.editTextWrapper = textInputLayout;
        this.experienceEditText = textInputEditText;
        this.experienceIconBackgroundView = view;
        this.experienceIconView = imageView;
        this.goldEditText = textInputEditText2;
        this.goldIconBackgroundView = view2;
        this.goldIconView = imageView2;
        this.healthEditText = textInputEditText3;
        this.healthIconBackgroundView = view3;
        this.healthIconView = imageView3;
        this.levelEditText = textInputEditText4;
        this.levelIconBackgroundView = view4;
        this.levelIconView = imageView4;
        this.manaEditText = textInputEditText5;
        this.manaIconBackgroundView = view5;
        this.manaIconView = imageView5;
        this.streakEditText = textInputEditText6;
        this.streakEditTextWrapper = textInputLayout2;
        this.streakIconBackgroundView = view6;
        this.streakIconView = imageView6;
        this.toolbar = toolbar;
    }

    public static ActivityFixcharacterBinding bind(View view) {
        int i10 = R.id.editTextWrapper;
        TextInputLayout textInputLayout = (TextInputLayout) b.a(view, R.id.editTextWrapper);
        if (textInputLayout != null) {
            i10 = R.id.experienceEditText;
            TextInputEditText textInputEditText = (TextInputEditText) b.a(view, R.id.experienceEditText);
            if (textInputEditText != null) {
                i10 = R.id.experienceIconBackgroundView;
                View a10 = b.a(view, R.id.experienceIconBackgroundView);
                if (a10 != null) {
                    i10 = R.id.experienceIconView;
                    ImageView imageView = (ImageView) b.a(view, R.id.experienceIconView);
                    if (imageView != null) {
                        i10 = R.id.goldEditText;
                        TextInputEditText textInputEditText2 = (TextInputEditText) b.a(view, R.id.goldEditText);
                        if (textInputEditText2 != null) {
                            i10 = R.id.goldIconBackgroundView;
                            View a11 = b.a(view, R.id.goldIconBackgroundView);
                            if (a11 != null) {
                                i10 = R.id.goldIconView;
                                ImageView imageView2 = (ImageView) b.a(view, R.id.goldIconView);
                                if (imageView2 != null) {
                                    i10 = R.id.healthEditText;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) b.a(view, R.id.healthEditText);
                                    if (textInputEditText3 != null) {
                                        i10 = R.id.healthIconBackgroundView;
                                        View a12 = b.a(view, R.id.healthIconBackgroundView);
                                        if (a12 != null) {
                                            i10 = R.id.healthIconView;
                                            ImageView imageView3 = (ImageView) b.a(view, R.id.healthIconView);
                                            if (imageView3 != null) {
                                                i10 = R.id.levelEditText;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) b.a(view, R.id.levelEditText);
                                                if (textInputEditText4 != null) {
                                                    i10 = R.id.levelIconBackgroundView;
                                                    View a13 = b.a(view, R.id.levelIconBackgroundView);
                                                    if (a13 != null) {
                                                        i10 = R.id.levelIconView;
                                                        ImageView imageView4 = (ImageView) b.a(view, R.id.levelIconView);
                                                        if (imageView4 != null) {
                                                            i10 = R.id.manaEditText;
                                                            TextInputEditText textInputEditText5 = (TextInputEditText) b.a(view, R.id.manaEditText);
                                                            if (textInputEditText5 != null) {
                                                                i10 = R.id.manaIconBackgroundView;
                                                                View a14 = b.a(view, R.id.manaIconBackgroundView);
                                                                if (a14 != null) {
                                                                    i10 = R.id.manaIconView;
                                                                    ImageView imageView5 = (ImageView) b.a(view, R.id.manaIconView);
                                                                    if (imageView5 != null) {
                                                                        i10 = R.id.streakEditText;
                                                                        TextInputEditText textInputEditText6 = (TextInputEditText) b.a(view, R.id.streakEditText);
                                                                        if (textInputEditText6 != null) {
                                                                            i10 = R.id.streakEditTextWrapper;
                                                                            TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, R.id.streakEditTextWrapper);
                                                                            if (textInputLayout2 != null) {
                                                                                i10 = R.id.streakIconBackgroundView;
                                                                                View a15 = b.a(view, R.id.streakIconBackgroundView);
                                                                                if (a15 != null) {
                                                                                    i10 = R.id.streakIconView;
                                                                                    ImageView imageView6 = (ImageView) b.a(view, R.id.streakIconView);
                                                                                    if (imageView6 != null) {
                                                                                        i10 = R.id.toolbar;
                                                                                        Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                                                                        if (toolbar != null) {
                                                                                            return new ActivityFixcharacterBinding((LinearLayout) view, textInputLayout, textInputEditText, a10, imageView, textInputEditText2, a11, imageView2, textInputEditText3, a12, imageView3, textInputEditText4, a13, imageView4, textInputEditText5, a14, imageView5, textInputEditText6, textInputLayout2, a15, imageView6, toolbar);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityFixcharacterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFixcharacterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_fixcharacter, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
