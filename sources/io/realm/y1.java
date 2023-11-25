package io.realm;

import com.habitrpg.android.habitica.models.TeamPlan;
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

/* compiled from: com_habitrpg_android_habitica_models_TeamPlanRealmProxy.java */
/* loaded from: classes4.dex */
public class y1 extends TeamPlan implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18422r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18423p;

    /* renamed from: q  reason: collision with root package name */
    private l0<TeamPlan> f18424q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_TeamPlanRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18425e;

        /* renamed from: f  reason: collision with root package name */
        long f18426f;

        /* renamed from: g  reason: collision with root package name */
        long f18427g;

        /* renamed from: h  reason: collision with root package name */
        long f18428h;

        /* renamed from: i  reason: collision with root package name */
        long f18429i;

        a(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("TeamPlan");
            this.f18425e = a("id", "id", b10);
            this.f18426f = a("userID", "userID", b10);
            this.f18427g = a("summary", "summary", b10);
            this.f18428h = a("leaderID", "leaderID", b10);
            this.f18429i = a("isActive", "isActive", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18425e = aVar.f18425e;
            aVar2.f18426f = aVar.f18426f;
            aVar2.f18427g = aVar.f18427g;
            aVar2.f18428h = aVar.f18428h;
            aVar2.f18429i = aVar.f18429i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1() {
        this.f18424q.p();
    }

    public static TeamPlan c(o0 o0Var, a aVar, TeamPlan teamPlan, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(teamPlan);
        if (oVar != null) {
            return (TeamPlan) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TeamPlan.class), set);
        osObjectBuilder.c1(aVar.f18425e, teamPlan.realmGet$id());
        osObjectBuilder.c1(aVar.f18426f, teamPlan.realmGet$userID());
        osObjectBuilder.c1(aVar.f18427g, teamPlan.realmGet$summary());
        osObjectBuilder.c1(aVar.f18428h, teamPlan.realmGet$leaderID());
        osObjectBuilder.F0(aVar.f18429i, Boolean.valueOf(teamPlan.realmGet$isActive()));
        y1 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(teamPlan, l10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.TeamPlan d(io.realm.o0 r8, io.realm.y1.a r9, com.habitrpg.android.habitica.models.TeamPlan r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.TeamPlan r1 = (com.habitrpg.android.habitica.models.TeamPlan) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.TeamPlan> r2 = com.habitrpg.android.habitica.models.TeamPlan.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18425e
            java.lang.String r5 = r10.realmGet$id()
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
            io.realm.y1 r1 = new io.realm.y1     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.TeamPlan r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.TeamPlan r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.y1.d(io.realm.o0, io.realm.y1$a, com.habitrpg.android.habitica.models.TeamPlan, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.TeamPlan");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static TeamPlan f(TeamPlan teamPlan, int i10, int i11, Map<a1, o.a<a1>> map) {
        TeamPlan teamPlan2;
        if (i10 <= i11 && teamPlan != null) {
            o.a<a1> aVar = map.get(teamPlan);
            if (aVar == null) {
                teamPlan2 = new TeamPlan();
                map.put(teamPlan, new o.a<>(i10, teamPlan2));
            } else if (i10 >= aVar.f17831a) {
                return (TeamPlan) aVar.f17832b;
            } else {
                TeamPlan teamPlan3 = (TeamPlan) aVar.f17832b;
                aVar.f17831a = i10;
                teamPlan2 = teamPlan3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) teamPlan).b().f();
            teamPlan2.realmSet$id(teamPlan.realmGet$id());
            teamPlan2.realmSet$userID(teamPlan.realmGet$userID());
            teamPlan2.realmSet$summary(teamPlan.realmGet$summary());
            teamPlan2.realmSet$leaderID(teamPlan.realmGet$leaderID());
            teamPlan2.realmSet$isActive(teamPlan.realmGet$isActive());
            return teamPlan2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "TeamPlan", false, 5, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        bVar.b("", "userID", realmFieldType, false, false, false);
        bVar.b("", "summary", realmFieldType, false, false, true);
        bVar.b("", "leaderID", realmFieldType, false, false, false);
        bVar.b("", "isActive", RealmFieldType.BOOLEAN, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18422r;
    }

    public static long i(o0 o0Var, TeamPlan teamPlan, Map<a1, Long> map) {
        long j10;
        if ((teamPlan instanceof io.realm.internal.o) && !d1.isFrozen(teamPlan)) {
            io.realm.internal.o oVar = (io.realm.internal.o) teamPlan;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(TeamPlan.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(TeamPlan.class);
        long j11 = aVar.f18425e;
        String realmGet$id = teamPlan.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j11, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j11, realmGet$id);
        }
        long j12 = j10;
        map.put(teamPlan, Long.valueOf(j12));
        String realmGet$userID = teamPlan.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(nativePtr, aVar.f18426f, j12, realmGet$userID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18426f, j12, false);
        }
        String realmGet$summary = teamPlan.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, aVar.f18427g, j12, realmGet$summary, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18427g, j12, false);
        }
        String realmGet$leaderID = teamPlan.realmGet$leaderID();
        if (realmGet$leaderID != null) {
            Table.nativeSetString(nativePtr, aVar.f18428h, j12, realmGet$leaderID, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f18428h, j12, false);
        }
        Table.nativeSetBoolean(nativePtr, aVar.f18429i, j12, teamPlan.realmGet$isActive(), false);
        return j12;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        TeamPlan teamPlan;
        Table c12 = o0Var.c1(TeamPlan.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(TeamPlan.class);
        long j12 = aVar.f18425e;
        while (it.hasNext()) {
            TeamPlan teamPlan2 = (TeamPlan) it.next();
            if (!map.containsKey(teamPlan2)) {
                if ((teamPlan2 instanceof io.realm.internal.o) && !d1.isFrozen(teamPlan2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) teamPlan2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(teamPlan2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = teamPlan2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$id);
                } else {
                    j11 = j10;
                }
                map.put(teamPlan2, Long.valueOf(j11));
                String realmGet$userID = teamPlan2.realmGet$userID();
                if (realmGet$userID != null) {
                    teamPlan = teamPlan2;
                    Table.nativeSetString(nativePtr, aVar.f18426f, j11, realmGet$userID, false);
                } else {
                    teamPlan = teamPlan2;
                    Table.nativeSetNull(nativePtr, aVar.f18426f, j11, false);
                }
                String realmGet$summary = teamPlan.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, aVar.f18427g, j11, realmGet$summary, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18427g, j11, false);
                }
                String realmGet$leaderID = teamPlan.realmGet$leaderID();
                if (realmGet$leaderID != null) {
                    Table.nativeSetString(nativePtr, aVar.f18428h, j11, realmGet$leaderID, false);
                } else {
                    Table.nativeSetNull(nativePtr, aVar.f18428h, j11, false);
                }
                Table.nativeSetBoolean(nativePtr, aVar.f18429i, j11, teamPlan.realmGet$isActive(), false);
            }
        }
    }

    static y1 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(TeamPlan.class), false, Collections.emptyList());
        y1 y1Var = new y1();
        cVar.a();
        return y1Var;
    }

    static TeamPlan n(o0 o0Var, a aVar, TeamPlan teamPlan, TeamPlan teamPlan2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(TeamPlan.class), set);
        osObjectBuilder.c1(aVar.f18425e, teamPlan2.realmGet$id());
        osObjectBuilder.c1(aVar.f18426f, teamPlan2.realmGet$userID());
        osObjectBuilder.c1(aVar.f18427g, teamPlan2.realmGet$summary());
        osObjectBuilder.c1(aVar.f18428h, teamPlan2.realmGet$leaderID());
        osObjectBuilder.F0(aVar.f18429i, Boolean.valueOf(teamPlan2.realmGet$isActive()));
        osObjectBuilder.g1();
        return teamPlan;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18424q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18423p = (a) cVar.c();
        l0<TeamPlan> l0Var = new l0<>(this);
        this.f18424q = l0Var;
        l0Var.r(cVar.e());
        this.f18424q.s(cVar.f());
        this.f18424q.o(cVar.b());
        this.f18424q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18424q;
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public String realmGet$id() {
        this.f18424q.f().e();
        return this.f18424q.g().getString(this.f18423p.f18425e);
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public boolean realmGet$isActive() {
        this.f18424q.f().e();
        return this.f18424q.g().getBoolean(this.f18423p.f18429i);
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public String realmGet$leaderID() {
        this.f18424q.f().e();
        return this.f18424q.g().getString(this.f18423p.f18428h);
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public String realmGet$summary() {
        this.f18424q.f().e();
        return this.f18424q.g().getString(this.f18423p.f18427g);
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public String realmGet$userID() {
        this.f18424q.f().e();
        return this.f18424q.g().getString(this.f18423p.f18426f);
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public void realmSet$id(String str) {
        if (this.f18424q.i()) {
            return;
        }
        this.f18424q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public void realmSet$isActive(boolean z10) {
        if (this.f18424q.i()) {
            if (!this.f18424q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18424q.g();
            g10.getTable().z(this.f18423p.f18429i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18424q.f().e();
        this.f18424q.g().setBoolean(this.f18423p.f18429i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public void realmSet$leaderID(String str) {
        if (this.f18424q.i()) {
            if (!this.f18424q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18424q.g();
            if (str == null) {
                g10.getTable().F(this.f18423p.f18428h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18423p.f18428h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18424q.f().e();
        if (str == null) {
            this.f18424q.g().setNull(this.f18423p.f18428h);
        } else {
            this.f18424q.g().setString(this.f18423p.f18428h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public void realmSet$summary(String str) {
        if (this.f18424q.i()) {
            if (!this.f18424q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18424q.g();
            if (str != null) {
                g10.getTable().G(this.f18423p.f18427g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
        }
        this.f18424q.f().e();
        if (str != null) {
            this.f18424q.g().setString(this.f18423p.f18427g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.TeamPlan, io.realm.z1
    public void realmSet$userID(String str) {
        if (this.f18424q.i()) {
            if (!this.f18424q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18424q.g();
            if (str == null) {
                g10.getTable().F(this.f18423p.f18426f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18423p.f18426f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18424q.f().e();
        if (str == null) {
            this.f18424q.g().setNull(this.f18423p.f18426f);
        } else {
            this.f18424q.g().setString(this.f18423p.f18426f, str);
        }
    }

    public String toString() {
        String str;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("TeamPlan = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{userID:");
        String str2 = "null";
        if (realmGet$userID() == null) {
            str = "null";
        } else {
            str = realmGet$userID();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{summary:");
        sb2.append(realmGet$summary());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{leaderID:");
        if (realmGet$leaderID() != null) {
            str2 = realmGet$leaderID();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isActive:");
        sb2.append(realmGet$isActive());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
