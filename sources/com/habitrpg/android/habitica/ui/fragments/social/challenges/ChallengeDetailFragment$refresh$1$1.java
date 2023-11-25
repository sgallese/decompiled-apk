package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import qc.q;
import qc.r;
import retrofit2.HttpException;

/* compiled from: ChallengeDetailFragment.kt */
/* loaded from: classes4.dex */
final class ChallengeDetailFragment$refresh$1$1 extends r implements pc.l<Throwable, w> {
    public static final ChallengeDetailFragment$refresh$1$1 INSTANCE = new ChallengeDetailFragment$refresh$1$1();

    ChallengeDetailFragment$refresh$1$1() {
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
        ExceptionHandler.Companion.reportError(th);
    }
}
