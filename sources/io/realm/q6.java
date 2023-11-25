package io.realm;

import com.habitrpg.android.habitica.models.user.Inbox;
import io.realm.a;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_InboxRealmProxy.java */
/* loaded from: classes4.dex */
public class q6 extends Inbox implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18137u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18138p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Inbox> f18139q;

    /* renamed from: r  reason: collision with root package name */
    private x0<String> f18140r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_InboxRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18141e;

        /* renamed from: f  reason: collision with root package name */
        long f18142f;

        /* renamed from: g  reason: collision with root package name */
        long f18143g;

        /* renamed from: h  reason: collision with root package name */
        long f18144h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Inbox");
            this.f18141e = a("optOut", "optOut", b10);
            this.f18142f = a("blocks", "blocks", b10);
            this.f18143g = a("newMessages", "newMessages", b10);
            this.f18144h = a("hasUserSeenInbox", "hasUserSeenInbox", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18141e = aVar.f18141e;
            aVar2.f18142f = aVar.f18142f;
            aVar2.f18143g = aVar.f18143g;
            aVar2.f18144h = aVar.f18144h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6() {
        this.f18139q.p();
    }

    public static Inbox c(o0 o0Var, a aVar, Inbox inbox, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(inbox);
        if (oVar != null) {
            return (Inbox) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Inbox.class), set);
        osObjectBuilder.F0(aVar.f18141e, Boolean.valueOf(inbox.realmGet$optOut()));
        osObjectBuilder.d1(aVar.f18142f, inbox.realmGet$blocks());
        osObjectBuilder.V0(aVar.f18143g, Integer.valueOf(inbox.realmGet$newMessages()));
        osObjectBuilder.F0(aVar.f18144h, Boolean.valueOf(inbox.realmGet$hasUserSeenInbox()));
        q6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(inbox, k10);
        return k10;
    }

    public static Inbox d(o0 o0Var, a aVar, Inbox inbox, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((inbox instanceof io.realm.internal.o) && !d1.isFrozen(inbox)) {
            io.realm.internal.o oVar = (io.realm.internal.o) inbox;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return inbox;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(inbox);
        if (oVar2 != null) {
            return (Inbox) oVar2;
        }
        return c(o0Var, aVar, inbox, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Inbox f(Inbox inbox, int i10, int i11, Map<a1, o.a<a1>> map) {
        Inbox inbox2;
        if (i10 <= i11 && inbox != null) {
            o.a<a1> aVar = map.get(inbox);
            if (aVar == null) {
                inbox2 = new Inbox();
                map.put(inbox, new o.a<>(i10, inbox2));
            } else if (i10 >= aVar.f17831a) {
                return (Inbox) aVar.f17832b;
            } else {
                Inbox inbox3 = (Inbox) aVar.f17832b;
                aVar.f17831a = i10;
                inbox2 = inbox3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) inbox).b().f();
            inbox2.realmSet$optOut(inbox.realmGet$optOut());
            inbox2.realmSet$blocks(new x0<>());
            inbox2.realmGet$blocks().addAll(inbox.realmGet$blocks());
            inbox2.realmSet$newMessages(inbox.realmGet$newMessages());
            inbox2.realmSet$hasUserSeenInbox(inbox.realmGet$hasUserSeenInbox());
            return inbox2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Inbox", true, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "optOut", realmFieldType, false, false, true);
        bVar.c("", "blocks", RealmFieldType.STRING_LIST, false);
        bVar.b("", "newMessages", RealmFieldType.INTEGER, false, false, true);
        bVar.b("", "hasUserSeenInbox", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18137u;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Inbox inbox, Map<a1, Long> map) {
        if ((inbox instanceof io.realm.internal.o) && !d1.isFrozen(inbox)) {
            io.realm.internal.o oVar = (io.realm.internal.o) inbox;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Inbox.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Inbox.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(inbox, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f18141e, createEmbeddedObject, inbox.realmGet$optOut(), false);
        OsList osList = new OsList(c12.s(createEmbeddedObject), aVar.f18142f);
        osList.K();
        x0<String> realmGet$blocks = inbox.realmGet$blocks();
        if (realmGet$blocks != null) {
            Iterator<String> it = realmGet$blocks.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.h();
                } else {
                    osList.l(next);
                }
            }
        }
        Table.nativeSetLong(nativePtr, aVar.f18143g, createEmbeddedObject, inbox.realmGet$newMessages(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f18144h, createEmbeddedObject, inbox.realmGet$hasUserSeenInbox(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Inbox.class), false, Collections.emptyList());
        q6 q6Var = new q6();
        cVar.a();
        return q6Var;
    }

    static Inbox l(o0 o0Var, a aVar, Inbox inbox, Inbox inbox2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Inbox.class), set);
        osObjectBuilder.F0(aVar.f18141e, Boolean.valueOf(inbox2.realmGet$optOut()));
        osObjectBuilder.d1(aVar.f18142f, inbox2.realmGet$blocks());
        osObjectBuilder.V0(aVar.f18143g, Integer.valueOf(inbox2.realmGet$newMessages()));
        osObjectBuilder.F0(aVar.f18144h, Boolean.valueOf(inbox2.realmGet$hasUserSeenInbox()));
        osObjectBuilder.f1((io.realm.internal.o) inbox);
        return inbox;
    }

    public static void n(o0 o0Var, Inbox inbox, Inbox inbox2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Inbox.class), inbox2, inbox, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18139q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18138p = (a) cVar.c();
        l0<Inbox> l0Var = new l0<>(this);
        this.f18139q = l0Var;
        l0Var.r(cVar.e());
        this.f18139q.s(cVar.f());
        this.f18139q.o(cVar.b());
        this.f18139q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18139q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q6 q6Var = (q6) obj;
        io.realm.a f10 = this.f18139q.f();
        io.realm.a f11 = q6Var.f18139q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18139q.g().getTable().p();
        String p11 = q6Var.f18139q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18139q.g().getObjectKey() == q6Var.f18139q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18139q.f().getPath();
        String p10 = this.f18139q.g().getTable().p();
        long objectKey = this.f18139q.g().getObjectKey();
        int i11 = 0;
        if (path != null) {
            i10 = path.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (527 + i10) * 31;
        if (p10 != null) {
            i11 = p10.hashCode();
        }
        return ((i12 + i11) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public x0<String> realmGet$blocks() {
        this.f18139q.f().e();
        x0<String> x0Var = this.f18140r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<String> x0Var2 = new x0<>(String.class, this.f18139q.g().getValueList(this.f18138p.f18142f, RealmFieldType.STRING_LIST), this.f18139q.f());
        this.f18140r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public boolean realmGet$hasUserSeenInbox() {
        this.f18139q.f().e();
        return this.f18139q.g().getBoolean(this.f18138p.f18144h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public int realmGet$newMessages() {
        this.f18139q.f().e();
        return (int) this.f18139q.g().getLong(this.f18138p.f18143g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public boolean realmGet$optOut() {
        this.f18139q.f().e();
        return this.f18139q.g().getBoolean(this.f18138p.f18141e);
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public void realmSet$blocks(x0<String> x0Var) {
        if (this.f18139q.i() && (!this.f18139q.d() || this.f18139q.e().contains("blocks"))) {
            return;
        }
        this.f18139q.f().e();
        OsList valueList = this.f18139q.g().getValueList(this.f18138p.f18142f, RealmFieldType.STRING_LIST);
        valueList.K();
        if (x0Var == null) {
            return;
        }
        Iterator<String> it = x0Var.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                valueList.h();
            } else {
                valueList.l(next);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public void realmSet$hasUserSeenInbox(boolean z10) {
        if (this.f18139q.i()) {
            if (!this.f18139q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18139q.g();
            g10.getTable().z(this.f18138p.f18144h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18139q.f().e();
        this.f18139q.g().setBoolean(this.f18138p.f18144h, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public void realmSet$newMessages(int i10) {
        if (this.f18139q.i()) {
            if (!this.f18139q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18139q.g();
            g10.getTable().E(this.f18138p.f18143g, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18139q.f().e();
        this.f18139q.g().setLong(this.f18138p.f18143g, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Inbox, io.realm.r6
    public void realmSet$optOut(boolean z10) {
        if (this.f18139q.i()) {
            if (!this.f18139q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18139q.g();
            g10.getTable().z(this.f18138p.f18141e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18139q.f().e();
        this.f18139q.g().setBoolean(this.f18138p.f18141e, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "Inbox = proxy[{optOut:" + realmGet$optOut() + "},{blocks:RealmList<String>[" + realmGet$blocks().size() + "]},{newMessages:" + realmGet$newMessages() + "},{hasUserSeenInbox:" + realmGet$hasUserSeenInbox() + "}]";
    }
}
