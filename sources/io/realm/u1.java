package io.realm;

import com.habitrpg.android.habitica.models.Skill;
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

/* compiled from: com_habitrpg_android_habitica_models_SkillRealmProxy.java */
/* loaded from: classes4.dex */
public class u1 extends Skill implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18234r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18235p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Skill> f18236q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_SkillRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18237e;

        /* renamed from: f  reason: collision with root package name */
        long f18238f;

        /* renamed from: g  reason: collision with root package name */
        long f18239g;

        /* renamed from: h  reason: collision with root package name */
        long f18240h;

        /* renamed from: i  reason: collision with root package name */
        long f18241i;

        /* renamed from: j  reason: collision with root package name */
        long f18242j;

        /* renamed from: k  reason: collision with root package name */
        long f18243k;

        a(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Skill");
            this.f18237e = a("key", "key", b10);
            this.f18238f = a("text", "text", b10);
            this.f18239g = a("notes", "notes", b10);
            this.f18240h = a("target", "target", b10);
            this.f18241i = a("habitClass", "habitClass", b10);
            this.f18242j = a("mana", "mana", b10);
            this.f18243k = a("lvl", "lvl", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18237e = aVar.f18237e;
            aVar2.f18238f = aVar.f18238f;
            aVar2.f18239g = aVar.f18239g;
            aVar2.f18240h = aVar.f18240h;
            aVar2.f18241i = aVar.f18241i;
            aVar2.f18242j = aVar.f18242j;
            aVar2.f18243k = aVar.f18243k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u1() {
        this.f18236q.p();
    }

    public static Skill c(o0 o0Var, a aVar, Skill skill, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(skill);
        if (oVar != null) {
            return (Skill) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Skill.class), set);
        osObjectBuilder.c1(aVar.f18237e, skill.realmGet$key());
        osObjectBuilder.c1(aVar.f18238f, skill.realmGet$text());
        osObjectBuilder.c1(aVar.f18239g, skill.realmGet$notes());
        osObjectBuilder.c1(aVar.f18240h, skill.realmGet$target());
        osObjectBuilder.c1(aVar.f18241i, skill.realmGet$habitClass());
        osObjectBuilder.V0(aVar.f18242j, skill.realmGet$mana());
        osObjectBuilder.V0(aVar.f18243k, skill.realmGet$lvl());
        u1 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(skill, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.Skill d(io.realm.o0 r8, io.realm.u1.a r9, com.habitrpg.android.habitica.models.Skill r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.Skill r1 = (com.habitrpg.android.habitica.models.Skill) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.Skill> r2 = com.habitrpg.android.habitica.models.Skill.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18237e
            java.lang.String r5 = r10.realmGet$key()
            long r3 = r2.e(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L6c
            r0 = 0
            goto L8d
        L6c:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L87
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L87
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L87
            io.realm.u1 r1 = new io.realm.u1     // Catch: java.lang.Throwable -> L87
            r1.<init>()     // Catch: java.lang.Throwable -> L87
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L87
            r0.a()
            goto L8c
        L87:
            r8 = move-exception
            r0.a()
            throw r8
        L8c:
            r0 = r11
        L8d:
            r3 = r1
            if (r0 == 0) goto L9a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.Skill r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.Skill r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.u1.d(io.realm.o0, io.realm.u1$a, com.habitrpg.android.habitica.models.Skill, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.Skill");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Skill f(Skill skill, int i10, int i11, Map<a1, o.a<a1>> map) {
        Skill skill2;
        if (i10 <= i11 && skill != null) {
            o.a<a1> aVar = map.get(skill);
            if (aVar == null) {
                skill2 = new Skill();
                map.put(skill, new o.a<>(i10, skill2));
            } else if (i10 >= aVar.f17831a) {
                return (Skill) aVar.f17832b;
            } else {
                Skill skill3 = (Skill) aVar.f17832b;
                aVar.f17831a = i10;
                skill2 = skill3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) skill).b().f();
            skill2.realmSet$key(skill.realmGet$key());
            skill2.realmSet$text(skill.realmGet$text());
            skill2.realmSet$notes(skill.realmGet$notes());
            skill2.realmSet$target(skill.realmGet$target());
            skill2.realmSet$habitClass(skill.realmGet$habitClass());
            skill2.realmSet$mana(skill.realmGet$mana());
            skill2.realmSet$lvl(skill.realmGet$lvl());
            return skill2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Skill", false, 7, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, true);
        bVar.b("", "notes", realmFieldType, false, false, false);
        bVar.b("", "target", realmFieldType, false, false, false);
        bVar.b("", "habitClass", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "mana", realmFieldType2, false, false, false);
        bVar.b("", "lvl", realmFieldType2, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18234r;
    }

    public static long i(o0 o0Var, Skill skill, Map<a1, Long> map) {
        long j10;
        if ((skill instanceof io.realm.internal.o) && !d1.isFrozen(skill)) {
            io.realm.internal.o oVar = (io.realm.internal.o) skill;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Skill.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Skill.class);
        long j11 = aVar.f18237e;
        String realmGet$key = skill.realmGet$key();
        if (realmGet$key != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$key);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$key);
        }
        long j12 = j10;
        map.put(skill, Long.valueOf(j12));
        String realmGet$text = skill.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18238f, j12, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18238f, j12, false);
        }
        String realmGet$notes = skill.realmGet$notes();
        if (realmGet$notes != null) {
            Table.nativeSetString(nativePtr, aVar.f18239g, j12, realmGet$notes, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18239g, j12, false);
        }
        String realmGet$target = skill.realmGet$target();
        if (realmGet$target != null) {
            Table.nativeSetString(nativePtr, aVar.f18240h, j12, realmGet$target, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18240h, j12, false);
        }
        String realmGet$habitClass = skill.realmGet$habitClass();
        if (realmGet$habitClass != null) {
            Table.nativeSetString(nativePtr, aVar.f18241i, j12, realmGet$habitClass, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18241i, j12, false);
        }
        Integer realmGet$mana = skill.realmGet$mana();
        if (realmGet$mana != null) {
            Table.nativeSetLong(nativePtr, aVar.f18242j, j12, realmGet$mana.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18242j, j12, false);
        }
        Integer realmGet$lvl = skill.realmGet$lvl();
        if (realmGet$lvl != null) {
            Table.nativeSetLong(nativePtr, aVar.f18243k, j12, realmGet$lvl.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18243k, j12, false);
        }
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        Table c12 = o0Var.c1(Skill.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Skill.class);
        long j13 = aVar.f18237e;
        while (it.hasNext()) {
            Skill skill = (Skill) it.next();
            if (!map.containsKey(skill)) {
                if ((skill instanceof io.realm.internal.o) && !d1.isFrozen(skill)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) skill;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(skill, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = skill.realmGet$key();
                if (realmGet$key != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j13, realmGet$key);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j13, realmGet$key);
                } else {
                    j11 = j10;
                }
                map.put(skill, Long.valueOf(j11));
                String realmGet$text = skill.realmGet$text();
                if (realmGet$text != null) {
                    j12 = j13;
                    Table.nativeSetString(nativePtr, aVar.f18238f, j11, realmGet$text, false);
                } else {
                    j12 = j13;
                    Table.nativeSetNull(nativePtr, aVar.f18238f, j11, false);
                }
                String realmGet$notes = skill.realmGet$notes();
                if (realmGet$notes != null) {
                    Table.nativeSetString(nativePtr, aVar.f18239g, j11, realmGet$notes, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18239g, j11, false);
                }
                String realmGet$target = skill.realmGet$target();
                if (realmGet$target != null) {
                    Table.nativeSetString(nativePtr, aVar.f18240h, j11, realmGet$target, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18240h, j11, false);
                }
                String realmGet$habitClass = skill.realmGet$habitClass();
                if (realmGet$habitClass != null) {
                    Table.nativeSetString(nativePtr, aVar.f18241i, j11, realmGet$habitClass, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18241i, j11, false);
                }
                Integer realmGet$mana = skill.realmGet$mana();
                if (realmGet$mana != null) {
                    Table.nativeSetLong(nativePtr, aVar.f18242j, j11, realmGet$mana.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18242j, j11, false);
                }
                Integer realmGet$lvl = skill.realmGet$lvl();
                if (realmGet$lvl != null) {
                    Table.nativeSetLong(nativePtr, aVar.f18243k, j11, realmGet$lvl.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18243k, j11, false);
                }
                j13 = j12;
            }
        }
    }

    static u1 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Skill.class), false, Collections.emptyList());
        u1 u1Var = new u1();
        cVar.a();
        return u1Var;
    }

    static Skill n(o0 o0Var, a aVar, Skill skill, Skill skill2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Skill.class), set);
        osObjectBuilder.c1(aVar.f18237e, skill2.realmGet$key());
        osObjectBuilder.c1(aVar.f18238f, skill2.realmGet$text());
        osObjectBuilder.c1(aVar.f18239g, skill2.realmGet$notes());
        osObjectBuilder.c1(aVar.f18240h, skill2.realmGet$target());
        osObjectBuilder.c1(aVar.f18241i, skill2.realmGet$habitClass());
        osObjectBuilder.V0(aVar.f18242j, skill2.realmGet$mana());
        osObjectBuilder.V0(aVar.f18243k, skill2.realmGet$lvl());
        osObjectBuilder.g1();
        return skill;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18236q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18235p = (a) cVar.c();
        l0<Skill> l0Var = new l0<>(this);
        this.f18236q = l0Var;
        l0Var.r(cVar.e());
        this.f18236q.s(cVar.f());
        this.f18236q.o(cVar.b());
        this.f18236q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18236q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        io.realm.a f10 = this.f18236q.f();
        io.realm.a f11 = u1Var.f18236q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18236q.g().getTable().p();
        String p11 = u1Var.f18236q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18236q.g().getObjectKey() == u1Var.f18236q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18236q.f().getPath();
        String p10 = this.f18236q.g().getTable().p();
        long objectKey = this.f18236q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public String realmGet$habitClass() {
        this.f18236q.f().e();
        return this.f18236q.g().getString(this.f18235p.f18241i);
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public String realmGet$key() {
        this.f18236q.f().e();
        return this.f18236q.g().getString(this.f18235p.f18237e);
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public Integer realmGet$lvl() {
        this.f18236q.f().e();
        if (this.f18236q.g().isNull(this.f18235p.f18243k)) {
            return null;
        }
        return Integer.valueOf((int) this.f18236q.g().getLong(this.f18235p.f18243k));
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public Integer realmGet$mana() {
        this.f18236q.f().e();
        if (this.f18236q.g().isNull(this.f18235p.f18242j)) {
            return null;
        }
        return Integer.valueOf((int) this.f18236q.g().getLong(this.f18235p.f18242j));
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public String realmGet$notes() {
        this.f18236q.f().e();
        return this.f18236q.g().getString(this.f18235p.f18239g);
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public String realmGet$target() {
        this.f18236q.f().e();
        return this.f18236q.g().getString(this.f18235p.f18240h);
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public String realmGet$text() {
        this.f18236q.f().e();
        return this.f18236q.g().getString(this.f18235p.f18238f);
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$habitClass(String str) {
        if (this.f18236q.i()) {
            if (!this.f18236q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18236q.g();
            if (str == null) {
                g10.getTable().F(this.f18235p.f18241i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18235p.f18241i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18236q.f().e();
        if (str == null) {
            this.f18236q.g().setNull(this.f18235p.f18241i);
        } else {
            this.f18236q.g().setString(this.f18235p.f18241i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$key(String str) {
        if (this.f18236q.i()) {
            return;
        }
        this.f18236q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$lvl(Integer num) {
        if (this.f18236q.i()) {
            if (!this.f18236q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18236q.g();
            if (num == null) {
                g10.getTable().F(this.f18235p.f18243k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18235p.f18243k, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18236q.f().e();
        if (num == null) {
            this.f18236q.g().setNull(this.f18235p.f18243k);
        } else {
            this.f18236q.g().setLong(this.f18235p.f18243k, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$mana(Integer num) {
        if (this.f18236q.i()) {
            if (!this.f18236q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18236q.g();
            if (num == null) {
                g10.getTable().F(this.f18235p.f18242j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18235p.f18242j, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18236q.f().e();
        if (num == null) {
            this.f18236q.g().setNull(this.f18235p.f18242j);
        } else {
            this.f18236q.g().setLong(this.f18235p.f18242j, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$notes(String str) {
        if (this.f18236q.i()) {
            if (!this.f18236q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18236q.g();
            if (str == null) {
                g10.getTable().F(this.f18235p.f18239g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18235p.f18239g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18236q.f().e();
        if (str == null) {
            this.f18236q.g().setNull(this.f18235p.f18239g);
        } else {
            this.f18236q.g().setString(this.f18235p.f18239g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$target(String str) {
        if (this.f18236q.i()) {
            if (!this.f18236q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18236q.g();
            if (str == null) {
                g10.getTable().F(this.f18235p.f18240h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18235p.f18240h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18236q.f().e();
        if (str == null) {
            this.f18236q.g().setNull(this.f18235p.f18240h);
        } else {
            this.f18236q.g().setString(this.f18235p.f18240h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Skill, io.realm.v1
    public void realmSet$text(String str) {
        if (this.f18236q.i()) {
            if (!this.f18236q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18236q.g();
            if (str != null) {
                g10.getTable().G(this.f18235p.f18238f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
        }
        this.f18236q.f().e();
        if (str != null) {
            this.f18236q.g().setString(this.f18235p.f18238f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'text' to null.");
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        Integer num;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Skill = proxy[");
        sb2.append("{key:");
        sb2.append(realmGet$key());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        sb2.append(realmGet$text());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{notes:");
        Object obj = "null";
        if (realmGet$notes() == null) {
            str = "null";
        } else {
            str = realmGet$notes();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{target:");
        if (realmGet$target() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$target();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{habitClass:");
        if (realmGet$habitClass() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$habitClass();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{mana:");
        if (realmGet$mana() == null) {
            num = "null";
        } else {
            num = realmGet$mana();
        }
        sb2.append(num);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{lvl:");
        if (realmGet$lvl() != null) {
            obj = realmGet$lvl();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
