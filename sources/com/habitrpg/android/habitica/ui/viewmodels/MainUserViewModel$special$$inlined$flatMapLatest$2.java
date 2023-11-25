package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
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
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel$special$$inlined$flatMapLatest$2", f = "MainUserViewModel.kt", l = {219, 193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainUserViewModel$special$$inlined$flatMapLatest$2 extends l implements q<h<? super List<? extends Member>>, String, Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MainUserViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainUserViewModel$special$$inlined$flatMapLatest$2(Continuation continuation, MainUserViewModel mainUserViewModel) {
        super(3, continuation);
        this.this$0 = mainUserViewModel;
    }

    @Override // pc.q
    public final Object invoke(h<? super List<? extends Member>> hVar, String str, Continuation<? super w> continuation) {
        MainUserViewModel$special$$inlined$flatMapLatest$2 mainUserViewModel$special$$inlined$flatMapLatest$2 = new MainUserViewModel$special$$inlined$flatMapLatest$2(continuation, this.this$0);
        mainUserViewModel$special$$inlined$flatMapLatest$2.L$0 = hVar;
        mainUserViewModel$special$$inlined$flatMapLatest$2.L$1 = str;
        return mainUserViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        h hVar;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) this.L$0;
            n.b(obj);
        } else {
            n.b(obj);
            hVar = (h) this.L$0;
            String str = (String) this.L$1;
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            this.L$0 = hVar;
            this.label = 1;
            obj = socialRepository.getGroupMembers(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        this.L$0 = null;
        this.label = 2;
        if (i.r(hVar, (g) obj, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
