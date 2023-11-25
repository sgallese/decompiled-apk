package com.habitrpg.android.habitica.ui.views;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import ec.p;
import qc.q;

/* compiled from: HabiticaListPreference.kt */
/* loaded from: classes4.dex */
public final class HabiticaListPreference extends ListPreference {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        q.i(context, "context");
    }

    private final int getValueIndex() {
        int S;
        CharSequence[] entryValues = getEntryValues();
        q.h(entryValues, "getEntryValues(...)");
        S = p.S(entryValues, getValue());
        return S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$0(HabiticaListPreference habiticaListPreference, DialogInterface dialogInterface, int i10) {
        q.i(habiticaListPreference, "this$0");
        int i11 = i10 - 1;
        if (habiticaListPreference.callChangeListener(habiticaListPreference.getEntryValues()[i11].toString())) {
            habiticaListPreference.setValueIndex(i11);
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void onClick() {
        View decorView;
        TextView textView = new TextView(getContext());
        textView.setText(R.string.cds_subtitle);
        AlertDialog create = new AlertDialog.Builder(getContext()).setSingleChoiceItems(getEntries(), getValueIndex() + 1, new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HabiticaListPreference.onClick$lambda$0(HabiticaListPreference.this, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }).setTitle(getTitle()).create();
        ViewExtKt.setScaledPadding(textView, getContext(), 24, 0, 24, 8);
        create.getListView().addHeaderView(textView);
        Window window = create.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackgroundResource(R.color.window_background);
        }
        create.show();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaListPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaListPreference(Context context) {
        super(context);
        q.i(context, "context");
    }
}
