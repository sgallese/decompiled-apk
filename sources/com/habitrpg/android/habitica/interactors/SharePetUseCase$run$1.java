package com.habitrpg.android.habitica.interactors;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.interactors.SharePetUseCase;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharePetUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.SharePetUseCase", f = "SharePetUseCase.kt", l = {69}, m = "run")
/* loaded from: classes4.dex */
public final class SharePetUseCase$run$1 extends d {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharePetUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePetUseCase$run$1(SharePetUseCase sharePetUseCase, Continuation<? super SharePetUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = sharePetUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.run((SharePetUseCase.RequestValues) null, (Continuation<? super w>) this);
    }
}
