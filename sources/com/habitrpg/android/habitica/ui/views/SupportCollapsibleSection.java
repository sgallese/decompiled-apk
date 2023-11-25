package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.t0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.SupportCollapsibleSectionBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import ec.t;
import qc.q;
import xc.o;

/* compiled from: SupportCollapsibleSection.kt */
/* loaded from: classes4.dex */
public final class SupportCollapsibleSection extends LinearLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCollapsibleSection(Context context) {
        super(context);
        q.i(context, "context");
        init(null, 0);
    }

    private final void init(AttributeSet attributeSet, int i10) {
        Context context = getContext();
        q.h(context, "getContext(...)");
        final SupportCollapsibleSectionBinding inflate = SupportCollapsibleSectionBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SupportCollapsibleSection, i10, 0);
        q.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setOrientation(1);
        inflate.titleView.setText(obtainStyledAttributes.getString(3));
        inflate.subtitleView.setText(obtainStyledAttributes.getString(2));
        inflate.descriptionView.setText(MarkdownParser.INSTANCE.parseMarkdown(obtainStyledAttributes.getString(0)));
        inflate.titleView.setTextColor(obtainStyledAttributes.getColor(4, androidx.core.content.a.c(getContext(), R.color.text_primary)));
        setBackground(androidx.core.content.a.e(getContext(), R.drawable.layout_rounded_bg_window));
        obtainStyledAttributes.recycle();
        setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupportCollapsibleSection.init$lambda$1(SupportCollapsibleSectionBinding.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(SupportCollapsibleSectionBinding supportCollapsibleSectionBinding, SupportCollapsibleSection supportCollapsibleSection, View view) {
        boolean z10;
        int q10;
        int i10;
        q.i(supportCollapsibleSectionBinding, "$binding");
        q.i(supportCollapsibleSection, "this$0");
        if (supportCollapsibleSectionBinding.descriptionView.getVisibility() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            supportCollapsibleSectionBinding.caretView.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
        } else {
            supportCollapsibleSectionBinding.caretView.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
        }
        xc.g<View> a10 = t0.a(supportCollapsibleSection);
        TextView textView = supportCollapsibleSectionBinding.descriptionView;
        q.h(textView, "descriptionView");
        q10 = o.q(a10, textView);
        int i11 = 0;
        for (View view2 : t0.a(supportCollapsibleSection)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                t.r();
            }
            View view3 = view2;
            if (i11 >= q10) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                view3.setVisibility(i10);
            }
            i11 = i12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCollapsibleSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        init(attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCollapsibleSection(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        init(attributeSet, i10);
    }
}
