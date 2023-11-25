package f3;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import ec.b0;
import ec.n0;
import ec.u0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import qc.h;
import qc.q;

/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15434a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static c f15435b = c.f15437d;

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    /* renamed from: f3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0371b {
    }

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f15436c = new a(null);

        /* renamed from: d  reason: collision with root package name */
        public static final c f15437d;

        /* renamed from: a  reason: collision with root package name */
        private final Set<a> f15438a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Set<Class<? extends Violation>>> f15439b;

        /* compiled from: FragmentStrictMode.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(h hVar) {
                this();
            }
        }

        static {
            Set b10;
            Map h10;
            b10 = u0.b();
            h10 = n0.h();
            f15437d = new c(b10, null, h10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, InterfaceC0371b interfaceC0371b, Map<String, ? extends Set<Class<? extends Violation>>> map) {
            q.i(set, "flags");
            q.i(map, "allowedViolations");
            this.f15438a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f15439b = linkedHashMap;
        }

        public final Set<a> a() {
            return this.f15438a;
        }

        public final InterfaceC0371b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.f15439b;
        }
    }

    private b() {
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                q.h(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.F0() != null) {
                    c F0 = parentFragmentManager.F0();
                    q.f(F0);
                    return F0;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f15435b;
    }

    private final void c(c cVar, final Violation violation) {
        Fragment a10 = violation.a();
        final String name = a10.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            p(a10, new Runnable() { // from class: f3.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        q.i(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.a().getClass().getName(), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Fragment fragment, String str) {
        q.i(fragment, "fragment");
        q.i(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        b bVar = f15434a;
        bVar.e(fragmentReuseViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.q(b10, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(b10, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        q.i(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        b bVar = f15434a;
        bVar.e(fragmentTagUsageViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.q(b10, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(b10, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Fragment fragment) {
        q.i(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        b bVar = f15434a;
        bVar.e(getRetainInstanceUsageViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(b10, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            bVar.c(b10, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Fragment fragment) {
        q.i(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        b bVar = f15434a;
        bVar.e(getTargetFragmentRequestCodeUsageViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(b10, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            bVar.c(b10, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Fragment fragment) {
        q.i(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        b bVar = f15434a;
        bVar.e(getTargetFragmentUsageViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(b10, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(b10, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(Fragment fragment) {
        q.i(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        b bVar = f15434a;
        bVar.e(setRetainInstanceUsageViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(b10, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            bVar.c(b10, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(Fragment fragment, Fragment fragment2, int i10) {
        q.i(fragment, "violatingFragment");
        q.i(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i10);
        b bVar = f15434a;
        bVar.e(setTargetFragmentUsageViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(b10, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            bVar.c(b10, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(Fragment fragment, boolean z10) {
        q.i(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z10);
        b bVar = f15434a;
        bVar.e(setUserVisibleHintViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && bVar.q(b10, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            bVar.c(b10, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(Fragment fragment, ViewGroup viewGroup) {
        q.i(fragment, "fragment");
        q.i(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        b bVar = f15434a;
        bVar.e(wrongFragmentContainerViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.q(b10, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(b10, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(Fragment fragment, Fragment fragment2, int i10) {
        q.i(fragment, "fragment");
        q.i(fragment2, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, fragment2, i10);
        b bVar = f15434a;
        bVar.e(wrongNestedHierarchyViolation);
        c b10 = bVar.b(fragment);
        if (b10.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bVar.q(b10, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            bVar.c(b10, wrongNestedHierarchyViolation);
        }
    }

    private final void p(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler g10 = fragment.getParentFragmentManager().z0().g();
            q.h(g10, "fragment.parentFragmentManager.host.handler");
            if (q.d(g10.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                g10.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean q(c cVar, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        boolean T;
        Set<Class<? extends Violation>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!q.d(cls2.getSuperclass(), Violation.class)) {
            T = b0.T(set, cls2.getSuperclass());
            if (T) {
                return false;
            }
        }
        return !set.contains(cls2);
    }
}
