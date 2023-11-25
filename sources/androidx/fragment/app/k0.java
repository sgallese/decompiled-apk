package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f4731a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f4732b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<a> f4733c;

    /* renamed from: d  reason: collision with root package name */
    int f4734d;

    /* renamed from: e  reason: collision with root package name */
    int f4735e;

    /* renamed from: f  reason: collision with root package name */
    int f4736f;

    /* renamed from: g  reason: collision with root package name */
    int f4737g;

    /* renamed from: h  reason: collision with root package name */
    int f4738h;

    /* renamed from: i  reason: collision with root package name */
    boolean f4739i;

    /* renamed from: j  reason: collision with root package name */
    boolean f4740j;

    /* renamed from: k  reason: collision with root package name */
    String f4741k;

    /* renamed from: l  reason: collision with root package name */
    int f4742l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f4743m;

    /* renamed from: n  reason: collision with root package name */
    int f4744n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f4745o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList<String> f4746p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<String> f4747q;

    /* renamed from: r  reason: collision with root package name */
    boolean f4748r;

    /* renamed from: s  reason: collision with root package name */
    ArrayList<Runnable> f4749s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f4750a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f4751b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4752c;

        /* renamed from: d  reason: collision with root package name */
        int f4753d;

        /* renamed from: e  reason: collision with root package name */
        int f4754e;

        /* renamed from: f  reason: collision with root package name */
        int f4755f;

        /* renamed from: g  reason: collision with root package name */
        int f4756g;

        /* renamed from: h  reason: collision with root package name */
        p.b f4757h;

        /* renamed from: i  reason: collision with root package name */
        p.b f4758i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment) {
            this.f4750a = i10;
            this.f4751b = fragment;
            this.f4752c = false;
            p.b bVar = p.b.RESUMED;
            this.f4757h = bVar;
            this.f4758i = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, Fragment fragment, boolean z10) {
            this.f4750a = i10;
            this.f4751b = fragment;
            this.f4752c = z10;
            p.b bVar = p.b.RESUMED;
            this.f4757h = bVar;
            this.f4758i = bVar;
        }

        a(int i10, Fragment fragment, p.b bVar) {
            this.f4750a = i10;
            this.f4751b = fragment;
            this.f4752c = false;
            this.f4757h = fragment.mMaxState;
            this.f4758i = bVar;
        }

        a(a aVar) {
            this.f4750a = aVar.f4750a;
            this.f4751b = aVar.f4751b;
            this.f4752c = aVar.f4752c;
            this.f4753d = aVar.f4753d;
            this.f4754e = aVar.f4754e;
            this.f4755f = aVar.f4755f;
            this.f4756g = aVar.f4756g;
            this.f4757h = aVar.f4757h;
            this.f4758i = aVar.f4758i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(u uVar, ClassLoader classLoader) {
        this.f4733c = new ArrayList<>();
        this.f4740j = true;
        this.f4748r = false;
        this.f4731a = uVar;
        this.f4732b = classLoader;
    }

    public k0 b(int i10, Fragment fragment) {
        p(i10, fragment, null, 1);
        return this;
    }

    public k0 c(int i10, Fragment fragment, String str) {
        p(i10, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0 d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public k0 e(Fragment fragment, String str) {
        p(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(a aVar) {
        this.f4733c.add(aVar);
        aVar.f4753d = this.f4734d;
        aVar.f4754e = this.f4735e;
        aVar.f4755f = this.f4736f;
        aVar.f4756g = this.f4737g;
    }

    public k0 g(View view, String str) {
        if (l0.f()) {
            String N = androidx.core.view.p0.N(view);
            if (N != null) {
                if (this.f4746p == null) {
                    this.f4746p = new ArrayList<>();
                    this.f4747q = new ArrayList<>();
                } else if (!this.f4747q.contains(str)) {
                    if (this.f4746p.contains(N)) {
                        throw new IllegalArgumentException("A shared element with the source name '" + N + "' has already been added to the transaction.");
                    }
                } else {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                this.f4746p.add(N);
                this.f4747q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public k0 h(String str) {
        if (this.f4740j) {
            this.f4739i = true;
            this.f4741k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public k0 i(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public k0 n(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public k0 o() {
        if (!this.f4739i) {
            this.f4740j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            f3.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.mFragmentId;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
                    }
                    fragment.mFragmentId = i10;
                    fragment.mContainerId = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            f(new a(i11, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public abstract boolean q();

    public k0 r(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public k0 s(int i10, Fragment fragment) {
        return t(i10, fragment, null);
    }

    public k0 t(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            p(i10, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public k0 u(int i10, int i11, int i12, int i13) {
        this.f4734d = i10;
        this.f4735e = i11;
        this.f4736f = i12;
        this.f4737g = i13;
        return this;
    }

    public k0 v(Fragment fragment, p.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public k0 w(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public k0 x(boolean z10) {
        this.f4748r = z10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(u uVar, ClassLoader classLoader, k0 k0Var) {
        this(uVar, classLoader);
        Iterator<a> it = k0Var.f4733c.iterator();
        while (it.hasNext()) {
            this.f4733c.add(new a(it.next()));
        }
        this.f4734d = k0Var.f4734d;
        this.f4735e = k0Var.f4735e;
        this.f4736f = k0Var.f4736f;
        this.f4737g = k0Var.f4737g;
        this.f4738h = k0Var.f4738h;
        this.f4739i = k0Var.f4739i;
        this.f4740j = k0Var.f4740j;
        this.f4741k = k0Var.f4741k;
        this.f4744n = k0Var.f4744n;
        this.f4745o = k0Var.f4745o;
        this.f4742l = k0Var.f4742l;
        this.f4743m = k0Var.f4743m;
        if (k0Var.f4746p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f4746p = arrayList;
            arrayList.addAll(k0Var.f4746p);
        }
        if (k0Var.f4747q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f4747q = arrayList2;
            arrayList2.addAll(k0Var.f4747q);
        }
        this.f4748r = k0Var.f4748r;
    }
}
