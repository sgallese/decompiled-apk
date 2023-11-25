package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class e0 extends androidx.lifecycle.v0 {

    /* renamed from: h  reason: collision with root package name */
    private static final y0.b f4676h = new a();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4680d;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Fragment> f4677a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, e0> f4678b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, b1> f4679c = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f4681e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4682f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4683g = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    class a implements y0.b {
        a() {
        }

        @Override // androidx.lifecycle.y0.b
        public <T extends androidx.lifecycle.v0> T a(Class<T> cls) {
            return new e0(true);
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ androidx.lifecycle.v0 b(Class cls, j3.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(boolean z10) {
        this.f4680d = z10;
    }

    private void e(String str) {
        e0 e0Var = this.f4678b.get(str);
        if (e0Var != null) {
            e0Var.onCleared();
            this.f4678b.remove(str);
        }
        b1 b1Var = this.f4679c.get(str);
        if (b1Var != null) {
            b1Var.a();
            this.f4679c.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e0 h(b1 b1Var) {
        return (e0) new y0(b1Var, f4676h).a(e0.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        if (this.f4683g) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f4677a.containsKey(fragment.mWho)) {
        } else {
            this.f4677a.put(fragment.mWho, fragment);
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        e(fragment.mWho);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(String str) {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f4677a.equals(e0Var.f4677a) && this.f4678b.equals(e0Var.f4678b) && this.f4679c.equals(e0Var.f4679c)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        return this.f4677a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 g(Fragment fragment) {
        e0 e0Var = this.f4678b.get(fragment.mWho);
        if (e0Var == null) {
            e0 e0Var2 = new e0(this.f4680d);
            this.f4678b.put(fragment.mWho, e0Var2);
            return e0Var2;
        }
        return e0Var;
    }

    public int hashCode() {
        return (((this.f4677a.hashCode() * 31) + this.f4678b.hashCode()) * 31) + this.f4679c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> i() {
        return new ArrayList(this.f4677a.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1 j(Fragment fragment) {
        b1 b1Var = this.f4679c.get(fragment.mWho);
        if (b1Var == null) {
            b1 b1Var2 = new b1();
            this.f4679c.put(fragment.mWho, b1Var2);
            return b1Var2;
        }
        return b1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.f4681e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment) {
        boolean z10;
        if (this.f4683g) {
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f4677a.remove(fragment.mWho) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f4683g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(Fragment fragment) {
        if (!this.f4677a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f4680d) {
            return this.f4681e;
        }
        return !this.f4682f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.v0
    public void onCleared() {
        if (FragmentManager.M0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4681e = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4677a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4678b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4679c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
