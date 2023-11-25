package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ContentRepositoryImpl", f = "ContentRepositoryImpl.kt", l = {31}, m = "retrieveContent")
/* loaded from: classes4.dex */
public final class ContentRepositoryImpl$retrieveContent$1 extends d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ContentRepositoryImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentRepositoryImpl$retrieveContent$1(ContentRepositoryImpl<T> contentRepositoryImpl, Continuation<? super ContentRepositoryImpl$retrieveContent$1> continuation) {
        super(continuation);
        this.this$0 = contentRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.retrieveContent(false, this);
    }
}
