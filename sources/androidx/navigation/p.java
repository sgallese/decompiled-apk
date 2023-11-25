package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.i;
import dc.w;
import ec.b0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import qc.r;

/* compiled from: Navigator.kt */
/* loaded from: classes.dex */
public abstract class p<D extends i> {

    /* renamed from: a  reason: collision with root package name */
    private k3.p f5386a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5387b;

    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.l<androidx.navigation.c, androidx.navigation.c> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<D> f5388f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f5389m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ a f5390p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p<D> pVar, m mVar, a aVar) {
            super(1);
            this.f5388f = pVar;
            this.f5389m = mVar;
            this.f5390p = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.c invoke(androidx.navigation.c cVar) {
            i d10;
            qc.q.i(cVar, "backStackEntry");
            i e10 = cVar.e();
            if (!(e10 instanceof i)) {
                e10 = null;
            }
            if (e10 != null && (d10 = this.f5388f.d(e10, cVar.c(), this.f5389m, this.f5390p)) != null) {
                if (!qc.q.d(d10, e10)) {
                    return this.f5388f.b().a(d10, d10.h(cVar.c()));
                }
                return cVar;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.l<n, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f5391f = new d();

        d() {
            super(1);
        }

        public final void a(n nVar) {
            qc.q.i(nVar, "$this$navOptions");
            nVar.d(true);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(n nVar) {
            a(nVar);
            return w.f13270a;
        }
    }

    public abstract D a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final k3.p b() {
        k3.p pVar = this.f5386a;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.f5387b;
    }

    public i d(D d10, Bundle bundle, m mVar, a aVar) {
        qc.q.i(d10, "destination");
        return d10;
    }

    public void e(List<androidx.navigation.c> list, m mVar, a aVar) {
        xc.g R;
        xc.g w10;
        xc.g o10;
        qc.q.i(list, "entries");
        R = b0.R(list);
        w10 = xc.o.w(R, new c(this, mVar, aVar));
        o10 = xc.o.o(w10);
        Iterator it = o10.iterator();
        while (it.hasNext()) {
            b().k((androidx.navigation.c) it.next());
        }
    }

    public void f(k3.p pVar) {
        qc.q.i(pVar, "state");
        this.f5386a = pVar;
        this.f5387b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(androidx.navigation.c cVar) {
        qc.q.i(cVar, "backStackEntry");
        i e10 = cVar.e();
        if (!(e10 instanceof i)) {
            e10 = null;
        }
        if (e10 == null) {
            return;
        }
        d(e10, null, k3.m.a(d.f5391f), null);
        b().f(cVar);
    }

    public void h(Bundle bundle) {
        qc.q.i(bundle, "savedState");
    }

    public Bundle i() {
        return null;
    }

    public void j(androidx.navigation.c cVar, boolean z10) {
        qc.q.i(cVar, "popUpTo");
        List<androidx.navigation.c> value = b().b().getValue();
        if (value.contains(cVar)) {
            ListIterator<androidx.navigation.c> listIterator = value.listIterator(value.size());
            androidx.navigation.c cVar2 = null;
            while (k()) {
                cVar2 = listIterator.previous();
                if (qc.q.d(cVar2, cVar)) {
                    break;
                }
            }
            if (cVar2 != null) {
                b().h(cVar2, z10);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + cVar + " which does not exist in back stack " + value).toString());
    }

    public boolean k() {
        return true;
    }
}
