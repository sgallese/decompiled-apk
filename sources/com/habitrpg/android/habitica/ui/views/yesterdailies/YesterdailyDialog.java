package com.habitrpg.android.habitica.ui.views.yesterdailies;

import ad.i;
import ad.l0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import ec.t;
import io.realm.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: YesterdailyDialog.kt */
/* loaded from: classes4.dex */
public final class YesterdailyDialog extends HabiticaAlertDialog {
    private static WeakReference<YesterdailyDialog> displayedDialog;
    private static Date lastCronRun;
    private final TaskRepository taskRepository;
    private final List<Task> tasks;
    private final UserRepository userRepository;
    private LinearLayout yesterdailiesList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: YesterdailyDialog.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final YesterdailyDialog showDialog(Activity activity, UserRepository userRepository, TaskRepository taskRepository, List<? extends Task> list) {
            YesterdailyDialog yesterdailyDialog = new YesterdailyDialog(activity, userRepository, taskRepository, list, null);
            yesterdailyDialog.setCancelable(false);
            yesterdailyDialog.setCanceledOnTouchOutside(false);
            if (!activity.isFinishing()) {
                yesterdailyDialog.enqueue();
            }
            return yesterdailyDialog;
        }

        public final Date getLastCronRun$Habitica_2311256681_prodRelease() {
            return YesterdailyDialog.lastCronRun;
        }

        public final void setLastCronRun$Habitica_2311256681_prodRelease(Date date) {
            YesterdailyDialog.lastCronRun = date;
        }

