package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import pc.l;
import qc.q;
import qc.r;
import retrofit2.HttpException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public final class GroupViewModel$retrieveGroup$1 extends r implements l<Throwable, w> {
    public static final GroupViewModel$retrieveGroup$1 INSTANCE = new GroupViewModel$retrieveGroup$1();

    GroupViewModel$retrieveGroup$1() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "it");
        if ((th instanceof HttpException) && ((HttpException) th).code() == 404) {
            MainNavigationController.INSTANCE.navigateBack();
        }
    }
}
