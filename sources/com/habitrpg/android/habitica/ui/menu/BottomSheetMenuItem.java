package com.habitrpg.android.habitica.ui.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.MenuBottomSheetItemBinding;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import qc.h;
import qc.q;

/* compiled from: BottomSheetMenuItem.kt */
/* loaded from: classes4.dex */
public final class BottomSheetMenuItem {
    public static final int $stable = 0;
    private final String currency;
    private final boolean isDestructive;
    private final double price;
    private final String title;

    public BottomSheetMenuItem(String str, boolean z10, String str2, double d10) {
        q.i(str, "title");
        this.title = str;
        this.isDestructive = z10;
        this.currency = str2;
        this.price = d10;
    }

    public final View inflate(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(context, "context");
        q.i(layoutInflater, "inflater");
        q.i(viewGroup, "contentView");
        MenuBottomSheetItemBinding inflate = MenuBottomSheetItemBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        inflate.textView.setText(this.title);
        if (this.isDestructive) {
            inflate.getRoot().setBackgroundTintList(ColorStateList.valueOf(a.c(context, R.color.maroon_100)));
        }
        if (this.price > 0.0d) {
            CurrencyView currencyView = inflate.currencyView;
            String str = this.currency;
            if (str == null) {
                str = "gold";
            }
            currencyView.setCurrency(str);
            inflate.currencyView.setValue(this.price);
            inflate.currencyView.setTextColor(a.c(context, R.color.white));
        }
        LinearLayout root = inflate.getRoot();
        q.h(root, "getRoot(...)");
        return root;
    }

    public /* synthetic */ BottomSheetMenuItem(String str, boolean z10, String str2, double d10, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? 0.0d : d10);
    }
}
