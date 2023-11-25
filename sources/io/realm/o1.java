package io.realm;

import com.habitrpg.android.habitica.models.Achievement;
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

/* compiled from: com_habitrpg_android_habitica_models_AchievementRealmProxy.java */
/* loaded from: classes4.dex */
public class o1 extends Achievement implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18016r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18017p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Achievement> f18018q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_AchievementRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18019e;

        /* renamed from: f  reason: collision with root package name */
        long f18020f;

        /* renamed from: g  reason: collision with root package name */
        long f18021g;

        /* renamed from: h  reason: collision with root package name */
        long f18022h;

        /* renamed from: i  reason: collision with root package name */
        long f18023i;

        /* renamed from: j  reason: collision with root package name */
        long f18024j;

        /* renamed from: k  reason: collision with root package name */
        long f18025k;

        /* renamed from: l  reason: collision with root package name */
        long f18026l;

        /* renamed from: m  reason: collision with root package name */
        long f18027m;

        a(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Achievement");
            this.f18019e = a("key", "key", b10);
            this.f18020f = a(TaskFormActivity.TASK_TYPE_KEY, TaskFormActivity.TASK_TYPE_KEY, b10);
            this.f18021g = a("title", "title", b10);
            this.f18022h = a("text", "text", b10);
            this.f18023i = a("icon", "icon", b10);
            this.f18024j = a("category", "category", b10);
            this.f18025k = a("earned", "earned", b10);
            this.f18026l = a("index", "index", b10);
            this.f18027m = a("optionalCount", "optionalCount", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18019e = aVar.f18019e;
            aVar2.f18020f = aVar.f18020f;
            aVar2.f18021g = aVar.f18021g;
            aVar2.f18022h = aVar.f18022h;
            aVar2.f18023i = aVar.f18023i;
            aVar2.f18024j = aVar.f18024j;
            aVar2.f18025k = aVar.f18025k;
            aVar2.f18026l = aVar.f18026l;
            aVar2.f18027m = aVar.f18027m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1() {
        this.f18018q.p();
    }

    public static Achievement c(o0 o0Var, a aVar, Achievement achievement, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(achievement);
        if (oVar != null) {
            return (Achievement) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Achievement.class), set);
        osObjectBuilder.c1(aVar.f18019e, achievement.realmGet$key());
        osObjectBuilder.c1(aVar.f18020f, achievement.realmGet$type());
        osObjectBuilder.c1(aVar.f18021g, achievement.realmGet$title());
        osObjectBuilder.c1(aVar.f18022h, achievement.realmGet$text());
        osObjectBuilder.c1(aVar.f18023i, achievement.realmGet$icon());
        osObjectBuilder.c1(aVar.f18024j, achievement.realmGet$category());
        osObjectBuilder.F0(aVar.f18025k, Boolean.valueOf(achievement.realmGet$earned()));
        osObjectBuilder.V0(aVar.f18026l, Integer.valueOf(achievement.realmGet$index()));
        osObjectBuilder.V0(aVar.f18027m, achievement.realmGet$optionalCount());
        o1 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(achievement, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.Achievement d(io.realm.o0 r8, io.realm.o1.a r9, com.habitrpg.android.habitica.models.Achievement r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.Achievement r1 = (com.habitrpg.android.habitica.models.Achievement) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L93
            java.lang.Class<com.habitrpg.android.habitica.models.Achievement> r2 = com.habitrpg.android.habitica.models.Achievement.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18019e
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
            io.realm.o1 r1 = new io.realm.o1     // Catch: java.lang.Throwable -> L8e
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
            com.habitrpg.android.habitica.models.Achievement r8 = n(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.habitrpg.android.habitica.models.Achievement r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.o1.d(io.realm.o0, io.realm.o1$a, com.habitrpg.android.habitica.models.Achievement, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.Achievement");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Achievement f(Achievement achievement, int i10, int i11, Map<a1, o.a<a1>> map) {
        Achievement achievement2;
        if (i10 <= i11 && achievement != null) {
            o.a<a1> aVar = map.get(achievement);
            if (aVar == null) {
                achievement2 = new Achievement();
                map.put(achievement, new o.a<>(i10, achievement2));
            } else if (i10 >= aVar.f17831a) {
                return (Achievement) aVar.f17832b;
            } else {
                Achievement achievement3 = (Achievement) aVar.f17832b;
                aVar.f17831a = i10;
                achievement2 = achievement3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) achievement).b().f();
            achievement2.realmSet$key(achievement.realmGet$key());
            achievement2.realmSet$type(achievement.realmGet$type());
            achievement2.realmSet$title(achievement.realmGet$title());
            achievement2.realmSet$text(achievement.realmGet$text());
            achievement2.realmSet$icon(achievement.realmGet$icon());
            achievement2.realmSet$category(achievement.realmGet$category());
            achievement2.realmSet$earned(achievement.realmGet$earned());
            achievement2.realmSet$index(achievement.realmGet$index());
            achievement2.realmSet$optionalCount(achievement.realmGet$optionalCount());
            return achievement2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Achievement", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "key", realmFieldType, true, false, false);
        bVar.b("", TaskFormActivity.TASK_TYPE_KEY, realmFieldType, false, false, false);
        bVar.b("", "title", realmFieldType, false, false, false);
        bVar.b("", "text", realmFieldType, false, false, false);
        bVar.b("", "icon", realmFieldType, false, false, false);
        bVar.b("", "category", realmFieldType, false, false, false);
        bVar.b("", "earned", RealmFieldType.BOOLEAN, false, false, true);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "index", realmFieldType2, false, false, true);
        bVar.b("", "optionalCount", realmFieldType2, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18016r;
    }

    public static long i(o0 o0Var, Achievement achievement, Map<a1, Long> map) {
        long nativeFindFirstString;
        if ((achievement instanceof io.realm.internal.o) && !d1.isFrozen(achievement)) {
            io.realm.internal.o oVar = (io.realm.internal.o) achievement;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Achievement.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Achievement.class);
        long j10 = aVar.f18019e;
        String realmGet$key = achievement.realmGet$key();
        if (realmGet$key == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j10);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j10, realmGet$key);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(c12, j10, realmGet$key);
        }
        long j11 = nativeFindFirstString;
        map.put(achievement, Long.valueOf(j11));
        String realmGet$type = achievement.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, aVar.f18020f, j11, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18020f, j11, false);
        }
        String realmGet$title = achievement.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, aVar.f18021g, j11, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18021g, j11, false);
        }
        String realmGet$text = achievement.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18022h, j11, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18022h, j11, false);
        }
        String realmGet$icon = achievement.realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(nativePtr, aVar.f18023i, j11, realmGet$icon, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18023i, j11, false);
        }
        String realmGet$category = achievement.realmGet$category();
        if (realmGet$category != null) {
            Table.nativeSetString(nativePtr, aVar.f18024j, j11, realmGet$category, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18024j, j11, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18025k, j11, achievement.realmGet$earned(), false);
        Table.nativeSetLong(nativePtr, aVar.f18026l, j11, achievement.realmGet$index(), false);
        Integer realmGet$optionalCount = achievement.realmGet$optionalCount();
        if (realmGet$optionalCount != null) {
            Table.nativeSetLong(nativePtr, aVar.f18027m, j11, realmGet$optionalCount.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18027m, j11, false);
        }
        return j11;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long nativeFindFirstString;
        long j10;
        long j11;
        Table c12 = o0Var.c1(Achievement.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(Achievement.class);
        long j12 = aVar.f18019e;
        while (it.hasNext()) {
            Achievement achievement = (Achievement) it.next();
            if (!map.containsKey(achievement)) {
                if ((achievement instanceof io.realm.internal.o) && !d1.isFrozen(achievement)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) achievement;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(achievement, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$key = achievement.realmGet$key();
                if (realmGet$key == null) {
                    nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j12);
                } else {
                    nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j12, realmGet$key);
                }
                if (nativeFindFirstString == -1) {
                    j10 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$key);
                } else {
                    j10 = nativeFindFirstString;
                }
                map.put(achievement, Long.valueOf(j10));
                String realmGet$type = achievement.realmGet$type();
                if (realmGet$type != null) {
                    j11 = j12;
                    Table.nativeSetString(nativePtr, aVar.f18020f, j10, realmGet$type, false);
                } else {
                    j11 = j12;
                    Table.nativeSetNull(nativePtr, aVar.f18020f, j10, false);
                }
                String realmGet$title = achievement.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, aVar.f18021g, j10, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18021g, j10, false);
                }
                String realmGet$text = achievement.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar.f18022h, j10, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18022h, j10, false);
                }
                String realmGet$icon = achievement.realmGet$icon();
                if (realmGet$icon != null) {
                    Table.nativeSetString(nativePtr, aVar.f18023i, j10, realmGet$icon, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18023i, j10, false);
                }
                String realmGet$category = achievement.realmGet$category();
                if (realmGet$category != null) {
                    Table.nativeSetString(nativePtr, aVar.f18024j, j10, realmGet$category, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18024j, j10, false);
                }
                long j13 = j10;
                Table.nativeSetBoolean(nativePtr, aVar.f18025k, j13, achievement.realmGet$earned(), false);
                Table.nativeSetLong(nativePtr, aVar.f18026l, j13, achievement.realmGet$index(), false);
                Integer realmGet$optionalCount = achievement.realmGet$optionalCount();
                if (realmGet$optionalCount != null) {
                    Table.nativeSetLong(nativePtr, aVar.f18027m, j10, realmGet$optionalCount.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18027m, j10, false);
                }
                j12 = j11;
            }
        }
    }

    static o1 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Achievement.class), false, Collections.emptyList());
        o1 o1Var = new o1();
        cVar.a();
        return o1Var;
    }

    static Achievement n(o0 o0Var, a aVar, Achievement achievement, Achievement achievement2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Achievement.class), set);
        osObjectBuilder.c1(aVar.f18019e, achievement2.realmGet$key());
        osObjectBuilder.c1(aVar.f18020f, achievement2.realmGet$type());
        osObjectBuilder.c1(aVar.f18021g, achievement2.realmGet$title());
        osObjectBuilder.c1(aVar.f18022h, achievement2.realmGet$text());
        osObjectBuilder.c1(aVar.f18023i, achievement2.realmGet$icon());
        osObjectBuilder.c1(aVar.f18024j, achievement2.realmGet$category());
        osObjectBuilder.F0(aVar.f18025k, Boolean.valueOf(achievement2.realmGet$earned()));
        osObjectBuilder.V0(aVar.f18026l, Integer.valueOf(achievement2.realmGet$index()));
        osObjectBuilder.V0(aVar.f18027m, achievement2.realmGet$optionalCount());
        osObjectBuilder.g1();
        return achievement;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18018q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18017p = (a) cVar.c();
        l0<Achievement> l0Var = new l0<>(this);
        this.f18018q = l0Var;
        l0Var.r(cVar.e());
        this.f18018q.s(cVar.f());
        this.f18018q.o(cVar.b());
        this.f18018q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18018q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o1 o1Var = (o1) obj;
        io.realm.a f10 = this.f18018q.f();
        io.realm.a f11 = o1Var.f18018q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18018q.g().getTable().p();
        String p11 = o1Var.f18018q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18018q.g().getObjectKey() == o1Var.f18018q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18018q.f().getPath();
        String p10 = this.f18018q.g().getTable().p();
        long objectKey = this.f18018q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public String realmGet$category() {
        this.f18018q.f().e();
        return this.f18018q.g().getString(this.f18017p.f18024j);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public boolean realmGet$earned() {
        this.f18018q.f().e();
        return this.f18018q.g().getBoolean(this.f18017p.f18025k);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public String realmGet$icon() {
        this.f18018q.f().e();
        return this.f18018q.g().getString(this.f18017p.f18023i);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public int realmGet$index() {
        this.f18018q.f().e();
        return (int) this.f18018q.g().getLong(this.f18017p.f18026l);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public String realmGet$key() {
        this.f18018q.f().e();
        return this.f18018q.g().getString(this.f18017p.f18019e);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public Integer realmGet$optionalCount() {
        this.f18018q.f().e();
        if (this.f18018q.g().isNull(this.f18017p.f18027m)) {
            return null;
        }
        return Integer.valueOf((int) this.f18018q.g().getLong(this.f18017p.f18027m));
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public String realmGet$text() {
        this.f18018q.f().e();
        return this.f18018q.g().getString(this.f18017p.f18022h);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public String realmGet$title() {
        this.f18018q.f().e();
        return this.f18018q.g().getString(this.f18017p.f18021g);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public String realmGet$type() {
        this.f18018q.f().e();
        return this.f18018q.g().getString(this.f18017p.f18020f);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$category(String str) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            if (str == null) {
                g10.getTable().F(this.f18017p.f18024j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18017p.f18024j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18018q.f().e();
        if (str == null) {
            this.f18018q.g().setNull(this.f18017p.f18024j);
        } else {
            this.f18018q.g().setString(this.f18017p.f18024j, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$earned(boolean z10) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            g10.getTable().z(this.f18017p.f18025k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18018q.f().e();
        this.f18018q.g().setBoolean(this.f18017p.f18025k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$icon(String str) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            if (str == null) {
                g10.getTable().F(this.f18017p.f18023i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18017p.f18023i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18018q.f().e();
        if (str == null) {
            this.f18018q.g().setNull(this.f18017p.f18023i);
        } else {
            this.f18018q.g().setString(this.f18017p.f18023i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$index(int i10) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            g10.getTable().E(this.f18017p.f18026l, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18018q.f().e();
        this.f18018q.g().setLong(this.f18017p.f18026l, i10);
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$key(String str) {
        if (this.f18018q.i()) {
            return;
        }
        this.f18018q.f().e();
        throw new RealmException("Primary key field 'key' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$optionalCount(Integer num) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            if (num == null) {
                g10.getTable().F(this.f18017p.f18027m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18017p.f18027m, g10.getObjectKey(), num.intValue(), true);
                return;
            }
        }
        this.f18018q.f().e();
        if (num == null) {
            this.f18018q.g().setNull(this.f18017p.f18027m);
        } else {
            this.f18018q.g().setLong(this.f18017p.f18027m, num.intValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$text(String str) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            if (str == null) {
                g10.getTable().F(this.f18017p.f18022h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18017p.f18022h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18018q.f().e();
        if (str == null) {
            this.f18018q.g().setNull(this.f18017p.f18022h);
        } else {
            this.f18018q.g().setString(this.f18017p.f18022h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$title(String str) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            if (str == null) {
                g10.getTable().F(this.f18017p.f18021g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18017p.f18021g, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18018q.f().e();
        if (str == null) {
            this.f18018q.g().setNull(this.f18017p.f18021g);
        } else {
            this.f18018q.g().setString(this.f18017p.f18021g, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.Achievement, io.realm.p1
    public void realmSet$type(String str) {
        if (this.f18018q.i()) {
            if (!this.f18018q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18018q.g();
            if (str == null) {
                g10.getTable().F(this.f18017p.f18020f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18017p.f18020f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18018q.f().e();
        if (str == null) {
            this.f18018q.g().setNull(this.f18017p.f18020f);
        } else {
            this.f18018q.g().setString(this.f18017p.f18020f, str);
        }
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Achievement = proxy[");
        sb2.append("{key:");
        Object obj = "null";
        if (realmGet$key() == null) {
            str = "null";
        } else {
            str = realmGet$key();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{type:");
        if (realmGet$type() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$type();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{title:");
        if (realmGet$title() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$title();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$text();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{icon:");
        if (realmGet$icon() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$icon();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{category:");
        if (realmGet$category() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$category();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{earned:");
        sb2.append(realmGet$earned());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{index:");
        sb2.append(realmGet$index());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{optionalCount:");
        if (realmGet$optionalCount() != null) {
            obj = realmGet$optionalCount();
        }
        sb2.append(obj);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
