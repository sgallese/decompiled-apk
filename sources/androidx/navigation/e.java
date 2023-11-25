package androidx.navigation;

import androidx.lifecycle.b1;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: NavControllerViewModel.kt */
/* loaded from: classes.dex */
public final class e extends v0 implements k3.n {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5216b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final y0.b f5217c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b1> f5218a = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    /* loaded from: classes.dex */
    public static final class a implements y0.b {
        a() {
        }

        @Override // androidx.lifecycle.y0.b
        public <T extends v0> T a(Class<T> cls) {
            qc.q.i(cls, "modelClass");
            return new e();
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ v0 b(Class cls, j3.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* compiled from: NavControllerViewModel.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final e a(b1 b1Var) {
            qc.q.i(b1Var, "viewModelStore");
            return (e) new y0(b1Var, e.f5217c, null, 4, null).a(e.class);
        }
    }

    @Override // k3.n
    public b1 a(String str) {
        qc.q.i(str, "backStackEntryId");
        b1 b1Var = this.f5218a.get(str);
        if (b1Var == null) {
            b1 b1Var2 = new b1();
            this.f5218a.put(str, b1Var2);
            return b1Var2;
        }
        return b1Var;
    }

    public final void c(String str) {
        qc.q.i(str, "backStackEntryId");
        b1 remove = this.f5218a.remove(str);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.v0
    public void onCleared() {
        Iterator<b1> it = this.f5218a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f5218a.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.f5218a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }
}
