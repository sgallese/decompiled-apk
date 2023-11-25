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
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$updateOrCreateGroup$1", f = "GroupViewModel.kt", l = {155, 164}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$updateOrCreateGroup$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Bundle $bundle;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$updateOrCreateGroup$1(GroupViewModel groupViewModel, Bundle bundle, Continuation<? super GroupViewModel$updateOrCreateGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$updateOrCreateGroup$1(this.this$0, this.$bundle, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$updateOrCreateGroup$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        LiveData liveData;
        LiveData liveData2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            liveData = this.this$0.group;
            Boolean bool = null;
            if (liveData.f() == null) {
                SocialRepository socialRepository = this.this$0.getSocialRepository();
                Bundle bundle = this.$bundle;
                if (bundle != null) {
                    str4 = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                } else {
                    str4 = null;
                }
                Bundle bundle2 = this.$bundle;
                if (bundle2 != null) {
                    str5 = bundle2.getString("description");
                } else {
                    str5 = null;
                }
                Bundle bundle3 = this.$bundle;
                if (bundle3 != null) {
                    str6 = bundle3.getString("leader");
                } else {
                    str6 = null;
                }
                Bundle bundle4 = this.$bundle;
                if (bundle4 != null) {
                    str7 = bundle4.getString("groupType");
                } else {
                    str7 = null;
                }
                Bundle bundle5 = this.$bundle;
                if (bundle5 != null) {
                    str8 = bundle5.getString("privacy");
                } else {
                    str8 = null;
                }
                Bundle bundle6 = this.$bundle;
                if (bundle6 != null) {
                    bool = b.a(bundle6.getBoolean("leaderCreateChallenge"));
                }
                this.label = 1;
                if (socialRepository.createGroup(str4, str5, str6, str7, str8, bool, this) == d10) {
                    return d10;
                }
            } else {
                SocialRepository socialRepository2 = this.this$0.getSocialRepository();
                liveData2 = this.this$0.group;
                Group group = (Group) liveData2.f();
                Bundle bundle7 = this.$bundle;
                if (bundle7 != null) {
                    str = bundle7.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                } else {
                    str = null;
                }
                Bundle bundle8 = this.$bundle;
                if (bundle8 != null) {
                    str2 = bundle8.getString("description");
                } else {
                    str2 = null;
                }
                Bundle bundle9 = this.$bundle;
                if (bundle9 != null) {
                    str3 = bundle9.getString("leader");
                } else {
                    str3 = null;
                }
                Bundle bundle10 = this.$bundle;
                if (bundle10 != null) {
                    bool = b.a(bundle10.getBoolean("leaderOnlyChallenges"));
                }
                this.label = 2;
                if (socialRepository2.updateGroup(group, str, str2, str3, bool, this) == d10) {
                    return d10;
                }
            }
        }
        return w.f13270a;
    }
}