        public final void showDialogIfNeeded(Activity activity, String str, UserRepository userRepository, TaskRepository taskRepository) {
            q.i(activity, "activity");
            q.i(taskRepository, "taskRepository");
            if (userRepository != null && str != null) {
                ExceptionHandlerKt.launchCatching$default(l0.b(), null, new YesterdailyDialog$Companion$showDialogIfNeeded$1(userRepository, taskRepository, activity, null), 1, null);
            }
        }
    }

    public /* synthetic */ YesterdailyDialog(Context context, UserRepository userRepository, TaskRepository taskRepository, List list, h hVar) {
        this(context, userRepository, taskRepository, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(YesterdailyDialog yesterdailyDialog, DialogInterface dialogInterface) {
        q.i(yesterdailyDialog, "this$0");
        lastCronRun = new Date();
        yesterdailyDialog.runCron();
    }

    private final void configureChecklistView(final ViewGroup viewGroup, final Task task, final ChecklistItem checklistItem) {
        Drawable drawable;
        ViewGroup viewGroup2;
        int extraLightTaskColor;
        int i10;
        Drawable drawable2;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.checkmark);
        if (task.getCompleted()) {
            if (imageView != null && (drawable2 = imageView.getDrawable()) != null) {
                drawable2.setTint(androidx.core.content.a.c(getContext(), R.color.gray_400));
            }
        } else if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.setTint(androidx.core.content.a.c(getContext(), task.getExtraExtraDarkTaskColor()));
        }
        if (imageView != null) {
            if (checklistItem.getCompleted()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
        View findViewById = viewGroup.findViewById(R.id.checkBoxHolder);
        TextView textView = null;
        if (findViewById instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) findViewById;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.yesterdailies.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    YesterdailyDialog.configureChecklistView$lambda$2(ChecklistItem.this, this, task, viewGroup, view);
                }
            });
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.yesterdailies.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YesterdailyDialog.configureChecklistView$lambda$3(ChecklistItem.this, this, task, viewGroup, view);
            }
        });
        if (viewGroup2 != null) {
            if (task.getCompleted()) {
                extraLightTaskColor = R.color.offset_background;
            } else {
                extraLightTaskColor = task.getExtraLightTaskColor();
            }
            viewGroup2.setBackgroundResource(extraLightTaskColor);
        }
        View findViewById2 = viewGroup.findViewById(R.id.checkedTextView);
        if (findViewById2 instanceof TextView) {
            textView = (TextView) findViewById2;
        }
        if (textView != null) {
            textView.setText(checklistItem.getText());
        }
        View findViewById3 = viewGroup.findViewById(R.id.checkBoxBackground);
        if (findViewById3 != null) {
            Context context = getContext();
            Context context2 = getContext();
            q.h(context2, "getContext(...)");
            boolean isUsingNightModeResources = ContextExtensionsKt.isUsingNightModeResources(context2);
            int i11 = R.color.checkbox_fill;
            if (isUsingNightModeResources && !task.getCompleted()) {
                i11 = task.getLightTaskColor();
            }
            findViewById3.setBackgroundTintList(androidx.core.content.a.d(context, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChecklistView$lambda$2(ChecklistItem checklistItem, YesterdailyDialog yesterdailyDialog, Task task, ViewGroup viewGroup, View view) {
        q.i(checklistItem, "$item");
        q.i(yesterdailyDialog, "this$0");
        q.i(task, "$task");
        q.i(viewGroup, "$checklistView");
        checklistItem.setCompleted(!checklistItem.getCompleted());
        yesterdailyDialog.scoreChecklistItem(task, checklistItem);
        yesterdailyDialog.configureChecklistView(viewGroup, task, checklistItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChecklistView$lambda$3(ChecklistItem checklistItem, YesterdailyDialog yesterdailyDialog, Task task, ViewGroup viewGroup, View view) {
        q.i(checklistItem, "$item");
        q.i(yesterdailyDialog, "this$0");
        q.i(task, "$task");
        q.i(viewGroup, "$checklistView");
        checklistItem.setCompleted(!checklistItem.getCompleted());
        yesterdailyDialog.scoreChecklistItem(task, checklistItem);
        yesterdailyDialog.configureChecklistView(viewGroup, task, checklistItem);
    }

    private final void configureTaskView(View view, Task task) {
        int i10;
        Drawable drawable;
        boolean z10 = !task.isDisplayedActive();
        ImageView imageView = (ImageView) view.findViewById(R.id.checkmark);
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.setTint(androidx.core.content.a.c(getContext(), R.color.gray_400));
        }
        View findViewById = view.findViewById(R.id.checkBoxHolder);
        View findViewById2 = view.findViewById(R.id.checkbox_background);
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
        if (z10) {
            Context context = getContext();
            q.h(context, "getContext(...)");
            findViewById.setBackgroundColor(ContextExtensionsKt.getThemeColor(context, R.attr.colorWindowBackground));
            findViewById2.setBackgroundResource(R.drawable.daily_checked);
        } else {
            findViewById.setBackgroundResource(task.getLightTaskColor());
            findViewById2.setBackgroundResource(R.drawable.daily_unchecked);
        }
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        if (textView != null) {
            textView.setText(task.markdownText(new YesterdailyDialog$configureTaskView$1(textView)));
        }
    }

    private final View createNewTaskView(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = this.yesterdailiesList;
        if (linearLayout == null) {
            q.z("yesterdailiesList");
            linearLayout = null;
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_yesterdaily_task, (ViewGroup) linearLayout, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    private final void createTaskViews(final LayoutInflater layoutInflater) {
        int i10;
        for (final Task task : this.tasks) {
            final View createNewTaskView = createNewTaskView(layoutInflater);
            createNewTaskView.setClipToOutline(true);
            configureTaskView(createNewTaskView, task);
            createNewTaskView.findViewById(R.id.taskHolder).setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.yesterdailies.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    YesterdailyDialog.createTaskViews$lambda$1(Task.this, this, createNewTaskView, layoutInflater, view);
                }
            });
            x0<ChecklistItem> checklist = task.getChecklist();
            if (checklist != null) {
                i10 = checklist.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                ViewGroup viewGroup = (ViewGroup) createNewTaskView.findViewById(R.id.checklistView);
                List<ChecklistItem> checklist2 = task.getChecklist();
                if (checklist2 == null) {
                    checklist2 = t.i();
                }
                for (ChecklistItem checklistItem : checklist2) {
                    View inflate = layoutInflater.inflate(R.layout.checklist_item_row, viewGroup, false);
                    q.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup2 = (ViewGroup) inflate;
                    configureChecklistView(viewGroup2, task, checklistItem);
                    viewGroup.addView(viewGroup2);
                }
            }
            LinearLayout linearLayout = this.yesterdailiesList;
            if (linearLayout == null) {
                q.z("yesterdailiesList");
                linearLayout = null;
            }
            linearLayout.addView(createNewTaskView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTaskViews$lambda$1(Task task, YesterdailyDialog yesterdailyDialog, View view, LayoutInflater layoutInflater, View view2) {
        int i10;
        q.i(task, "$task");
        q.i(yesterdailyDialog, "this$0");
        q.i(view, "$taskView");
        q.i(layoutInflater, "$inflater");
        task.setCompleted(!task.getCompleted());
        yesterdailyDialog.configureTaskView(view, task);
        x0<ChecklistItem> checklist = task.getChecklist();
        if (checklist != null) {
            i10 = checklist.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.checklistView);
            viewGroup.removeAllViews();
            List<ChecklistItem> checklist2 = task.getChecklist();
            if (checklist2 == null) {
                checklist2 = t.i();
            }
            for (ChecklistItem checklistItem : checklist2) {
                View inflate = layoutInflater.inflate(R.layout.checklist_item_row, viewGroup, false);
                q.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) inflate;
                yesterdailyDialog.configureChecklistView(viewGroup2, task, checklistItem);
                viewGroup.addView(viewGroup2);
            }
        }
    }

    private final void runCron() {
        ArrayList arrayList = new ArrayList();
        for (Task task : this.tasks) {
            if (task.getCompleted()) {
                arrayList.add(task);
            }
        }
        lastCronRun = new Date();
        i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new YesterdailyDialog$runCron$1(this, arrayList, null), 2, null);
        displayedDialog = null;
    }

    private final void scoreChecklistItem(Task task, ChecklistItem checklistItem) {
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new YesterdailyDialog$scoreChecklistItem$1(this, task, checklistItem, null), 2, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        displayedDialog = new WeakReference<>(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        displayedDialog = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private YesterdailyDialog(Context context, UserRepository userRepository, TaskRepository taskRepository, List<? extends Task> list) {
        super(context);
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
        this.tasks = list;
        Object systemService = context.getSystemService("layout_inflater");
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.dialog_yesterdaily, (ViewGroup) null) : null;
        setTitle(R.string.welcome_back);
        setMessage(R.string.yesterdaililes_prompt);
        setAdditionalContentView(inflate);
        setAdditionalContentSidePadding(IntExtensionsKt.dpToPx(9, context));
        HabiticaAlertDialog.addButton$default((HabiticaAlertDialog) this, (int) R.string.start_day, true, false, false, (p) null, 28, (Object) null);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.habitrpg.android.habitica.ui.views.yesterdailies.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                YesterdailyDialog._init_$lambda$0(YesterdailyDialog.this, dialogInterface);
            }
        });
        LinearLayout linearLayout = inflate != null ? (LinearLayout) inflate.findViewById(R.id.yesterdailies_list) : null;
        LinearLayout linearLayout2 = linearLayout instanceof LinearLayout ? linearLayout : null;
        if (linearLayout2 != null) {
            this.yesterdailiesList = linearLayout2;
        }
        if (layoutInflater != null) {
            createTaskViews(layoutInflater);
        }
        setDialogWidth(IntExtensionsKt.dpToPx(360, context));
    }
}
