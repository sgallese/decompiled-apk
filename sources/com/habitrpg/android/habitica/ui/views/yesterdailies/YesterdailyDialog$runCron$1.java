package com.habitrpg.android.habitica.ui.views.yesterdailies;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.tasks.Task;
import dc.n;
import dc.w;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YesterdailyDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.yesterdailies.YesterdailyDialog$runCron$1", f = "YesterdailyDialog.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class YesterdailyDialog$runCron$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ ArrayList<Task> $completedTasks;
    int label;
    final /* synthetic */ YesterdailyDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YesterdailyDialog$runCron$1(YesterdailyDialog yesterdailyDialog, ArrayList<Task> arrayList, Continuation<? super YesterdailyDialog$runCron$1> continuation) {
        super(2, continuation);
        this.this$0 = yesterdailyDialog;
        this.$completedTasks = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new YesterdailyDialog$runCron$1(this.this$0, this.$completedTasks, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((YesterdailyDialog$runCron$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        UserRepository userRepository;
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
            userRepository = this.this$0.userRepository;
            ArrayList<Task> arrayList = this.$completedTasks;
            this.label = 1;
            if (userRepository.runCron(arrayList, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
