package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.social.Group;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.SocialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1", f = "SocialRepositoryImpl.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SocialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1 extends l implements q<h<? super List<? extends Group>>, String, Continuation<? super w>, Object> {
    final /* synthetic */ String $type$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SocialRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1(Continuation continuation, SocialRepositoryImpl socialRepositoryImpl, String str) {
        super(3, continuation);
        this.this$0 = socialRepositoryImpl;
        this.$type$inlined = str;
    }

    @Override // pc.q
    public final Object invoke(h<? super List<? extends Group>> hVar, String str, Continuation<? super w> continuation) {
        SocialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1 socialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1 = new SocialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1(continuation, this.this$0, this.$type$inlined);
        socialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1.L$0 = hVar;
        socialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1.L$1 = str;
        return socialRepositoryImpl$getUserGroups$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
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
            g<List<Group>> userGroups = this.this$0.getLocalRepository().getUserGroups((String) this.L$1, this.$type$inlined);
            this.label = 1;
            if (i.r(hVar, userGroups, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
