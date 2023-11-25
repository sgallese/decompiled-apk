package com.habitrpg.android.habitica.ui.views;

import ad.k0;
import ad.u0;
import android.text.SpannableStringBuilder;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Typewriter.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.Typewriter$animateText$1", f = "Typewriter.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Typewriter$animateText$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ Typewriter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typewriter$animateText$1(Typewriter typewriter, Continuation<? super Typewriter$animateText$1> continuation) {
        super(2, continuation);
        this.this$0 = typewriter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new Typewriter$animateText$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((Typewriter$animateText$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        long j10;
        Object obj2;
        int i12;
        d10 = ic.d.d();
        int i13 = this.label;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n.b(obj);
        do {
            i10 = this.this$0.index;
            spannableStringBuilder = this.this$0.stringBuilder;
            if (spannableStringBuilder != null) {
                i11 = spannableStringBuilder.length();
            } else {
                i11 = 0;
            }
            if (i10 <= i11) {
                spannableStringBuilder2 = this.this$0.stringBuilder;
                if (spannableStringBuilder2 != null) {
                    obj2 = this.this$0.visibleSpan;
                    Typewriter typewriter = this.this$0;
                    i12 = typewriter.index;
                    typewriter.index = i12 + 1;
                    spannableStringBuilder2.setSpan(obj2, 0, i12, 18);
                }
                Typewriter typewriter2 = this.this$0;
                spannableStringBuilder3 = typewriter2.stringBuilder;
                typewriter2.setText(spannableStringBuilder3);
                j10 = this.this$0.delay;
                this.label = 1;
            } else {
                return w.f13270a;
            }
        } while (u0.a(j10, this) != d10);
        return d10;
    }
}
