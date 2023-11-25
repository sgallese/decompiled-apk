package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class DialogLoginIncentiveBinding implements a {
    public final PixelArtView imageView;
    public final TextView nextUnlockMessage;
    private final LinearLayout rootView;
    public final TextView youEarnedMessage;

    private DialogLoginIncentiveBinding(LinearLayout linearLayout, PixelArtView pixelArtView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.imageView = pixelArtView;
        this.nextUnlockMessage = textView;
        this.youEarnedMessage = textView2;
    }

    public static DialogLoginIncentiveBinding bind(View view) {
        int i10 = R.id.imageView;
        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.imageView);
        if (pixelArtView != null) {
            i10 = R.id.next_unlock_message;
            TextView textView = (TextView) b.a(view, R.id.next_unlock_message);
            if (textView != null) {
                i10 = R.id.you_earned_message;
                TextView textView2 = (TextView) b.a(view, R.id.you_earned_message);
                if (textView2 != null) {
                    return new DialogLoginIncentiveBinding((LinearLayout) view, pixelArtView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogLoginIncentiveBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogLoginIncentiveBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_login_incentive, viewGroup, false);
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
