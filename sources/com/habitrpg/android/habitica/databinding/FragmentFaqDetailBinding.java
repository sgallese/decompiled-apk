package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentFaqDetailBinding implements a {
    public final TextView answerTextView;
    public final TextView questionTextView;
    private final NestedScrollView rootView;

    private FragmentFaqDetailBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2) {
        this.rootView = nestedScrollView;
        this.answerTextView = textView;
        this.questionTextView = textView2;
    }

    public static FragmentFaqDetailBinding bind(View view) {
        int i10 = R.id.answerTextView;
        TextView textView = (TextView) b.a(view, R.id.answerTextView);
        if (textView != null) {
            i10 = R.id.questionTextView;
            TextView textView2 = (TextView) b.a(view, R.id.questionTextView);
            if (textView2 != null) {
                return new FragmentFaqDetailBinding((NestedScrollView) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFaqDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFaqDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_faq_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
