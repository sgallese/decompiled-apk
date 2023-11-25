package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ProfileAttributetablerowBinding implements a {
    private final TableRow rootView;
    public final TextView tvAttributeCon;
    public final TextView tvAttributeInt;
    public final TextView tvAttributePer;
    public final TextView tvAttributeStr;
    public final TextView tvAttributeType;

    private ProfileAttributetablerowBinding(TableRow tableRow, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = tableRow;
        this.tvAttributeCon = textView;
        this.tvAttributeInt = textView2;
        this.tvAttributePer = textView3;
        this.tvAttributeStr = textView4;
        this.tvAttributeType = textView5;
    }

    public static ProfileAttributetablerowBinding bind(View view) {
        int i10 = R.id.tv_attribute_con;
        TextView textView = (TextView) b.a(view, R.id.tv_attribute_con);
        if (textView != null) {
            i10 = R.id.tv_attribute_int;
            TextView textView2 = (TextView) b.a(view, R.id.tv_attribute_int);
            if (textView2 != null) {
                i10 = R.id.tv_attribute_per;
                TextView textView3 = (TextView) b.a(view, R.id.tv_attribute_per);
                if (textView3 != null) {
                    i10 = R.id.tv_attribute_str;
                    TextView textView4 = (TextView) b.a(view, R.id.tv_attribute_str);
                    if (textView4 != null) {
                        i10 = R.id.tv_attribute_type;
                        TextView textView5 = (TextView) b.a(view, R.id.tv_attribute_type);
                        if (textView5 != null) {
                            return new ProfileAttributetablerowBinding((TableRow) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ProfileAttributetablerowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ProfileAttributetablerowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.profile_attributetablerow, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public TableRow getRoot() {
        return this.rootView;
    }
}
