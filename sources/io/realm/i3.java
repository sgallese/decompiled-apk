package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestDropItemRealmProxy.java */
/* loaded from: classes4.dex */
public class i3 extends QuestDropItem implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17647r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17648p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestDropItem> f17649q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestDropItemRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17650e;

        /* renamed from: f  reason: collision with root package name */
        long f17651f;

        /* renamed from: g  reason: collision with root package name */
        long f17652g;

        /* renamed from: h  reason: collision with root package name */
        long f17653h;

        /* renamed from: i  reason: collision with root package name */
        long f17654i;

        /* renamed from: j  reason: collision with root package name */
        long f17655j;

        /* renamed from: k  reason: collision with root package name */
        long f17656k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestDropItem");
            this.f17650e = a("combinedKey", "combinedKey", b10);
            this.f17651f = a("questKey", "questKey", b10);
            this.f17652g = a("key", "key", b10);
            this.f17653h = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f17654i = a("text", "text", b10);
            this.f17655j = a("onlyOwner", "onlyOwner", b10);
            this.f17656k = a("count", "count", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17650e = aVar.f17650e;
            aVar2.f17651f = aVar.f17651f;
            aVar2.f17652g = aVar.f17652g;
            aVar2.f17653h = aVar.f17653h;
            aVar2.f17654i = aVar.f17654i;
            aVar2.f17655j = aVar.f17655j;
            aVar2.f17656k = aVar.f17656k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i3() {
        this.f17649q.p();
    }

    public static QuestDropItem c(o0 o0Var, a aVar, QuestDropItem questDropItem, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questDropItem);
        if (oVar != null) {
            return (QuestDropItem) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestDropItem.class), set);
        osObjectBuilder.c1(aVar.f17650e, questDropItem.realmGet$combinedKey());
        osObjectBuilder.c1(aVar.f17651f, questDropItem.realmGet$questKey());
        osObjectBuilder.c1(aVar.f17652g, questDropItem.realmGet$key());
        osObjectBuilder.c1(aVar.f17653h, questDropItem.realmGet$type());
        osObjectBuilder.c1(aVar.f17654i, questDropItem.realmGet$text());
        osObjectBuilder.F0(aVar.f17655j, Boolean.valueOf(questDropItem.realmGet$onlyOwner()));
        osObjectBuilder.V0(aVar.f17656k, Integer.valueOf(questDropItem.realmGet$count()));
        i3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questDropItem, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestDropItem d(io.realm.o0 r8, io.realm.i3.a r9, com.habitrpg.android.habitica.models.inventory.QuestDropItem r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestDropItem r1 = (com.habitrpg.android.habitica.models.inventory.QuestDropItem) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestDropItem> r2 = com.habitrpg.android.habitica.models.inventory.QuestDropItem.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17650e
            java.lang.String r5 = r10.realmGet$combinedKey()
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
            io.realm.i3 r1 = new io.realm.i3     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.QuestDropItem r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestDropItem r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.i3.d(io.realm.o0, io.realm.i3$a, com.habitrpg.android.habitica.models.inventory.QuestDropItem, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestDropItem");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestDropItem f(QuestDropItem questDropItem, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestDropItem questDropItem2;
        if (i10 <= i11 && questDropItem != null) {
            o.a<a1> aVar = map.get(questDropItem);
            if (aVar == null) {
                questDropItem2 = new QuestDropItem();
                map.put(questDropItem, new o.a<>(i10, questDropItem2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestDropItem) aVar.f17832b;
            } else {
                QuestDropItem questDropItem3 = (QuestDropItem) aVar.f17832b;
                aVar.f17831a = i10;
                questDropItem2 = questDropItem3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questDropItem).b().f();
            questDropItem2.realmSet$combinedKey(questDropItem.realmGet$combinedKey());
            questDropItem2.realmSet$questKey(questDropItem.realmGet$questKey());
            questDropItem2.realmSet$key(questDropItem.realmGet$key());
            questDropItem2.realmSet$type(questDropItem.realmGet$type());
            questDropItem2.realmSet$text(questDropItem.realmGet$text());
            questDropItem2.realmSet$onlyOwner(questDropItem.realmGet$onlyOwner());
            questDropItem2.realmSet$count(questDropItem.realmGet$count());
            return questDropItem2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestDropItem", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "combinedKey", realmFieldType, true, false, false);
        bVar.b("", "questKey", realmFieldType, false, false, false);
        bVar.b("", "key", realmFieldType, false, false, true);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", "onlyOwner", RealmFieldType.BOOLEAN, false, false, true);
        bVar.b("", "count", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17647r;
    }

    public static long i(o0 o0Var, QuestDropItem questDropItem, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questDropItem instanceof io.realm.internal.o) && !d1.isFrozen(questDropItem)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questDropItem;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestDropItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestDropItem.class);
        long j10 = aVar.f17650e;
        String realmGet$combinedKey = questDropItem.realmGet$combinedKey();
        if (realmGet$combinedKey == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$combinedKey);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$combinedKey);
        }
        long j11 = nativeFindFirstString;
        map.put(questDropItem, Long.valueOf(j11));
        String realmGet$questKey = questDropItem.realmGet$questKey();
        if (realmGet$questKey != null) {
            Table.nativeSetString(nativePtr, aVar.f17651f, j11, realmGet$questKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17651f, j11, false);
        }
        String realmGet$key = questDropItem.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, aVar.f17652g, j11, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17652g, j11, false);
        }
        String realmGet$type = questDropItem.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f17653h, j11, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17653h, j11, false);
        }
        String realmGet$text = questDropItem.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f17654i, j11, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17654i, j11, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f17655j, j11, questDropItem.realmGet$onlyOwner(), false);
        Table.nativeSetLong(nativePtr, aVar.f17656k, j11, questDropItem.realmGet$count(), false);
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(QuestDropItem.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestDropItem.class);
        long j12 = aVar.f17650e;
        while (it.hasNext()) {
            QuestDropItem questDropItem = (QuestDropItem) it.next();
            if (!map.containsKey(questDropItem)) {
                if ((questDropItem instanceof io.realm.internal.o) && !d1.isFrozen(questDropItem)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questDropItem;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questDropItem, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$combinedKey = questDropItem.realmGet$combinedKey();
                if (realmGet$combinedKey == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j12);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j12, realmGet$combinedKey);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$combinedKey);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(questDropItem, Long.valueOf(j10));
                String realmGet$questKey = questDropItem.realmGet$questKey();
                if (realmGet$questKey != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f17651f, j10, realmGet$questKey, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f17651f, j10, false);
                }
                String realmGet$key = questDropItem.realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(nativePtr, aVar.f17652g, j10, realmGet$key, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17652g, j10, false);
                }
                String realmGet$type = questDropItem.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, aVar.f17653h, j10, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17653h, j10, false);
                }
                String realmGet$text = questDropItem.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar.f17654i, j10, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17654i, j10, false);
                }
                long j13 = j10;
                Table.nativeSetBoolean(nativePtr, aVar.f17655j, j13, questDropItem.realmGet$onlyOwner(), false);
                Table.nativeSetLong(nativePtr, aVar.f17656k, j13, questDropItem.realmGet$count(), false);
                j12 = j11;
            }
        }
    }

    static i3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestDropItem.class), false, Collections.emptyList());
        i3 i3Var = new i3();
        cVar.a();
        return i3Var;
    }

    static QuestDropItem n(o0 o0Var, a aVar, QuestDropItem questDropItem, QuestDropItem questDropItem2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestDropItem.class), set);
        osObjectBuilder.c1(aVar.f17650e, questDropItem2.realmGet$combinedKey());
        osObjectBuilder.c1(aVar.f17651f, questDropItem2.realmGet$questKey());
        osObjectBuilder.c1(aVar.f17652g, questDropItem2.realmGet$key());
        osObjectBuilder.c1(aVar.f17653h, questDropItem2.realmGet$type());
        osObjectBuilder.c1(aVar.f17654i, questDropItem2.realmGet$text());
        osObjectBuilder.F0(aVar.f17655j, Boolean.valueOf(questDropItem2.realmGet$onlyOwner()));
        osObjectBuilder.V0(aVar.f17656k, Integer.valueOf(questDropItem2.realmGet$count()));
        osObjectBuilder.g1();
        return questDropItem;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17649q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17648p = (a) cVar.c();
        l0<QuestDropItem> l0Var = new l0<>(this);
        this.f17649q = l0Var;
        l0Var.r(cVar.e());
        this.f17649q.s(cVar.f());
        this.f17649q.o(cVar.b());
        this.f17649q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17649q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i3 i3Var = (i3) obj;
        io.realm.a f10 = this.f17649q.f();
        io.realm.a f11 = i3Var.f17649q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17649q.g().getTable().p();
        String p11 = i3Var.f17649q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17649q.g().getObjectKey() == i3Var.f17649q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17649q.f().getPath();
        String p10 = this.f17649q.g().getTable().p();
        long objectKey = this.f17649q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public String realmGet$combinedKey() {
        this.f17649q.f().e();
        return this.f17649q.g().getString(this.f17648p.f17650e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public int realmGet$count() {
        this.f17649q.f().e();
        return (int) this.f17649q.g().getLong(this.f17648p.f17656k);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public String realmGet$key() {
        this.f17649q.f().e();
        return this.f17649q.g().getString(this.f17648p.f17652g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public boolean realmGet$onlyOwner() {
        this.f17649q.f().e();
        return this.f17649q.g().getBoolean(this.f17648p.f17655j);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public String realmGet$questKey() {
        this.f17649q.f().e();
        return this.f17649q.g().getString(this.f17648p.f17651f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public String realmGet$text() {
        this.f17649q.f().e();
        return this.f17649q.g().getString(this.f17648p.f17654i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public String realmGet$type() {
        this.f17649q.f().e();
        return this.f17649q.g().getString(this.f17648p.f17653h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$combinedKey(String str) {
        if (this.f17649q.i()) {
            return;
        }
        this.f17649q.f().e();
        throw new RealmException("Primary key field 'combinedKey' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$count(int i10) {
        if (this.f17649q.i()) {
            if (!this.f17649q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17649q.g();
            g10.getTable().E(this.f17648p.f17656k, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17649q.f().e();
        this.f17649q.g().setLong(this.f17648p.f17656k, i10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$key(String str) {
        if (this.f17649q.i()) {
            if (!this.f17649q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17649q.g();
            if (str != null) {
                g10.getTable().G(this.f17648p.f17652g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
        }
        this.f17649q.f().e();
        if (str != null) {
            this.f17649q.g().setString(this.f17648p.f17652g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'key' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$onlyOwner(boolean z10) {
        if (this.f17649q.i()) {
            if (!this.f17649q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17649q.g();
            g10.getTable().z(this.f17648p.f17655j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17649q.f().e();
        this.f17649q.g().setBoolean(this.f17648p.f17655j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$questKey(String str) {
        if (this.f17649q.i()) {
            if (!this.f17649q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17649q.g();
            if (str == null) {
                g10.getTable().F(this.f17648p.f17651f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17648p.f17651f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17649q.f().e();
        if (str == null) {
            this.f17649q.g().setNull(this.f17648p.f17651f);
        } else {
            this.f17649q.g().setString(this.f17648p.f17651f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$text(String str) {
        if (this.f17649q.i()) {
            if (!this.f17649q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17649q.g();
            if (str == null) {
                g10.getTable().F(this.f17648p.f17654i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17648p.f17654i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17649q.f().e();
        if (str == null) {
            this.f17649q.g().setNull(this.f17648p.f17654i);
        } else {
            this.f17649q.g().setString(this.f17648p.f17654i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestDropItem, io.realm.j3
    public void realmSet$type(String str) {
        if (this.f17649q.i()) {
            if (!this.f17649q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17649q.g();
            if (str == null) {
                g10.getTable().F(this.f17648p.f17653h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17648p.f17653h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17649q.f().e();
        if (str == null) {
            this.f17649q.g().setNull(this.f17648p.f17653h);
        } else {
            this.f17649q.g().setString(this.f17648p.f17653h, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestDropItem = proxy[");
        sb2.append("{combinedKey:");
        String str4 = "null";
        if (realmGet$combinedKey() == null) {
            str = "null";
        } else {
            str = realmGet$combinedKey();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{questKey:");
        if (realmGet$questKey() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$questKey();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$type();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() != null) {
            str4 = realmGet$text();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{onlyOwner:");
        sb2.append(realmGet$onlyOwner());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{count:");
        sb2.append(realmGet$count());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
