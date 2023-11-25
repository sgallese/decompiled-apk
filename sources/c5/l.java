package c5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c5.c;
import dc.w;
import kotlin.coroutines.Continuation;
import qc.r;

/* compiled from: ViewSizeResolver.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewSizeResolver.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<Throwable, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m<T> f8850f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f8851m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b f8852p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, ViewTreeObserver viewTreeObserver, b bVar) {
            super(1);
            this.f8850f = mVar;
            this.f8851m = viewTreeObserver;
            this.f8852p = bVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            l.f(this.f8850f, this.f8851m, this.f8852p);
        }
    }

    /* compiled from: ViewSizeResolver.kt */
    /* loaded from: classes.dex */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f  reason: collision with root package name */
        private boolean f8853f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m<T> f8854m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f8855p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ad.m<i> f8856q;

        /* JADX WARN: Multi-variable type inference failed */
        b(m<T> mVar, ViewTreeObserver viewTreeObserver, ad.m<? super i> mVar2) {
            this.f8854m = mVar;
            this.f8855p = viewTreeObserver;
            this.f8856q = mVar2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            i d10 = l.d(this.f8854m);
            if (d10 != null) {
                l.f(this.f8854m, this.f8855p, this);
                if (!this.f8853f) {
                    this.f8853f = true;
                    this.f8856q.resumeWith(dc.m.a(d10));
                }
            }
            return true;
        }
    }

    public static Object a(m mVar, Continuation continuation) {
        return i(mVar, continuation);
    }

    public static c b(m mVar, int i10, int i11, int i12) {
        if (i10 == -2) {
            return c.b.f8841a;
        }
        int i13 = i10 - i12;
        if (i13 > 0) {
            return c5.a.a(i13);
        }
        int i14 = i11 - i12;
        if (i14 > 0) {
            return c5.a.a(i14);
        }
        return null;
    }

    public static c c(m mVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = mVar.getView().getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        int height = mVar.getView().getHeight();
        if (mVar.e()) {
            i11 = mVar.getView().getPaddingTop() + mVar.getView().getPaddingBottom();
        } else {
            i11 = 0;
        }
        return b(mVar, i10, height, i11);
    }

    public static i d(m mVar) {
        c c10;
        c e10 = e(mVar);
        if (e10 == null || (c10 = c(mVar)) == null) {
            return null;
        }
        return new i(e10, c10);
    }

    public static c e(m mVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = mVar.getView().getLayoutParams();
        if (layoutParams != null) {
            i10 = layoutParams.width;
        } else {
            i10 = -1;
        }
        int width = mVar.getView().getWidth();
        if (mVar.e()) {
            i11 = mVar.getView().getPaddingLeft() + mVar.getView().getPaddingRight();
        } else {
            i11 = 0;
        }
        return b(mVar, i10, width, i11);
    }

    public static void f(m mVar, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            mVar.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    public static /* synthetic */ <T extends View> Object i(m<T> mVar, Continuation<? super i> continuation) {
        i d10 = d(mVar);
        if (d10 != null) {
            return d10;
        }
        ad.n nVar = new ad.n(ic.b.c(continuation), 1);
        nVar.A();
        ViewTreeObserver viewTreeObserver = mVar.getView().getViewTreeObserver();
        b bVar = new b(mVar, viewTreeObserver, nVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        nVar.n(new a(mVar, viewTreeObserver, bVar));
        Object x10 = nVar.x();
        if (x10 == ic.b.d()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }
}
