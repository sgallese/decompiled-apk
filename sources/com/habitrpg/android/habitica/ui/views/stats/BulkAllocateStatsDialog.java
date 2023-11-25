package com.habitrpg.android.habitica.ui.views.stats;

import ad.i;
import ad.l0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.DialogBulkAllocateBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import qc.q;

/* compiled from: BulkAllocateStatsDialog.kt */
/* loaded from: classes4.dex */
public final class BulkAllocateStatsDialog extends androidx.appcompat.app.c {
    public static final int $stable = 8;
    private final DialogBulkAllocateBinding binding;
    private int pointsToAllocate;
    private final UserRepository userRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkAllocateStatsDialog(Context context, UserRepository userRepository) {
        super(context);
        q.i(context, "context");
        q.i(userRepository, "userRepository");
        this.userRepository = userRepository;
        DialogBulkAllocateBinding inflate = DialogBulkAllocateBinding.inflate(ContextExtensionsKt.getLayoutInflater(context));
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setView(inflate.getRoot());
        setButton(-1, context.getString(R.string.save), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.stats.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                BulkAllocateStatsDialog._init_$lambda$0(BulkAllocateStatsDialog.this, dialogInterface, i10);
            }
        });
        setButton(-3, context.getString(R.string.action_cancel), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.stats.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                BulkAllocateStatsDialog._init_$lambda$1(BulkAllocateStatsDialog.this, dialogInterface, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BulkAllocateStatsDialog bulkAllocateStatsDialog, DialogInterface dialogInterface, int i10) {
        q.i(bulkAllocateStatsDialog, "this$0");
        bulkAllocateStatsDialog.saveChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BulkAllocateStatsDialog bulkAllocateStatsDialog, DialogInterface dialogInterface, int i10) {
        q.i(bulkAllocateStatsDialog, "this$0");
        bulkAllocateStatsDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkRedistribution(StatsSliderView statsSliderView) {
        int allocatedPoints = getAllocatedPoints() - this.pointsToAllocate;
        if (allocatedPoints > 0) {
            StatsSliderView statsSliderView2 = null;
            if (!q.d(statsSliderView, this.binding.strengthSliderView)) {
                statsSliderView2 = getSliderWithHigherValue(null, this.binding.strengthSliderView);
            }
            if (!q.d(statsSliderView, this.binding.intelligenceSliderView)) {
                statsSliderView2 = getSliderWithHigherValue(statsSliderView2, this.binding.intelligenceSliderView);
            }
            if (!q.d(statsSliderView, this.binding.constitutionSliderView)) {
                statsSliderView2 = getSliderWithHigherValue(statsSliderView2, this.binding.constitutionSliderView);
            }
            if (!q.d(statsSliderView, this.binding.perceptionSliderView)) {
                statsSliderView2 = getSliderWithHigherValue(statsSliderView2, this.binding.perceptionSliderView);
            }
            if (statsSliderView2 != null) {
                statsSliderView2.setCurrentValue(statsSliderView2.getCurrentValue() - allocatedPoints);
            }
        }
    }

    private final int getAllocatedPoints() {
        return this.binding.strengthSliderView.getCurrentValue() + 0 + this.binding.intelligenceSliderView.getCurrentValue() + this.binding.constitutionSliderView.getCurrentValue() + this.binding.perceptionSliderView.getCurrentValue();
    }

    private final StatsSliderView getSliderWithHigherValue(StatsSliderView statsSliderView, StatsSliderView statsSliderView2) {
        int i10;
        int i11 = 0;
        if (statsSliderView != null) {
            i10 = statsSliderView.getCurrentValue();
        } else {
            i10 = 0;
        }
        if (statsSliderView2 != null) {
            i11 = statsSliderView2.getCurrentValue();
        }
        if (i10 <= i11) {
            return statsSliderView2;
        }
        return statsSliderView;
    }

    private final void saveChanges() {
        getButton(-1).setEnabled(false);
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new BulkAllocateStatsDialog$saveChanges$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPointsToAllocate(int i10) {
        this.pointsToAllocate = i10;
        updateTitle();
        this.binding.strengthSliderView.setMaxValue(this.pointsToAllocate);
        this.binding.intelligenceSliderView.setMaxValue(this.pointsToAllocate);
        this.binding.constitutionSliderView.setMaxValue(this.pointsToAllocate);
        this.binding.perceptionSliderView.setMaxValue(this.pointsToAllocate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    public final void updateTitle() {
        boolean z10;
        this.binding.allocatedTitle.setText(getAllocatedPoints() + "/" + this.pointsToAllocate);
        if (getAllocatedPoints() > 0) {
            LinearLayout linearLayout = this.binding.titleView;
            Context context = getContext();
            q.h(context, "getContext(...)");
            linearLayout.setBackgroundColor(ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent));
        } else {
            this.binding.titleView.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.disabled_background));
        }
        Button button = getButton(-1);
        if (getAllocatedPoints() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        button.setEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.appcompat.app.x, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new BulkAllocateStatsDialog$onCreate$1(this, null), 2, null);
        this.binding.strengthSliderView.setAllocateAction(new BulkAllocateStatsDialog$onCreate$2(this));
        this.binding.intelligenceSliderView.setAllocateAction(new BulkAllocateStatsDialog$onCreate$3(this));
        this.binding.constitutionSliderView.setAllocateAction(new BulkAllocateStatsDialog$onCreate$4(this));
        this.binding.perceptionSliderView.setAllocateAction(new BulkAllocateStatsDialog$onCreate$5(this));
    }
}
