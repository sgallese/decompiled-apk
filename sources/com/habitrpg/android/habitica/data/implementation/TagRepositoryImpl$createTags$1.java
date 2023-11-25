package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TagRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.TagRepositoryImpl", f = "TagRepositoryImpl.kt", l = {49}, m = "createTags")
/* loaded from: classes4.dex */
public final class TagRepositoryImpl$createTags$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagRepositoryImpl$createTags$1(TagRepositoryImpl tagRepositoryImpl, Continuation<? super TagRepositoryImpl$createTags$1> continuation) {
        super(continuation);
        this.this$0 = tagRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.createTags(null, this);
    }
}
