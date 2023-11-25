package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.tasks.form.StepperValueFormView;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogPurchaseContentItemBinding implements a {
    public final TextView amountErrorLabel;
    public final PixelArtView imageView;
    public final TextView notesTextView;
    public final TextView purchaseImmediatelyView;
    private final View rootView;
    public final StepperValueFormView stepperView;
    public final TextView titleTextView;

    private DialogPurchaseContentItemBinding(View view, TextView textView, PixelArtView pixelArtView, TextView textView2, TextView textView3, StepperValueFormView stepperValueFormView, TextView textView4) {
        this.rootView = view;
        this.amountErrorLabel = textView;
        this.imageView = pixelArtView;
        this.notesTextView = textView2;
        this.purchaseImmediatelyView = textView3;
        this.stepperView = stepperValueFormView;
        this.titleTextView = textView4;
    }

    public static DialogPurchaseContentItemBinding bind(View view) {
        int i10 = R.id.amount_error_label;
        TextView textView = (TextView) b.a(view, R.id.amount_error_label);
        if (textView != null) {
            i10 = R.id.imageView;
            PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
            if (pixelArtView != null) {
                i10 = R.id.notesTextView;
                TextView textView2 = (TextView) b.a(view, R.id.notesTextView);
                if (textView2 != null) {
                    i10 = R.id.purchase_immediately_view;
                    TextView textView3 = (TextView) b.a(view, R.id.purchase_immediately_view);
                    if (textView3 != null) {
                        i10 = R.id.stepper_view;
                        StepperValueFormView stepperValueFormView = (StepperValueFormView) b.a(view, R.id.stepper_view);
                        if (stepperValueFormView != null) {
                            i10 = R.id.titleTextView;
                            TextView textView4 = (TextView) b.a(view, R.id.titleTextView);
                            if (textView4 != null) {
                                return new DialogPurchaseContentItemBinding(view, textView, pixelArtView, textView2, textView3, stepperValueFormView, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogPurchaseContentItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.dialog_purchase_content_item, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
