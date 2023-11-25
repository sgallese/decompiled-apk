package com.habitrpg.android.habitica.ui.views.navigation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.p0;
import androidx.core.view.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.MainNavigationViewBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: HabiticaBottomNavigationView.kt */
/* loaded from: classes4.dex */
public final class HabiticaBottomNavigationView extends RelativeLayout {
    public static final int $stable = 8;
    private TaskType activeTaskType;
    private final MainNavigationViewBinding binding;
    private boolean canAddTasks;
    private boolean isShowingSubmenu;
    private HabiticaBottomNavigationViewListener listener;

    /* compiled from: HabiticaBottomNavigationView.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.HABIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HabiticaBottomNavigationView(Context context) {
        this(context, null, 0, 6, null);
        q.i(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        habiticaBottomNavigationView.setActiveTaskType(TaskType.HABIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        habiticaBottomNavigationView.setActiveTaskType(TaskType.DAILY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        habiticaBottomNavigationView.setActiveTaskType(TaskType.TODO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        habiticaBottomNavigationView.setActiveTaskType(TaskType.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        if (habiticaBottomNavigationView.isShowingSubmenu) {
            habiticaBottomNavigationView.hideSubmenu();
        } else {
            HabiticaBottomNavigationViewListener habiticaBottomNavigationViewListener = habiticaBottomNavigationView.listener;
            if (habiticaBottomNavigationViewListener != null) {
                habiticaBottomNavigationViewListener.onAdd(habiticaBottomNavigationView.activeTaskType);
            }
        }
        habiticaBottomNavigationView.animateButtonTap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$5(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        habiticaBottomNavigationView.showSubmenu();
        habiticaBottomNavigationView.animateButtonTap();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$6(HabiticaBottomNavigationView habiticaBottomNavigationView, View view, MotionEvent motionEvent) {
        q.i(habiticaBottomNavigationView, "this$0");
        if (motionEvent.getAction() == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(habiticaBottomNavigationView.binding.addButton, "scaleX", 1.0f, 1.1f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(habiticaBottomNavigationView.binding.addButton, "scaleY", 1.0f, 1.1f);
            ofFloat2.setDuration(100L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.start();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(habiticaBottomNavigationView.binding.addButtonBackground, "scaleX", 1.0f, 0.9f);
            ofFloat3.setDuration(100L);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.start();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(habiticaBottomNavigationView.binding.addButtonBackground, "scaleY", 1.0f, 0.9f);
            ofFloat4.setDuration(100L);
            ofFloat4.setInterpolator(new LinearInterpolator());
            ofFloat4.start();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        habiticaBottomNavigationView.hideSubmenu();
    }

    private final void animateButtonTap() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.binding.addButton, "scaleX", 1.3f, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new BounceInterpolator());
        ofFloat.start();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.binding.addButton, "scaleY", 1.3f, 1.0f);
        ofFloat2.setDuration(400L);
        ofFloat2.setInterpolator(new BounceInterpolator());
        ofFloat2.start();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.binding.addButtonBackground, "scaleX", 0.9f, 1.0f);
        ofFloat3.setDuration(600L);
        ofFloat3.setInterpolator(new BounceInterpolator());
        ofFloat3.start();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.binding.addButtonBackground, "scaleY", 0.9f, 1.0f);
        ofFloat4.setDuration(600L);
        ofFloat4.setInterpolator(new BounceInterpolator());
        ofFloat4.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSubmenu() {
        int i10 = 0;
        this.isShowingSubmenu = false;
        RotateAnimation rotateAnimation = new RotateAnimation(135.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(250L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setFillAfter(true);
        this.binding.addButton.startAnimation(rotateAnimation);
        LinearLayout linearLayout = this.binding.submenuWrapper;
        q.h(linearLayout, "submenuWrapper");
        for (final View view : t0.a(linearLayout)) {
            view.setAlpha(1.0f);
            view.setScaleY(1.0f);
            p0.e(view).b(0.0f).h(200L).l(i10 * 150);
            p0.e(view).g(0.7f).h(250L).l(i10 * 100).p(new Runnable() { // from class: com.habitrpg.android.habitica.ui.views.navigation.c
                @Override // java.lang.Runnable
                public final void run() {
                    HabiticaBottomNavigationView.hideSubmenu$lambda$8(HabiticaBottomNavigationView.this, view);
                }
            });
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideSubmenu$lambda$8(HabiticaBottomNavigationView habiticaBottomNavigationView, View view) {
        q.i(habiticaBottomNavigationView, "this$0");
        q.i(view, "$view");
        habiticaBottomNavigationView.binding.submenuWrapper.removeView(view);
    }

    private final void showSubmenu() {
        List<TaskType> l10;
        int measuredTitleWidth;
        if (this.isShowingSubmenu) {
            return;
        }
        this.isShowingSubmenu = true;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 135.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(250L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setFillAfter(true);
        this.binding.addButton.startAnimation(rotateAnimation);
        this.binding.submenuWrapper.removeAllViews();
        l10 = t.l(TaskType.HABIT, TaskType.DAILY, TaskType.TODO, TaskType.REWARD);
        int i10 = 4;
        for (TaskType taskType : l10) {
            Context context = getContext();
            q.h(context, "getContext(...)");
            BottomNavigationSubmenuItem bottomNavigationSubmenuItem = new BottomNavigationSubmenuItem(context, null, 0, 6, null);
            int i11 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            bottomNavigationSubmenuItem.setIcon(androidx.core.content.a.e(getContext(), R.drawable.add_habit));
                            bottomNavigationSubmenuItem.setTitle(getContext().getString(R.string.habit));
                        }
                    } else {
                        bottomNavigationSubmenuItem.setIcon(androidx.core.content.a.e(getContext(), R.drawable.add_todo));
                        bottomNavigationSubmenuItem.setTitle(getContext().getString(R.string.todo));
                    }
                } else {
                    bottomNavigationSubmenuItem.setIcon(androidx.core.content.a.e(getContext(), R.drawable.add_rewards));
                    bottomNavigationSubmenuItem.setTitle(getContext().getString(R.string.reward));
                }
            } else {
                bottomNavigationSubmenuItem.setIcon(androidx.core.content.a.e(getContext(), R.drawable.add_daily));
                bottomNavigationSubmenuItem.setTitle(getContext().getString(R.string.daily));
            }
            bottomNavigationSubmenuItem.setOnAddListener(new HabiticaBottomNavigationView$showSubmenu$1(this, taskType));
            this.binding.submenuWrapper.addView(bottomNavigationSubmenuItem);
            bottomNavigationSubmenuItem.setAlpha(0.0f);
            bottomNavigationSubmenuItem.setScaleY(0.7f);
            long j10 = i10 * 100;
            p0.e(bottomNavigationSubmenuItem).b(1.0f).h(250L).l(j10);
            p0.e(bottomNavigationSubmenuItem).g(1.0f).h(250L).l(j10);
            i10--;
        }
        LinearLayout linearLayout = this.binding.submenuWrapper;
        q.h(linearLayout, "submenuWrapper");
        int i12 = 0;
        for (View view : t0.a(linearLayout)) {
            if ((view instanceof BottomNavigationSubmenuItem) && i12 < (measuredTitleWidth = ((BottomNavigationSubmenuItem) view).getMeasuredTitleWidth())) {
                i12 = measuredTitleWidth;
            }
        }
        LinearLayout linearLayout2 = this.binding.submenuWrapper;
        q.h(linearLayout2, "submenuWrapper");
        for (View view2 : t0.a(linearLayout2)) {
            if (view2 instanceof BottomNavigationSubmenuItem) {
                ((BottomNavigationSubmenuItem) view2).setTitleWidth(i12);
            }
        }
    }

    private final void updateItemSelection() {
        boolean z10;
        boolean z11;
        boolean z12;
        BottomNavigationItem bottomNavigationItem = this.binding.habitsTab;
        boolean z13 = true;
        if (this.activeTaskType == TaskType.HABIT) {
            z10 = true;
        } else {
            z10 = false;
        }
        bottomNavigationItem.setActive(z10);
        BottomNavigationItem bottomNavigationItem2 = this.binding.dailiesTab;
        if (this.activeTaskType == TaskType.DAILY) {
            z11 = true;
        } else {
            z11 = false;
        }
        bottomNavigationItem2.setActive(z11);
        BottomNavigationItem bottomNavigationItem3 = this.binding.todosTab;
        if (this.activeTaskType == TaskType.TODO) {
            z12 = true;
        } else {
            z12 = false;
        }
        bottomNavigationItem3.setActive(z12);
        BottomNavigationItem bottomNavigationItem4 = this.binding.rewardsTab;
        if (this.activeTaskType != TaskType.REWARD) {
            z13 = false;
        }
        bottomNavigationItem4.setActive(z13);
    }

    public final TaskType getActiveTaskType() {
        return this.activeTaskType;
    }

    public final int getBarHeight() {
        return this.binding.itemWrapper.getMeasuredHeight();
    }

    public final boolean getCanAddTasks() {
        return this.canAddTasks;
    }

    public final HabiticaBottomNavigationViewListener getListener() {
        return this.listener;
    }

    public final int getSelectedPosition() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.activeTaskType.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    public final void setActiveTaskType(TaskType taskType) {
        boolean z10;
        q.i(taskType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.activeTaskType != taskType) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.activeTaskType = taskType;
        if (z10) {
            updateItemSelection();
            HabiticaBottomNavigationViewListener habiticaBottomNavigationViewListener = this.listener;
            if (habiticaBottomNavigationViewListener != null) {
                habiticaBottomNavigationViewListener.onTabSelected(taskType, true);
            }
        }
    }

    public final void setCanAddTasks(boolean z10) {
        if (this.canAddTasks == z10) {
            return;
        }
        this.canAddTasks = z10;
        this.binding.addButton.setEnabled(z10);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (this.canAddTasks) {
            this.binding.addButtonBackground.animate().translationY(0.0f).alpha(1.0f).setDuration(200L);
        } else {
            this.binding.addButtonBackground.animate().translationY((-this.binding.addButtonBackground.getHeight()) / 2).alpha(0.0f).setDuration(200L);
        }
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    public final void setListener(HabiticaBottomNavigationViewListener habiticaBottomNavigationViewListener) {
        this.listener = habiticaBottomNavigationViewListener;
    }

    public final void setSelectedPosition(int i10) {
        TaskType taskType;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    taskType = TaskType.HABIT;
                } else {
                    taskType = TaskType.REWARD;
                }
            } else {
                taskType = TaskType.TODO;
            }
        } else {
            taskType = TaskType.DAILY;
        }
        setActiveTaskType(taskType);
    }

    public final BottomNavigationItem tabWithId(int i10) {
        switch (i10) {
            case R.id.dailies_tab /* 2131296644 */:
                return this.binding.dailiesTab;
            case R.id.habits_tab /* 2131296859 */:
                return this.binding.habitsTab;
            case R.id.rewards_tab /* 2131297377 */:
                return this.binding.rewardsTab;
            case R.id.todos_tab /* 2131297670 */:
                return this.binding.todosTab;
            default:
                return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HabiticaBottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.i(context, "context");
    }

    public /* synthetic */ HabiticaBottomNavigationView(Context context, AttributeSet attributeSet, int i10, int i11, qc.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaBottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        MainNavigationViewBinding inflate = MainNavigationViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.activeTaskType = TaskType.HABIT;
        this.canAddTasks = true;
        inflate.habitsTab.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaBottomNavigationView._init_$lambda$0(HabiticaBottomNavigationView.this, view);
            }
        });
        inflate.dailiesTab.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaBottomNavigationView._init_$lambda$1(HabiticaBottomNavigationView.this, view);
            }
        });
        inflate.todosTab.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaBottomNavigationView._init_$lambda$2(HabiticaBottomNavigationView.this, view);
            }
        });
        inflate.rewardsTab.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaBottomNavigationView._init_$lambda$3(HabiticaBottomNavigationView.this, view);
            }
        });
        inflate.addButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaBottomNavigationView._init_$lambda$4(HabiticaBottomNavigationView.this, view);
            }
        });
        inflate.addButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.i
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$5;
                _init_$lambda$5 = HabiticaBottomNavigationView._init_$lambda$5(HabiticaBottomNavigationView.this, view);
                return _init_$lambda$5;
            }
        });
        inflate.addButton.setOnTouchListener(new View.OnTouchListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$6;
                _init_$lambda$6 = HabiticaBottomNavigationView._init_$lambda$6(HabiticaBottomNavigationView.this, view, motionEvent);
                return _init_$lambda$6;
            }
        });
        inflate.submenuWrapper.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.navigation.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabiticaBottomNavigationView._init_$lambda$7(HabiticaBottomNavigationView.this, view);
            }
        });
        updateItemSelection();
        Drawable e10 = androidx.core.content.a.e(context, R.drawable.bottom_navigation_inset);
        if (e10 != null) {
            DrawableExtendsionsKt.setTintWith(e10, ContextExtensionsKt.getThemeColor(context, R.attr.barColor), PorterDuff.Mode.MULTIPLY);
        }
        inflate.cutoutBackground.setImageDrawable(e10);
        Drawable e11 = androidx.core.content.a.e(context, R.drawable.fab_background);
        if (e11 != null) {
            DrawableExtendsionsKt.setTintWith(e11, ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent), PorterDuff.Mode.MULTIPLY);
        }
        inflate.addButtonBackground.setBackground(e11);
    }
}
