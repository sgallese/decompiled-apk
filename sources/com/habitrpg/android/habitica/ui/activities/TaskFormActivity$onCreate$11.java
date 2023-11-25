package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: TaskFormActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$11", f = "TaskFormActivity.kt", l = {331, 331}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TaskFormActivity$onCreate$11 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ TaskFormActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskFormActivity$onCreate$11(TaskFormActivity taskFormActivity, Continuation<? super TaskFormActivity$onCreate$11> continuation) {
        super(2, continuation);
        this.this$0 = taskFormActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new TaskFormActivity$onCreate$11(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((TaskFormActivity$onCreate$11) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String str;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dc.n.b(obj);
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            str = this.this$0.groupID;
            if (str == null) {
                str = "";
            }
            this.label = 1;
            obj = socialRepository.getGroupMembers(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        final TaskFormActivity taskFormActivity = this.this$0;
        dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.TaskFormActivity$onCreate$11.1
            @Override // dd.h
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((List) obj2, (Continuation<? super dc.w>) continuation);
            }

            public final Object emit(List<? extends Member> list, Continuation<? super dc.w> continuation) {
                t0.r rVar;
                t0.r rVar2;
                rVar = TaskFormActivity.this.groupMembers;
                rVar.clear();
                rVar2 = TaskFormActivity.this.groupMembers;
                rVar2.addAll(list);
                return dc.w.f13270a;
            }
        };
        this.label = 2;
        if (((dd.g) obj).collect(hVar, this) == d10) {
            return d10;
        }
        return dc.w.f13270a;
    }
}
