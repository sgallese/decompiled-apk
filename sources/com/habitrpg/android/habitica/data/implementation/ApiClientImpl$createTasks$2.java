package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createTasks$2", f = "ApiClientImpl.kt", l = {482}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$createTasks$2 extends l implements pc.l<Continuation<? super HabitResponse<List<? extends Task>>>, Object> {
    final /* synthetic */ List<Task> $tasks;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiClientImpl$createTasks$2(ApiClientImpl apiClientImpl, List<? extends Task> list, Continuation<? super ApiClientImpl$createTasks$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$tasks = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$createTasks$2(this.this$0, this.$tasks, continuation);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super HabitResponse<List<? extends Task>>> continuation) {
        return invoke2((Continuation<? super HabitResponse<List<Task>>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiService apiService;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            apiService = this.this$0.apiService;
            if (apiService == null) {
                q.z("apiService");
                apiService = null;
            }
            List<Task> list = this.$tasks;
            this.label = 1;
            obj = apiService.createTasks(list, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super HabitResponse<List<Task>>> continuation) {
        return ((ApiClientImpl$createTasks$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
