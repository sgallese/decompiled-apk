package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.social.Group;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$flatMapLatest$1", f = "MainUserViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainUserViewModel$special$$inlined$flatMapLatest$1 extends l implements q<h<? super Group>, String, Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MainUserViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainUserViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, MainUserViewModel mainUserViewModel) {
        super(3, continuation);
        this.this$0 = mainUserViewModel;
    }

    @Override // pc.q
    public final Object invoke(h<? super Group> hVar, String str, Continuation<? super w> continuation) {
        MainUserViewModel$special$$inlined$flatMapLatest$1 mainUserViewModel$special$$inlined$flatMapLatest$1 = new MainUserViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        mainUserViewModel$special$$inlined$flatMapLatest$1.L$0 = hVar;
        mainUserViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return mainUserViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            h hVar = (h) this.L$0;
            g<Group> group = this.this$0.getSocialRepository().getGroup((String) this.L$1);
            this.label = 1;
            if (i.r(hVar, group, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
