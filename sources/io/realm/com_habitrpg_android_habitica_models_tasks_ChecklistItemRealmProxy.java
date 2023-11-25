package io.realm;

import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import io.realm.a;
import io.realm.exceptions.RealmException;
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

/* loaded from: classes4.dex */
public class com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy extends ChecklistItem implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17404r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17405p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ChecklistItem> f17406q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17407e;

        /* renamed from: f  reason: collision with root package name */
        long f17408f;

        /* renamed from: g  reason: collision with root package name */
        long f17409g;

        /* renamed from: h  reason: collision with root package name */
        long f17410h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ChecklistItem");
            this.f17407e = a("id", "id", b10);
            this.f17408f = a("text", "text", b10);
            this.f17409g = a(Task.FILTER_COMPLETED, Task.FILTER_COMPLETED, b10);
            this.f17410h = a("position", "position", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17407e = aVar.f17407e;
            aVar2.f17408f = aVar.f17408f;
            aVar2.f17409g = aVar.f17409g;
            aVar2.f17410h = aVar.f17410h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy() {
        this.f17406q.p();
    }

    public static ChecklistItem c(o0 o0Var, a aVar, ChecklistItem checklistItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(checklistItem);
        if (oVar != null) {
            return (ChecklistItem) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChecklistItem.class), set);
        osObjectBuilder.c1(aVar.f17407e, checklistItem.realmGet$id());
        osObjectBuilder.c1(aVar.f17408f, checklistItem.realmGet$text());
        osObjectBuilder.F0(aVar.f17409g, Boolean.valueOf(checklistItem.realmGet$completed()));
        osObjectBuilder.V0(aVar.f17410h, Integer.valueOf(checklistItem.realmGet$position()));
        com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy l10 = l(o0Var, osObjectBuilder.e1());
        map.put(checklistItem, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.tasks.ChecklistItem d(io.realm.o0 r8, io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.a r9, com.habitrpg.android.habitica.models.tasks.ChecklistItem r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
        /*
            boolean r0 = r10 instanceof io.realm.internal.o
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.d1.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            io.realm.internal.o r0 = (io.realm.internal.o) r0
            io.realm.l0 r1 = r0.b()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.l0 r0 = r0.b()
            io.realm.a r0 = r0.f()
            long r1 = r0.f17239m
            long r3 = r8.f17239m
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.f17237x
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.o r1 = (io.realm.internal.o) r1
            if (r1 == 0) goto L51
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r1 = (com.habitrpg.android.habitica.models.tasks.ChecklistItem) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.tasks.ChecklistItem> r2 = com.habitrpg.android.habitica.models.tasks.ChecklistItem.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17407e
            java.lang.String r5 = r10.realmGet$id()
            if (r5 != 0) goto L67
            long r3 = r2.d(r3)
            goto L6b
        L67:
            long r3 = r2.e(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L73
            r0 = 0
            goto L94
        L73:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L8e
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy r1 = new io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy     // Catch: java.lang.Throwable -> L8e
            r1.<init>()     // Catch: java.lang.Throwable -> L8e
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L8e
            r0.a()
            goto L93
        L8e:
            r8 = move-exception
            r0.a()
            throw r8
        L93:
            r0 = r11
        L94:
            r3 = r1
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.tasks.ChecklistItem r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy.d(io.realm.o0, io.realm.com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy$a, com.habitrpg.android.habitica.models.tasks.ChecklistItem, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.tasks.ChecklistItem");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ChecklistItem f(ChecklistItem checklistItem, int i10, int i11, Map<a1, o.a<a1>> map) {
        ChecklistItem checklistItem2;
        if (i10 <= i11 && checklistItem != null) {
            o.a<a1> aVar = map.get(checklistItem);
            if (aVar == null) {
                checklistItem2 = new ChecklistItem();
                map.put(checklistItem, new o.a<>(i10, checklistItem2));
            } else if (i10 >= aVar.f17831a) {
                return (ChecklistItem) aVar.f17832b;
            } else {
                ChecklistItem checklistItem3 = (ChecklistItem) aVar.f17832b;
                aVar.f17831a = i10;
                checklistItem2 = checklistItem3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) checklistItem).b().f();
            checklistItem2.realmSet$id(checklistItem.realmGet$id());
            checklistItem2.realmSet$text(checklistItem.realmGet$text());
            checklistItem2.realmSet$completed(checklistItem.realmGet$completed());
            checklistItem2.realmSet$position(checklistItem.realmGet$position());
            return checklistItem2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ChecklistItem", false, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", Task.FILTER_COMPLETED, RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "position", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17404r;
    }

    public static long i(o0 o0Var, ChecklistItem checklistItem, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((checklistItem instanceof io.realm.internal.o) && !d1.isFrozen(checklistItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) checklistItem;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(ChecklistItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(ChecklistItem.class);
        long j10 = aVar.f17407e;
        String realmGet$id = checklistItem.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$id);
        }
        long j11 = nativeFindFirstString;
        map.put(checklistItem, Long.valueOf(j11));
        String realmGet$text = checklistItem.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17408f, j11, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17408f, j11, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17409g, j11, checklistItem.realmGet$completed(), false);
        Table.nativeSetLong(nativePtr, aVar.f17410h, j11, checklistItem.realmGet$position(), false);
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(ChecklistItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(ChecklistItem.class);
        long j12 = aVar.f17407e;
        while (it.hasNext()) {
            ChecklistItem checklistItem = (ChecklistItem) it.next();
            if (!map.containsKey(checklistItem)) {
                if ((checklistItem instanceof io.realm.internal.o) && !d1.isFrozen(checklistItem)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) checklistItem;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(checklistItem, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = checklistItem.realmGet$id();
                if (realmGet$id == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j12);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j12, realmGet$id);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$id);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(checklistItem, Long.valueOf(j10));
                String realmGet$text = checklistItem.realmGet$text();
                if (realmGet$text != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f17408f, j10, realmGet$text, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f17408f, j10, false);
                }
                long j13 = j10;
                Table.nativeSetBoolean(nativePtr, aVar.f17409g, j13, checklistItem.realmGet$completed(), false);
                Table.nativeSetLong(nativePtr, aVar.f17410h, j13, checklistItem.realmGet$position(), false);
                j12 = j11;
            }
        }
    }

    static com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ChecklistItem.class), false, Collections.emptyList());
        com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy com_habitrpg_android_habitica_models_tasks_checklistitemrealmproxy = new com_habitrpg_android_habitica_models_tasks_ChecklistItemRealmProxy();
        cVar.a();
        return com_habitrpg_android_habitica_models_tasks_checklistitemrealmproxy;
    }

    static ChecklistItem n(o0 o0Var, a aVar, ChecklistItem checklistItem, ChecklistItem checklistItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChecklistItem.class), set);
        osObjectBuilder.c1(aVar.f17407e, checklistItem2.realmGet$id());
        osObjectBuilder.c1(aVar.f17408f, checklistItem2.realmGet$text());
        osObjectBuilder.F0(aVar.f17409g, Boolean.valueOf(checklistItem2.realmGet$completed()));
        osObjectBuilder.V0(aVar.f17410h, Integer.valueOf(checklistItem2.realmGet$position()));
        osObjectBuilder.g1();
        return checklistItem;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17406q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17405p = (a) cVar.c();
        l0<ChecklistItem> l0Var = new l0<>(this);
        this.f17406q = l0Var;
        l0Var.r(cVar.e());
        this.f17406q.s(cVar.f());
        this.f17406q.o(cVar.b());
        this.f17406q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17406q;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public boolean realmGet$completed() {
        this.f17406q.f().e();
        return this.f17406q.g().getBoolean(this.f17405p.f17409g);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public String realmGet$id() {
        this.f17406q.f().e();
        return this.f17406q.g().getString(this.f17405p.f17407e);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public int realmGet$position() {
        this.f17406q.f().e();
        return (int) this.f17406q.g().getLong(this.f17405p.f17410h);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public String realmGet$text() {
        this.f17406q.f().e();
        return this.f17406q.g().getString(this.f17405p.f17408f);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public void realmSet$completed(boolean z10) {
        if (this.f17406q.i()) {
            if (!this.f17406q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17406q.g();
            g10.getTable().z(this.f17405p.f17409g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17406q.f().e();
        this.f17406q.g().setBoolean(this.f17405p.f17409g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public void realmSet$id(String str) {
        if (this.f17406q.i()) {
            return;
        }
        this.f17406q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public void realmSet$position(int i10) {
        if (this.f17406q.i()) {
            if (!this.f17406q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17406q.g();
            g10.getTable().E(this.f17405p.f17410h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17406q.f().e();
        this.f17406q.g().setLong(this.f17405p.f17410h, i10);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.ChecklistItem, io.realm.i5
    public void realmSet$text(String str) {
        if (this.f17406q.i()) {
            if (!this.f17406q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17406q.g();
            if (str == null) {
                g10.getTable().F(this.f17405p.f17408f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17405p.f17408f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17406q.f().e();
        if (str == null) {
            this.f17406q.g().setNull(this.f17405p.f17408f);
        } else {
            this.f17406q.g().setString(this.f17405p.f17408f, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("ChecklistItem = proxy[");
        sb2.append("{id:");
        String str2 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() != null) {
            str2 = realmGet$text();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{completed:");
        sb2.append(realmGet$completed());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{position:");
        sb2.append(realmGet$position());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
