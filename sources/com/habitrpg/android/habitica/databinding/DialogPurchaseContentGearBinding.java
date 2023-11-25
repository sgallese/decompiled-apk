package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseContentGearBinding implements a {
    public final TextView amountErrorLabel;
    public final TextView conLabel;
    public final TextView conValue;
    public final PixelArtView imageView;
    public final TextView intLabel;
    public final TextView intValue;
    public final TextView notesTextView;
    public final TextView perLabel;
    public final TextView perValue;
    private final View rootView;
    public final TextView strLabel;
    public final TextView strValue;
    public final TextView titleTextView;

    private DialogPurchaseContentGearBinding(View view, TextView textView, TextView textView2, TextView textView3, PixelArtView pixelArtView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = view;
        this.amountErrorLabel = textView;
        this.conLabel = textView2;
        this.conValue = textView3;
        this.imageView = pixelArtView;
        this.intLabel = textView4;
        this.intValue = textView5;
        this.notesTextView = textView6;
        this.perLabel = textView7;
        this.perValue = textView8;
        this.strLabel = textView9;
        this.strValue = textView10;
        this.titleTextView = textView11;
    }

    public static DialogPurchaseContentGearBinding bind(View view) {
        int i10 = R.id.amount_error_label;
        TextView textView = (TextView) b.a(view, R.id.amount_error_label);
        if (textView != null) {
            i10 = R.id.con_label;
            TextView textView2 = (TextView) b.a(view, R.id.con_label);
            if (textView2 != null) {
                i10 = R.id.con_value;
                TextView textView3 = (TextView) b.a(view, R.id.con_value);
                if (textView3 != null) {
                    i10 = R.id.imageView;
                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
                    if (pixelArtView != null) {
                        i10 = R.id.int_label;
                        TextView textView4 = (TextView) b.a(view, R.id.int_label);
                        if (textView4 != null) {
                            i10 = R.id.int_value;
                            TextView textView5 = (TextView) b.a(view, R.id.int_value);
                            if (textView5 != null) {
                                i10 = R.id.notesTextView;
                                TextView textView6 = (TextView) b.a(view, R.id.notesTextView);
                                if (textView6 != null) {
                                    i10 = R.id.per_label;
                                    TextView textView7 = (TextView) b.a(view, R.id.per_label);
                                    if (textView7 != null) {
                                        i10 = R.id.per_value;
                                        TextView textView8 = (TextView) b.a(view, R.id.per_value);
                                        if (textView8 != null) {
                                            i10 = R.id.str_label;
                                            TextView textView9 = (TextView) b.a(view, R.id.str_label);
                                            if (textView9 != null) {
                                                i10 = R.id.str_value;
                                                TextView textView10 = (TextView) b.a(view, R.id.str_value);
                                                if (textView10 != null) {
                                                    i10 = R.id.titleTextView;
                                                    TextView textView11 = (TextView) b.a(view, R.id.titleTextView);
                                                    if (textView11 != null) {
                                                        return new DialogPurchaseContentGearBinding(view, textView, textView2, textView3, pixelArtView, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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

    public static DialogPurchaseContentGearBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dialog_purchase_content_gear, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
