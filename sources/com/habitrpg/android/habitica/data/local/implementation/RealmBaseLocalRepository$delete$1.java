package com.habitrpg.android.habitica.data.local.implementation;

import com.habitrpg.android.habitica.models.BaseMainObject;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* JADX WARN: Incorrect field signature: TT; */
/* compiled from: RealmBaseLocalRepository.kt */
/* loaded from: classes4.dex */
final class RealmBaseLocalRepository$delete$1 extends r implements l<o0, w> {
    final /* synthetic */ BaseMainObject $liveObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public RealmBaseLocalRepository$delete$1(BaseMainObject baseMainObject) {
        super(1);
        this.$liveObject = baseMainObject;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        q.i(o0Var, "it");
        ac.a.a(this.$liveObject);
    }
}
