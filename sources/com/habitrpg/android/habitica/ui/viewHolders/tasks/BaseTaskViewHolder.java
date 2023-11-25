package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import ad.a1;
import ad.k0;
import ad.l0;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.viewHolders.BindableViewHolder;
import com.habitrpg.android.habitica.ui.views.EllipsisTextView;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import io.realm.x0;
import pc.l;
import pc.p;
import qc.q;
import yc.v;

/* compiled from: BaseTaskViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class BaseTaskViewHolder extends BindableViewHolder<Task> implements View.OnTouchListener {
    public static final int $stable = 8;
    private final TextView approvalRequiredTextView;
    private GroupPlanInfoProvider assignedTextProvider;
    private final TextView assignedTextView;
    private l<? super Task, w> brokenTaskFunc;
    private final ImageView calendarIconView;
    private final TextView completedCountTextView;
    private Context context;
    private pc.a<w> errorButtonClicked;
    private final ImageButton errorIconView;
    private final Button expandNotesButton;
    private final ImageView iconViewChallenge;
    private final ImageView iconViewReminder;
    private final ImageView iconViewTeam;
    private boolean isLocked;
    private final ViewGroup mainTaskWrapper;
    private Integer movingFromPosition;
    private boolean notesExpanded;
    private final EllipsisTextView notesTextView;
    private boolean openTaskDisabled;
    private l<? super dc.l<? extends Task, ? extends View>, w> openTaskFunc;
    private final TextView reminderTextView;
    private final k0 scope;
    private p<? super Task, ? super TaskDirection, w> scoreTaskFunc;
    private final TextView specialTaskTextView;
    private final ImageView streakIconView;
    private final TextView streakTextView;
    private final ProgressBar syncingView;
    private Task task;
    private boolean taskActionsDisabled;
    private final int taskGray;
    private final LinearLayout taskIconWrapper;
    private final EllipsisTextView titleTextView;
    private String userID;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTaskViewHolder(View view, p<? super Task, ? super TaskDirection, w> pVar, l<? super dc.l<? extends Task, ? extends View>, w> lVar, l<? super Task, w> lVar2, GroupPlanInfoProvider groupPlanInfoProvider) {
        super(view);
        q.i(view, "itemView");
        q.i(pVar, "scoreTaskFunc");
        q.i(lVar, "openTaskFunc");
        q.i(lVar2, "brokenTaskFunc");
        this.scoreTaskFunc = pVar;
        this.openTaskFunc = lVar;
        this.brokenTaskFunc = lVar2;
        this.assignedTextProvider = groupPlanInfoProvider;
        this.scope = l0.b();
        View findViewById = view.findViewById(R.id.main_task_wrapper);
        q.h(findViewById, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.mainTaskWrapper = viewGroup;
        View findViewById2 = view.findViewById(R.id.assigned_textview);
        q.h(findViewById2, "findViewById(...)");
        this.assignedTextView = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.completed_textview);
        q.h(findViewById3, "findViewById(...)");
        this.completedCountTextView = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.checkedTextView);
        q.h(findViewById4, "findViewById(...)");
        EllipsisTextView ellipsisTextView = (EllipsisTextView) findViewById4;
        this.titleTextView = ellipsisTextView;
        EllipsisTextView ellipsisTextView2 = (EllipsisTextView) view.findViewById(R.id.notesTextView);
        this.notesTextView = ellipsisTextView2;
        this.calendarIconView = (ImageView) view.findViewById(R.id.iconViewCalendar);
        this.iconViewTeam = (ImageView) view.findViewById(R.id.iconViewTeamTask);
        this.specialTaskTextView = (TextView) view.findViewById(R.id.specialTaskText);
        ImageView imageView = (ImageView) view.findViewById(R.id.iconviewChallenge);
        this.iconViewChallenge = imageView;
        this.iconViewReminder = (ImageView) view.findViewById(R.id.iconviewReminder);
        this.taskIconWrapper = (LinearLayout) view.findViewById(R.id.taskIconWrapper);
        View findViewById5 = view.findViewById(R.id.approvalRequiredTextField);
        q.h(findViewById5, "findViewById(...)");
        this.approvalRequiredTextView = (TextView) findViewById5;
        Button button = (Button) view.findViewById(R.id.expand_notes_button);
        this.expandNotesButton = button;
        this.syncingView = (ProgressBar) view.findViewById(R.id.syncing_view);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.error_icon);
        this.errorIconView = imageButton;
        this.taskGray = androidx.core.content.a.c(view.getContext(), R.color.offset_background);
        View findViewById6 = view.findViewById(R.id.iconViewStreak);
        q.h(findViewById6, "findViewById(...)");
        this.streakIconView = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.streakTextView);
        q.h(findViewById7, "findViewById(...)");
        this.streakTextView = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.reminder_textview);
        q.h(findViewById8, "findViewById(...)");
        this.reminderTextView = (TextView) findViewById8;
        view.setOnTouchListener(this);
        view.setClickable(true);
        viewGroup.setClipToOutline(true);
        ellipsisTextView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseTaskViewHolder._init_$lambda$0(BaseTaskViewHolder.this, view2);
            }
        });
        if (ellipsisTextView2 != null) {
            ellipsisTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseTaskViewHolder._init_$lambda$1(BaseTaskViewHolder.this, view2);
                }
            });
        }
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseTaskViewHolder._init_$lambda$2(BaseTaskViewHolder.this, view2);
                }
            });
        }
        if (ellipsisTextView2 != null) {
            ellipsisTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        ellipsisTextView.setMovementMethod(LinkMovementMethod.getInstance());
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseTaskViewHolder._init_$lambda$3(BaseTaskViewHolder.this, view2);
                }
            });
        }
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseTaskViewHolder._init_$lambda$5(BaseTaskViewHolder.this, view2);
                }
            });
        }
        if (ellipsisTextView2 != null) {
            ellipsisTextView2.addEllipsesListener(new EllipsisTextView.EllipsisListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder.6
                @Override // com.habitrpg.android.habitica.ui.views.EllipsisTextView.EllipsisListener
                public void ellipsisStateChanged(boolean z10) {
                    ad.i.d(BaseTaskViewHolder.this.scope, a1.c().N0(), null, new BaseTaskViewHolder$6$ellipsisStateChanged$1(z10, BaseTaskViewHolder.this, null), 2, null);
                }
            });
        }
        Context context = view.getContext();
        q.h(context, "getContext(...)");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BaseTaskViewHolder baseTaskViewHolder, View view) {
        q.i(baseTaskViewHolder, "this$0");
        baseTaskViewHolder.onTouch(view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(BaseTaskViewHolder baseTaskViewHolder, View view) {
        q.i(baseTaskViewHolder, "this$0");
        baseTaskViewHolder.onTouch(view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(BaseTaskViewHolder baseTaskViewHolder, View view) {
        q.i(baseTaskViewHolder, "this$0");
        pc.a<w> aVar = baseTaskViewHolder.errorButtonClicked;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(BaseTaskViewHolder baseTaskViewHolder, View view) {
        q.i(baseTaskViewHolder, "this$0");
        baseTaskViewHolder.expandTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(BaseTaskViewHolder baseTaskViewHolder, View view) {
        String challengeBroken;
        boolean u10;
        q.i(baseTaskViewHolder, "this$0");
        Task task = baseTaskViewHolder.task;
        if (task != null) {
            boolean z10 = false;
            if (task != null && (challengeBroken = task.getChallengeBroken()) != null) {
                u10 = v.u(challengeBroken);
                if ((!u10) == true) {
                    z10 = true;
                }
            }
            if (z10) {
                baseTaskViewHolder.brokenTaskFunc.invoke(task);
            }
        }
    }

    private final void expandTask() {
        boolean z10 = !this.notesExpanded;
        this.notesExpanded = z10;
        if (z10) {
            EllipsisTextView ellipsisTextView = this.notesTextView;
            if (ellipsisTextView != null) {
                ellipsisTextView.setMaxLines(100);
            }
            Button button = this.expandNotesButton;
            if (button != null) {
                button.setText(this.context.getString(R.string.collapse_notes));
                return;
            }
            return;
        }
        EllipsisTextView ellipsisTextView2 = this.notesTextView;
        if (ellipsisTextView2 != null) {
            ellipsisTextView2.setMaxLines(8);
        }
        Button button2 = this.expandNotesButton;
        if (button2 != null) {
            button2.setText(this.context.getString(R.string.expand_notes));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configureSpecialTaskTextView(Task task) {
        q.i(task, "task");
        TextView textView = this.specialTaskTextView;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.calendarIconView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final GroupPlanInfoProvider getAssignedTextProvider() {
        return this.assignedTextProvider;
    }

    protected final TextView getAssignedTextView() {
        return this.assignedTextView;
    }

    public final l<Task, w> getBrokenTaskFunc() {
        return this.brokenTaskFunc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView getCalendarIconView() {
        return this.calendarIconView;
    }

    protected final TextView getCompletedCountTextView() {
        return this.completedCountTextView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.context;
    }

    public final pc.a<w> getErrorButtonClicked() {
        return this.errorButtonClicked;
    }

    protected final ImageView getIconViewTeam() {
        return this.iconViewTeam;
    }

    public final Integer getMovingFromPosition() {
        return this.movingFromPosition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final EllipsisTextView getNotesTextView() {
        return this.notesTextView;
    }

    public final l<dc.l<? extends Task, ? extends View>, w> getOpenTaskFunc() {
        return this.openTaskFunc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getReminderTextView() {
        return this.reminderTextView;
    }

    public final p<Task, TaskDirection, w> getScoreTaskFunc() {
        return this.scoreTaskFunc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getSpecialTaskTextView() {
        return this.specialTaskTextView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView getStreakIconView() {
        return this.streakIconView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TextView getStreakTextView() {
        return this.streakTextView;
    }

    public final Task getTask() {
        return this.task;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getTaskGray() {
        return this.taskGray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getTaskIconWrapperIsVisible() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ImageView imageView = this.iconViewTeam;
        boolean z14 = false;
        if (imageView != null && imageView.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView2 = this.iconViewReminder;
        if (imageView2 != null && imageView2.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            z10 = true;
        }
        ImageView imageView3 = this.iconViewChallenge;
        if (imageView3 != null && imageView3.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            z10 = true;
        }
        ImageView imageView4 = this.iconViewReminder;
        if (imageView4 != null && imageView4.getVisibility() == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            z10 = true;
        }
        TextView textView = this.specialTaskTextView;
        if (textView != null && textView.getVisibility() == 0) {
            z14 = true;
        }
        if (z14) {
            z10 = true;
        }
        if (this.streakTextView.getVisibility() == 0) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final EllipsisTextView getTitleTextView() {
        return this.titleTextView;
    }

    public final String getUserID() {
        return this.userID;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        x0<ChecklistItem> checklist;
        if (motionEvent != null) {
            if (motionEvent.getAction() != 1) {
                return true;
            }
            if (motionEvent.getY() <= this.mainTaskWrapper.getHeight() + IntExtensionsKt.dpToPx(5, this.context)) {
                Task task = this.task;
                boolean z10 = false;
                if (task != null && (checklist = task.getChecklist()) != null && (!checklist.isEmpty()) == true) {
                    z10 = true;
                }
                if (!z10) {
                    if (motionEvent.getX() <= IntExtensionsKt.dpToPx(72, this.context)) {
                        onLeftActionTouched();
                        return true;
                    } else if (this.itemView.getWidth() - motionEvent.getX() <= IntExtensionsKt.dpToPx(72, this.context)) {
                        onRightActionTouched();
                        return true;
                    }
                } else {
                    View findViewById = this.itemView.findViewById(R.id.checkBoxHolder);
                    q.h(findViewById, "findViewById(...)");
                    if (this.mainTaskWrapper.getHeight() == ((ViewGroup) findViewById).getHeight()) {
                        if (motionEvent.getX() <= IntExtensionsKt.dpToPx(72, this.context)) {
                            onLeftActionTouched();
                            return true;
                        } else if (this.itemView.getWidth() - motionEvent.getX() <= IntExtensionsKt.dpToPx(72, this.context)) {
                            onRightActionTouched();
                            return true;
                        }
                    } else if (motionEvent.getY() <= r1.getHeight() + IntExtensionsKt.dpToPx(5, this.context)) {
                        if (motionEvent.getX() <= IntExtensionsKt.dpToPx(72, this.context)) {
                            onLeftActionTouched();
                            return true;
                        } else if (this.itemView.getWidth() - motionEvent.getX() <= IntExtensionsKt.dpToPx(72, this.context)) {
                            onRightActionTouched();
                            return true;
                        }
                    }
                }
            }
        }
        Task task2 = this.task;
        if (task2 != null) {
            this.openTaskFunc.invoke(new dc.l(task2, this.mainTaskWrapper));
        }
        return true;
    }

    public final void setAssignedTextProvider(GroupPlanInfoProvider groupPlanInfoProvider) {
        this.assignedTextProvider = groupPlanInfoProvider;
    }

    public final void setBrokenTaskFunc(l<? super Task, w> lVar) {
        q.i(lVar, "<set-?>");
        this.brokenTaskFunc = lVar;
    }

    protected final void setContext(Context context) {
        q.i(context, "<set-?>");
        this.context = context;
    }

    public void setDisabled(boolean z10, boolean z11) {
        this.openTaskDisabled = z10;
        this.taskActionsDisabled = z11;
    }

    public final void setErrorButtonClicked(pc.a<w> aVar) {
        this.errorButtonClicked = aVar;
    }

    public final void setLocked(boolean z10) {
        this.isLocked = z10;
    }

    public final void setMovingFromPosition(Integer num) {
        this.movingFromPosition = num;
    }

    public final void setOpenTaskFunc(l<? super dc.l<? extends Task, ? extends View>, w> lVar) {
        q.i(lVar, "<set-?>");
        this.openTaskFunc = lVar;
    }

    public final void setScoreTaskFunc(p<? super Task, ? super TaskDirection, w> pVar) {
        q.i(pVar, "<set-?>");
        this.scoreTaskFunc = pVar;
    }

    public final void setTask(Task task) {
        this.task = task;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.BindableViewHolder
    public void bind(Task task, int i10, String str) {
        q.i(task, "data");
        q.i(str, "displayMode");
        bind(task, i10, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(com.habitrpg.android.habitica.models.tasks.Task r12, int r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder.bind(com.habitrpg.android.habitica.models.tasks.Task, int, java.lang.String, java.lang.String):void");
    }

    public void onLeftActionTouched() {
    }

    public void onRightActionTouched() {
    }
}
