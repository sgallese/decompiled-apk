package io.realm;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.l0;
import io.realm.log.RealmLog;
import java.util.Collections;

/* compiled from: RealmObject.java */
/* loaded from: classes4.dex */
public abstract class d1 implements a1 {
    static final String MSG_DELETED_OBJECT = "the object is already deleted.";
    static final String MSG_DYNAMIC_OBJECT = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.";
    static final String MSG_NULL_OBJECT = "'model' is null.";

    public final <E extends a1> void addChangeListener(e1<E> e1Var) {
        addChangeListener(this, (e1<d1>) e1Var);
    }

    public final <E extends d1> Observable<bc.a<E>> asChangesetObservable() {
        return asChangesetObservable(this);
    }

    public final <E extends d1> Flowable<E> asFlowable() {
        return asFlowable(this);
    }

    public final void deleteFromRealm() {
        deleteFromRealm(this);
    }

    public final <E extends a1> E freeze() {
        return (E) freeze(this);
    }

    public o0 getRealm() {
        return getRealm(this);
    }

    public final boolean isFrozen() {
        return isFrozen(this);
    }

    public final boolean isLoaded() {
        return isLoaded(this);
    }

    public boolean isManaged() {
        return isManaged(this);
    }

    public final boolean isValid() {
        return isValid(this);
    }

    public final boolean load() {
        return load(this);
    }

    public final void removeAllChangeListeners() {
        removeAllChangeListeners(this);
    }

    public final void removeChangeListener(e1 e1Var) {
        removeChangeListener(this, e1Var);
    }

    public static <E extends a1> Observable<bc.a<E>> asChangesetObservable(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            a f10 = ((io.realm.internal.o) e10).b().f();
            if (f10 instanceof o0) {
                return f10.f17240p.o().d((o0) f10, e10);
            }
            if (f10 instanceof n) {
                return f10.f17240p.o().c((n) f10, (p) e10);
            }
            throw new UnsupportedOperationException(f10.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
    }

    public static <E extends a1> Flowable<E> asFlowable(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            a f10 = ((io.realm.internal.o) e10).b().f();
            if (f10 instanceof o0) {
                return f10.f17240p.o().a((o0) f10, e10);
            }
            if (f10 instanceof n) {
                return f10.f17240p.o().b((n) f10, (p) e10);
            }
            throw new UnsupportedOperationException(f10.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
    }

    public static <E extends a1> void deleteFromRealm(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            io.realm.internal.o oVar = (io.realm.internal.o) e10;
            if (oVar.b().g() != null) {
                if (oVar.b().f() != null) {
                    oVar.b().f().e();
                    io.realm.internal.q g10 = oVar.b().g();
                    g10.getTable().y(g10.getObjectKey());
                    oVar.b().s(io.realm.internal.f.INSTANCE);
                    return;
                }
                throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
            }
            throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
        }
        throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
    }

    public static <E extends a1> E freeze(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            io.realm.internal.o oVar = (io.realm.internal.o) e10;
            a f10 = oVar.b().f();
            a z10 = f10.Y() ? f10 : f10.z();
            io.realm.internal.q freeze = oVar.b().g().freeze(z10.f17242r);
            if (z10 instanceof n) {
                return new p(z10, freeze);
            }
            if (z10 instanceof o0) {
                Class<? super Object> superclass = e10.getClass().getSuperclass();
                return (E) z10.L().p().t(superclass, z10, freeze, f10.R().e(superclass), false, Collections.emptyList());
            }
            throw new UnsupportedOperationException("Unknown Realm type: " + z10.getClass().getName());
        }
        throw new IllegalArgumentException("It is only possible to freeze valid managed Realm objects.");
    }

    public static o0 getRealm(a1 a1Var) {
        if (a1Var != null) {
            if (!(a1Var instanceof p)) {
                if (a1Var instanceof io.realm.internal.o) {
                    a f10 = ((io.realm.internal.o) a1Var).b().f();
                    f10.e();
                    if (isValid(a1Var)) {
                        return (o0) f10;
                    }
                    throw new IllegalStateException(MSG_DELETED_OBJECT);
                }
                return null;
            }
            throw new IllegalStateException(MSG_DYNAMIC_OBJECT);
        }
        throw new IllegalArgumentException(MSG_NULL_OBJECT);
    }

    public static <E extends a1> boolean isFrozen(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            return ((io.realm.internal.o) e10).b().f().Y();
        }
        return false;
    }

    public static <E extends a1> boolean isLoaded(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            io.realm.internal.o oVar = (io.realm.internal.o) e10;
            oVar.b().f().e();
            return oVar.b().h();
        }
        return true;
    }

    public static <E extends a1> boolean isManaged(E e10) {
        return e10 instanceof io.realm.internal.o;
    }

    public static <E extends a1> boolean isValid(E e10) {
        if (!(e10 instanceof io.realm.internal.o)) {
            return e10 != null;
        }
        io.realm.internal.q g10 = ((io.realm.internal.o) e10).b().g();
        return g10 != null && g10.isValid();
    }

    public static <E extends a1> boolean load(E e10) {
        if (isLoaded(e10)) {
            return true;
        }
        if (e10 instanceof io.realm.internal.o) {
            ((io.realm.internal.o) e10).b().j();
            return true;
        }
        return false;
    }

    public static <E extends a1> void removeAllChangeListeners(E e10) {
        if (e10 instanceof io.realm.internal.o) {
            io.realm.internal.o oVar = (io.realm.internal.o) e10;
            a f10 = oVar.b().f();
            if (f10.isClosed()) {
                RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", f10.f17240p.l());
            }
            oVar.b().m();
            return;
        }
        throw new IllegalArgumentException("Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)");
    }

    public final <E extends a1> void addChangeListener(u0<E> u0Var) {
        addChangeListener(this, (u0<d1>) u0Var);
    }

    public final void removeChangeListener(u0 u0Var) {
        removeChangeListener(this, u0Var);
    }

    public static <E extends a1> void addChangeListener(E e10, e1<E> e1Var) {
        if (e10 == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (e1Var != null) {
            if (e10 instanceof io.realm.internal.o) {
                io.realm.internal.o oVar = (io.realm.internal.o) e10;
                a f10 = oVar.b().f();
                f10.e();
                f10.f17242r.capabilities.c("Listeners cannot be used on current thread.");
                oVar.b().b(e1Var);
                return;
            }
            throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public static <E extends a1> void removeChangeListener(E e10, e1 e1Var) {
        if (e10 == null) {
            throw new IllegalArgumentException("Object should not be null");
        }
        if (e1Var != null) {
            if (e10 instanceof io.realm.internal.o) {
                io.realm.internal.o oVar = (io.realm.internal.o) e10;
                a f10 = oVar.b().f();
                if (f10.isClosed()) {
                    RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", f10.f17240p.l());
                }
                oVar.b().n(e1Var);
                return;
            }
            throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public static <E extends a1> void addChangeListener(E e10, u0<E> u0Var) {
        addChangeListener(e10, new l0.c(u0Var));
    }

    public static <E extends a1> void removeChangeListener(E e10, u0<E> u0Var) {
        removeChangeListener(e10, new l0.c(u0Var));
    }
}
