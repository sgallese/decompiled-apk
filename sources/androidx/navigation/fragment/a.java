package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import androidx.lifecycle.b1;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.navigation.fragment.a;
import androidx.navigation.m;
import androidx.navigation.p;
import dc.w;
import ec.b0;
import ec.n0;
import ec.y;
import j3.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import pc.l;
import qc.k;
import qc.q;
import qc.r;

/* compiled from: FragmentNavigator.kt */
@p.b("fragment")
/* loaded from: classes.dex */
public class a extends p<c> {

    /* renamed from: i  reason: collision with root package name */
    private static final b f5270i = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f5271c;

    /* renamed from: d  reason: collision with root package name */
    private final FragmentManager f5272d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5273e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f5274f;

    /* renamed from: g  reason: collision with root package name */
    private final s f5275g;

    /* renamed from: h  reason: collision with root package name */
    private final l<androidx.navigation.c, s> f5276h;

    /* compiled from: FragmentNavigator.kt */
    /* renamed from: androidx.navigation.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0114a extends v0 {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<pc.a<w>> f5277a;

        public final WeakReference<pc.a<w>> b() {
            WeakReference<pc.a<w>> weakReference = this.f5277a;
            if (weakReference != null) {
                return weakReference;
            }
            q.z("completeTransition");
            return null;
        }

        public final void c(WeakReference<pc.a<w>> weakReference) {
            q.i(weakReference, "<set-?>");
            this.f5277a = weakReference;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.v0
        public void onCleared() {
            super.onCleared();
            pc.a<w> aVar = b().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static class c extends androidx.navigation.i {

        /* renamed from: y  reason: collision with root package name */
        private String f5278y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p<? extends c> pVar) {
            super(pVar);
            q.i(pVar, "fragmentNavigator");
        }

        public final String H() {
            String str = this.f5278y;
            if (str != null) {
                q.g(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("Fragment class was not set".toString());
        }

        public final c I(String str) {
            q.i(str, "className");
            this.f5278y = str;
            return this;
        }

        @Override // androidx.navigation.i
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof c) || !super.equals(obj) || !q.d(this.f5278y, ((c) obj).f5278y)) {
                return false;
            }
            return true;
        }

        @Override // androidx.navigation.i
        public int hashCode() {
            int i10;
            int hashCode = super.hashCode() * 31;
            String str = this.f5278y;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode + i10;
        }

        @Override // androidx.navigation.i
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f5278y;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            q.h(sb3, "sb.toString()");
            return sb3;
        }

        @Override // androidx.navigation.i
        public void y(Context context, AttributeSet attributeSet) {
            q.i(context, "context");
            q.i(attributeSet, "attrs");
            super.y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m3.e.f19742c);
            q.h(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(m3.e.f19743d);
            if (string != null) {
                I(string);
            }
            w wVar = w.f13270a;
            obtainAttributes.recycle();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static final class d implements p.a {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedHashMap<View, String> f5279a;

        public final Map<View, String> a() {
            Map<View, String> r10;
            r10 = n0.r(this.f5279a);
            return r10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static final class e extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.navigation.c f5280f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k3.p f5281m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Fragment f5282p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.navigation.c cVar, k3.p pVar, Fragment fragment) {
            super(0);
            this.f5280f = cVar;
            this.f5281m = pVar;
            this.f5282p = fragment;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k3.p pVar = this.f5281m;
            Fragment fragment = this.f5282p;
            for (androidx.navigation.c cVar : pVar.c().getValue()) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + cVar + " due to fragment " + fragment + " viewmodel being cleared");
                }
                pVar.e(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static final class f extends r implements l<j3.a, C0114a> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f5283f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final C0114a invoke(j3.a aVar) {
            q.i(aVar, "$this$initializer");
            return new C0114a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static final class g extends r implements l<v, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Fragment f5285m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.navigation.c f5286p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Fragment fragment, androidx.navigation.c cVar) {
            super(1);
            this.f5285m = fragment;
            this.f5286p = cVar;
        }

        public final void a(v vVar) {
            boolean T;
            if (vVar != null) {
                T = b0.T(a.this.u(), this.f5285m.getTag());
                if (!T) {
                    androidx.lifecycle.p lifecycle = this.f5285m.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.b().isAtLeast(p.b.CREATED)) {
                        lifecycle.a((u) a.this.f5276h.invoke(this.f5286p));
                    }
                }
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(v vVar) {
            a(vVar);
            return w.f13270a;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    static final class h extends r implements l<androidx.navigation.c, s> {
        h() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, androidx.navigation.c cVar, v vVar, p.a aVar2) {
            q.i(aVar, "this$0");
            q.i(cVar, "$entry");
            q.i(vVar, "owner");
            q.i(aVar2, "event");
            if (aVar2 == p.a.ON_RESUME && aVar.b().b().getValue().contains(cVar)) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + cVar + " due to fragment " + vVar + " view lifecycle reaching RESUMED");
                }
                aVar.b().e(cVar);
            }
            if (aVar2 == p.a.ON_DESTROY) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + cVar + " due to fragment " + vVar + " view lifecycle reaching DESTROYED");
                }
                aVar.b().e(cVar);
            }
        }

        @Override // pc.l
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final s invoke(final androidx.navigation.c cVar) {
            q.i(cVar, "entry");
            final a aVar = a.this;
            return new s() { // from class: androidx.navigation.fragment.b
                @Override // androidx.lifecycle.s
                public final void c(v vVar, p.a aVar2) {
                    a.h.c(a.this, cVar, vVar, aVar2);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static final class j implements g0, k {

        /* renamed from: f  reason: collision with root package name */
        private final /* synthetic */ l f5290f;

        j(l lVar) {
            q.i(lVar, "function");
            this.f5290f = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof g0) || !(obj instanceof k)) {
                return false;
            }
            return q.d(getFunctionDelegate(), ((k) obj).getFunctionDelegate());
        }

        @Override // qc.k
        public final dc.c<?> getFunctionDelegate() {
            return this.f5290f;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.g0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f5290f.invoke(obj);
        }
    }

    public a(Context context, FragmentManager fragmentManager, int i10) {
        q.i(context, "context");
        q.i(fragmentManager, "fragmentManager");
        this.f5271c = context;
        this.f5272d = fragmentManager;
        this.f5273e = i10;
        this.f5274f = new LinkedHashSet();
        this.f5275g = new s() { // from class: m3.b
            @Override // androidx.lifecycle.s
            public final void c(v vVar, p.a aVar) {
                androidx.navigation.fragment.a.t(androidx.navigation.fragment.a.this, vVar, aVar);
            }
        };
        this.f5276h = new h();
    }

    private final void q(androidx.navigation.c cVar, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().j(fragment, new j(new g(fragment, cVar)));
        fragment.getLifecycle().a(this.f5275g);
    }

    private final k0 s(androidx.navigation.c cVar, m mVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.navigation.i e10 = cVar.e();
        q.g(e10, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle c10 = cVar.c();
        String H = ((c) e10).H();
        int i14 = 0;
        if (H.charAt(0) == '.') {
            H = this.f5271c.getPackageName() + H;
        }
        Fragment a10 = this.f5272d.w0().a(this.f5271c.getClassLoader(), H);
        q.h(a10, "fragmentManager.fragment…t.classLoader, className)");
        a10.setArguments(c10);
        k0 q10 = this.f5272d.q();
        q.h(q10, "fragmentManager.beginTransaction()");
        if (mVar != null) {
            i10 = mVar.a();
        } else {
            i10 = -1;
        }
        if (mVar != null) {
            i11 = mVar.b();
        } else {
            i11 = -1;
        }
        if (mVar != null) {
            i12 = mVar.c();
        } else {
            i12 = -1;
        }
        if (mVar != null) {
            i13 = mVar.d();
        } else {
            i13 = -1;
        }
        if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            if (i13 != -1) {
                i14 = i13;
            }
            q10.u(i10, i11, i12, i14);
        }
        q10.t(this.f5273e, a10, cVar.f());
        q10.w(a10);
        q10.x(true);
        return q10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(a aVar, v vVar, p.a aVar2) {
        q.i(aVar, "this$0");
        q.i(vVar, "source");
        q.i(aVar2, "event");
        if (aVar2 == p.a.ON_DESTROY) {
            Fragment fragment = (Fragment) vVar;
            Object obj = null;
            for (Object obj2 : aVar.b().c().getValue()) {
                if (q.d(((androidx.navigation.c) obj2).f(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            androidx.navigation.c cVar = (androidx.navigation.c) obj;
            if (cVar != null) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + cVar + " due to fragment " + vVar + " lifecycle reaching DESTROYED");
                }
                aVar.b().e(cVar);
            }
        }
    }

    private final void v(androidx.navigation.c cVar, m mVar, p.a aVar) {
        boolean z10;
        boolean isEmpty = b().b().getValue().isEmpty();
        if (mVar != null && !isEmpty && mVar.i() && this.f5274f.remove(cVar.f())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f5272d.t1(cVar.f());
            b().l(cVar);
            return;
        }
        k0 s10 = s(cVar, mVar);
        if (!isEmpty) {
            s10.h(cVar.f());
        }
        if (aVar instanceof d) {
            for (Map.Entry<View, String> entry : ((d) aVar).a().entrySet()) {
                s10.g(entry.getKey(), entry.getValue());
            }
        }
        s10.j();
        if (FragmentManager.M0(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + cVar);
        }
        b().l(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(k3.p pVar, a aVar, FragmentManager fragmentManager, Fragment fragment) {
        androidx.navigation.c cVar;
        q.i(pVar, "$state");
        q.i(aVar, "this$0");
        q.i(fragmentManager, "<anonymous parameter 0>");
        q.i(fragment, "fragment");
        List<androidx.navigation.c> value = pVar.b().getValue();
        ListIterator<androidx.navigation.c> listIterator = value.listIterator(value.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                cVar = listIterator.previous();
                if (q.d(cVar.f(), fragment.getTag())) {
                    break;
                }
            } else {
                cVar = null;
                break;
            }
        }
        androidx.navigation.c cVar2 = cVar;
        if (FragmentManager.M0(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + cVar2 + " to FragmentManager " + aVar.f5272d);
        }
        if (cVar2 != null) {
            aVar.q(cVar2, fragment);
            aVar.p(fragment, cVar2, pVar);
        }
    }

    @Override // androidx.navigation.p
    public void e(List<androidx.navigation.c> list, m mVar, p.a aVar) {
        q.i(list, "entries");
        if (this.f5272d.T0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<androidx.navigation.c> it = list.iterator();
        while (it.hasNext()) {
            v(it.next(), mVar, aVar);
        }
    }

    @Override // androidx.navigation.p
    public void f(final k3.p pVar) {
        q.i(pVar, "state");
        super.f(pVar);
        if (FragmentManager.M0(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.f5272d.k(new f0() { // from class: m3.c
            @Override // androidx.fragment.app.f0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                androidx.navigation.fragment.a.w(k3.p.this, this, fragmentManager, fragment);
            }
        });
        this.f5272d.l(new i(pVar, this));
    }

    @Override // androidx.navigation.p
    public void g(androidx.navigation.c cVar) {
        q.i(cVar, "backStackEntry");
        if (this.f5272d.T0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        k0 s10 = s(cVar, null);
        if (b().b().getValue().size() > 1) {
            this.f5272d.i1(cVar.f(), 1);
            s10.h(cVar.f());
        }
        s10.j();
        b().f(cVar);
    }

    @Override // androidx.navigation.p
    public void h(Bundle bundle) {
        q.i(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f5274f.clear();
            y.w(this.f5274f, stringArrayList);
        }
    }

    @Override // androidx.navigation.p
    public Bundle i() {
        if (this.f5274f.isEmpty()) {
            return null;
        }
        return androidx.core.os.e.a(dc.r.a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f5274f)));
    }

    @Override // androidx.navigation.p
    public void j(androidx.navigation.c cVar, boolean z10) {
        Object a02;
        List<androidx.navigation.c> t02;
        q.i(cVar, "popUpTo");
        if (this.f5272d.T0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<androidx.navigation.c> value = b().b().getValue();
        List<androidx.navigation.c> subList = value.subList(value.indexOf(cVar), value.size());
        if (z10) {
            a02 = b0.a0(value);
            androidx.navigation.c cVar2 = (androidx.navigation.c) a02;
            t02 = b0.t0(subList);
            for (androidx.navigation.c cVar3 : t02) {
                if (q.d(cVar3, cVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + cVar3);
                } else {
                    this.f5272d.y1(cVar3.f());
                    this.f5274f.add(cVar3.f());
                }
            }
        } else {
            this.f5272d.i1(cVar.f(), 1);
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + cVar + " with savedState " + z10);
        }
        b().i(cVar, z10);
    }

    public final void p(Fragment fragment, androidx.navigation.c cVar, k3.p pVar) {
        q.i(fragment, "fragment");
        q.i(cVar, "entry");
        q.i(pVar, "state");
        b1 viewModelStore = fragment.getViewModelStore();
        q.h(viewModelStore, "fragment.viewModelStore");
        j3.c cVar2 = new j3.c();
        cVar2.a(qc.g0.b(C0114a.class), f.f5283f);
        ((C0114a) new y0(viewModelStore, cVar2.b(), a.C0424a.f19017b).a(C0114a.class)).c(new WeakReference<>(new e(cVar, pVar, fragment)));
    }

    @Override // androidx.navigation.p
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    public final Set<String> u() {
        Set H0;
        Set e10;
        int s10;
        Set<String> H02;
        Set<androidx.navigation.c> value = b().c().getValue();
        H0 = b0.H0(b().b().getValue());
        e10 = ec.v0.e(value, H0);
        Set set = e10;
        s10 = ec.u.s(set, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.navigation.c) it.next()).f());
        }
        H02 = b0.H0(arrayList);
        return H02;
    }

    /* compiled from: FragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static final class i implements FragmentManager.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k3.p f5288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f5289b;

        i(k3.p pVar, a aVar) {
            this.f5288a = pVar;
            this.f5289b = aVar;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public void a(Fragment fragment, boolean z10) {
            List r02;
            Object obj;
            q.i(fragment, "fragment");
            r02 = b0.r0(this.f5288a.b().getValue(), this.f5288a.c().getValue());
            ListIterator listIterator = r02.listIterator(r02.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (q.d(((androidx.navigation.c) obj).f(), fragment.getTag())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            androidx.navigation.c cVar = (androidx.navigation.c) obj;
            if (FragmentManager.M0(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + cVar);
            }
            if (!z10 && cVar == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            } else if (cVar != null) {
                this.f5289b.p(fragment, cVar, this.f5288a);
                if (z10 && this.f5289b.u().isEmpty() && fragment.isRemoving()) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentNavigator", "Popping entry " + cVar + " with transition via system back");
                    }
                    this.f5288a.i(cVar, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public void b(Fragment fragment, boolean z10) {
            androidx.navigation.c cVar;
            q.i(fragment, "fragment");
            if (z10) {
                List<androidx.navigation.c> value = this.f5288a.b().getValue();
                ListIterator<androidx.navigation.c> listIterator = value.listIterator(value.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        cVar = listIterator.previous();
                        if (q.d(cVar.f(), fragment.getTag())) {
                            break;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                androidx.navigation.c cVar2 = cVar;
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + cVar2);
                }
                if (cVar2 != null) {
                    this.f5288a.j(cVar2);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public void c() {
        }
    }
}
