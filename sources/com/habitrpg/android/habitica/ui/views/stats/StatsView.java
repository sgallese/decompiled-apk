package com.habitrpg.android.habitica.ui.views.stats;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.StatsViewBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import dc.w;
import qc.q;

/* compiled from: StatsView.kt */
/* loaded from: classes4.dex */
public final class StatsView extends LinearLayout {
    public static final int $stable = 8;
    private pc.a<w> allocateAction;
    private int allocatedValue;
    private final StatsViewBinding binding;
    private int buffValue;
    private boolean canDistributePoints;
    private int equipmentValue;
    private int levelValue;
    private int statColor;
    private int totalValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        q.i(context, "context");
        StatsViewBinding inflate = StatsViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        Resources.Theme theme = context.getTheme();
        if (theme != null) {
            typedArray = theme.obtainStyledAttributes(attributeSet, R.styleable.StatsView, 0, 0);
        } else {
            typedArray = null;
        }
        Drawable e10 = androidx.core.content.a.e(context, R.drawable.layout_top_rounded_bg_white);
        if (typedArray != null) {
            this.statColor = typedArray.getColor(0, 0);
            if (e10 != null) {
                DrawableExtendsionsKt.setTintWith(e10, typedArray.getColor(2, 0), PorterDuff.Mode.MULTIPLY);
            }
            inflate.titleTextView.setText(typedArray.getString(1));
        }
        inflate.titleWrapper.setBackground(e10);
        inflate.allocateButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.stats.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StatsView._init_$lambda$0(StatsView.this, view);
            }
        });
        inflate.allocateButton.setImageBitmap(HabiticaIconsHelper.imageOfAttributeAllocateButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(StatsView statsView, View view) {
        q.i(statsView, "this$0");
        HapticFeedbackManager.Companion.tap(statsView);
        pc.a<w> aVar = statsView.allocateAction;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final pc.a<w> getAllocateAction() {
        return this.allocateAction;
    }

    public final int getAllocatedValue() {
        return this.allocatedValue;
    }

    public final int getBuffValue() {
        return this.buffValue;
    }

    public final boolean getCanDistributePoints() {
        return this.canDistributePoints;
    }

    public final int getEquipmentValue() {
        return this.equipmentValue;
    }

    public final int getLevelValue() {
        return this.levelValue;
    }

    public final int getTotalValue() {
        return this.totalValue;
    }

    public final void setAllocateAction(pc.a<w> aVar) {
        this.allocateAction = aVar;
    }

    public final void setAllocatedValue(int i10) {
        this.allocatedValue = i10;
        this.binding.allocatedValueTextView.setText(String.valueOf(i10));
    }

    public final void setBuffValue(int i10) {
        this.buffValue = i10;
        this.binding.buffValueTextView.setText(String.valueOf(i10));
    }

    public final void setCanDistributePoints(boolean z10) {
        int i10;
        this.canDistributePoints = z10;
        ImageButton imageButton = this.binding.allocateButton;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageButton.setVisibility(i10);
        if (z10) {
            this.binding.allocatedWrapper.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.offset_background_30));
            this.binding.allocateButton.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.offset_background_30));
            this.binding.allocatedValueTextView.setTextColor(this.statColor);
            this.binding.allocatedLabelView.setTextColor(this.statColor);
            return;
        }
        LinearLayout linearLayout = this.binding.allocatedWrapper;
        Context context = getContext();
        q.h(context, "getContext(...)");
        linearLayout.setBackgroundColor(ContextExtensionsKt.getThemeColor(context, R.attr.colorWindowBackground));
        ImageButton imageButton2 = this.binding.allocateButton;
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        imageButton2.setBackgroundColor(ContextExtensionsKt.getThemeColor(context2, R.attr.colorWindowBackground));
        this.binding.allocatedValueTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_primary));
        this.binding.allocatedLabelView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_quad));
    }

    public final void setEquipmentValue(int i10) {
        this.equipmentValue = i10;
        this.binding.equipmentValueTextView.setText(String.valueOf(i10));
    }

    public final void setLevelValue(int i10) {
        this.levelValue = i10;
        this.binding.levelValueTextView.setText(String.valueOf(i10));
    }

    public final void setTotalValue(int i10) {
        this.totalValue = i10;
        this.binding.totalValueTextView.setText(String.valueOf(i10));
    }
}
