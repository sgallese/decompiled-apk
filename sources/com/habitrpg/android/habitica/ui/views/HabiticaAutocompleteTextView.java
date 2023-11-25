package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.p;
import qc.q;

/* compiled from: HabiticaAutocompleteTextView.kt */
/* loaded from: classes4.dex */
public final class HabiticaAutocompleteTextView extends p {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaAutocompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        setInputType(getInputType() & (getInputType() ^ 65536));
    }
}
