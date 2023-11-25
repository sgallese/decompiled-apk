package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: HabitViewHolder.kt */
/* loaded from: classes4.dex */
public final class HabitViewHolder extends BaseTaskViewHolder {
    public static final int $stable = 8;
    private final Button btnMinus;
    private final View btnMinusCircleView;
    private final ImageView btnMinusIconView;
    private final FrameLayout btnMinusWrapper;
    private final Button btnPlus;
    private final View btnPlusCircleView;
    private final ImageView btnPlusIconView;
    private final FrameLayout btnPlusWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitViewHolder(View view, p<? super Task, ? super TaskDirection, w> pVar, l<? super dc.l<? extends Task, ? extends View>, w> lVar, l<? super Task, w> lVar2, GroupPlanInfoProvider groupPlanInfoProvider) {
        super(view, pVar, lVar, lVar2, groupPlanInfoProvider);
        q.i(view, "itemView");
        q.i(pVar, "scoreTaskFunc");
        q.i(lVar, "openTaskFunc");
        q.i(lVar2, "brokenTaskFunc");
        View findViewById = view.findViewById(R.id.btnPlusWrapper);
        q.h(findViewById, "findViewById(...)");
        this.btnPlusWrapper = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.btnPlusIconView);
        q.h(findViewById2, "findViewById(...)");
        this.btnPlusIconView = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.button_plus_circle_view);
        q.h(findViewById3, "findViewById(...)");
        this.btnPlusCircleView = findViewById3;
        View findViewById4 = view.findViewById(R.id.btnPlus);
        q.h(findViewById4, "findViewById(...)");
        Button button = (Button) findViewById4;
        this.btnPlus = button;
        View findViewById5 = view.findViewById(R.id.btnMinusWrapper);
        q.h(findViewById5, "findViewById(...)");
        this.btnMinusWrapper = (FrameLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.btnMinusIconView);
        q.h(findViewById6, "findViewById(...)");
        this.btnMinusIconView = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.button_minus_circle_view);
        q.h(findViewById7, "findViewById(...)");
        this.btnMinusCircleView = findViewById7;
        View findViewById8 = view.findViewById(R.id.btnMinus);
        q.h(findViewById8, "findViewById(...)");
        Button button2 = (Button) findViewById8;
        this.btnMinus = button2;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HabitViewHolder._init_$lambda$0(HabitViewHolder.this, view2);
            }
        });
        button.setClickable(true);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HabitViewHolder._init_$lambda$1(HabitViewHolder.this, view2);
            }
        });
        button2.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HabitViewHolder habitViewHolder, View view) {
        q.i(habitViewHolder, "this$0");
        habitViewHolder.onPlusButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HabitViewHolder habitViewHolder, View view) {
        q.i(habitViewHolder, "this$0");
        habitViewHolder.onMinusButtonClicked();
    }

    private final void onMinusButtonClicked() {
        boolean z10;
        Task task;
        Task task2 = getTask();
        if (task2 != null) {
            z10 = q.d(task2.getDown(), Boolean.TRUE);
        } else {
            z10 = false;
        }
        if (z10 && (task = getTask()) != null) {
            getScoreTaskFunc().invoke(task, TaskDirection.DOWN);
        }
    }

    private final void onPlusButtonClicked() {
        boolean z10;
        Task task;
        Task task2 = getTask();
        if (task2 != null) {
            z10 = q.d(task2.getUp(), Boolean.TRUE);
        } else {
            z10 = false;
        }
        if (z10 && (task = getTask()) != null) {
            getScoreTaskFunc().invoke(task, TaskDirection.UP);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(com.habitrpg.android.habitica.models.tasks.Task r17, int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewHolders.tasks.HabitViewHolder.bind(com.habitrpg.android.habitica.models.tasks.Task, int, java.lang.String, java.lang.String):void");
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void onLeftActionTouched() {
        super.onLeftActionTouched();
        if (!isLocked()) {
            onPlusButtonClicked();
        }
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void onRightActionTouched() {
        super.onRightActionTouched();
        if (!isLocked()) {
            onMinusButtonClicked();
        }
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void setDisabled(boolean z10, boolean z11) {
        super.setDisabled(z10, z11);
        this.btnPlus.setEnabled(!z11);
        this.btnMinus.setEnabled(!z11);
    }
}
