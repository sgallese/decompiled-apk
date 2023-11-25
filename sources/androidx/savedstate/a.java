package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import qc.h;
import qc.q;
import w3.d;

/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f7090g = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private boolean f7092b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f7093c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7094d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f7095e;

    /* renamed from: a  reason: collision with root package name */
    private final m.b<String, c> f7091a = new m.b<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f7096f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0162a {
        void a(d dVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: classes.dex */
    public interface c {
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, v vVar, p.a aVar2) {
        q.i(aVar, "this$0");
        q.i(vVar, "<anonymous parameter 0>");
        q.i(aVar2, "event");
        if (aVar2 == p.a.ON_START) {
            aVar.f7096f = true;
        } else if (aVar2 == p.a.ON_STOP) {
            aVar.f7096f = false;
        }
    }

    public final Bundle b(String str) {
        Bundle bundle;
        q.i(str, "key");
        if (this.f7094d) {
            Bundle bundle2 = this.f7093c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f7093c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f7093c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f7093c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        q.i(str, "key");
        Iterator<Map.Entry<String, c>> it = this.f7091a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            q.h(next, "components");
            String key = next.getKey();
            c value = next.getValue();
            if (q.d(key, str)) {
                return value;
            }
        }
        return null;
    }

    public final void e(p pVar) {
        q.i(pVar, "lifecycle");
        if ((!this.f7092b) != false) {
            pVar.a(new s() { // from class: w3.b
                @Override // androidx.lifecycle.s
                public final void c(v vVar, p.a aVar) {
                    androidx.savedstate.a.d(androidx.savedstate.a.this, vVar, aVar);
                }
            });
            this.f7092b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        Bundle bundle2;
        if (this.f7092b) {
            if ((!this.f7094d) != false) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                this.f7093c = bundle2;
                this.f7094d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    public final void g(Bundle bundle) {
        q.i(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f7093c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<String, c>.d f10 = this.f7091a.f();
        q.h(f10, "this.components.iteratorWithAdditions()");
        while (f10.hasNext()) {
            Map.Entry next = f10.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).saveState());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        boolean z10;
        q.i(str, "key");
        q.i(cVar, "provider");
        if (this.f7091a.i(str, cVar) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void i(Class<? extends InterfaceC0162a> cls) {
        q.i(cls, "clazz");
        if (this.f7096f) {
            Recreator.b bVar = this.f7095e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f7095e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f7095e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    q.h(name, "clazz.name");
                    bVar2.a(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public final void j(String str) {
        q.i(str, "key");
        this.f7091a.j(str);
    }
}
