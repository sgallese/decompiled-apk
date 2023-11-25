package com.habitrpg.android.habitica.ui.views.yesterdailies;

import ad.k0;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YesterdailyDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.yesterdailies.YesterdailyDialog$scoreChecklistItem$1", f = "YesterdailyDialog.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class YesterdailyDialog$scoreChecklistItem$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ChecklistItem $item;
    final /* synthetic */ Task $task;
    int label;
    final /* synthetic */ YesterdailyDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YesterdailyDialog$scoreChecklistItem$1(YesterdailyDialog yesterdailyDialog, Task task, ChecklistItem checklistItem, Continuation<? super YesterdailyDialog$scoreChecklistItem$1> continuation) {
        super(2, continuation);
        this.this$0 = yesterdailyDialog;
        this.$task = task;
        this.$item = checklistItem;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new YesterdailyDialog$scoreChecklistItem$1(this.this$0, this.$task, this.$item, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((YesterdailyDialog$scoreChecklistItem$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        TaskRepository taskRepository;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            taskRepository = this.this$0.taskRepository;
            String id2 = this.$task.getId();
            String str = "";
            if (id2 == null) {
                id2 = "";
            }
            String id3 = this.$item.getId();
            if (id3 != null) {
                str = id3;
            }
            this.label = 1;
            if (taskRepository.scoreChecklistItem(id2, str, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
