package androidx.compose.ui.platform;

import ad.x1;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class w4 {

    /* renamed from: a  reason: collision with root package name */
    public static final w4 f2864a = new w4();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<v4> f2865b = new AtomicReference<>(v4.f2857a.a());

    /* renamed from: c  reason: collision with root package name */
    public static final int f2866c = 8;

    /* compiled from: WindowRecomposer.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ad.x1 f2867f;

        a(ad.x1 x1Var) {
            this.f2867f = x1Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            qc.q.i(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            qc.q.i(view, "v");
            view.removeOnAttachStateChangeListener(this);
            x1.a.a(this.f2867f, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f2868f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0.b2 f2869m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ View f2870p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j0.b2 b2Var, View view, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f2869m = b2Var;
            this.f2870p = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f2869m, this.f2870p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            View view;
            d10 = ic.d.d();
            int i10 = this.f2868f;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    j0.b2 b2Var = this.f2869m;
                    this.f2868f = 1;
                    if (b2Var.f0(this) == d10) {
                        return d10;
                    }
                }
                if (WindowRecomposer_androidKt.f(view) == this.f2869m) {
                    WindowRecomposer_androidKt.i(this.f2870p, null);
                }
                return dc.w.f13270a;
            } finally {
                if (WindowRecomposer_androidKt.f(this.f2870p) == this.f2869m) {
                    WindowRecomposer_androidKt.i(this.f2870p, null);
                }
            }
        }
    }

    private w4() {
    }

    public final j0.b2 a(View view) {
        ad.x1 d10;
        qc.q.i(view, "rootView");
        j0.b2 a10 = f2865b.get().a(view);
        WindowRecomposer_androidKt.i(view, a10);
        ad.p1 p1Var = ad.p1.f548f;
        Handler handler = view.getHandler();
        qc.q.h(handler, "rootView.handler");
        d10 = ad.i.d(p1Var, bd.f.b(handler, "windowRecomposer cleanup").N0(), null, new b(a10, view, null), 2, null);
        view.addOnAttachStateChangeListener(new a(d10));
        return a10;
    }
}
