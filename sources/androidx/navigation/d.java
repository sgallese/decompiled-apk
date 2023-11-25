package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.b1;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.navigation.c;
import androidx.navigation.e;
import androidx.navigation.i;
import androidx.navigation.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import dd.l0;
import dd.n0;
import dd.x;
import ec.b0;
import ec.t;
import ec.y;
import ec.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import qc.d0;
import qc.k0;
import qc.r;

/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public class d {
    public static final a H = new a(null);
    private static boolean I = true;
    private pc.l<? super androidx.navigation.c, w> A;
    private final Map<androidx.navigation.c, Boolean> B;
    private int C;
    private final List<androidx.navigation.c> D;
    private final dc.f E;
    private final dd.w<androidx.navigation.c> F;
    private final dd.g<androidx.navigation.c> G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5158a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f5159b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.navigation.l f5160c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.navigation.j f5161d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f5162e;

    /* renamed from: f  reason: collision with root package name */
    private Parcelable[] f5163f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5164g;

    /* renamed from: h  reason: collision with root package name */
    private final ec.k<androidx.navigation.c> f5165h;

    /* renamed from: i  reason: collision with root package name */
    private final x<List<androidx.navigation.c>> f5166i;

    /* renamed from: j  reason: collision with root package name */
    private final l0<List<androidx.navigation.c>> f5167j;

    /* renamed from: k  reason: collision with root package name */
    private final x<List<androidx.navigation.c>> f5168k;

    /* renamed from: l  reason: collision with root package name */
    private final l0<List<androidx.navigation.c>> f5169l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<androidx.navigation.c, androidx.navigation.c> f5170m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<androidx.navigation.c, AtomicInteger> f5171n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<Integer, String> f5172o;

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, ec.k<NavBackStackEntryState>> f5173p;

    /* renamed from: q  reason: collision with root package name */
    private v f5174q;

    /* renamed from: r  reason: collision with root package name */
    private androidx.navigation.e f5175r;

    /* renamed from: s  reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f5176s;

    /* renamed from: t  reason: collision with root package name */
    private p.b f5177t;

    /* renamed from: u  reason: collision with root package name */
    private final u f5178u;

    /* renamed from: v  reason: collision with root package name */
    private final androidx.activity.m f5179v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5180w;

    /* renamed from: x  reason: collision with root package name */
    private q f5181x;

    /* renamed from: y  reason: collision with root package name */
    private final Map<androidx.navigation.p<? extends androidx.navigation.i>, b> f5182y;

    /* renamed from: z  reason: collision with root package name */
    private pc.l<? super androidx.navigation.c, w> f5183z;

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public final class b extends k3.p {

        /* renamed from: g  reason: collision with root package name */
        private final androidx.navigation.p<? extends androidx.navigation.i> f5184g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f5185h;

        /* compiled from: NavController.kt */
        /* loaded from: classes.dex */
        static final class a extends r implements pc.a<w> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ androidx.navigation.c f5187m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ boolean f5188p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.navigation.c cVar, boolean z10) {
                super(0);
                this.f5187m = cVar;
                this.f5188p = z10;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ w invoke() {
                invoke2();
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.super.h(this.f5187m, this.f5188p);
            }
        }

        public b(d dVar, androidx.navigation.p<? extends androidx.navigation.i> pVar) {
            qc.q.i(pVar, "navigator");
            this.f5185h = dVar;
            this.f5184g = pVar;
        }

        @Override // k3.p
        public androidx.navigation.c a(androidx.navigation.i iVar, Bundle bundle) {
            qc.q.i(iVar, "destination");
            return c.a.b(androidx.navigation.c.B, this.f5185h.B(), iVar, bundle, this.f5185h.G(), this.f5185h.f5175r, null, null, 96, null);
        }

        @Override // k3.p
        public void e(androidx.navigation.c cVar) {
            List F0;
            androidx.navigation.e eVar;
            qc.q.i(cVar, "entry");
            boolean d10 = qc.q.d(this.f5185h.B.get(cVar), Boolean.TRUE);
            super.e(cVar);
            this.f5185h.B.remove(cVar);
            if (!this.f5185h.f5165h.contains(cVar)) {
                this.f5185h.v0(cVar);
                if (cVar.getLifecycle().b().isAtLeast(p.b.CREATED)) {
                    cVar.k(p.b.DESTROYED);
                }
                ec.k kVar = this.f5185h.f5165h;
                boolean z10 = true;
                if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
                    Iterator<E> it = kVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (qc.q.d(((androidx.navigation.c) it.next()).f(), cVar.f())) {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (z10 && !d10 && (eVar = this.f5185h.f5175r) != null) {
                    eVar.c(cVar.f());
                }
                this.f5185h.w0();
                this.f5185h.f5168k.e(this.f5185h.k0());
            } else if (!d()) {
                this.f5185h.w0();
                x xVar = this.f5185h.f5166i;
                F0 = b0.F0(this.f5185h.f5165h);
                xVar.e(F0);
                this.f5185h.f5168k.e(this.f5185h.k0());
            }
        }

        @Override // k3.p
        public void h(androidx.navigation.c cVar, boolean z10) {
            qc.q.i(cVar, "popUpTo");
            androidx.navigation.p d10 = this.f5185h.f5181x.d(cVar.e().p());
            if (qc.q.d(d10, this.f5184g)) {
                pc.l lVar = this.f5185h.A;
                if (lVar != null) {
                    lVar.invoke(cVar);
                    super.h(cVar, z10);
                    return;
                }
                this.f5185h.e0(cVar, new a(cVar, z10));
                return;
            }
            Object obj = this.f5185h.f5182y.get(d10);
            qc.q.f(obj);
            ((b) obj).h(cVar, z10);
        }

        @Override // k3.p
        public void i(androidx.navigation.c cVar, boolean z10) {
            qc.q.i(cVar, "popUpTo");
            super.i(cVar, z10);
            this.f5185h.B.put(cVar, Boolean.valueOf(z10));
        }

        @Override // k3.p
        public void j(androidx.navigation.c cVar) {
            qc.q.i(cVar, "entry");
            super.j(cVar);
            if (this.f5185h.f5165h.contains(cVar)) {
                cVar.k(p.b.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        @Override // k3.p
        public void k(androidx.navigation.c cVar) {
            qc.q.i(cVar, "backStackEntry");
            androidx.navigation.p d10 = this.f5185h.f5181x.d(cVar.e().p());
            if (qc.q.d(d10, this.f5184g)) {
                pc.l lVar = this.f5185h.f5183z;
                if (lVar != null) {
                    lVar.invoke(cVar);
                    o(cVar);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + cVar.e() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f5185h.f5182y.get(d10);
            if (obj != null) {
                ((b) obj).k(cVar);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + cVar.e().p() + " should already be created").toString());
        }

        public final void o(androidx.navigation.c cVar) {
            qc.q.i(cVar, "backStackEntry");
            super.k(cVar);
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public interface c {
        void a(d dVar, androidx.navigation.i iVar, Bundle bundle);
    }

    /* compiled from: NavController.kt */
    /* renamed from: androidx.navigation.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0111d extends r implements pc.l<Context, Context> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0111d f5189f = new C0111d();

        C0111d() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context context) {
            qc.q.i(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class e extends r implements pc.l<androidx.navigation.n, w> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f5190f = new e();

        e() {
            super(1);
        }

        public final void a(androidx.navigation.n nVar) {
            qc.q.i(nVar, "$this$navOptions");
            nVar.g(true);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.navigation.n nVar) {
            a(nVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class f extends r implements pc.l<androidx.navigation.c, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.b0 f5191f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.b0 f5192m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d f5193p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f5194q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ec.k<NavBackStackEntryState> f5195r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qc.b0 b0Var, qc.b0 b0Var2, d dVar, boolean z10, ec.k<NavBackStackEntryState> kVar) {
            super(1);
            this.f5191f = b0Var;
            this.f5192m = b0Var2;
            this.f5193p = dVar;
            this.f5194q = z10;
            this.f5195r = kVar;
        }

        public final void a(androidx.navigation.c cVar) {
            qc.q.i(cVar, "entry");
            this.f5191f.f21657f = true;
            this.f5192m.f21657f = true;
            this.f5193p.i0(cVar, this.f5194q, this.f5195r);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.navigation.c cVar) {
            a(cVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class g extends r implements pc.l<androidx.navigation.i, androidx.navigation.i> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f5196f = new g();

        g() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.i invoke(androidx.navigation.i iVar) {
            qc.q.i(iVar, "destination");
            androidx.navigation.j r10 = iVar.r();
            boolean z10 = false;
            if (r10 != null && r10.P() == iVar.n()) {
                z10 = true;
            }
            if (z10) {
                return iVar.r();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class h extends r implements pc.l<androidx.navigation.i, Boolean> {
        h() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.navigation.i iVar) {
            qc.q.i(iVar, "destination");
            return Boolean.valueOf(!d.this.f5172o.containsKey(Integer.valueOf(iVar.n())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class i extends r implements pc.l<androidx.navigation.i, androidx.navigation.i> {

        /* renamed from: f  reason: collision with root package name */
        public static final i f5198f = new i();

        i() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.i invoke(androidx.navigation.i iVar) {
            qc.q.i(iVar, "destination");
            androidx.navigation.j r10 = iVar.r();
            boolean z10 = false;
            if (r10 != null && r10.P() == iVar.n()) {
                z10 = true;
            }
            if (z10) {
                return iVar.r();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class j extends r implements pc.l<androidx.navigation.i, Boolean> {
        j() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.navigation.i iVar) {
            qc.q.i(iVar, "destination");
            return Boolean.valueOf(!d.this.f5172o.containsKey(Integer.valueOf(iVar.n())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class k extends r implements pc.l<androidx.navigation.c, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.b0 f5200f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<androidx.navigation.c> f5201m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d0 f5202p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ d f5203q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Bundle f5204r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(qc.b0 b0Var, List<androidx.navigation.c> list, d0 d0Var, d dVar, Bundle bundle) {
            super(1);
            this.f5200f = b0Var;
            this.f5201m = list;
            this.f5202p = d0Var;
            this.f5203q = dVar;
            this.f5204r = bundle;
        }

        public final void a(androidx.navigation.c cVar) {
            List<androidx.navigation.c> i10;
            qc.q.i(cVar, "entry");
            this.f5200f.f21657f = true;
            int indexOf = this.f5201m.indexOf(cVar);
            if (indexOf == -1) {
                i10 = t.i();
            } else {
                int i11 = indexOf + 1;
                i10 = this.f5201m.subList(this.f5202p.f21667f, i11);
                this.f5202p.f21667f = i11;
            }
            this.f5203q.p(cVar.e(), this.f5204r, cVar, i10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.navigation.c cVar) {
            a(cVar);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class l extends r implements pc.l<androidx.navigation.n, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.navigation.i f5205f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f5206m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NavController.kt */
        /* loaded from: classes.dex */
        public static final class a extends r implements pc.l<k3.c, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f5207f = new a();

            a() {
                super(1);
            }

            public final void a(k3.c cVar) {
                qc.q.i(cVar, "$this$anim");
                cVar.e(0);
                cVar.f(0);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(k3.c cVar) {
                a(cVar);
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NavController.kt */
        /* loaded from: classes.dex */
        public static final class b extends r implements pc.l<k3.q, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final b f5208f = new b();

            b() {
                super(1);
            }

            public final void a(k3.q qVar) {
                qc.q.i(qVar, "$this$popUpTo");
                qVar.c(true);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(k3.q qVar) {
                a(qVar);
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.navigation.i iVar, d dVar) {
            super(1);
            this.f5205f = iVar;
            this.f5206m = dVar;
        }

        public final void a(androidx.navigation.n nVar) {
            boolean z10;
            androidx.navigation.j jVar;
            qc.q.i(nVar, "$this$navOptions");
            nVar.a(a.f5207f);
            androidx.navigation.i iVar = this.f5205f;
            boolean z11 = false;
            if (iVar instanceof androidx.navigation.j) {
                xc.g<androidx.navigation.i> c10 = androidx.navigation.i.f5309w.c(iVar);
                d dVar = this.f5206m;
                Iterator<androidx.navigation.i> it = c10.iterator();
                while (true) {
                    if (it.hasNext()) {
                        androidx.navigation.i next = it.next();
                        androidx.navigation.i D = dVar.D();
                        if (D != null) {
                            jVar = D.r();
                        } else {
                            jVar = null;
                        }
                        if (qc.q.d(next, jVar)) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    z11 = true;
                }
            }
            if (z11 && d.I) {
                nVar.c(androidx.navigation.j.C.a(this.f5206m.F()).n(), b.f5208f);
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.navigation.n nVar) {
            a(nVar);
            return w.f13270a;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    static final class m extends r implements pc.a<androidx.navigation.l> {
        m() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.l invoke() {
            androidx.navigation.l lVar = d.this.f5160c;
            if (lVar == null) {
                return new androidx.navigation.l(d.this.B(), d.this.f5181x);
            }
            return lVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class n extends r implements pc.l<androidx.navigation.c, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.b0 f5210f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f5211m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.navigation.i f5212p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Bundle f5213q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(qc.b0 b0Var, d dVar, androidx.navigation.i iVar, Bundle bundle) {
            super(1);
            this.f5210f = b0Var;
            this.f5211m = dVar;
            this.f5212p = iVar;
            this.f5213q = bundle;
        }

        public final void a(androidx.navigation.c cVar) {
            qc.q.i(cVar, "it");
            this.f5210f.f21657f = true;
            d.q(this.f5211m, this.f5212p, this.f5213q, cVar, null, 8, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.navigation.c cVar) {
            a(cVar);
            return w.f13270a;
        }
    }

    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class o extends androidx.activity.m {
        o() {
            super(false);
        }

        @Override // androidx.activity.m
        public void b() {
            d.this.b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    /* loaded from: classes.dex */
    public static final class p extends r implements pc.l<String, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f5215f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f5215f = str;
        }

        @Override // pc.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(qc.q.d(str, this.f5215f));
        }
    }

    public d(Context context) {
        xc.g f10;
        Object obj;
        List i10;
        List i11;
        dc.f b10;
        qc.q.i(context, "context");
        this.f5158a = context;
        f10 = xc.m.f(context, C0111d.f5189f);
        Iterator it = f10.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f5159b = (Activity) obj;
        this.f5165h = new ec.k<>();
        i10 = t.i();
        x<List<androidx.navigation.c>> a10 = n0.a(i10);
        this.f5166i = a10;
        this.f5167j = dd.i.b(a10);
        i11 = t.i();
        x<List<androidx.navigation.c>> a11 = n0.a(i11);
        this.f5168k = a11;
        this.f5169l = dd.i.b(a11);
        this.f5170m = new LinkedHashMap();
        this.f5171n = new LinkedHashMap();
        this.f5172o = new LinkedHashMap();
        this.f5173p = new LinkedHashMap();
        this.f5176s = new CopyOnWriteArrayList<>();
        this.f5177t = p.b.INITIALIZED;
        this.f5178u = new s() { // from class: k3.j
            @Override // androidx.lifecycle.s
            public final void c(v vVar, p.a aVar) {
                androidx.navigation.d.M(androidx.navigation.d.this, vVar, aVar);
            }
        };
        this.f5179v = new o();
        this.f5180w = true;
        this.f5181x = new q();
        this.f5182y = new LinkedHashMap();
        this.B = new LinkedHashMap();
        q qVar = this.f5181x;
        qVar.b(new androidx.navigation.k(qVar));
        this.f5181x.b(new androidx.navigation.a(this.f5158a));
        this.D = new ArrayList();
        b10 = dc.h.b(new m());
        this.E = b10;
        dd.w<androidx.navigation.c> b11 = dd.d0.b(1, 0, cd.a.DROP_OLDEST, 2, null);
        this.F = b11;
        this.G = dd.i.a(b11);
    }

    private final int E() {
        ec.k<androidx.navigation.c> kVar = this.f5165h;
        int i10 = 0;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<androidx.navigation.c> it = kVar.iterator();
            while (it.hasNext()) {
                if ((!(it.next().e() instanceof androidx.navigation.j)) != false && (i10 = i10 + 1) < 0) {
                    t.q();
                }
            }
        }
        return i10;
    }

    private final List<androidx.navigation.c> K(ec.k<NavBackStackEntryState> kVar) {
        androidx.navigation.i F;
        ArrayList arrayList = new ArrayList();
        androidx.navigation.c o10 = this.f5165h.o();
        if (o10 == null || (F = o10.e()) == null) {
            F = F();
        }
        if (kVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : kVar) {
                androidx.navigation.i y10 = y(F, navBackStackEntryState.a());
                if (y10 != null) {
                    arrayList.add(navBackStackEntryState.c(this.f5158a, y10, G(), this.f5175r));
                    F = y10;
                } else {
                    throw new IllegalStateException(("Restore State failed: destination " + androidx.navigation.i.f5309w.b(this.f5158a, navBackStackEntryState.a()) + " cannot be found from the current destination " + F).toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect condition in loop: B:27:0x0062 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean L(androidx.navigation.i r6, android.os.Bundle r7) {
        /*
            r5 = this;
            androidx.navigation.c r0 = r5.C()
            boolean r1 = r6 instanceof androidx.navigation.j
            if (r1 == 0) goto L16
            androidx.navigation.j$a r1 = androidx.navigation.j.C
            r2 = r6
            androidx.navigation.j r2 = (androidx.navigation.j) r2
            androidx.navigation.i r1 = r1.a(r2)
            int r1 = r1.n()
            goto L1a
        L16:
            int r1 = r6.n()
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2c
            androidx.navigation.i r0 = r0.e()
            if (r0 == 0) goto L2c
            int r0 = r0.n()
            if (r1 != r0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L30
            return r3
        L30:
            ec.k r0 = new ec.k
            r0.<init>()
            ec.k<androidx.navigation.c> r1 = r5.f5165h
            int r4 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r4)
        L3f:
            boolean r4 = r1.hasPrevious()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r1.previous()
            androidx.navigation.c r4 = (androidx.navigation.c) r4
            androidx.navigation.i r4 = r4.e()
            if (r4 != r6) goto L53
            r4 = 1
            goto L54
        L53:
            r4 = 0
        L54:
            if (r4 == 0) goto L3f
            int r6 = r1.nextIndex()
            goto L5c
        L5b:
            r6 = -1
        L5c:
            ec.k<androidx.navigation.c> r1 = r5.f5165h
            int r1 = ec.r.k(r1)
            if (r1 < r6) goto L80
            ec.k<androidx.navigation.c> r1 = r5.f5165h
            java.lang.Object r1 = r1.u()
            androidx.navigation.c r1 = (androidx.navigation.c) r1
            r5.v0(r1)
            androidx.navigation.c r3 = new androidx.navigation.c
            androidx.navigation.i r4 = r1.e()
            android.os.Bundle r4 = r4.h(r7)
            r3.<init>(r1, r4)
            r0.f(r3)
            goto L5c
        L80:
            java.util.Iterator r6 = r0.iterator()
        L84:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lab
            java.lang.Object r7 = r6.next()
            androidx.navigation.c r7 = (androidx.navigation.c) r7
            androidx.navigation.i r1 = r7.e()
            androidx.navigation.j r1 = r1.r()
            if (r1 == 0) goto La5
            int r1 = r1.n()
            androidx.navigation.c r1 = r5.A(r1)
            r5.N(r7, r1)
        La5:
            ec.k<androidx.navigation.c> r1 = r5.f5165h
            r1.add(r7)
            goto L84
        Lab:
            java.util.Iterator r6 = r0.iterator()
        Laf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = r6.next()
            androidx.navigation.c r7 = (androidx.navigation.c) r7
            androidx.navigation.q r0 = r5.f5181x
            androidx.navigation.i r1 = r7.e()
            java.lang.String r1 = r1.p()
            androidx.navigation.p r0 = r0.d(r1)
            r0.g(r7)
            goto Laf
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.d.L(androidx.navigation.i, android.os.Bundle):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(d dVar, v vVar, p.a aVar) {
        qc.q.i(dVar, "this$0");
        qc.q.i(vVar, "<anonymous parameter 0>");
        qc.q.i(aVar, "event");
        dVar.f5177t = aVar.getTargetState();
        if (dVar.f5161d != null) {
            Iterator<androidx.navigation.c> it = dVar.f5165h.iterator();
            while (it.hasNext()) {
                it.next().h(aVar);
            }
        }
    }

    private final void N(androidx.navigation.c cVar, androidx.navigation.c cVar2) {
        this.f5170m.put(cVar, cVar2);
        if (this.f5171n.get(cVar2) == null) {
            this.f5171n.put(cVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f5171n.get(cVar2);
        qc.q.f(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final void W(androidx.navigation.i iVar, Bundle bundle, androidx.navigation.m mVar, p.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        List<androidx.navigation.c> d10;
        Iterator<T> it = this.f5182y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        qc.b0 b0Var = new qc.b0();
        if (mVar != null && mVar.e() != -1) {
            z10 = g0(mVar.e(), mVar.f(), mVar.h());
        } else {
            z10 = false;
        }
        Bundle h10 = iVar.h(bundle);
        if (mVar != null && mVar.i()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && this.f5172o.containsKey(Integer.valueOf(iVar.n()))) {
            b0Var.f21657f = m0(iVar.n(), h10, mVar, aVar);
            z13 = false;
        } else {
            if (mVar != null && mVar.g()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && L(iVar, bundle)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                androidx.navigation.c b10 = c.a.b(androidx.navigation.c.B, this.f5158a, iVar, h10, G(), this.f5175r, null, null, 96, null);
                androidx.navigation.p<? extends androidx.navigation.i> d11 = this.f5181x.d(iVar.p());
                d10 = ec.s.d(b10);
                Y(d11, d10, mVar, aVar, new n(b0Var, this, iVar, h10));
            }
        }
        x0();
        Iterator<T> it2 = this.f5182y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        if (!z10 && !b0Var.f21657f && !z13) {
            w0();
        } else {
            u();
        }
    }

    private final void Y(androidx.navigation.p<? extends androidx.navigation.i> pVar, List<androidx.navigation.c> list, androidx.navigation.m mVar, p.a aVar, pc.l<? super androidx.navigation.c, w> lVar) {
        this.f5183z = lVar;
        pVar.e(list, mVar, aVar);
        this.f5183z = null;
    }

    private final void a0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f5162e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                q qVar = this.f5181x;
                qc.q.h(next, AppMeasurementSdk.ConditionalUserProperty.NAME);
                androidx.navigation.p d10 = qVar.d(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    d10.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f5163f;
        boolean z10 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                qc.q.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                androidx.navigation.i x10 = x(navBackStackEntryState.a());
                if (x10 != null) {
                    androidx.navigation.c c10 = navBackStackEntryState.c(this.f5158a, x10, G(), this.f5175r);
                    androidx.navigation.p<? extends androidx.navigation.i> d11 = this.f5181x.d(x10.p());
                    Map<androidx.navigation.p<? extends androidx.navigation.i>, b> map = this.f5182y;
                    b bVar = map.get(d11);
                    if (bVar == null) {
                        bVar = new b(this, d11);
                        map.put(d11, bVar);
                    }
                    this.f5165h.add(c10);
                    bVar.o(c10);
                    androidx.navigation.j r10 = c10.e().r();
                    if (r10 != null) {
                        N(c10, A(r10.n()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + androidx.navigation.i.f5309w.b(this.f5158a, navBackStackEntryState.a()) + " cannot be found from the current destination " + D());
                }
            }
            x0();
            this.f5163f = null;
        }
        Collection<androidx.navigation.p<? extends androidx.navigation.i>> values = this.f5181x.e().values();
        ArrayList<androidx.navigation.p<? extends androidx.navigation.i>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((androidx.navigation.p) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (androidx.navigation.p<? extends androidx.navigation.i> pVar : arrayList) {
            Map<androidx.navigation.p<? extends androidx.navigation.i>, b> map2 = this.f5182y;
            b bVar2 = map2.get(pVar);
            if (bVar2 == null) {
                bVar2 = new b(this, pVar);
                map2.put(pVar, bVar2);
            }
            pVar.f(bVar2);
        }
        if (this.f5161d != null && this.f5165h.isEmpty()) {
            if (!this.f5164g && (activity = this.f5159b) != null) {
                qc.q.f(activity);
                if (J(activity.getIntent())) {
                    z10 = true;
                }
            }
            if (!z10) {
                androidx.navigation.j jVar = this.f5161d;
                qc.q.f(jVar);
                W(jVar, bundle, null, null);
                return;
            }
            return;
        }
        u();
    }

    private final void f0(androidx.navigation.p<? extends androidx.navigation.i> pVar, androidx.navigation.c cVar, boolean z10, pc.l<? super androidx.navigation.c, w> lVar) {
        this.A = lVar;
        pVar.j(cVar, z10);
        this.A = null;
    }

    private final boolean g0(int i10, boolean z10, boolean z11) {
        List t02;
        androidx.navigation.i iVar;
        if (this.f5165h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        t02 = b0.t0(this.f5165h);
        Iterator it = t02.iterator();
        while (true) {
            if (it.hasNext()) {
                iVar = ((androidx.navigation.c) it.next()).e();
                androidx.navigation.p d10 = this.f5181x.d(iVar.p());
                if (z10 || iVar.n() != i10) {
                    arrayList.add(d10);
                }
                if (iVar.n() == i10) {
                    break;
                }
            } else {
                iVar = null;
                break;
            }
        }
        if (iVar == null) {
            Log.i("NavController", "Ignoring popBackStack to destination " + androidx.navigation.i.f5309w.b(this.f5158a, i10) + " as it was not found on the current back stack");
            return false;
        }
        return v(arrayList, iVar, z10, z11);
    }

    static /* synthetic */ boolean h0(d dVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return dVar.g0(i10, z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(androidx.navigation.c cVar, boolean z10, ec.k<NavBackStackEntryState> kVar) {
        boolean z11;
        androidx.navigation.e eVar;
        l0<Set<androidx.navigation.c>> c10;
        Set<androidx.navigation.c> value;
        androidx.navigation.c last = this.f5165h.last();
        if (qc.q.d(last, cVar)) {
            this.f5165h.u();
            b bVar = this.f5182y.get(I().d(last.e().p()));
            boolean z12 = true;
            if (bVar != null && (c10 = bVar.c()) != null && (value = c10.getValue()) != null && value.contains(last)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !this.f5171n.containsKey(last)) {
                z12 = false;
            }
            p.b b10 = last.getLifecycle().b();
            p.b bVar2 = p.b.CREATED;
            if (b10.isAtLeast(bVar2)) {
                if (z10) {
                    last.k(bVar2);
                    kVar.f(new NavBackStackEntryState(last));
                }
                if (!z12) {
                    last.k(p.b.DESTROYED);
                    v0(last);
                } else {
                    last.k(bVar2);
                }
            }
            if (!z10 && !z12 && (eVar = this.f5175r) != null) {
                eVar.c(last.f());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + cVar.e() + ", which is not the top of the back stack (" + last.e() + ')').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void j0(d dVar, androidx.navigation.c cVar, boolean z10, ec.k kVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                kVar = new ec.k();
            }
            dVar.i0(cVar, z10, kVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final boolean m0(int i10, Bundle bundle, androidx.navigation.m mVar, p.a aVar) {
        if (!this.f5172o.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = this.f5172o.get(Integer.valueOf(i10));
        y.B(this.f5172o.values(), new p(str));
        return w(K((ec.k) k0.d(this.f5173p).remove(str)), bundle, mVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0268, code lost:
    
        r1 = (androidx.navigation.c) r0.next();
        r2 = r32.f5182y.get(r32.f5181x.d(r1.e().p()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0282, code lost:
    
        if (r2 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0284, code lost:
    
        r2.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02ad, code lost:
    
        throw new java.lang.IllegalStateException(("NavigatorBackStack for " + r33.p() + " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ae, code lost:
    
        r32.f5165h.addAll(r11);
        r32.f5165h.add(r8);
        r0 = ec.b0.s0(r11, r8);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c6, code lost:
    
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02c8, code lost:
    
        r1 = (androidx.navigation.c) r0.next();
        r2 = r1.e().r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d6, code lost:
    
        if (r2 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r5 = new ec.k();
        r4 = true;
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d8, code lost:
    
        N(r1, A(r2.n()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if ((r33 instanceof androidx.navigation.j) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        qc.q.f(r0);
        r3 = r0.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r0.hasPrevious() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (qc.q.d(r1.e(), r3) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r20 = r12;
        r0 = r13;
        r2 = r15;
        r8 = r14;
        r1 = androidx.navigation.c.a.b(androidx.navigation.c.B, r32.f5158a, r3, r34, G(), r32.f5175r, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        r20 = r12;
        r0 = r13;
        r8 = r14;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r5.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if ((r32.f5165h.isEmpty() ^ r4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if (r32.f5165h.last().e() != r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        r13 = r0;
        r14 = r2;
        r9 = r3;
        r10 = true;
        r11 = r5;
        j0(r32, r32.f5165h.last(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e8, code lost:
    
        r13 = r0;
        r14 = r2;
        r9 = r3;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        r9 = r3;
        r11 = r5;
        r20 = r12;
        r8 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        r10 = true;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f4, code lost:
    
        if (r9 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r9 != r33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        r0 = r9;
        r5 = r11;
        r15 = r14;
        r12 = r20;
        r4 = true;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
    
        r11 = r5;
        r20 = r12;
        r8 = r14;
        r14 = r15;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        if ((r12 instanceof k3.d) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
    
        if (r11.isEmpty() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r12 = ((androidx.navigation.c) r11.first()).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
    
        if (r12 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
    
        if (x(r12.n()) == r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0128, code lost:
    
        r12 = r12.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
    
        if (r12 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012e, code lost:
    
        if (r14 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        if (r34.isEmpty() != r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        if (r4 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
    
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        if (r0.hasPrevious() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r32.f5165h.isEmpty() != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014d, code lost:
    
        r1 = r0.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        if (qc.q.d(r1.e(), r12) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0161, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0163, code lost:
    
        if (r1 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        r1 = androidx.navigation.c.a.b(androidx.navigation.c.B, r32.f5158a, r12, r12.h(r15), G(), r32.f5175r, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r11.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018d, code lost:
    
        if (r11.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018f, code lost:
    
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r12 = ((androidx.navigation.c) r11.first()).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a2, code lost:
    
        if (r32.f5165h.isEmpty() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        if ((r32.f5165h.last().e() instanceof androidx.navigation.j) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        r0 = r32.f5165h.last().e();
        qc.q.g(r0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        if (((androidx.navigation.j) r0).J(r12.n(), false) != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d1, code lost:
    
        j0(r32, r32.f5165h.last(), false, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e4, code lost:
    
        r0 = r32.f5165h.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if ((r32.f5165h.last().e() instanceof k3.d) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ec, code lost:
    
        if (r0 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ee, code lost:
    
        r0 = (androidx.navigation.c) r11.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f6, code lost:
    
        r0 = r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0203, code lost:
    
        if (qc.q.d(r0, r32.f5161d) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0205, code lost:
    
        r0 = r13.listIterator(r36.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0211, code lost:
    
        if (r0.hasPrevious() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0213, code lost:
    
        r1 = r0.previous();
        r2 = r1.e();
        r3 = r32.f5161d;
        qc.q.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0227, code lost:
    
        if (qc.q.d(r2, r3) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0229, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022b, code lost:
    
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022d, code lost:
    
        if (r18 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022f, code lost:
    
        r19 = androidx.navigation.c.B;
        r0 = r32.f5158a;
        r1 = r32.f5161d;
        qc.q.f(r1);
        r2 = r32.f5161d;
        qc.q.f(r2);
        r18 = androidx.navigation.c.a.b(r19, r0, r1, r2.h(r14), G(), r32.f5175r, null, null, 96, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0259, code lost:
    
        r11.f(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025e, code lost:
    
        r0 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0266, code lost:
    
        if (r0.hasNext() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (h0(r32, r32.f5165h.last().e().n(), true, false, 4, null) != false) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(androidx.navigation.i r33, android.os.Bundle r34, androidx.navigation.c r35, java.util.List<androidx.navigation.c> r36) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.d.p(androidx.navigation.i, android.os.Bundle, androidx.navigation.c, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(d dVar, androidx.navigation.i iVar, Bundle bundle, androidx.navigation.c cVar, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                list = t.i();
            }
            dVar.p(iVar, bundle, cVar, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    private final boolean s(int i10) {
        Iterator<T> it = this.f5182y.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        boolean m02 = m0(i10, null, k3.m.a(e.f5190f), null);
        Iterator<T> it2 = this.f5182y.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        if (m02 && g0(i10, true, false)) {
            return true;
        }
        return false;
    }

    private final boolean t0() {
        List c02;
        Object F;
        boolean z10;
        Bundle bundle;
        Object F2;
        int i10 = 0;
        if (!this.f5164g) {
            return false;
        }
        Activity activity = this.f5159b;
        qc.q.f(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        qc.q.f(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        qc.q.f(intArray);
        c02 = ec.p.c0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        F = y.F(c02);
        int intValue = ((Number) F).intValue();
        if (parcelableArrayList != null) {
            F2 = y.F(parcelableArrayList);
            Bundle bundle2 = (Bundle) F2;
        }
        if (c02.isEmpty()) {
            return false;
        }
        androidx.navigation.i y10 = y(F(), intValue);
        if (y10 instanceof androidx.navigation.j) {
            intValue = androidx.navigation.j.C.a((androidx.navigation.j) y10).n();
        }
        androidx.navigation.i D = D();
        if (D != null && intValue == D.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        androidx.navigation.g t10 = t();
        Bundle a10 = androidx.core.os.e.a(dc.r.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle3 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle3 != null) {
            a10.putAll(bundle3);
        }
        t10.e(a10);
        for (Object obj : c02) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                t.r();
            }
            int intValue2 = ((Number) obj).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i10);
            } else {
                bundle = null;
            }
            t10.a(intValue2, bundle);
            i10 = i11;
        }
        t10.b().k();
        Activity activity2 = this.f5159b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    private final boolean u() {
        List<androidx.navigation.c> F0;
        List<androidx.navigation.c> F02;
        while (!this.f5165h.isEmpty() && (this.f5165h.last().e() instanceof androidx.navigation.j)) {
            j0(this, this.f5165h.last(), false, null, 6, null);
        }
        androidx.navigation.c o10 = this.f5165h.o();
        if (o10 != null) {
            this.D.add(o10);
        }
        this.C++;
        w0();
        int i10 = this.C - 1;
        this.C = i10;
        if (i10 == 0) {
            F0 = b0.F0(this.D);
            this.D.clear();
            for (androidx.navigation.c cVar : F0) {
                Iterator<c> it = this.f5176s.iterator();
                while (it.hasNext()) {
                    it.next().a(this, cVar.e(), cVar.c());
                }
                this.F.e(cVar);
            }
            x<List<androidx.navigation.c>> xVar = this.f5166i;
            F02 = b0.F0(this.f5165h);
            xVar.e(F02);
            this.f5168k.e(k0());
        }
        if (o10 != null) {
            return true;
        }
        return false;
    }

    private final boolean u0() {
        Bundle bundle;
        androidx.navigation.i D = D();
        qc.q.f(D);
        int n10 = D.n();
        for (androidx.navigation.j r10 = D.r(); r10 != null; r10 = r10.r()) {
            if (r10.P() != n10) {
                Bundle bundle2 = new Bundle();
                Activity activity = this.f5159b;
                if (activity != null) {
                    qc.q.f(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f5159b;
                        qc.q.f(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f5159b;
                            qc.q.f(activity3);
                            bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            androidx.navigation.j jVar = this.f5161d;
                            qc.q.f(jVar);
                            Activity activity4 = this.f5159b;
                            qc.q.f(activity4);
                            Intent intent = activity4.getIntent();
                            qc.q.h(intent, "activity!!.intent");
                            i.b w10 = jVar.w(new androidx.navigation.h(intent));
                            if (w10 != null) {
                                bundle = w10.f();
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundle2.putAll(w10.d().h(w10.f()));
                            }
                        }
                    }
                }
                androidx.navigation.g.g(new androidx.navigation.g(this), r10.n(), null, 2, null).e(bundle2).b().k();
                Activity activity5 = this.f5159b;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            n10 = r10.n();
        }
        return false;
    }

    private final boolean v(List<? extends androidx.navigation.p<?>> list, androidx.navigation.i iVar, boolean z10, boolean z11) {
        xc.g f10;
        xc.g B;
        xc.g f11;
        xc.g<androidx.navigation.i> B2;
        String str;
        qc.b0 b0Var = new qc.b0();
        ec.k<NavBackStackEntryState> kVar = new ec.k<>();
        Iterator<? extends androidx.navigation.p<?>> it = list.iterator();
        while (it.hasNext()) {
            androidx.navigation.p<? extends androidx.navigation.i> pVar = (androidx.navigation.p) it.next();
            qc.b0 b0Var2 = new qc.b0();
            f0(pVar, this.f5165h.last(), z11, new f(b0Var2, b0Var, this, z11, kVar));
            if (!b0Var2.f21657f) {
                break;
            }
        }
        if (z11) {
            if (!z10) {
                f11 = xc.m.f(iVar, g.f5196f);
                B2 = xc.o.B(f11, new h());
                for (androidx.navigation.i iVar2 : B2) {
                    Map<Integer, String> map = this.f5172o;
                    Integer valueOf = Integer.valueOf(iVar2.n());
                    NavBackStackEntryState m10 = kVar.m();
                    if (m10 != null) {
                        str = m10.b();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if ((!kVar.isEmpty()) != false) {
                NavBackStackEntryState first = kVar.first();
                f10 = xc.m.f(x(first.a()), i.f5198f);
                B = xc.o.B(f10, new j());
                Iterator it2 = B.iterator();
                while (it2.hasNext()) {
                    this.f5172o.put(Integer.valueOf(((androidx.navigation.i) it2.next()).n()), first.b());
                }
                this.f5173p.put(first.b(), kVar);
            }
        }
        x0();
        return b0Var.f21657f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean w(java.util.List<androidx.navigation.c> r12, android.os.Bundle r13, androidx.navigation.m r14, androidx.navigation.p.a r15) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            r4 = r3
            androidx.navigation.c r4 = (androidx.navigation.c) r4
            androidx.navigation.i r4 = r4.e()
            boolean r4 = r4 instanceof androidx.navigation.j
            if (r4 != 0) goto L11
            r2.add(r3)
            goto L11
        L2a:
            java.util.Iterator r1 = r2.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            androidx.navigation.c r2 = (androidx.navigation.c) r2
            java.lang.Object r3 = ec.r.n0(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L55
            java.lang.Object r4 = ec.r.m0(r3)
            androidx.navigation.c r4 = (androidx.navigation.c) r4
            if (r4 == 0) goto L55
            androidx.navigation.i r4 = r4.e()
            if (r4 == 0) goto L55
            java.lang.String r4 = r4.p()
            goto L56
        L55:
            r4 = 0
        L56:
            androidx.navigation.i r5 = r2.e()
            java.lang.String r5 = r5.p()
            boolean r4 = qc.q.d(r4, r5)
            if (r4 == 0) goto L6a
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r2)
            goto L2e
        L6a:
            r3 = 1
            androidx.navigation.c[] r3 = new androidx.navigation.c[r3]
            r4 = 0
            r3[r4] = r2
            java.util.List r2 = ec.r.n(r3)
            r0.add(r2)
            goto L2e
        L78:
            qc.b0 r1 = new qc.b0
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            androidx.navigation.q r3 = r11.f5181x
            java.lang.Object r4 = ec.r.a0(r2)
            androidx.navigation.c r4 = (androidx.navigation.c) r4
            androidx.navigation.i r4 = r4.e()
            java.lang.String r4 = r4.p()
            androidx.navigation.p r9 = r3.d(r4)
            qc.d0 r6 = new qc.d0
            r6.<init>()
            androidx.navigation.d$k r10 = new androidx.navigation.d$k
            r3 = r10
            r4 = r1
            r5 = r12
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r11
            r4 = r9
            r5 = r2
            r6 = r14
            r7 = r15
            r8 = r10
            r3.Y(r4, r5, r6, r7, r8)
            goto L81
        Lba:
            boolean r12 = r1.f21657f
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.d.w(java.util.List, android.os.Bundle, androidx.navigation.m, androidx.navigation.p$a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        if (E() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x0() {
        /*
            r3 = this;
            androidx.activity.m r0 = r3.f5179v
            boolean r1 = r3.f5180w
            if (r1 == 0) goto Le
            int r1 = r3.E()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.d.x0():void");
    }

    private final androidx.navigation.i y(androidx.navigation.i iVar, int i10) {
        androidx.navigation.j r10;
        if (iVar.n() == i10) {
            return iVar;
        }
        if (iVar instanceof androidx.navigation.j) {
            r10 = (androidx.navigation.j) iVar;
        } else {
            r10 = iVar.r();
            qc.q.f(r10);
        }
        return r10.I(i10);
    }

    private final String z(int[] iArr) {
        androidx.navigation.j jVar;
        androidx.navigation.j jVar2 = this.f5161d;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            androidx.navigation.i iVar = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                androidx.navigation.j jVar3 = this.f5161d;
                qc.q.f(jVar3);
                if (jVar3.n() == i11) {
                    iVar = this.f5161d;
                }
            } else {
                qc.q.f(jVar2);
                iVar = jVar2.I(i11);
            }
            if (iVar == null) {
                return androidx.navigation.i.f5309w.b(this.f5158a, i11);
            }
            if (i10 != iArr.length - 1 && (iVar instanceof androidx.navigation.j)) {
                while (true) {
                    jVar = (androidx.navigation.j) iVar;
                    qc.q.f(jVar);
                    if (!(jVar.I(jVar.P()) instanceof androidx.navigation.j)) {
                        break;
                    }
                    iVar = jVar.I(jVar.P());
                }
                jVar2 = jVar;
            }
            i10++;
        }
    }

    public androidx.navigation.c A(int i10) {
        androidx.navigation.c cVar;
        boolean z10;
        ec.k<androidx.navigation.c> kVar = this.f5165h;
        ListIterator<androidx.navigation.c> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                cVar = listIterator.previous();
                if (cVar.e().n() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                cVar = null;
                break;
            }
        }
        androidx.navigation.c cVar2 = cVar;
        if (cVar2 != null) {
            return cVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + D()).toString());
    }

    public final Context B() {
        return this.f5158a;
    }

    public androidx.navigation.c C() {
        return this.f5165h.o();
    }

    public androidx.navigation.i D() {
        androidx.navigation.c C = C();
        if (C != null) {
            return C.e();
        }
        return null;
    }

    public androidx.navigation.j F() {
        androidx.navigation.j jVar = this.f5161d;
        if (jVar != null) {
            qc.q.g(jVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return jVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final p.b G() {
        if (this.f5174q == null) {
            return p.b.CREATED;
        }
        return this.f5177t;
    }

    public androidx.navigation.l H() {
        return (androidx.navigation.l) this.E.getValue();
    }

    public q I() {
        return this.f5181x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean J(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.d.J(android.content.Intent):boolean");
    }

    public void O(int i10) {
        P(i10, null);
    }

    public void P(int i10, Bundle bundle) {
        Q(i10, bundle, null);
    }

    public void Q(int i10, Bundle bundle, androidx.navigation.m mVar) {
        R(i10, bundle, mVar, null);
    }

    public void R(int i10, Bundle bundle, androidx.navigation.m mVar, p.a aVar) {
        androidx.navigation.i e10;
        int i11;
        boolean z10;
        if (this.f5165h.isEmpty()) {
            e10 = this.f5161d;
        } else {
            e10 = this.f5165h.last().e();
        }
        if (e10 != null) {
            k3.e k10 = e10.k(i10);
            Bundle bundle2 = null;
            if (k10 != null) {
                if (mVar == null) {
                    mVar = k10.c();
                }
                i11 = k10.b();
                Bundle a10 = k10.a();
                if (a10 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a10);
                }
            } else {
                i11 = i10;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i11 == 0 && mVar != null && mVar.e() != -1) {
                c0(mVar.e(), mVar.f());
                return;
            }
            boolean z11 = true;
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.navigation.i x10 = x(i11);
                if (x10 == null) {
                    i.a aVar2 = androidx.navigation.i.f5309w;
                    String b10 = aVar2.b(this.f5158a, i11);
                    if (k10 != null) {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalArgumentException(("Navigation destination " + b10 + " referenced from action " + aVar2.b(this.f5158a, i10) + " cannot be found from the current destination " + e10).toString());
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + b10 + " cannot be found from the current destination " + e10);
                }
                W(x10, bundle2, mVar, aVar);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
    }

    public void S(Uri uri) {
        qc.q.i(uri, "deepLink");
        T(new androidx.navigation.h(uri, null, null));
    }

    public void T(androidx.navigation.h hVar) {
        qc.q.i(hVar, "request");
        U(hVar, null);
    }

    public void U(androidx.navigation.h hVar, androidx.navigation.m mVar) {
        qc.q.i(hVar, "request");
        V(hVar, mVar, null);
    }

    public void V(androidx.navigation.h hVar, androidx.navigation.m mVar, p.a aVar) {
        qc.q.i(hVar, "request");
        androidx.navigation.j jVar = this.f5161d;
        if (jVar != null) {
            qc.q.f(jVar);
            i.b w10 = jVar.w(hVar);
            if (w10 != null) {
                Bundle h10 = w10.d().h(w10.f());
                if (h10 == null) {
                    h10 = new Bundle();
                }
                androidx.navigation.i d10 = w10.d();
                Intent intent = new Intent();
                intent.setDataAndType(hVar.c(), hVar.b());
                intent.setAction(hVar.a());
                h10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                W(d10, h10, mVar, aVar);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + hVar + " cannot be found in the navigation graph " + this.f5161d);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + hVar + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public void X(k3.k kVar) {
        qc.q.i(kVar, "directions");
        Q(kVar.getActionId(), kVar.getArguments(), null);
    }

    public boolean Z() {
        Bundle bundle;
        Intent intent;
        if (E() == 1) {
            Activity activity = this.f5159b;
            int[] iArr = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            }
            if (iArr != null) {
                return t0();
            }
            return u0();
        }
        return b0();
    }

    public boolean b0() {
        if (this.f5165h.isEmpty()) {
            return false;
        }
        androidx.navigation.i D = D();
        qc.q.f(D);
        return c0(D.n(), true);
    }

    public boolean c0(int i10, boolean z10) {
        return d0(i10, z10, false);
    }

    public boolean d0(int i10, boolean z10, boolean z11) {
        if (g0(i10, z10, z11) && u()) {
            return true;
        }
        return false;
    }

    public final void e0(androidx.navigation.c cVar, pc.a<w> aVar) {
        qc.q.i(cVar, "popUpTo");
        qc.q.i(aVar, "onComplete");
        int indexOf = this.f5165h.indexOf(cVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + cVar + " as it was not found on the current back stack");
            return;
        }
        int i10 = indexOf + 1;
        if (i10 != this.f5165h.size()) {
            g0(this.f5165h.get(i10).e().n(), true, false);
        }
        j0(this, cVar, false, null, 6, null);
        aVar.invoke();
        x0();
        u();
    }

    public final List<androidx.navigation.c> k0() {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f5182y.values().iterator();
        while (it.hasNext()) {
            Set<androidx.navigation.c> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                androidx.navigation.c cVar = (androidx.navigation.c) obj;
                if (!arrayList.contains(cVar) && !cVar.g().isAtLeast(p.b.STARTED)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList2.add(obj);
                }
            }
            y.w(arrayList, arrayList2);
        }
        ec.k<androidx.navigation.c> kVar = this.f5165h;
        ArrayList arrayList3 = new ArrayList();
        for (androidx.navigation.c cVar2 : kVar) {
            androidx.navigation.c cVar3 = cVar2;
            if (!arrayList.contains(cVar3) && cVar3.g().isAtLeast(p.b.STARTED)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList3.add(cVar2);
            }
        }
        y.w(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if ((!(((androidx.navigation.c) obj2).e() instanceof androidx.navigation.j)) != false) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void l0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f5158a.getClassLoader());
        this.f5162e = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f5163f = bundle.getParcelableArray("android-support-nav:controller:backStack");
        this.f5173p.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.f5172o.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    Map<String, ec.k<NavBackStackEntryState>> map = this.f5173p;
                    qc.q.h(str, "id");
                    ec.k<NavBackStackEntryState> kVar = new ec.k<>(parcelableArray.length);
                    Iterator a10 = qc.c.a(parcelableArray);
                    while (a10.hasNext()) {
                        Parcelable parcelable = (Parcelable) a10.next();
                        qc.q.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        kVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(str, kVar);
                }
            }
        }
        this.f5164g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle n0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, androidx.navigation.p<? extends androidx.navigation.i>> entry : this.f5181x.e().entrySet()) {
            String key = entry.getKey();
            Bundle i10 = entry.getValue().i();
            if (i10 != null) {
                arrayList.add(key);
                bundle2.putBundle(key, i10);
            }
        }
        if ((!arrayList.isEmpty()) != false) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if ((!this.f5165h.isEmpty()) != false) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f5165h.size()];
            Iterator<androidx.navigation.c> it = this.f5165h.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                parcelableArr[i11] = new NavBackStackEntryState(it.next());
                i11++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if ((!this.f5172o.isEmpty()) != false) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f5172o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i12 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f5172o.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i12] = intValue;
                arrayList2.add(value);
                i12++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if ((!this.f5173p.isEmpty()) != false) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, ec.k<NavBackStackEntryState>> entry3 : this.f5173p.entrySet()) {
                String key2 = entry3.getKey();
                ec.k<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i13 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        t.r();
                    }
                    parcelableArr2[i13] = navBackStackEntryState;
                    i13 = i14;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f5164g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f5164g);
        }
        return bundle;
    }

    public void o0(int i10) {
        q0(H().b(i10), null);
    }

    public void p0(int i10, Bundle bundle) {
        q0(H().b(i10), bundle);
    }

    public void q0(androidx.navigation.j jVar, Bundle bundle) {
        List D;
        List<androidx.navigation.i> M;
        qc.q.i(jVar, "graph");
        if (!qc.q.d(this.f5161d, jVar)) {
            androidx.navigation.j jVar2 = this.f5161d;
            if (jVar2 != null) {
                for (Integer num : new ArrayList(this.f5172o.keySet())) {
                    qc.q.h(num, "id");
                    s(num.intValue());
                }
                h0(this, jVar2.n(), true, false, 4, null);
            }
            this.f5161d = jVar;
            a0(bundle);
            return;
        }
        int q10 = jVar.N().q();
        for (int i10 = 0; i10 < q10; i10++) {
            androidx.navigation.i r10 = jVar.N().r(i10);
            androidx.navigation.j jVar3 = this.f5161d;
            qc.q.f(jVar3);
            int l10 = jVar3.N().l(i10);
            androidx.navigation.j jVar4 = this.f5161d;
            qc.q.f(jVar4);
            jVar4.N().p(l10, r10);
        }
        for (androidx.navigation.c cVar : this.f5165h) {
            D = xc.o.D(androidx.navigation.i.f5309w.c(cVar.e()));
            M = z.M(D);
            androidx.navigation.i iVar = this.f5161d;
            qc.q.f(iVar);
            for (androidx.navigation.i iVar2 : M) {
                if (!qc.q.d(iVar2, this.f5161d) || !qc.q.d(iVar, jVar)) {
                    if (iVar instanceof androidx.navigation.j) {
                        iVar = ((androidx.navigation.j) iVar).I(iVar2.n());
                        qc.q.f(iVar);
                    }
                }
            }
            cVar.j(iVar);
        }
    }

    public void r(c cVar) {
        qc.q.i(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f5176s.add(cVar);
        if ((!this.f5165h.isEmpty()) != false) {
            androidx.navigation.c last = this.f5165h.last();
            cVar.a(this, last.e(), last.c());
        }
    }

    public void r0(v vVar) {
        androidx.lifecycle.p lifecycle;
        qc.q.i(vVar, "owner");
        if (qc.q.d(vVar, this.f5174q)) {
            return;
        }
        v vVar2 = this.f5174q;
        if (vVar2 != null && (lifecycle = vVar2.getLifecycle()) != null) {
            lifecycle.d(this.f5178u);
        }
        this.f5174q = vVar;
        vVar.getLifecycle().a(this.f5178u);
    }

    public void s0(b1 b1Var) {
        qc.q.i(b1Var, "viewModelStore");
        androidx.navigation.e eVar = this.f5175r;
        e.b bVar = androidx.navigation.e.f5216b;
        if (qc.q.d(eVar, bVar.a(b1Var))) {
            return;
        }
        if (this.f5165h.isEmpty()) {
            this.f5175r = bVar.a(b1Var);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    public androidx.navigation.g t() {
        return new androidx.navigation.g(this);
    }

    public final androidx.navigation.c v0(androidx.navigation.c cVar) {
        qc.q.i(cVar, "child");
        androidx.navigation.c remove = this.f5170m.remove(cVar);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f5171n.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            b bVar = this.f5182y.get(this.f5181x.d(remove.e().p()));
            if (bVar != null) {
                bVar.e(remove);
            }
            this.f5171n.remove(remove);
        }
        return remove;
    }

    public final void w0() {
        List<androidx.navigation.c> F0;
        Object m02;
        List<androidx.navigation.c> t02;
        Object a02;
        Object D;
        Object c02;
        Boolean bool;
        boolean z10;
        l0<Set<androidx.navigation.c>> c10;
        Set<androidx.navigation.c> value;
        List t03;
        F0 = b0.F0(this.f5165h);
        if (!F0.isEmpty()) {
            m02 = b0.m0(F0);
            androidx.navigation.i e10 = ((androidx.navigation.c) m02).e();
            ArrayList arrayList = new ArrayList();
            if (e10 instanceof k3.d) {
                t03 = b0.t0(F0);
                Iterator it = t03.iterator();
                while (it.hasNext()) {
                    androidx.navigation.i e11 = ((androidx.navigation.c) it.next()).e();
                    arrayList.add(e11);
                    if (!(e11 instanceof k3.d) && !(e11 instanceof androidx.navigation.j)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            t02 = b0.t0(F0);
            for (androidx.navigation.c cVar : t02) {
                p.b g10 = cVar.g();
                androidx.navigation.i e12 = cVar.e();
                boolean z11 = true;
                if (e10 != null && e12.n() == e10.n()) {
                    p.b bVar = p.b.RESUMED;
                    if (g10 != bVar) {
                        b bVar2 = this.f5182y.get(I().d(cVar.e().p()));
                        if (bVar2 != null && (c10 = bVar2.c()) != null && (value = c10.getValue()) != null) {
                            bool = Boolean.valueOf(value.contains(cVar));
                        } else {
                            bool = null;
                        }
                        if (!qc.q.d(bool, Boolean.TRUE)) {
                            AtomicInteger atomicInteger = this.f5171n.get(cVar);
                            if (atomicInteger != null && atomicInteger.get() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                hashMap.put(cVar, bVar);
                            }
                        }
                        hashMap.put(cVar, p.b.STARTED);
                    }
                    c02 = b0.c0(arrayList);
                    androidx.navigation.i iVar = (androidx.navigation.i) c02;
                    if (iVar == null || iVar.n() != e12.n()) {
                        z11 = false;
                    }
                    if (z11) {
                        y.D(arrayList);
                    }
                    e10 = e10.r();
                } else {
                    if (true ^ arrayList.isEmpty()) {
                        int n10 = e12.n();
                        a02 = b0.a0(arrayList);
                        if (n10 == ((androidx.navigation.i) a02).n()) {
                            D = y.D(arrayList);
                            androidx.navigation.i iVar2 = (androidx.navigation.i) D;
                            if (g10 == p.b.RESUMED) {
                                cVar.k(p.b.STARTED);
                            } else {
                                p.b bVar3 = p.b.STARTED;
                                if (g10 != bVar3) {
                                    hashMap.put(cVar, bVar3);
                                }
                            }
                            androidx.navigation.j r10 = iVar2.r();
                            if (r10 != null && !arrayList.contains(r10)) {
                                arrayList.add(r10);
                            }
                        }
                    }
                    cVar.k(p.b.CREATED);
                }
            }
            for (androidx.navigation.c cVar2 : F0) {
                p.b bVar4 = (p.b) hashMap.get(cVar2);
                if (bVar4 != null) {
                    cVar2.k(bVar4);
                } else {
                    cVar2.l();
                }
            }
        }
    }

    public final androidx.navigation.i x(int i10) {
        androidx.navigation.i iVar;
        androidx.navigation.j jVar = this.f5161d;
        if (jVar == null) {
            return null;
        }
        qc.q.f(jVar);
        if (jVar.n() == i10) {
            return this.f5161d;
        }
        androidx.navigation.c o10 = this.f5165h.o();
        if (o10 == null || (iVar = o10.e()) == null) {
            iVar = this.f5161d;
            qc.q.f(iVar);
        }
        return y(iVar, i10);
    }
}
