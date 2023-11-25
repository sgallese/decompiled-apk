package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.habitrpg.android.habitica.R;
import qc.q;

/* compiled from: ExtraLabelPreference.kt */
/* loaded from: classes4.dex */
public final class ExtraLabelPreference extends Preference {
    public static final int $stable = 8;
    private String extraText;
    private Integer extraTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraLabelPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        setLayoutResource(R.layout.preference_button);
    }

    public final String getExtraText() {
        return this.extraText;
    }

    public final Integer getExtraTextColor() {
        return this.extraTextColor;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.m mVar) {
        q.i(mVar, "holder");
        super.onBindViewHolder(mVar);
        TextView textView = (TextView) mVar.itemView.findViewById(R.id.extra_label);
        if (textView != null) {
            textView.setText(this.extraText);
        }
        Integer num = this.extraTextColor;
        if (num != null) {
            int intValue = num.intValue();
            if (textView != null) {
                textView.setTextColor(intValue);
            }
        }
    }

    public final void setExtraText(String str) {
        this.extraText = str;
    }

    public final void setExtraTextColor(Integer num) {
        this.extraTextColor = num;
    }
}
