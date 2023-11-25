package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.lifecycle.LiveData;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.Group;
import dc.n;
import dc.w;
import ic.d;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$inviteToGroup$1", f = "GroupViewModel.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$inviteToGroup$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HashMap<String, Object> $inviteData;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$inviteToGroup$1(GroupViewModel groupViewModel, HashMap<String, Object> hashMap, Continuation<? super GroupViewModel$inviteToGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$inviteData = hashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$inviteToGroup$1(this.this$0, this.$inviteData, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$inviteToGroup$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        LiveData liveData;
        String str;
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
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            liveData = this.this$0.group;
            Group group = (Group) liveData.f();
            if (group == null || (str = group.getId()) == null) {
                str = "";
            }
            HashMap<String, Object> hashMap = this.$inviteData;
            this.label = 1;
            if (socialRepository.inviteToGroup(str, hashMap, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
