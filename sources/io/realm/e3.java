package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestColors;
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

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestColorsRealmProxy.java */
/* loaded from: classes4.dex */
public class e3 extends QuestColors implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17470r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17471p;

    /* renamed from: q  reason: collision with root package name */
    private l0<QuestColors> f17472q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_inventory_QuestColorsRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17473e;

        /* renamed from: f  reason: collision with root package name */
        long f17474f;

        /* renamed from: g  reason: collision with root package name */
        long f17475g;

        /* renamed from: h  reason: collision with root package name */
        long f17476h;

        /* renamed from: i  reason: collision with root package name */
        long f17477i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("QuestColors");
            this.f17473e = a("key", "key", b10);
            this.f17474f = a("dark", "dark", b10);
            this.f17475g = a("medium", "medium", b10);
            this.f17476h = a("light", "light", b10);
            this.f17477i = a("extralight", "extralight", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17473e = aVar.f17473e;
            aVar2.f17474f = aVar.f17474f;
            aVar2.f17475g = aVar.f17475g;
            aVar2.f17476h = aVar.f17476h;
            aVar2.f17477i = aVar.f17477i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e3() {
        this.f17472q.p();
    }

    public static QuestColors c(o0 o0Var, a aVar, QuestColors questColors, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(questColors);
        if (oVar != null) {
            return (QuestColors) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestColors.class), set);
        osObjectBuilder.c1(aVar.f17473e, questColors.realmGet$key());
        osObjectBuilder.c1(aVar.f17474f, questColors.realmGet$dark());
        osObjectBuilder.c1(aVar.f17475g, questColors.realmGet$medium());
        osObjectBuilder.c1(aVar.f17476h, questColors.realmGet$light());
        osObjectBuilder.c1(aVar.f17477i, questColors.realmGet$extralight());
        e3 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(questColors, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.inventory.QuestColors d(io.realm.o0 r8, io.realm.e3.a r9, com.habitrpg.android.habitica.models.inventory.QuestColors r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.inventory.QuestColors r1 = (com.habitrpg.android.habitica.models.inventory.QuestColors) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.inventory.QuestColors> r2 = com.habitrpg.android.habitica.models.inventory.QuestColors.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17473e
            java.lang.String r5 = r10.realmGet$key()
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
            io.realm.e3 r1 = new io.realm.e3     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.inventory.QuestColors r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.inventory.QuestColors r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.e3.d(io.realm.o0, io.realm.e3$a, com.habitrpg.android.habitica.models.inventory.QuestColors, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.inventory.QuestColors");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static QuestColors f(QuestColors questColors, int i10, int i11, Map<a1, o.a<a1>> map) {
        QuestColors questColors2;
        if (i10 <= i11 && questColors != null) {
            o.a<a1> aVar = map.get(questColors);
            if (aVar == null) {
                questColors2 = new QuestColors();
                map.put(questColors, new o.a<>(i10, questColors2));
            } else if (i10 >= aVar.f17831a) {
                return (QuestColors) aVar.f17832b;
            } else {
                QuestColors questColors3 = (QuestColors) aVar.f17832b;
                aVar.f17831a = i10;
                questColors2 = questColors3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) questColors).b().f();
            questColors2.realmSet$key(questColors.realmGet$key());
            questColors2.realmSet$dark(questColors.realmGet$dark());
            questColors2.realmSet$medium(questColors.realmGet$medium());
            questColors2.realmSet$light(questColors.realmGet$light());
            questColors2.realmSet$extralight(questColors.realmGet$extralight());
            return questColors2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "QuestColors", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, false);
        bVar.b("", "dark", realmFieldType, false, false, false);
        bVar.b("", "medium", realmFieldType, false, false, false);
        bVar.b("", "light", realmFieldType, false, false, false);
        bVar.b("", "extralight", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17470r;
    }

    public static long i(o0 o0Var, QuestColors questColors, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((questColors instanceof io.realm.internal.o) && !d1.isFrozen(questColors)) {
            io.realm.internal.o oVar = (io.realm.internal.o) questColors;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(QuestColors.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestColors.class);
        long j10 = aVar.f17473e;
        String realmGet$key = questColors.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(questColors, Long.valueOf(j11));
        String realmGet$dark = questColors.realmGet$dark();
        if (realmGet$dark != null) {
            Table.nativeSetString(nativePtr, aVar.f17474f, j11, realmGet$dark, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17474f, j11, false);
        }
        String realmGet$medium = questColors.realmGet$medium();
        if (realmGet$medium != null) {
            Table.nativeSetString(nativePtr, aVar.f17475g, j11, realmGet$medium, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17475g, j11, false);
        }
        String realmGet$light = questColors.realmGet$light();
        if (realmGet$light != null) {
            Table.nativeSetString(nativePtr, aVar.f17476h, j11, realmGet$light, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17476h, j11, false);
        }
        String realmGet$extralight = questColors.realmGet$extralight();
        if (realmGet$extralight != null) {
            Table.nativeSetString(nativePtr, aVar.f17477i, j11, realmGet$extralight, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17477i, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        QuestColors questColors;
        Table c12 = o0Var.c1(QuestColors.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(QuestColors.class);
        long j11 = aVar.f17473e;
        while (it.hasNext()) {
            QuestColors questColors2 = (QuestColors) it.next();
            if (!map.containsKey(questColors2)) {
                if ((questColors2 instanceof io.realm.internal.o) && !d1.isFrozen(questColors2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) questColors2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(questColors2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = questColors2.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j11);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(questColors2, Long.valueOf(j10));
                String realmGet$dark = questColors2.realmGet$dark();
                if (realmGet$dark != null) {
                    questColors = questColors2;
                    Table.nativeSetString(nativePtr, aVar.f17474f, j10, realmGet$dark, false);
                } else {
                    questColors = questColors2;
                    Table.nativeSetNull(nativePtr, aVar.f17474f, j10, false);
                }
                String realmGet$medium = questColors.realmGet$medium();
                if (realmGet$medium != null) {
                    Table.nativeSetString(nativePtr, aVar.f17475g, j10, realmGet$medium, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17475g, j10, false);
                }
                String realmGet$light = questColors.realmGet$light();
                if (realmGet$light != null) {
                    Table.nativeSetString(nativePtr, aVar.f17476h, j10, realmGet$light, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17476h, j10, false);
                }
                String realmGet$extralight = questColors.realmGet$extralight();
                if (realmGet$extralight != null) {
                    Table.nativeSetString(nativePtr, aVar.f17477i, j10, realmGet$extralight, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f17477i, j10, false);
                }
            }
        }
    }

    static e3 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(QuestColors.class), false, Collections.emptyList());
        e3 e3Var = new e3();
        cVar.a();
        return e3Var;
    }

    static QuestColors n(o0 o0Var, a aVar, QuestColors questColors, QuestColors questColors2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(QuestColors.class), set);
        osObjectBuilder.c1(aVar.f17473e, questColors2.realmGet$key());
        osObjectBuilder.c1(aVar.f17474f, questColors2.realmGet$dark());
        osObjectBuilder.c1(aVar.f17475g, questColors2.realmGet$medium());
        osObjectBuilder.c1(aVar.f17476h, questColors2.realmGet$light());
        osObjectBuilder.c1(aVar.f17477i, questColors2.realmGet$extralight());
        osObjectBuilder.g1();
        return questColors;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17472q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17471p = (a) cVar.c();
        l0<QuestColors> l0Var = new l0<>(this);
        this.f17472q = l0Var;
        l0Var.r(cVar.e());
        this.f17472q.s(cVar.f());
        this.f17472q.o(cVar.b());
        this.f17472q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17472q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e3 e3Var = (e3) obj;
        io.realm.a f10 = this.f17472q.f();
        io.realm.a f11 = e3Var.f17472q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17472q.g().getTable().p();
        String p11 = e3Var.f17472q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17472q.g().getObjectKey() == e3Var.f17472q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17472q.f().getPath();
        String p10 = this.f17472q.g().getTable().p();
        long objectKey = this.f17472q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public String realmGet$dark() {
        this.f17472q.f().e();
        return this.f17472q.g().getString(this.f17471p.f17474f);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public String realmGet$extralight() {
        this.f17472q.f().e();
        return this.f17472q.g().getString(this.f17471p.f17477i);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public String realmGet$key() {
        this.f17472q.f().e();
        return this.f17472q.g().getString(this.f17471p.f17473e);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public String realmGet$light() {
        this.f17472q.f().e();
        return this.f17472q.g().getString(this.f17471p.f17476h);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public String realmGet$medium() {
        this.f17472q.f().e();
        return this.f17472q.g().getString(this.f17471p.f17475g);
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public void realmSet$dark(String str) {
        if (this.f17472q.i()) {
            if (!this.f17472q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17472q.g();
            if (str == null) {
                g10.getTable().F(this.f17471p.f17474f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17471p.f17474f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17472q.f().e();
        if (str == null) {
            this.f17472q.g().setNull(this.f17471p.f17474f);
        } else {
            this.f17472q.g().setString(this.f17471p.f17474f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public void realmSet$extralight(String str) {
        if (this.f17472q.i()) {
            if (!this.f17472q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17472q.g();
            if (str == null) {
                g10.getTable().F(this.f17471p.f17477i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17471p.f17477i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17472q.f().e();
        if (str == null) {
            this.f17472q.g().setNull(this.f17471p.f17477i);
        } else {
            this.f17472q.g().setString(this.f17471p.f17477i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public void realmSet$key(String str) {
        if (this.f17472q.i()) {
            return;
        }
        this.f17472q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public void realmSet$light(String str) {
        if (this.f17472q.i()) {
            if (!this.f17472q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17472q.g();
            if (str == null) {
                g10.getTable().F(this.f17471p.f17476h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17471p.f17476h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17472q.f().e();
        if (str == null) {
            this.f17472q.g().setNull(this.f17471p.f17476h);
        } else {
            this.f17472q.g().setString(this.f17471p.f17476h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.inventory.QuestColors, io.realm.f3
    public void realmSet$medium(String str) {
        if (this.f17472q.i()) {
            if (!this.f17472q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17472q.g();
            if (str == null) {
                g10.getTable().F(this.f17471p.f17475g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17471p.f17475g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17472q.f().e();
        if (str == null) {
            this.f17472q.g().setNull(this.f17471p.f17475g);
        } else {
            this.f17472q.g().setString(this.f17471p.f17475g, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("QuestColors = proxy[");
        sb2.append("{key:");
        String str5 = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dark:");
        if (realmGet$dark() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$dark();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{medium:");
        if (realmGet$medium() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$medium();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{light:");
        if (realmGet$light() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$light();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{extralight:");
        if (realmGet$extralight() != null) {
            str5 = realmGet$extralight();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
