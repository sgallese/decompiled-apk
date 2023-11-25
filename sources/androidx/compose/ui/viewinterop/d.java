package androidx.compose.ui.viewinterop;

import android.view.View;
import kotlin.coroutines.Continuation;
import n1.t;
import p1.j0;

/* compiled from: AndroidViewHolder.android.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final a f3073a = new a();

    /* compiled from: AndroidViewHolder.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements j1.b {
        a() {
        }

        @Override // j1.b
        public /* synthetic */ Object A0(long j10, Continuation continuation) {
            return j1.a.c(this, j10, continuation);
        }

        @Override // j1.b
        public /* synthetic */ Object H(long j10, long j11, Continuation continuation) {
            return j1.a.a(this, j10, j11, continuation);
        }

        @Override // j1.b
        public /* synthetic */ long T0(long j10, long j11, int i10) {
            return j1.a.b(this, j10, j11, i10);
        }

        @Override // j1.b
        public /* synthetic */ long o0(long j10, int i10) {
            return j1.a.d(this, j10, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, j0 j0Var) {
        int d10;
        int d11;
        long e10 = t.e(j0Var.g());
        d10 = sc.c.d(z0.f.o(e10));
        d11 = sc.c.d(z0.f.p(e10));
        view.layout(d10, d11, view.getMeasuredWidth() + d10, view.getMeasuredHeight() + d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i10) {
        return i10 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10) {
        if (i10 == 0) {
            return j1.f.f18968a.a();
        }
        return j1.f.f18968a.b();
    }
}
