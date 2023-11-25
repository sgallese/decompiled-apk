package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.f;
import androidx.fragment.app.t0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: SpecialEffectsController.kt */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4820f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f4821a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f4822b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f4823c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4824d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4825e;

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final t0 a(ViewGroup viewGroup, FragmentManager fragmentManager) {
            qc.q.i(viewGroup, "container");
            qc.q.i(fragmentManager, "fragmentManager");
            v0 E0 = fragmentManager.E0();
            qc.q.h(E0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, E0);
        }

        public final t0 b(ViewGroup viewGroup, v0 v0Var) {
            qc.q.i(viewGroup, "container");
            qc.q.i(v0Var, "factory");
            int i10 = e3.b.f14019b;
            Object tag = viewGroup.getTag(i10);
            if (tag instanceof t0) {
                return (t0) tag;
            }
            t0 a10 = v0Var.a(viewGroup);
            qc.q.h(a10, "factory.createController(container)");
            viewGroup.setTag(i10, a10);
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class b extends c {

        /* renamed from: h  reason: collision with root package name */
        private final h0 f4826h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(androidx.fragment.app.t0.c.b r3, androidx.fragment.app.t0.c.a r4, androidx.fragment.app.h0 r5, androidx.core.os.f r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                qc.q.i(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                qc.q.i(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                qc.q.i(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                qc.q.i(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                qc.q.h(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f4826h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.t0.b.<init>(androidx.fragment.app.t0$c$b, androidx.fragment.app.t0$c$a, androidx.fragment.app.h0, androidx.core.os.f):void");
        }

        @Override // androidx.fragment.app.t0.c
        public void e() {
            super.e();
            this.f4826h.m();
        }

        @Override // androidx.fragment.app.t0.c
        public void n() {
            boolean z10;
            if (i() == c.a.ADDING) {
                Fragment k10 = this.f4826h.k();
                qc.q.h(k10, "fragmentStateManager.fragment");
                View findFocus = k10.mView.findFocus();
                if (findFocus != null) {
                    k10.setFocusedView(findFocus);
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View requireView = h().requireView();
                qc.q.h(requireView, "this.fragment.requireView()");
                if (requireView.getParent() == null) {
                    this.f4826h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k10.getPostOnViewCreatedAlpha());
            } else if (i() == c.a.REMOVING) {
                Fragment k11 = this.f4826h.k();
                qc.q.h(k11, "fragmentStateManager.fragment");
                View requireView2 = k11.requireView();
                qc.q.h(requireView2, "fragment.requireView()");
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k11);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4836a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4836a = iArr;
        }
    }

    public t0(ViewGroup viewGroup) {
        qc.q.i(viewGroup, "container");
        this.f4821a = viewGroup;
        this.f4822b = new ArrayList();
        this.f4823c = new ArrayList();
    }

    private final void c(c.b bVar, c.a aVar, h0 h0Var) {
        synchronized (this.f4822b) {
            androidx.core.os.f fVar = new androidx.core.os.f();
            Fragment k10 = h0Var.k();
            qc.q.h(k10, "fragmentStateManager.fragment");
            c l10 = l(k10);
            if (l10 != null) {
                l10.m(bVar, aVar);
                return;
            }
            final b bVar2 = new b(bVar, aVar, h0Var, fVar);
            this.f4822b.add(bVar2);
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.r0
                @Override // java.lang.Runnable
                public final void run() {
                    t0.d(t0.this, bVar2);
                }
            });
            bVar2.c(new Runnable() { // from class: androidx.fragment.app.s0
                @Override // java.lang.Runnable
                public final void run() {
                    t0.e(t0.this, bVar2);
                }
            });
            dc.w wVar = dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(t0 t0Var, b bVar) {
        qc.q.i(t0Var, "this$0");
        qc.q.i(bVar, "$operation");
        if (t0Var.f4822b.contains(bVar)) {
            c.b g10 = bVar.g();
            View view = bVar.h().mView;
            qc.q.h(view, "operation.fragment.mView");
            g10.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(t0 t0Var, b bVar) {
        qc.q.i(t0Var, "this$0");
        qc.q.i(bVar, "$operation");
        t0Var.f4822b.remove(bVar);
        t0Var.f4823c.remove(bVar);
    }

    private final c l(Fragment fragment) {
        Object obj;
        boolean z10;
        Iterator<T> it = this.f4822b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                c cVar = (c) obj;
                if (qc.q.d(cVar.h(), fragment) && !cVar.j()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (c) obj;
    }

    private final c m(Fragment fragment) {
        Object obj;
        boolean z10;
        Iterator<T> it = this.f4823c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                c cVar = (c) obj;
                if (qc.q.d(cVar.h(), fragment) && !cVar.j()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (c) obj;
    }

    public static final t0 r(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f4820f.a(viewGroup, fragmentManager);
    }

    public static final t0 s(ViewGroup viewGroup, v0 v0Var) {
        return f4820f.b(viewGroup, v0Var);
    }

    private final void u() {
        for (c cVar : this.f4822b) {
            if (cVar.i() == c.a.ADDING) {
                View requireView = cVar.h().requireView();
                qc.q.h(requireView, "fragment.requireView()");
                cVar.m(c.b.Companion.b(requireView.getVisibility()), c.a.NONE);
            }
        }
    }

    public final void f(c.b bVar, h0 h0Var) {
        qc.q.i(bVar, "finalState");
        qc.q.i(h0Var, "fragmentStateManager");
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + h0Var.k());
        }
        c(bVar, c.a.ADDING, h0Var);
    }

    public final void g(h0 h0Var) {
        qc.q.i(h0Var, "fragmentStateManager");
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + h0Var.k());
        }
        c(c.b.GONE, c.a.NONE, h0Var);
    }

    public final void h(h0 h0Var) {
        qc.q.i(h0Var, "fragmentStateManager");
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + h0Var.k());
        }
        c(c.b.REMOVED, c.a.REMOVING, h0Var);
    }

    public final void i(h0 h0Var) {
        qc.q.i(h0Var, "fragmentStateManager");
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + h0Var.k());
        }
        c(c.b.VISIBLE, c.a.NONE, h0Var);
    }

    public abstract void j(List<c> list, boolean z10);

    public final void k() {
        List<c> F0;
        List<c> F02;
        if (this.f4825e) {
            return;
        }
        if (!androidx.core.view.p0.X(this.f4821a)) {
            n();
            this.f4824d = false;
            return;
        }
        synchronized (this.f4822b) {
            if ((!this.f4822b.isEmpty()) != false) {
                F0 = ec.b0.F0(this.f4823c);
                this.f4823c.clear();
                for (c cVar : F0) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar);
                    }
                    cVar.d();
                    if (!cVar.k()) {
                        this.f4823c.add(cVar);
                    }
                }
                u();
                F02 = ec.b0.F0(this.f4822b);
                this.f4822b.clear();
                this.f4823c.addAll(F02);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator<c> it = F02.iterator();
                while (it.hasNext()) {
                    it.next().n();
                }
                j(F02, this.f4824d);
                this.f4824d = false;
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void n() {
        List<c> F0;
        List<c> F02;
        String str;
        String str2;
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean X = androidx.core.view.p0.X(this.f4821a);
        synchronized (this.f4822b) {
            u();
            Iterator<c> it = this.f4822b.iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            F0 = ec.b0.F0(this.f4823c);
            for (c cVar : F0) {
                if (FragmentManager.M0(2)) {
                    if (X) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4821a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar);
                }
                cVar.d();
            }
            F02 = ec.b0.F0(this.f4822b);
            for (c cVar2 : F02) {
                if (FragmentManager.M0(2)) {
                    if (X) {
                        str = "";
                    } else {
                        str = "Container " + this.f4821a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar2);
                }
                cVar2.d();
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void o() {
        if (this.f4825e) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4825e = false;
            k();
        }
    }

    public final c.a p(h0 h0Var) {
        c.a aVar;
        int i10;
        qc.q.i(h0Var, "fragmentStateManager");
        Fragment k10 = h0Var.k();
        qc.q.h(k10, "fragmentStateManager.fragment");
        c l10 = l(k10);
        c.a aVar2 = null;
        if (l10 != null) {
            aVar = l10.i();
        } else {
            aVar = null;
        }
        c m10 = m(k10);
        if (m10 != null) {
            aVar2 = m10.i();
        }
        if (aVar == null) {
            i10 = -1;
        } else {
            i10 = d.f4836a[aVar.ordinal()];
        }
        if (i10 == -1 || i10 == 1) {
            return aVar2;
        }
        return aVar;
    }

    public final ViewGroup q() {
        return this.f4821a;
    }

    public final void t() {
        boolean z10;
        Fragment fragment;
        c cVar;
        boolean z11;
        synchronized (this.f4822b) {
            u();
            List<c> list = this.f4822b;
            ListIterator<c> listIterator = list.listIterator(list.size());
            while (true) {
                z10 = false;
                fragment = null;
                if (listIterator.hasPrevious()) {
                    cVar = listIterator.previous();
                    c cVar2 = cVar;
                    c.b.a aVar = c.b.Companion;
                    View view = cVar2.h().mView;
                    qc.q.h(view, "operation.fragment.mView");
                    c.b a10 = aVar.a(view);
                    c.b g10 = cVar2.g();
                    c.b bVar = c.b.VISIBLE;
                    if (g10 == bVar && a10 != bVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    cVar = null;
                    break;
                }
            }
            c cVar3 = cVar;
            if (cVar3 != null) {
                fragment = cVar3.h();
            }
            if (fragment != null) {
                z10 = fragment.isPostponed();
            }
            this.f4825e = z10;
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void v(boolean z10) {
        this.f4824d = z10;
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private b f4827a;

        /* renamed from: b  reason: collision with root package name */
        private a f4828b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f4829c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f4830d;

        /* renamed from: e  reason: collision with root package name */
        private final Set<androidx.core.os.f> f4831e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4832f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f4833g;

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final a Companion = new a(null);

            /* compiled from: SpecialEffectsController.kt */
            /* loaded from: classes.dex */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(qc.h hVar) {
                    this();
                }

                public final b a(View view) {
                    boolean z10;
                    qc.q.i(view, "<this>");
                    if (view.getAlpha() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && view.getVisibility() == 0) {
                        return b.INVISIBLE;
                    }
                    return b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 != 0) {
                        if (i10 != 4) {
                            if (i10 == 8) {
                                return b.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i10);
                        }
                        return b.INVISIBLE;
                    }
                    return b.VISIBLE;
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            /* renamed from: androidx.fragment.app.t0$c$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0091b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f4834a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f4834a = iArr;
                }
            }

            public static final b from(int i10) {
                return Companion.b(i10);
            }

            public final void applyState(View view) {
                ViewGroup viewGroup;
                qc.q.i(view, "view");
                int i10 = C0091b.f4834a[ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                if (FragmentManager.M0(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        /* renamed from: androidx.fragment.app.t0$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0092c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f4835a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f4835a = iArr;
            }
        }

        public c(b bVar, a aVar, Fragment fragment, androidx.core.os.f fVar) {
            qc.q.i(bVar, "finalState");
            qc.q.i(aVar, "lifecycleImpact");
            qc.q.i(fragment, "fragment");
            qc.q.i(fVar, "cancellationSignal");
            this.f4827a = bVar;
            this.f4828b = aVar;
            this.f4829c = fragment;
            this.f4830d = new ArrayList();
            this.f4831e = new LinkedHashSet();
            fVar.b(new f.b() { // from class: androidx.fragment.app.u0
                @Override // androidx.core.os.f.b
                public final void a() {
                    t0.c.b(t0.c.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c cVar) {
            qc.q.i(cVar, "this$0");
            cVar.d();
        }

        public final void c(Runnable runnable) {
            qc.q.i(runnable, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f4830d.add(runnable);
        }

        public final void d() {
            Set G0;
            if (this.f4832f) {
                return;
            }
            this.f4832f = true;
            if (!this.f4831e.isEmpty()) {
                G0 = ec.b0.G0(this.f4831e);
                Iterator it = G0.iterator();
                while (it.hasNext()) {
                    ((androidx.core.os.f) it.next()).a();
                }
                return;
            }
            e();
        }

        public void e() {
            if (this.f4833g) {
                return;
            }
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4833g = true;
            Iterator<T> it = this.f4830d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(androidx.core.os.f fVar) {
            qc.q.i(fVar, "signal");
            if (this.f4831e.remove(fVar) && this.f4831e.isEmpty()) {
                e();
            }
        }

        public final b g() {
            return this.f4827a;
        }

        public final Fragment h() {
            return this.f4829c;
        }

        public final a i() {
            return this.f4828b;
        }

        public final boolean j() {
            return this.f4832f;
        }

        public final boolean k() {
            return this.f4833g;
        }

        public final void l(androidx.core.os.f fVar) {
            qc.q.i(fVar, "signal");
            n();
            this.f4831e.add(fVar);
        }

        public final void m(b bVar, a aVar) {
            qc.q.i(bVar, "finalState");
            qc.q.i(aVar, "lifecycleImpact");
            int i10 = C0092c.f4835a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f4827a != b.REMOVED) {
                        if (FragmentManager.M0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4829c + " mFinalState = " + this.f4827a + " -> " + bVar + '.');
                        }
                        this.f4827a = bVar;
                        return;
                    }
                    return;
                }
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4829c + " mFinalState = " + this.f4827a + " -> REMOVED. mLifecycleImpact  = " + this.f4828b + " to REMOVING.");
                }
                this.f4827a = b.REMOVED;
                this.f4828b = a.REMOVING;
            } else if (this.f4827a == b.REMOVED) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4829c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4828b + " to ADDING.");
                }
                this.f4827a = b.VISIBLE;
                this.f4828b = a.ADDING;
            }
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f4827a + " lifecycleImpact = " + this.f4828b + " fragment = " + this.f4829c + '}';
        }

        public void n() {
        }
    }
}
