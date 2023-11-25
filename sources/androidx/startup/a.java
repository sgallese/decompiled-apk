package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b4.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f7097d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f7098e = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Context f7101c;

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends z3.a<?>>> f7100b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f7099a = new HashMap();

    a(Context context) {
        this.f7101c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends z3.a<?>> cls, Set<Class<?>> set) {
        T t10;
        if (b.d()) {
            try {
                b.a(cls.getSimpleName());
            } finally {
                b.b();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f7099a.containsKey(cls)) {
                set.add(cls);
                try {
                    z3.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends z3.a<?>>> a10 = newInstance.a();
                    if (!a10.isEmpty()) {
                        for (Class<? extends z3.a<?>> cls2 : a10) {
                            if (!this.f7099a.containsKey(cls2)) {
                                d(cls2, set);
                            }
                        }
                    }
                    t10 = (T) newInstance.b(this.f7101c);
                    set.remove(cls);
                    this.f7099a.put(cls, t10);
                } catch (Throwable th) {
                    throw new StartupException(th);
                }
            } else {
                t10 = (T) this.f7099a.get(cls);
            }
            return t10;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    public static a e(Context context) {
        if (f7097d == null) {
            synchronized (f7098e) {
                if (f7097d == null) {
                    f7097d = new a(context);
                }
            }
        }
        return f7097d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                b.a("Startup");
                b(this.f7101c.getPackageManager().getProviderInfo(new ComponentName(this.f7101c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.f7101c.getString(z3.b.f26403a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (z3.a.class.isAssignableFrom(cls)) {
                            this.f7100b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends z3.a<?>>> it = this.f7100b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    <T> T c(Class<? extends z3.a<?>> cls) {
        T t10;
        synchronized (f7098e) {
            t10 = (T) this.f7099a.get(cls);
            if (t10 == null) {
                t10 = (T) d(cls, new HashSet());
            }
        }
        return t10;
    }

    public <T> T f(Class<? extends z3.a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends z3.a<?>> cls) {
        return this.f7100b.contains(cls);
    }
}
