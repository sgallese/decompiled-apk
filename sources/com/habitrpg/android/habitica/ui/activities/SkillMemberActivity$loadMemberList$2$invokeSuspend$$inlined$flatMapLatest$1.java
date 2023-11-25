package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: Merge.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1", f = "SkillMemberActivity.kt", l = {219, 193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.l implements pc.q<dd.h<? super List<? extends Member>>, String, Continuation<? super dc.w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SkillMemberActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, SkillMemberActivity skillMemberActivity) {
        super(3, continuation);
        this.this$0 = skillMemberActivity;
    }

    @Override // pc.q
    public final Object invoke(dd.h<? super List<? extends Member>> hVar, String str, Continuation<? super dc.w> continuation) {
        SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1 skillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1 = new SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        skillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = hVar;
        skillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return skillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        dd.h hVar;
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
            hVar = (dd.h) this.L$0;
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            hVar = (dd.h) this.L$0;
            String str = (String) this.L$1;
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            this.L$0 = hVar;
            this.label = 1;
            obj = socialRepository.getPartyMembers(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        this.L$0 = null;
        this.label = 2;
        if (dd.i.r(hVar, (dd.g) obj, this) == d10) {
            return d10;
        }
        return dc.w.f13270a;
    }
}
