package com.habitrpg.common.habitica.helpers;

import ad.a1;
import ad.i2;
import ad.k0;
import android.text.Spanned;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MarkdownParser.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.common.habitica.helpers.MarkdownParser$parseMarkdownAsync$1", f = "MarkdownParser.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MarkdownParser$parseMarkdownAsync$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $input;
    final /* synthetic */ pc.l<Spanned, w> $onSuccess;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MarkdownParser.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.common.habitica.helpers.MarkdownParser$parseMarkdownAsync$1$1", f = "MarkdownParser.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.common.habitica.helpers.MarkdownParser$parseMarkdownAsync$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ pc.l<Spanned, w> $onSuccess;
        final /* synthetic */ Spanned $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(pc.l<? super Spanned, w> lVar, Spanned spanned, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onSuccess = lVar;
            this.$result = spanned;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$onSuccess, this.$result, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                n.b(obj);
                this.$onSuccess.invoke(this.$result);
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarkdownParser$parseMarkdownAsync$1(String str, pc.l<? super Spanned, w> lVar, Continuation<? super MarkdownParser$parseMarkdownAsync$1> continuation) {
        super(2, continuation);
        this.$input = str;
        this.$onSuccess = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MarkdownParser$parseMarkdownAsync$1(this.$input, this.$onSuccess, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MarkdownParser$parseMarkdownAsync$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            Spanned parseMarkdown = MarkdownParser.INSTANCE.parseMarkdown(this.$input);
            i2 c10 = a1.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSuccess, parseMarkdown, null);
            this.label = 1;
            if (ad.g.g(c10, anonymousClass1, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
