package com.habitrpg.android.habitica.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import qc.q;

/* compiled from: SimpleSpinnerAdapter.kt */
/* loaded from: classes4.dex */
public final class SimpleSpinnerAdapter extends ArrayAdapter<CharSequence> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleSpinnerAdapter(Context context, int i10) {
        super(context, i10, (int) R.id.textView, context.getResources().getTextArray(i10));
        q.i(context, "context");
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        q.i(viewGroup, "parent");
        View inflate = ViewGroupExt.inflate(viewGroup, R.layout.spinner_item, false);
        if (inflate == null) {
            inflate = new View(getContext());
        }
        if (inflate instanceof TextView) {
            textView = (TextView) inflate;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText((CharSequence) getItem(i10));
        }
        return inflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        q.i(viewGroup, "parent");
        if (view == null) {
            view = ViewGroupExt.inflate(viewGroup, 17367048, false);
        }
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText((CharSequence) getItem(i10));
        }
        return view;
    }
}
