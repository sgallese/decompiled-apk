package com.habitrpg.android.habitica.models.tasks;

import android.text.Spanned;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Task.kt */
/* loaded from: classes4.dex */
public final class Task$markdownText$1 extends r implements l<Spanned, w> {
    final /* synthetic */ l<CharSequence, w> $callback;
    final /* synthetic */ Task this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Task$markdownText$1(Task task, l<? super CharSequence, w> lVar) {
        super(1);
        this.this$0 = task;
        this.$callback = lVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Spanned spanned) {
        invoke2(spanned);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Spanned spanned) {
        q.i(spanned, "parsedText");
        this.this$0.setParsedText(spanned);
        this.$callback.invoke(spanned);
    }
}
