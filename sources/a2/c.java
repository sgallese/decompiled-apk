package a2;

import ad.a1;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.coroutines.Continuation;

/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidFontLoader.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super Typeface>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f236f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p0 f237m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Context f238p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f237m = p0Var;
            this.f238p = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f237m, this.f238p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super Typeface> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f236f == 0) {
                dc.n.b(obj);
                return c.c(this.f237m, this.f238p);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(p0 p0Var, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return r0.f321a.a(context, p0Var);
        }
        Typeface g10 = androidx.core.content.res.h.g(context, p0Var.d());
        qc.q.f(g10);
        qc.q.h(g10, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(p0 p0Var, Context context, Continuation<? super Typeface> continuation) {
        return ad.g.g(a1.b(), new a(p0Var, context, null), continuation);
    }
}
