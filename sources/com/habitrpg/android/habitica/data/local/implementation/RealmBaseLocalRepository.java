package com.habitrpg.android.habitica.data.local.implementation;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.data.local.BaseLocalRepository;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import dd.g;
import ec.t;
import ec.y;
import io.realm.a1;
import io.realm.d1;
import io.realm.g1;
import io.realm.o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import qc.h;
import qc.k0;
import qc.q;

/* compiled from: RealmBaseLocalRepository.kt */
/* loaded from: classes4.dex */
public abstract class RealmBaseLocalRepository implements BaseLocalRepository {
    private o0 realm;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static AtomicBoolean isSaving = new AtomicBoolean(false);
    private static List<Object> pendingSaves = new ArrayList();

    /* compiled from: RealmBaseLocalRepository.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public RealmBaseLocalRepository(o0 o0Var) {
        q.i(o0Var, "realm");
        this.realm = o0Var;
    }

    private final <T extends a1> void copy(o0 o0Var, T t10) {
        try {
            o0Var.g1(t10);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void process() {
        if (isClosed()) {
            return;
        }
        getRealm().V0(new o0.a() { // from class: com.habitrpg.android.habitica.data.local.implementation.a
            @Override // io.realm.o0.a
            public final void a(o0 o0Var) {
                RealmBaseLocalRepository.process$lambda$0(RealmBaseLocalRepository.this, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$0(RealmBaseLocalRepository realmBaseLocalRepository, o0 o0Var) {
        Object D;
        List list;
        q.i(realmBaseLocalRepository, "this$0");
        while ((!pendingSaves.isEmpty()) != false) {
            D = y.D(pendingSaves);
            if (D instanceof a1) {
                q.f(o0Var);
                realmBaseLocalRepository.copy(o0Var, (a1) D);
            } else {
                l lVar = null;
                if (D instanceof List) {
                    list = (List) D;
                } else {
                    list = null;
                }
                if (list != null) {
                    o0Var.h1((Collection) D);
                } else if (k0.k(D, 0)) {
                    ((pc.a) D).invoke();
                } else {
                    if (k0.k(D, 1)) {
                        lVar = (l) D;
                    }
                    if (lVar != null) {
                        q.f(o0Var);
                        ((l) D).invoke(o0Var);
                    }
                }
            }
        }
        isSaving.set(false);
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public void close() {
        getRealm().close();
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseMainObject> void delete(T t10) {
        BaseMainObject baseMainObject;
        q.i(t10, "obj");
        if (isClosed() || (baseMainObject = (BaseMainObject) getLiveObject(t10)) == null) {
            return;
        }
        executeTransaction(new RealmBaseLocalRepository$delete$1(baseMainObject));
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public void executeTransaction(l<? super o0, w> lVar) {
        q.i(lVar, "transaction");
        pendingSaves.add(lVar);
        if (isSaving.compareAndSet(false, true)) {
            process();
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseObject> T getLiveObject(T t10) {
        BaseMainObject baseMainObject;
        q.i(t10, "obj");
        if (isClosed()) {
            return null;
        }
        if ((t10 instanceof d1) && ((d1) t10).isManaged()) {
            if (t10 instanceof BaseMainObject) {
                baseMainObject = (BaseMainObject) t10;
            } else {
                baseMainObject = null;
            }
            if (baseMainObject == null) {
                return null;
            }
            Object q10 = getRealm().k1(baseMainObject.getRealmClass()).n(baseMainObject.getPrimaryIdentifierName(), baseMainObject.getPrimaryIdentifier()).q();
            if (!(q10 instanceof BaseObject)) {
                return null;
            }
            return (T) q10;
        }
        return t10;
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public User getLiveUser(String str) {
        q.i(str, "id");
        return (User) getRealm().k1(User.class).n("id", str).q();
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public o0 getRealm() {
        return this.realm;
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseObject> T getUnmanagedCopy(T t10) {
        q.i(t10, "managedObject");
        if (t10 instanceof d1) {
            d1 d1Var = (d1) t10;
            if (d1Var.isManaged() && d1Var.isValid()) {
                a1 s02 = getRealm().s0(t10);
                q.f(s02);
                return (T) s02;
            }
            return t10;
        }
        return t10;
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public boolean isClosed() {
        return getRealm().isClosed();
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseMainObject> void modify(T t10, l<? super T, w> lVar) {
        BaseMainObject baseMainObject;
        q.i(t10, "obj");
        q.i(lVar, "transaction");
        if (isClosed() || (baseMainObject = (BaseMainObject) getLiveObject(t10)) == null) {
            return;
        }
        executeTransaction(new RealmBaseLocalRepository$modify$1(lVar, baseMainObject));
    }

    public final g<User> queryUser(String str) {
        q.i(str, "userID");
        g1 p10 = getRealm().k1(User.class).n("id", str).p();
        q.h(p10, "findAll(...)");
        final g a10 = ac.c.a(p10);
        final g<g1<User>> gVar = new g<g1<User>>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements dd.h {
                final /* synthetic */ dd.h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1$2", f = "RealmBaseLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(dd.h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r7)
                        goto L59
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        dc.n.b(r7)
                        dd.h r7 = r5.$this_unsafeFlow
                        r2 = r6
                        io.realm.g1 r2 = (io.realm.g1) r2
                        boolean r4 = r2.isLoaded()
                        if (r4 == 0) goto L4d
                        boolean r4 = r2.isValid()
                        if (r4 == 0) goto L4d
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L4d
                        r2 = 1
                        goto L4e
                    L4d:
                        r2 = 0
                    L4e:
                        if (r2 == 0) goto L59
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L59
                        return r1
                    L59:
                        dc.w r6 = dc.w.f13270a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(dd.h<? super g1<User>> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
        return new g<User>() { // from class: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements dd.h {
                final /* synthetic */ dd.h $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @f(c = "com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1$2", f = "RealmBaseLocalRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(dd.h hVar) {
                    this.$this_unsafeFlow = hVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        dd.h r6 = r4.$this_unsafeFlow
                        io.realm.g1 r5 = (io.realm.g1) r5
                        java.lang.Object r5 = ec.r.c0(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.data.local.implementation.RealmBaseLocalRepository$queryUser$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // dd.g
            public Object collect(dd.h<? super User> hVar, Continuation continuation) {
                Object d10;
                Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        };
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseObject> void save(T t10) {
        q.i(t10, "obj");
        pendingSaves.add(t10);
        if (isSaving.compareAndSet(false, true)) {
            process();
        }
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public void setRealm(o0 o0Var) {
        q.i(o0Var, "<set-?>");
        this.realm = o0Var;
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseObject> List<T> getUnmanagedCopy(List<? extends T> list) {
        List<T> i10;
        q.i(list, "list");
        if (isClosed()) {
            i10 = t.i();
            return i10;
        }
        List<T> z02 = getRealm().z0(list);
        q.h(z02, "copyFromRealm(...)");
        return z02;
    }

    @Override // com.habitrpg.android.habitica.data.local.BaseLocalRepository
    public <T extends BaseObject> void save(List<? extends T> list) {
        q.i(list, "objects");
        pendingSaves.add(list);
        if (isSaving.compareAndSet(false, true)) {
            process();
        }
    }
}
