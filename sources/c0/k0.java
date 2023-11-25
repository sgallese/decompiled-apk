package c0;

import androidx.compose.foundation.FocusableKt;
import kotlin.coroutines.Continuation;

/* compiled from: TextFieldGestureModifiers.kt */
/* loaded from: classes.dex */
public final class k0 {

    /* compiled from: TextFieldGestureModifiers.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f8452f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f8453m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f0 f8454p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8454p = f0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f8454p, continuation);
            aVar.f8453m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f8452f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k1.l0 l0Var = (k1.l0) this.f8453m;
                f0 f0Var = this.f8454p;
                this.f8452f = 1;
                if (y.d(l0Var, f0Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: TextFieldGestureModifiers.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f8455f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f8456m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e0.g f8457p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e0.g gVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8457p = gVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f8457p, continuation);
            bVar.f8456m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f8455f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k1.l0 l0Var = (k1.l0) this.f8456m;
                e0.g gVar = this.f8457p;
                this.f8455f = 1;
                if (e0.c0.c(l0Var, gVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, f0 f0Var, boolean z10) {
        qc.q.i(eVar, "<this>");
        qc.q.i(f0Var, "observer");
        if (z10) {
            return k1.u0.c(eVar, f0Var, new a(f0Var, null));
        }
        return eVar;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, e0.g gVar, boolean z10) {
        qc.q.i(eVar, "<this>");
        qc.q.i(gVar, "observer");
        if (z10) {
            return k1.u0.c(androidx.compose.ui.e.f2335a, gVar, new b(gVar, null));
        }
        return eVar;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, androidx.compose.ui.focus.k kVar, v.m mVar, pc.l<? super y0.o, dc.w> lVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(kVar, "focusRequester");
        qc.q.i(lVar, "onFocusChanged");
        return FocusableKt.b(androidx.compose.ui.focus.b.a(androidx.compose.ui.focus.l.a(eVar, kVar), lVar), z10, mVar);
    }
}
