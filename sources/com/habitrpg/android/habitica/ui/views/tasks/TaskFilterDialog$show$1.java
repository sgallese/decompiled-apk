package com.habitrpg.android.habitica.ui.views.tasks;

import ad.k0;
import com.habitrpg.android.habitica.models.Tag;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskFilterDialog.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog$show$1", f = "TaskFilterDialog.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TaskFilterDialog$show$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ TaskFilterDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFilterDialog$show$1(TaskFilterDialog taskFilterDialog, Continuation<? super TaskFilterDialog$show$1> continuation) {
        super(2, continuation);
        this.this$0 = taskFilterDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new TaskFilterDialog$show$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((TaskFilterDialog$show$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            dd.g<List<Tag>> tags = this.this$0.getViewModel().getTagRepository().getTags();
            final TaskFilterDialog taskFilterDialog = this.this$0;
            dd.h<? super List<Tag>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.views.tasks.TaskFilterDialog$show$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Tag> list, Continuation<? super w> continuation) {
                    TaskFilterDialog.this.setTags(list);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (tags.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
