package com.habitrpg.android.habitica.interactors;

import ad.a1;
import ad.g;
import com.habitrpg.android.habitica.interactors.UseCase.RequestValues;
import kotlin.coroutines.Continuation;

/* compiled from: UseCase.kt */
/* loaded from: classes4.dex */
public abstract class UseCase<Q extends RequestValues, T> {
    public static final int $stable = 0;

    /* compiled from: UseCase.kt */
    /* loaded from: classes4.dex */
    public interface RequestValues {
    }

    public final Object callInteractor(Q q10, Continuation<? super T> continuation) {
        return g.g(a1.c(), new UseCase$callInteractor$2(this, q10, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object run(Q q10, Continuation<? super T> continuation);
}
