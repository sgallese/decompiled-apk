package io.realm.internal;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.o0;
import io.realm.v0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ObjectServerFacade.java */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final i f17815a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static i f17816b;

    /* compiled from: ObjectServerFacade.java */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* compiled from: ObjectServerFacade.java */
    /* loaded from: classes4.dex */
    public interface b {
    }

    static {
        f17816b = null;
        try {
            f17816b = (i) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e10);
        } catch (InstantiationException e11) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e11);
        } catch (NoSuchMethodException e12) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e13.getTargetException());
        }
    }

    public static i c(boolean z10) {
        if (z10) {
            return f17816b;
        }
        return f17815a;
    }

    public static i e() {
        i iVar = f17816b;
        if (iVar != null) {
            return iVar;
        }
        return f17815a;
    }

    public Object[] d(v0 v0Var) {
        return new Object[19];
    }

    public String f(v0 v0Var) {
        return null;
    }

    public String g(v0 v0Var) {
        return null;
    }

    public void b(v0 v0Var) {
    }

    public void i(v0 v0Var) {
    }

    public void j(OsRealmConfig osRealmConfig) {
    }

    public void a(o0 o0Var, v0 v0Var) {
    }

    public void h(Context context, String str, a aVar, b bVar) {
    }
}
