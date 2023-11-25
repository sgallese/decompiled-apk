package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityMaintenanceBinding implements a {
    public final TextView descriptionTextView;
    public final ImageView imageView;
    public final Button playStoreButton;
    private final ScrollView rootView;
    public final TextView titleTextView;

    private ActivityMaintenanceBinding(ScrollView scrollView, TextView textView, ImageView imageView, Button button, TextView textView2) {
        this.rootView = scrollView;
        this.descriptionTextView = textView;
        this.imageView = imageView;
        this.playStoreButton = button;
        this.titleTextView = textView2;
    }

    public static ActivityMaintenanceBinding bind(View view) {
        int i10 = R.id.descriptionTextView;
        TextView textView = (TextView) b.a(view, R.id.descriptionTextView);
        if (textView != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) b.a(view, R.id.imageView);
            if (imageView != null) {
                i10 = R.id.playStoreButton;
                Button button = (Button) b.a(view, R.id.playStoreButton);
                if (button != null) {
                    i10 = R.id.titleTextView;
                    TextView textView2 = (TextView) b.a(view, R.id.titleTextView);
                    if (textView2 != null) {
                        return new ActivityMaintenanceBinding((ScrollView) view, textView, imageView, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityMaintenanceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMaintenanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_maintenance, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}
