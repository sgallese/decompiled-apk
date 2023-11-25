package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.AvatarView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PurchaseDialogBackgroundBinding implements a {
    public final AvatarView avatarView;
    public final TextView notesTextView;
    private final View rootView;
    public final TextView titleTextView;

    private PurchaseDialogBackgroundBinding(View view, AvatarView avatarView, TextView textView, TextView textView2) {
        this.rootView = view;
        this.avatarView = avatarView;
        this.notesTextView = textView;
        this.titleTextView = textView2;
    }

    public static PurchaseDialogBackgroundBinding bind(View view) {
        int i10 = R.id.avatar_view;
        AvatarView avatarView = (AvatarView) b.a(view, R.id.avatar_view);
        if (avatarView != null) {
            i10 = R.id.notesTextView;
            TextView textView = (TextView) b.a(view, R.id.notesTextView);
            if (textView != null) {
                i10 = R.id.titleTextView;
                TextView textView2 = (TextView) b.a(view, R.id.titleTextView);
                if (textView2 != null) {
                    return new PurchaseDialogBackgroundBinding(view, avatarView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PurchaseDialogBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.purchase_dialog_background, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
