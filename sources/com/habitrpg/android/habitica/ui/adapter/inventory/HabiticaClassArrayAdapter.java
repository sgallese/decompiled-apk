package com.habitrpg.android.habitica.ui.adapter.inventory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import java.util.List;
import qc.q;

/* compiled from: HabiticaClassArrayAdapter.kt */
/* loaded from: classes4.dex */
public final class HabiticaClassArrayAdapter extends ArrayAdapter<CharSequence> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaClassArrayAdapter(Context context, int i10, List<? extends CharSequence> list) {
        super(context, i10, (int) R.id.textView, list);
        q.i(context, "context");
        q.i(list, "objects");
    }

    private final View createView(int i10, View view) {
        TextView textView;
        ImageView imageView;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.textView);
        } else {
            textView = null;
        }
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.classIconView);
        } else {
            imageView = null;
        }
        CharSequence charSequence = (CharSequence) getItem(i10);
        if (q.d(charSequence, Stats.WARRIOR)) {
            if (textView != null) {
                textView.setText(getContext().getString(R.string.warrior));
            }
            if (textView != null) {
                textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_red));
            }
            if (imageView != null) {
                imageView.setImageBitmap(HabiticaIconsHelper.imageOfWarriorLightBg());
            }
        } else if (q.d(charSequence, Stats.MAGE)) {
            if (textView != null) {
                textView.setText(getContext().getString(R.string.mage));
            }
            if (textView != null) {
                textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_blue));
            }
            if (imageView != null) {
                imageView.setImageBitmap(HabiticaIconsHelper.imageOfMageLightBg());
            }
        } else if (q.d(charSequence, Stats.HEALER)) {
            if (textView != null) {
                textView.setText(getContext().getString(R.string.healer));
            }
            if (textView != null) {
                textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_yellow));
            }
            if (imageView != null) {
                imageView.setImageBitmap(HabiticaIconsHelper.imageOfHealerLightBg());
            }
        } else if (q.d(charSequence, Stats.ROGUE)) {
            if (textView != null) {
                textView.setText(getContext().getString(R.string.rogue));
            }
            if (textView != null) {
                textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_brand));
            }
            if (imageView != null) {
                imageView.setImageBitmap(HabiticaIconsHelper.imageOfRogueLightBg());
            }
        } else {
            if (textView != null) {
                textView.setText(getContext().getString(R.string.classless));
            }
            if (textView != null) {
                textView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_primary));
            }
            if (imageView != null) {
                imageView.setImageBitmap(null);
            }
        }
        if (view == null) {
            return new View(getContext());
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            if (viewGroup != null) {
                view = ViewGroupExt.inflate(viewGroup, R.layout.class_spinner_dropdown_item, false);
            } else {
                view = null;
            }
        }
        return createView(i10, view);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        q.i(viewGroup, "parent");
        if (view == null) {
            view = ViewGroupExt.inflate(viewGroup, R.layout.class_spinner_dropdown_item_selected, false);
        }
        return createView(i10, view);
    }
}
