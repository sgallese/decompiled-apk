package io.realm;

import com.habitrpg.android.habitica.models.FAQArticle;
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

/* compiled from: com_habitrpg_android_habitica_models_FAQArticleRealmProxy.java */
/* loaded from: classes4.dex */
public class q1 extends FAQArticle implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18081r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18082p;

    /* renamed from: q  reason: collision with root package name */
    private l0<FAQArticle> f18083q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_FAQArticleRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18084e;

        /* renamed from: f  reason: collision with root package name */
        long f18085f;

        /* renamed from: g  reason: collision with root package name */
        long f18086g;

        a(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("FAQArticle");
            this.f18084e = a("position", "position", b10);
            this.f18085f = a("question", "question", b10);
            this.f18086g = a("answer", "answer", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18084e = aVar.f18084e;
            aVar2.f18085f = aVar.f18085f;
            aVar2.f18086g = aVar.f18086g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q1() {
        this.f18083q.p();
    }

    public static FAQArticle c(o0 o0Var, a aVar, FAQArticle fAQArticle, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(fAQArticle);
        if (oVar != null) {
            return (FAQArticle) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(FAQArticle.class), set);
        osObjectBuilder.V0(aVar.f18084e, fAQArticle.realmGet$position());
        osObjectBuilder.c1(aVar.f18085f, fAQArticle.realmGet$question());
        osObjectBuilder.c1(aVar.f18086g, fAQArticle.realmGet$answer());
        q1 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(fAQArticle, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.FAQArticle d(io.realm.o0 r8, io.realm.q1.a r9, com.habitrpg.android.habitica.models.FAQArticle r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.FAQArticle r1 = (com.habitrpg.android.habitica.models.FAQArticle) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L97
            java.lang.Class<com.habitrpg.android.habitica.models.FAQArticle> r2 = com.habitrpg.android.habitica.models.FAQArticle.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18084e
            java.lang.Integer r5 = r10.realmGet$position()
            if (r5 != 0) goto L67
            long r3 = r2.d(r3)
            goto L6f
        L67:
            long r5 = r5.longValue()
            long r3 = r2.c(r3, r5)
        L6f:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L77
            r0 = 0
            goto L98
        L77:
            io.realm.internal.UncheckedRow r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L92
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L92
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92
            io.realm.q1 r1 = new io.realm.q1     // Catch: java.lang.Throwable -> L92
            r1.<init>()     // Catch: java.lang.Throwable -> L92
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L92
            r0.a()
            goto L97
        L92:
            r8 = move-exception
            r0.a()
            throw r8
        L97:
            r0 = r11
        L98:
            r3 = r1
            if (r0 == 0) goto La5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.habitrpg.android.habitica.models.FAQArticle r8 = n(r1, r2, r3, r4, r5, r6)
            goto La9
        La5:
            com.habitrpg.android.habitica.models.FAQArticle r8 = c(r8, r9, r10, r11, r12, r13)
        La9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.q1.d(io.realm.o0, io.realm.q1$a, com.habitrpg.android.habitica.models.FAQArticle, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.FAQArticle");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static FAQArticle f(FAQArticle fAQArticle, int i10, int i11, Map<a1, o.a<a1>> map) {
        FAQArticle fAQArticle2;
        if (i10 <= i11 && fAQArticle != null) {
            o.a<a1> aVar = map.get(fAQArticle);
            if (aVar == null) {
                fAQArticle2 = new FAQArticle();
                map.put(fAQArticle, new o.a<>(i10, fAQArticle2));
            } else if (i10 >= aVar.f17831a) {
                return (FAQArticle) aVar.f17832b;
            } else {
                FAQArticle fAQArticle3 = (FAQArticle) aVar.f17832b;
                aVar.f17831a = i10;
                fAQArticle2 = fAQArticle3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) fAQArticle).b().f();
            fAQArticle2.realmSet$position(fAQArticle.realmGet$position());
            fAQArticle2.realmSet$question(fAQArticle.realmGet$question());
            fAQArticle2.realmSet$answer(fAQArticle.realmGet$answer());
            return fAQArticle2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "FAQArticle", false, 3, 0);
        bVar.b("", "position", RealmFieldType.INTEGER, true, false, false);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "question", realmFieldType, false, false, false);
        bVar.b("", "answer", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18081r;
    }

    public static long i(o0 o0Var, FAQArticle fAQArticle, Map<a1, Long> map) {
        long nativeFindFirstInt;
        if ((fAQArticle instanceof io.realm.internal.o) && !d1.isFrozen(fAQArticle)) {
            io.realm.internal.o oVar = (io.realm.internal.o) fAQArticle;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(FAQArticle.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(FAQArticle.class);
        long j10 = aVar.f18084e;
        if (fAQArticle.realmGet$position() == null) {
            nativeFindFirstInt = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j10, fAQArticle.realmGet$position().intValue());
        }
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(c12, j10, fAQArticle.realmGet$position());
        }
        long j11 = nativeFindFirstInt;
        map.put(fAQArticle, Long.valueOf(j11));
        String realmGet$question = fAQArticle.realmGet$question();
        if (realmGet$question != null) {
            Table.nativeSetString(nativePtr, aVar.f18085f, j11, realmGet$question, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18085f, j11, false);
        }
        String realmGet$answer = fAQArticle.realmGet$answer();
        if (realmGet$answer != null) {
            Table.nativeSetString(nativePtr, aVar.f18086g, j11, realmGet$answer, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18086g, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstInt;
        FAQArticle fAQArticle;
        Table c12 = o0Var.c1(FAQArticle.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(FAQArticle.class);
        long j10 = aVar.f18084e;
        while (it.hasNext()) {
            FAQArticle fAQArticle2 = (FAQArticle) it.next();
            if (!map.containsKey(fAQArticle2)) {
                if ((fAQArticle2 instanceof io.realm.internal.o) && !d1.isFrozen(fAQArticle2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) fAQArticle2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(fAQArticle2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                if (fAQArticle2.realmGet$position() == null) {
                    nativeFindFirstInt = Table.nativeFindFirstNull(nativePtr, j10);
                } else {
                    nativeFindFirstInt = Table.nativeFindFirstInt(nativePtr, j10, fAQArticle2.realmGet$position().intValue());
                }
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(c12, j10, fAQArticle2.realmGet$position());
                }
                long j11 = nativeFindFirstInt;
                map.put(fAQArticle2, Long.valueOf(j11));
                String realmGet$question = fAQArticle2.realmGet$question();
                if (realmGet$question != null) {
                    fAQArticle = fAQArticle2;
                    Table.nativeSetString(nativePtr, aVar.f18085f, j11, realmGet$question, false);
                } else {
                    fAQArticle = fAQArticle2;
                    Table.nativeSetNull(nativePtr, aVar.f18085f, j11, false);
                }
                String realmGet$answer = fAQArticle.realmGet$answer();
                if (realmGet$answer != null) {
                    Table.nativeSetString(nativePtr, aVar.f18086g, j11, realmGet$answer, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18086g, j11, false);
                }
            }
        }
    }

    static q1 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(FAQArticle.class), false, Collections.emptyList());
        q1 q1Var = new q1();
        cVar.a();
        return q1Var;
    }

    static FAQArticle n(o0 o0Var, a aVar, FAQArticle fAQArticle, FAQArticle fAQArticle2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(FAQArticle.class), set);
        osObjectBuilder.V0(aVar.f18084e, fAQArticle2.realmGet$position());
        osObjectBuilder.c1(aVar.f18085f, fAQArticle2.realmGet$question());
        osObjectBuilder.c1(aVar.f18086g, fAQArticle2.realmGet$answer());
        osObjectBuilder.g1();
        return fAQArticle;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18083q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18082p = (a) cVar.c();
        l0<FAQArticle> l0Var = new l0<>(this);
        this.f18083q = l0Var;
        l0Var.r(cVar.e());
        this.f18083q.s(cVar.f());
        this.f18083q.o(cVar.b());
        this.f18083q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18083q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        io.realm.a f10 = this.f18083q.f();
        io.realm.a f11 = q1Var.f18083q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18083q.g().getTable().p();
        String p11 = q1Var.f18083q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18083q.g().getObjectKey() == q1Var.f18083q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18083q.f().getPath();
        String p10 = this.f18083q.g().getTable().p();
        long objectKey = this.f18083q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.FAQArticle, io.realm.r1
    public String realmGet$answer() {
        this.f18083q.f().e();
        return this.f18083q.g().getString(this.f18082p.f18086g);
    }

    @Override // com.habitrpg.android.habitica.models.FAQArticle, io.realm.r1
    public Integer realmGet$position() {
        this.f18083q.f().e();
        if (this.f18083q.g().isNull(this.f18082p.f18084e)) {
            return null;
        }
        return Integer.valueOf((int) this.f18083q.g().getLong(this.f18082p.f18084e));
    }

    @Override // com.habitrpg.android.habitica.models.FAQArticle, io.realm.r1
    public String realmGet$question() {
        this.f18083q.f().e();
        return this.f18083q.g().getString(this.f18082p.f18085f);
    }

    @Override // com.habitrpg.android.habitica.models.FAQArticle, io.realm.r1
    public void realmSet$answer(String str) {
        if (this.f18083q.i()) {
            if (!this.f18083q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18083q.g();
            if (str == null) {
                g10.getTable().F(this.f18082p.f18086g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18082p.f18086g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18083q.f().e();
        if (str == null) {
            this.f18083q.g().setNull(this.f18082p.f18086g);
        } else {
            this.f18083q.g().setString(this.f18082p.f18086g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.FAQArticle, io.realm.r1
    public void realmSet$position(Integer num) {
        if (this.f18083q.i()) {
            return;
        }
        this.f18083q.f().e();
        throw new RealmException("Primary key field 'position' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.FAQArticle, io.realm.r1
    public void realmSet$question(String str) {
        if (this.f18083q.i()) {
            if (!this.f18083q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18083q.g();
            if (str == null) {
                g10.getTable().F(this.f18082p.f18085f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18082p.f18085f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18083q.f().e();
        if (str == null) {
            this.f18083q.g().setNull(this.f18082p.f18085f);
        } else {
            this.f18083q.g().setString(this.f18082p.f18085f, str);
        }
    }

    public String toString() {
        Integer num;
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("FAQArticle = proxy[");
        sb2.append("{position:");
        String str2 = "null";
        if (realmGet$position() == null) {
            num = "null";
        } else {
            num = realmGet$position();
        }
        sb2.append(num);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{question:");
        if (realmGet$question() == null) {
            str = "null";
        } else {
            str = realmGet$question();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{answer:");
        if (realmGet$answer() != null) {
            str2 = realmGet$answer();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
