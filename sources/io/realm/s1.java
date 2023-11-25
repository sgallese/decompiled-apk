package io.realm;

import com.habitrpg.android.habitica.models.QuestAchievement;
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

/* compiled from: com_habitrpg_android_habitica_models_QuestAchievementRealmProxy.java */
/* loaded from: classes4.dex */
public class s1 extends QuestAchievement implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18155r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18156p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestAchievement> f18157q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_QuestAchievementRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18158e;

        /* renamed from: f  reason: collision with root package name */
        long f18159f;

        /* renamed from: g  reason: collision with root package name */
        long f18160g;

        /* renamed from: h  reason: collision with root package name */
        long f18161h;

        a(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestAchievement");
            this.f18158e = a("combinedKey", "combinedKey", b10);
            this.f18159f = a("questKey", "questKey", b10);
            this.f18160g = a("userID", "userID", b10);
            this.f18161h = a("count", "count", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18158e = aVar.f18158e;
            aVar2.f18159f = aVar.f18159f;
            aVar2.f18160g = aVar.f18160g;
            aVar2.f18161h = aVar.f18161h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s1() {
        this.f18157q.p();
    }

    public static QuestAchievement c(o0 o0Var, a aVar, QuestAchievement questAchievement, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questAchievement);
        if (oVar != null) {
            return (QuestAchievement) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestAchievement.class), set);
        osObjectBuilder.c1(aVar.f18158e, questAchievement.realmGet$combinedKey());
        osObjectBuilder.c1(aVar.f18159f, questAchievement.realmGet$questKey());
        osObjectBuilder.c1(aVar.f18160g, questAchievement.realmGet$userID());
        osObjectBuilder.V0(aVar.f18161h, Integer.valueOf(questAchievement.realmGet$count()));
        s1 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questAchievement, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.QuestAchievement d(io.realm.o0 r8, io.realm.s1.a r9, com.habitrpg.android.habitica.models.QuestAchievement r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.QuestAchievement r1 = (com.habitrpg.android.habitica.models.QuestAchievement) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.QuestAchievement> r2 = com.habitrpg.android.habitica.models.QuestAchievement.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18158e
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
            io.realm.s1 r1 = new io.realm.s1     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.QuestAchievement r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.QuestAchievement r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.s1.d(io.realm.o0, io.realm.s1$a, com.habitrpg.android.habitica.models.QuestAchievement, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.QuestAchievement");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestAchievement f(QuestAchievement questAchievement, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestAchievement questAchievement2;
        if (i10 <= i11 && questAchievement != null) {
            o.a<a1> aVar = map.get(questAchievement);
            if (aVar == null) {
                questAchievement2 = new QuestAchievement();
                map.put(questAchievement, new o.a<>(i10, questAchievement2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestAchievement) aVar.f17832b;
            } else {
                QuestAchievement questAchievement3 = (QuestAchievement) aVar.f17832b;
                aVar.f17831a = i10;
                questAchievement2 = questAchievement3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questAchievement).b().f();
            questAchievement2.realmSet$combinedKey(questAchievement.realmGet$combinedKey());
            questAchievement2.realmSet$questKey(questAchievement.realmGet$questKey());
            questAchievement2.realmSet$userID(questAchievement.realmGet$userID());
            questAchievement2.realmSet$count(questAchievement.realmGet$count());
            return questAchievement2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestAchievement", false, 4, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "combinedKey", realmFieldType, true, false, false);
        bVar.b("", "questKey", realmFieldType, false, false, false);
        bVar.b("", "userID", realmFieldType, false, false, false);
        bVar.b("", "count", RealmFieldType.INTEGER, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18155r;
    }

    public static long i(o0 o0Var, QuestAchievement questAchievement, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questAchievement instanceof io.realm.internal.o) && !d1.isFrozen(questAchievement)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questAchievement;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestAchievement.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestAchievement.class);
        long j10 = aVar.f18158e;
        String realmGet$combinedKey = questAchievement.realmGet$combinedKey();
        if (realmGet$combinedKey == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$combinedKey);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$combinedKey);
        }
        long j11 = nativeFindFirstString;
        map.put(questAchievement, Long.valueOf(j11));
        String realmGet$questKey = questAchievement.realmGet$questKey();
        if (realmGet$questKey != null) {
            Table.nativeSetString(nativePtr, aVar.f18159f, j11, realmGet$questKey, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18159f, j11, false);
        }
        String realmGet$userID = questAchievement.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f18160g, j11, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18160g, j11, false);
        }
        Table.nativeSetLong(nativePtr, aVar.f18161h, j11, questAchievement.realmGet$count(), false);
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(QuestAchievement.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestAchievement.class);
        long j12 = aVar.f18158e;
        while (it.hasNext()) {
            QuestAchievement questAchievement = (QuestAchievement) it.next();
            if (!map.containsKey(questAchievement)) {
                if ((questAchievement instanceof io.realm.internal.o) && !d1.isFrozen(questAchievement)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questAchievement;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questAchievement, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$combinedKey = questAchievement.realmGet$combinedKey();
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
                map.put(questAchievement, Long.valueOf(j10));
                String realmGet$questKey = questAchievement.realmGet$questKey();
                if (realmGet$questKey != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f18159f, j10, realmGet$questKey, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f18159f, j10, false);
                }
                String realmGet$userID = questAchievement.realmGet$userID();
                if (realmGet$userID != null) {
                    Table.nativeSetString(nativePtr, aVar.f18160g, j10, realmGet$userID, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18160g, j10, false);
                }
                Table.nativeSetLong(nativePtr, aVar.f18161h, j10, questAchievement.realmGet$count(), false);
                j12 = j11;
            }
        }
    }

    static s1 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestAchievement.class), false, Collections.emptyList());
        s1 s1Var = new s1();
        cVar.a();
        return s1Var;
    }

    static QuestAchievement n(o0 o0Var, a aVar, QuestAchievement questAchievement, QuestAchievement questAchievement2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestAchievement.class), set);
        osObjectBuilder.c1(aVar.f18158e, questAchievement2.realmGet$combinedKey());
        osObjectBuilder.c1(aVar.f18159f, questAchievement2.realmGet$questKey());
        osObjectBuilder.c1(aVar.f18160g, questAchievement2.realmGet$userID());
        osObjectBuilder.V0(aVar.f18161h, Integer.valueOf(questAchievement2.realmGet$count()));
        osObjectBuilder.g1();
        return questAchievement;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18157q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18156p = (a) cVar.c();
        l0<QuestAchievement> l0Var = new l0<>(this);
        this.f18157q = l0Var;
        l0Var.r(cVar.e());
        this.f18157q.s(cVar.f());
        this.f18157q.o(cVar.b());
        this.f18157q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18157q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        io.realm.a f10 = this.f18157q.f();
        io.realm.a f11 = s1Var.f18157q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18157q.g().getTable().p();
        String p11 = s1Var.f18157q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18157q.g().getObjectKey() == s1Var.f18157q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18157q.f().getPath();
        String p10 = this.f18157q.g().getTable().p();
        long objectKey = this.f18157q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public String realmGet$combinedKey() {
        this.f18157q.f().e();
        return this.f18157q.g().getString(this.f18156p.f18158e);
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public int realmGet$count() {
        this.f18157q.f().e();
        return (int) this.f18157q.g().getLong(this.f18156p.f18161h);
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public String realmGet$questKey() {
        this.f18157q.f().e();
        return this.f18157q.g().getString(this.f18156p.f18159f);
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public String realmGet$userID() {
        this.f18157q.f().e();
        return this.f18157q.g().getString(this.f18156p.f18160g);
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public void realmSet$combinedKey(String str) {
        if (this.f18157q.i()) {
            return;
        }
        this.f18157q.f().e();
        throw new RealmException("Primary key field 'combinedKey' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public void realmSet$count(int i10) {
        if (this.f18157q.i()) {
            if (!this.f18157q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18157q.g();
            g10.getTable().E(this.f18156p.f18161h, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18157q.f().e();
        this.f18157q.g().setLong(this.f18156p.f18161h, i10);
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public void realmSet$questKey(String str) {
        if (this.f18157q.i()) {
            if (!this.f18157q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18157q.g();
            if (str == null) {
                g10.getTable().F(this.f18156p.f18159f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18156p.f18159f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18157q.f().e();
        if (str == null) {
            this.f18157q.g().setNull(this.f18156p.f18159f);
        } else {
            this.f18157q.g().setString(this.f18156p.f18159f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.QuestAchievement, io.realm.t1
    public void realmSet$userID(String str) {
        if (this.f18157q.i()) {
            if (!this.f18157q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18157q.g();
            if (str == null) {
                g10.getTable().F(this.f18156p.f18160g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18156p.f18160g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18157q.f().e();
        if (str == null) {
            this.f18157q.g().setNull(this.f18156p.f18160g);
        } else {
            this.f18157q.g().setString(this.f18156p.f18160g, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestAchievement = proxy[");
        sb2.append("{combinedKey:");
        String str3 = "null";
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
        sb2.append("{userID:");
        if (realmGet$userID() != null) {
            str3 = realmGet$userID();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{count:");
        sb2.append(realmGet$count());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
