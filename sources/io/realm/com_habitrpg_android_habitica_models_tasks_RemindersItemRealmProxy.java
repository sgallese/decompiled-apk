package io.realm;

import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
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
public class com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy extends RemindersItem implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17421r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17422p;

    /* renamed from: q  reason: collision with root package name */
    private l0<RemindersItem> f17423q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17424e;

        /* renamed from: f  reason: collision with root package name */
        long f17425f;

        /* renamed from: g  reason: collision with root package name */
        long f17426g;

        /* renamed from: h  reason: collision with root package name */
        long f17427h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("RemindersItem");
            this.f17424e = a("id", "id", b10);
            this.f17425f = a("startDate", "startDate", b10);
            this.f17426g = a("time", "time", b10);
            this.f17427h = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17424e = aVar.f17424e;
            aVar2.f17425f = aVar.f17425f;
            aVar2.f17426g = aVar.f17426g;
            aVar2.f17427h = aVar.f17427h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy() {
        this.f17423q.p();
    }

    public static RemindersItem c(o0 o0Var, a aVar, RemindersItem remindersItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(remindersItem);
        if (oVar != null) {
            return (RemindersItem) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(RemindersItem.class), set);
        osObjectBuilder.c1(aVar.f17424e, remindersItem.realmGet$id());
        osObjectBuilder.c1(aVar.f17425f, remindersItem.realmGet$startDate());
        osObjectBuilder.c1(aVar.f17426g, remindersItem.realmGet$time());
        osObjectBuilder.c1(aVar.f17427h, remindersItem.realmGet$type());
        com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy l10 = l(o0Var, osObjectBuilder.e1());
        map.put(remindersItem, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.tasks.RemindersItem d(io.realm.o0 r8, io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.a r9, com.habitrpg.android.habitica.models.tasks.RemindersItem r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.tasks.RemindersItem r1 = (com.habitrpg.android.habitica.models.tasks.RemindersItem) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.tasks.RemindersItem> r2 = com.habitrpg.android.habitica.models.tasks.RemindersItem.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17424e
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
            io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy r1 = new io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.tasks.RemindersItem r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.tasks.RemindersItem r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy.d(io.realm.o0, io.realm.com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy$a, com.habitrpg.android.habitica.models.tasks.RemindersItem, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.tasks.RemindersItem");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static RemindersItem f(RemindersItem remindersItem, int i10, int i11, Map<a1, o.a<a1>> map) {
        RemindersItem remindersItem2;
        if (i10 <= i11 && remindersItem != null) {
            o.a<a1> aVar = map.get(remindersItem);
            if (aVar == null) {
                remindersItem2 = new RemindersItem();
                map.put(remindersItem, new o.a<>(i10, remindersItem2));
            } else if (i10 >= aVar.f17831a) {
                return (RemindersItem) aVar.f17832b;
            } else {
                RemindersItem remindersItem3 = (RemindersItem) aVar.f17832b;
                aVar.f17831a = i10;
                remindersItem2 = remindersItem3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) remindersItem).b().f();
            remindersItem2.realmSet$id(remindersItem.realmGet$id());
            remindersItem2.realmSet$startDate(remindersItem.realmGet$startDate());
            remindersItem2.realmSet$time(remindersItem.realmGet$time());
            remindersItem2.realmSet$type(remindersItem.realmGet$type());
            return remindersItem2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "RemindersItem", false, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, false);
        bVar.b("", "startDate", realmFieldType, false, false, false);
        bVar.b("", "time", realmFieldType, false, false, false);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17421r;
    }

    public static long i(o0 o0Var, RemindersItem remindersItem, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((remindersItem instanceof io.realm.internal.o) && !d1.isFrozen(remindersItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) remindersItem;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(RemindersItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(RemindersItem.class);
        long j10 = aVar.f17424e;
        String realmGet$id = remindersItem.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$id);
        }
        long j11 = nativeFindFirstString;
        map.put(remindersItem, Long.valueOf(j11));
        String realmGet$startDate = remindersItem.realmGet$startDate();
        if (realmGet$startDate != null) {
            Table.nativeSetString(nativePtr, aVar.f17425f, j11, realmGet$startDate, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17425f, j11, false);
        }
        String realmGet$time = remindersItem.realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(nativePtr, aVar.f17426g, j11, realmGet$time, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17426g, j11, false);
        }
        String realmGet$type = remindersItem.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f17427h, j11, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17427h, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        RemindersItem remindersItem;
        Table c12 = o0Var.c1(RemindersItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(RemindersItem.class);
        long j11 = aVar.f17424e;
        while (it.hasNext()) {
            RemindersItem remindersItem2 = (RemindersItem) it.next();
            if (!map.containsKey(remindersItem2)) {
                if ((remindersItem2 instanceof io.realm.internal.o) && !d1.isFrozen(remindersItem2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) remindersItem2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(remindersItem2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = remindersItem2.realmGet$id();
                if (realmGet$id == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j11);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j11, realmGet$id);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$id);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(remindersItem2, Long.valueOf(j10));
                String realmGet$startDate = remindersItem2.realmGet$startDate();
                if (realmGet$startDate != null) {
                    remindersItem = remindersItem2;
                    Table.nativeSetString(nativePtr, aVar.f17425f, j10, realmGet$startDate, false);
                } else {
                    remindersItem = remindersItem2;
                    Table.nativeSetNull(nativePtr, aVar.f17425f, j10, false);
                }
                String realmGet$time = remindersItem.realmGet$time();
                if (realmGet$time != null) {
                    Table.nativeSetString(nativePtr, aVar.f17426g, j10, realmGet$time, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17426g, j10, false);
                }
                String realmGet$type = remindersItem.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, aVar.f17427h, j10, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17427h, j10, false);
                }
            }
        }
    }

    static com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(RemindersItem.class), false, Collections.emptyList());
        com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy com_habitrpg_android_habitica_models_tasks_remindersitemrealmproxy = new com_habitrpg_android_habitica_models_tasks_RemindersItemRealmProxy();
        cVar.a();
        return com_habitrpg_android_habitica_models_tasks_remindersitemrealmproxy;
    }

    static RemindersItem n(o0 o0Var, a aVar, RemindersItem remindersItem, RemindersItem remindersItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(RemindersItem.class), set);
        osObjectBuilder.c1(aVar.f17424e, remindersItem2.realmGet$id());
        osObjectBuilder.c1(aVar.f17425f, remindersItem2.realmGet$startDate());
        osObjectBuilder.c1(aVar.f17426g, remindersItem2.realmGet$time());
        osObjectBuilder.c1(aVar.f17427h, remindersItem2.realmGet$type());
        osObjectBuilder.g1();
        return remindersItem;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17423q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17422p = (a) cVar.c();
        l0<RemindersItem> l0Var = new l0<>(this);
        this.f17423q = l0Var;
        l0Var.r(cVar.e());
        this.f17423q.s(cVar.f());
        this.f17423q.o(cVar.b());
        this.f17423q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17423q;
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public String realmGet$id() {
        this.f17423q.f().e();
        return this.f17423q.g().getString(this.f17422p.f17424e);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public String realmGet$startDate() {
        this.f17423q.f().e();
        return this.f17423q.g().getString(this.f17422p.f17425f);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public String realmGet$time() {
        this.f17423q.f().e();
        return this.f17423q.g().getString(this.f17422p.f17426g);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public String realmGet$type() {
        this.f17423q.f().e();
        return this.f17423q.g().getString(this.f17422p.f17427h);
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public void realmSet$id(String str) {
        if (this.f17423q.i()) {
            return;
        }
        this.f17423q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public void realmSet$startDate(String str) {
        if (this.f17423q.i()) {
            if (!this.f17423q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17423q.g();
            if (str == null) {
                g10.getTable().F(this.f17422p.f17425f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17422p.f17425f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17423q.f().e();
        if (str == null) {
            this.f17423q.g().setNull(this.f17422p.f17425f);
        } else {
            this.f17423q.g().setString(this.f17422p.f17425f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public void realmSet$time(String str) {
        if (this.f17423q.i()) {
            if (!this.f17423q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17423q.g();
            if (str == null) {
                g10.getTable().F(this.f17422p.f17426g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17422p.f17426g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17423q.f().e();
        if (str == null) {
            this.f17423q.g().setNull(this.f17422p.f17426g);
        } else {
            this.f17423q.g().setString(this.f17422p.f17426g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.tasks.RemindersItem, io.realm.m5
    public void realmSet$type(String str) {
        if (this.f17423q.i()) {
            if (!this.f17423q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17423q.g();
            if (str == null) {
                g10.getTable().F(this.f17422p.f17427h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17422p.f17427h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17423q.f().e();
        if (str == null) {
            this.f17423q.g().setNull(this.f17422p.f17427h);
        } else {
            this.f17423q.g().setString(this.f17422p.f17427h, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("RemindersItem = proxy[");
        sb2.append("{id:");
        String str4 = "null";
        if (realmGet$id() == null) {
            str = "null";
        } else {
            str = realmGet$id();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{startDate:");
        if (realmGet$startDate() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$startDate();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{time:");
        if (realmGet$time() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$time();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() != null) {
            str4 = realmGet$type();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
