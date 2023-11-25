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
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel$special$$inlined$flatMapLatest$1", f = "PartyViewModel.kt", l = {219, 193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PartyViewModel$special$$inlined$flatMapLatest$1 extends l implements q<h<? super List<? extends Member>>, String, Continuation<? super w>, Object> {
    final /* synthetic */ SocialRepository $socialRepository$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, SocialRepository socialRepository) {
        super(3, continuation);
        this.$socialRepository$inlined = socialRepository;
    }

    @Override // pc.q
    public final Object invoke(h<? super List<? extends Member>> hVar, String str, Continuation<? super w> continuation) {
        PartyViewModel$special$$inlined$flatMapLatest$1 partyViewModel$special$$inlined$flatMapLatest$1 = new PartyViewModel$special$$inlined$flatMapLatest$1(continuation, this.$socialRepository$inlined);
        partyViewModel$special$$inlined$flatMapLatest$1.L$0 = hVar;
        partyViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return partyViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
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
            SocialRepository socialRepository = this.$socialRepository$inlined;
            this.L$0 = hVar;
            this.label = 1;
            obj = socialRepository.getPartyMembers(str, this);
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
