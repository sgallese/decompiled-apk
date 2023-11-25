package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class NotificationItemBinding implements a {
    public final ImageView dismissButton;
    public final TextView messageText;
    public final PixelArtView notificationImage;
    public final LinearLayout notificationItem;
    private final LinearLayout rootView;

    private NotificationItemBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, PixelArtView pixelArtView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.dismissButton = imageView;
        this.messageText = textView;
        this.notificationImage = pixelArtView;
        this.notificationItem = linearLayout2;
    }

    public static NotificationItemBinding bind(View view) {
        int i10 = R.id.dismiss_button;
        ImageView imageView = (ImageView) b.a(view, R.id.dismiss_button);
        if (imageView != null) {
            i10 = R.id.message_text;
            TextView textView = (TextView) b.a(view, R.id.message_text);
            if (textView != null) {
                i10 = R.id.notification_image;
                PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.notification_image);
                if (pixelArtView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new NotificationItemBinding(linearLayout, imageView, textView, pixelArtView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static NotificationItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static NotificationItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.notification_item, viewGroup, false);
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
