package com.habitrpg.android.habitica.interactors;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.interactors.ShareMountUseCase;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShareMountUseCase.kt */
@f(c = "com.habitrpg.android.habitica.interactors.ShareMountUseCase", f = "ShareMountUseCase.kt", l = {60}, m = "run")
/* loaded from: classes4.dex */
public final class ShareMountUseCase$run$1 extends d {
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
    final /* synthetic */ ShareMountUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMountUseCase$run$1(ShareMountUseCase shareMountUseCase, Continuation<? super ShareMountUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = shareMountUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.run((ShareMountUseCase.RequestValues) null, (Continuation<? super w>) this);
    }
}
