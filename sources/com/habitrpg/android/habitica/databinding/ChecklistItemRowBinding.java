package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.EllipsisTextView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ChecklistItemRowBinding implements a {
    public final View checkBoxBackground;
    public final FrameLayout checkBoxHolder;
    public final EllipsisTextView checkedTextView;
    public final ImageView checkmark;
    private final LinearLayout rootView;

    private ChecklistItemRowBinding(LinearLayout linearLayout, View view, FrameLayout frameLayout, EllipsisTextView ellipsisTextView, ImageView imageView) {
        this.rootView = linearLayout;
        this.checkBoxBackground = view;
        this.checkBoxHolder = frameLayout;
        this.checkedTextView = ellipsisTextView;
        this.checkmark = imageView;
    }

    public static ChecklistItemRowBinding bind(View view) {
        int i10 = R.id.checkBoxBackground;
        View a10 = b.a(view, R.id.checkBoxBackground);
        if (a10 != null) {
            i10 = R.id.checkBoxHolder;
            FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.checkBoxHolder);
            if (frameLayout != null) {
                i10 = R.id.checkedTextView;
                EllipsisTextView ellipsisTextView = (EllipsisTextView) b.a(view, R.id.checkedTextView);
                if (ellipsisTextView != null) {
                    i10 = R.id.checkmark;
                    ImageView imageView = (ImageView) b.a(view, R.id.checkmark);
                    if (imageView != null) {
                        return new ChecklistItemRowBinding((LinearLayout) view, a10, frameLayout, ellipsisTextView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ChecklistItemRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ChecklistItemRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.checklist_item_row, viewGroup, false);
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
