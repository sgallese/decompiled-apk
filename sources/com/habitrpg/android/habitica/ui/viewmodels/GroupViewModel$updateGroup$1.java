package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.Group;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$updateGroup$1", f = "GroupViewModel.kt", l = {288}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$updateGroup$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Bundle $bundle;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$updateGroup$1(GroupViewModel groupViewModel, Bundle bundle, Continuation<? super GroupViewModel$updateGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$updateGroup$1(this.this$0, this.$bundle, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$updateGroup$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        LiveData liveData;
        String str;
        String str2;
        String str3;
        Boolean bool;
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
            Bundle bundle = this.$bundle;
            if (bundle != null) {
                str = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            } else {
                str = null;
            }
            Bundle bundle2 = this.$bundle;
            if (bundle2 != null) {
                str2 = bundle2.getString("description");
            } else {
                str2 = null;
            }
            Bundle bundle3 = this.$bundle;
            if (bundle3 != null) {
                str3 = bundle3.getString("leader");
            } else {
                str3 = null;
            }
            Bundle bundle4 = this.$bundle;
            if (bundle4 != null) {
                bool = b.a(bundle4.getBoolean("leaderOnlyChallenges"));
            } else {
                bool = null;
            }
            this.label = 1;
            if (socialRepository.updateGroup(group, str, str2, str3, bool, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
