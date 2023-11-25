package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import qc.h;
import qc.q;
import w3.d;

/* compiled from: Recreator.kt */
/* loaded from: classes.dex */
public final class Recreator implements s {

    /* renamed from: m  reason: collision with root package name */
    public static final a f7087m = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final d f7088f;

    /* compiled from: Recreator.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    /* loaded from: classes.dex */
    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f7089a;

        public b(androidx.savedstate.a aVar) {
            q.i(aVar, "registry");
            this.f7089a = new LinkedHashSet();
            aVar.h("androidx.savedstate.Restarter", this);
        }

        public final void a(String str) {
            q.i(str, "className");
            this.f7089a.add(str);
        }

        @Override // androidx.savedstate.a.c
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f7089a));
            return bundle;
        }
    }

    public Recreator(d dVar) {
        q.i(dVar, "owner");
        this.f7088f = dVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0162a.class);
            q.h(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    q.h(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0162a) newInstance).a(this.f7088f);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        q.i(vVar, "source");
        q.i(aVar, "event");
        if (aVar == p.a.ON_CREATE) {
            vVar.getLifecycle().d(this);
            Bundle b10 = this.f7088f.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (b10 == null) {
                return;
            }
            ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
