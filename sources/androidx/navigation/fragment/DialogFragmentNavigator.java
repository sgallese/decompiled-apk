package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.f0;
import androidx.fragment.app.k;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.navigation.fragment.DialogFragmentNavigator;
import androidx.navigation.i;
import androidx.navigation.m;
import androidx.navigation.p;
import ec.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m3.e;
import qc.h;
import qc.k0;
import qc.q;

/* compiled from: DialogFragmentNavigator.kt */
@p.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends p<b> {

    /* renamed from: h  reason: collision with root package name */
    private static final a f5255h = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f5256c;

    /* renamed from: d  reason: collision with root package name */
    private final FragmentManager f5257d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f5258e;

    /* renamed from: f  reason: collision with root package name */
    private final DialogFragmentNavigator$observer$1 f5259f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, k> f5260g;

    /* compiled from: DialogFragmentNavigator.kt */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    /* loaded from: classes.dex */
    public static class b extends i implements k3.d {

        /* renamed from: y  reason: collision with root package name */
        private String f5261y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p<? extends b> pVar) {
            super(pVar);
            q.i(pVar, "fragmentNavigator");
        }

        public final String H() {
            String str = this.f5261y;
            if (str != null) {
                q.g(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }

        public final b I(String str) {
            q.i(str, "className");
            this.f5261y = str;
            return this;
        }

        @Override // androidx.navigation.i
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof b) || !super.equals(obj) || !q.d(this.f5261y, ((b) obj).f5261y)) {
                return false;
            }
            return true;
        }

        @Override // androidx.navigation.i
        public int hashCode() {
            int i10;
            int hashCode = super.hashCode() * 31;
            String str = this.f5261y;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode + i10;
        }

        @Override // androidx.navigation.i
        public void y(Context context, AttributeSet attributeSet) {
            q.i(context, "context");
            q.i(attributeSet, "attrs");
            super.y(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.f19740a);
            q.h(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(e.f19741b);
            if (string != null) {
                I(string);
            }
            obtainAttributes.recycle();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.navigation.fragment.DialogFragmentNavigator$observer$1] */
    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        q.i(context, "context");
        q.i(fragmentManager, "fragmentManager");
        this.f5256c = context;
        this.f5257d = fragmentManager;
        this.f5258e = new LinkedHashSet();
        this.f5259f = new s() { // from class: androidx.navigation.fragment.DialogFragmentNavigator$observer$1

            /* compiled from: DialogFragmentNavigator.kt */
            /* loaded from: classes.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f5263a;

                static {
                    int[] iArr = new int[p.a.values().length];
                    try {
                        iArr[p.a.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[p.a.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[p.a.ON_STOP.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[p.a.ON_DESTROY.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f5263a = iArr;
                }
            }

            @Override // androidx.lifecycle.s
            public void c(v vVar, p.a aVar) {
                k3.p b10;
                k3.p b11;
                k3.p b12;
                k3.p b13;
                Object n02;
                k3.p b14;
                k3.p b15;
                k3.p b16;
                q.i(vVar, "source");
                q.i(aVar, "event");
                int i10 = a.f5263a[aVar.ordinal()];
                boolean z10 = true;
                if (i10 != 1) {
                    Object obj = null;
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                k kVar = (k) vVar;
                                b15 = DialogFragmentNavigator.this.b();
                                for (Object obj2 : b15.c().getValue()) {
                                    if (q.d(((androidx.navigation.c) obj2).f(), kVar.getTag())) {
                                        obj = obj2;
                                    }
                                }
                                androidx.navigation.c cVar = (androidx.navigation.c) obj;
                                if (cVar != null) {
                                    b16 = DialogFragmentNavigator.this.b();
                                    b16.e(cVar);
                                }
                                kVar.getLifecycle().d(this);
                                return;
                            }
                            return;
                        }
                        k kVar2 = (k) vVar;
                        if (!kVar2.requireDialog().isShowing()) {
                            b13 = DialogFragmentNavigator.this.b();
                            List<androidx.navigation.c> value = b13.b().getValue();
                            ListIterator<androidx.navigation.c> listIterator = value.listIterator(value.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                Object previous = listIterator.previous();
                                if (q.d(((androidx.navigation.c) previous).f(), kVar2.getTag())) {
                                    obj = previous;
                                    break;
                                }
                            }
                            androidx.navigation.c cVar2 = (androidx.navigation.c) obj;
                            n02 = b0.n0(value);
                            if (!q.d(n02, cVar2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + kVar2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (cVar2 != null) {
                                b14 = DialogFragmentNavigator.this.b();
                                b14.i(cVar2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    k kVar3 = (k) vVar;
                    b11 = DialogFragmentNavigator.this.b();
                    for (Object obj3 : b11.c().getValue()) {
                        if (q.d(((androidx.navigation.c) obj3).f(), kVar3.getTag())) {
                            obj = obj3;
                        }
                    }
                    androidx.navigation.c cVar3 = (androidx.navigation.c) obj;
                    if (cVar3 != null) {
                        b12 = DialogFragmentNavigator.this.b();
                        b12.e(cVar3);
                        return;
                    }
                    return;
                }
                k kVar4 = (k) vVar;
                b10 = DialogFragmentNavigator.this.b();
                List<androidx.navigation.c> value2 = b10.b().getValue();
                if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                    Iterator<T> it = value2.iterator();
                    while (it.hasNext()) {
                        if (q.d(((androidx.navigation.c) it.next()).f(), kVar4.getTag())) {
                            break;
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                    kVar4.dismiss();
                }
            }
        };
        this.f5260g = new LinkedHashMap();
    }

    private final k o(androidx.navigation.c cVar) {
        i e10 = cVar.e();
        q.g(e10, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) e10;
        String H = bVar.H();
        if (H.charAt(0) == '.') {
            H = this.f5256c.getPackageName() + H;
        }
        Fragment a10 = this.f5257d.w0().a(this.f5256c.getClassLoader(), H);
        q.h(a10, "fragmentManager.fragment…ader, className\n        )");
        if (k.class.isAssignableFrom(a10.getClass())) {
            k kVar = (k) a10;
            kVar.setArguments(cVar.c());
            kVar.getLifecycle().a(this.f5259f);
            this.f5260g.put(cVar.f(), kVar);
            return kVar;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.H() + " is not an instance of DialogFragment").toString());
    }

    private final void p(androidx.navigation.c cVar) {
        Object n02;
        boolean T;
        o(cVar).show(this.f5257d, cVar.f());
        n02 = b0.n0(b().b().getValue());
        androidx.navigation.c cVar2 = (androidx.navigation.c) n02;
        T = b0.T(b().c().getValue(), cVar2);
        b().l(cVar);
        if (cVar2 != null && !T) {
            b().e(cVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DialogFragmentNavigator dialogFragmentNavigator, FragmentManager fragmentManager, Fragment fragment) {
        q.i(dialogFragmentNavigator, "this$0");
        q.i(fragmentManager, "<anonymous parameter 0>");
        q.i(fragment, "childFragment");
        Set<String> set = dialogFragmentNavigator.f5258e;
        if (k0.a(set).remove(fragment.getTag())) {
            fragment.getLifecycle().a(dialogFragmentNavigator.f5259f);
        }
        Map<String, k> map = dialogFragmentNavigator.f5260g;
        k0.d(map).remove(fragment.getTag());
    }

    @Override // androidx.navigation.p
    public void e(List<androidx.navigation.c> list, m mVar, p.a aVar) {
        q.i(list, "entries");
        if (this.f5257d.T0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<androidx.navigation.c> it = list.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
    }

    @Override // androidx.navigation.p
    public void f(k3.p pVar) {
        androidx.lifecycle.p lifecycle;
        q.i(pVar, "state");
        super.f(pVar);
        for (androidx.navigation.c cVar : pVar.b().getValue()) {
            k kVar = (k) this.f5257d.j0(cVar.f());
            if (kVar != null && (lifecycle = kVar.getLifecycle()) != null) {
                lifecycle.a(this.f5259f);
            } else {
                this.f5258e.add(cVar.f());
            }
        }
        this.f5257d.k(new f0() { // from class: m3.a
            @Override // androidx.fragment.app.f0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                DialogFragmentNavigator.q(DialogFragmentNavigator.this, fragmentManager, fragment);
            }
        });
    }

    @Override // androidx.navigation.p
    public void g(androidx.navigation.c cVar) {
        q.i(cVar, "backStackEntry");
        if (this.f5257d.T0()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        k kVar = this.f5260g.get(cVar.f());
        if (kVar == null) {
            Fragment j02 = this.f5257d.j0(cVar.f());
            if (j02 instanceof k) {
                kVar = (k) j02;
            } else {
                kVar = null;
            }
        }
        if (kVar != null) {
            kVar.getLifecycle().d(this.f5259f);
            kVar.dismiss();
        }
        o(cVar).show(this.f5257d, cVar.f());
        b().g(cVar);
    }

    @Override // androidx.navigation.p
    public void j(androidx.navigation.c cVar, boolean z10) {
        Object d02;
        boolean T;
        List t02;
        q.i(cVar, "popUpTo");
        if (this.f5257d.T0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<androidx.navigation.c> value = b().b().getValue();
        int indexOf = value.indexOf(cVar);
        List<androidx.navigation.c> subList = value.subList(indexOf, value.size());
        d02 = b0.d0(value, indexOf - 1);
        androidx.navigation.c cVar2 = (androidx.navigation.c) d02;
        T = b0.T(b().c().getValue(), cVar2);
        t02 = b0.t0(subList);
        Iterator it = t02.iterator();
        while (it.hasNext()) {
            Fragment j02 = this.f5257d.j0(((androidx.navigation.c) it.next()).f());
            if (j02 != null) {
                ((k) j02).dismiss();
            }
        }
        b().i(cVar, z10);
        if (cVar2 != null && !T) {
            b().e(cVar2);
        }
    }

    @Override // androidx.navigation.p
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }
}
