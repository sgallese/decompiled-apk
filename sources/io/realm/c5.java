package io.realm;

import com.habitrpg.android.habitica.models.social.InboxConversation;
import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_social_InboxConversationRealmProxy.java */
/* loaded from: classes4.dex */
public class c5 extends InboxConversation implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17367r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17368p;

    /* renamed from: q  reason: collision with root package name */
    private l0<InboxConversation> f17369q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_InboxConversationRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17370e;

        /* renamed from: f  reason: collision with root package name */
        long f17371f;

        /* renamed from: g  reason: collision with root package name */
        long f17372g;

        /* renamed from: h  reason: collision with root package name */
        long f17373h;

        /* renamed from: i  reason: collision with root package name */
        long f17374i;

        /* renamed from: j  reason: collision with root package name */
        long f17375j;

        /* renamed from: k  reason: collision with root package name */
        long f17376k;

        /* renamed from: l  reason: collision with root package name */
        long f17377l;

        /* renamed from: m  reason: collision with root package name */
        long f17378m;

        a(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("InboxConversation");
            this.f17370e = a("combinedID", "combinedID", b10);
            this.f17371f = a("uuid", "uuid", b10);
            this.f17372g = a("userID", "userID", b10);
            this.f17373h = a("username", "username", b10);
            this.f17374i = a("user", "user", b10);
            this.f17375j = a("timestamp", "timestamp", b10);
            this.f17376k = a("contributor", "contributor", b10);
            this.f17377l = a("userStyles", "userStyles", b10);
            this.f17378m = a("text", "text", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17370e = aVar.f17370e;
            aVar2.f17371f = aVar.f17371f;
            aVar2.f17372g = aVar.f17372g;
            aVar2.f17373h = aVar.f17373h;
            aVar2.f17374i = aVar.f17374i;
            aVar2.f17375j = aVar.f17375j;
            aVar2.f17376k = aVar.f17376k;
            aVar2.f17377l = aVar.f17377l;
            aVar2.f17378m = aVar.f17378m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c5() {
        this.f17369q.p();
    }

    public static InboxConversation c(o0 o0Var, a aVar, InboxConversation inboxConversation, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(inboxConversation);
        if (oVar != null) {
            return (InboxConversation) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(InboxConversation.class), set);
        osObjectBuilder.c1(aVar.f17370e, inboxConversation.realmGet$combinedID());
        osObjectBuilder.c1(aVar.f17371f, inboxConversation.realmGet$uuid());
        osObjectBuilder.c1(aVar.f17372g, inboxConversation.realmGet$userID());
        osObjectBuilder.c1(aVar.f17373h, inboxConversation.realmGet$username());
        osObjectBuilder.c1(aVar.f17374i, inboxConversation.realmGet$user());
        osObjectBuilder.I0(aVar.f17375j, inboxConversation.realmGet$timestamp());
        osObjectBuilder.c1(aVar.f17378m, inboxConversation.realmGet$text());
        c5 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(inboxConversation, l10);
        ContributorInfo realmGet$contributor = inboxConversation.realmGet$contributor();
        if (realmGet$contributor == null) {
            l10.realmSet$contributor(null);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k10 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(l10.b().g().createEmbeddedObject(aVar.f17376k, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k10);
            e6.n(o0Var, realmGet$contributor, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        UserStyles realmGet$userStyles = inboxConversation.realmGet$userStyles();
        if (realmGet$userStyles == null) {
            l10.realmSet$userStyles(null);
        } else if (((UserStyles) map.get(realmGet$userStyles)) == null) {
            g5 k11 = g5.k(o0Var, o0Var.c1(UserStyles.class).s(l10.b().g().createEmbeddedObject(aVar.f17377l, RealmFieldType.OBJECT)));
            map.put(realmGet$userStyles, k11);
            g5.n(o0Var, realmGet$userStyles, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheuserStyles.toString()");
        }
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.habitrpg.android.habitica.models.social.InboxConversation d(io.realm.o0 r8, io.realm.c5.a r9, com.habitrpg.android.habitica.models.social.InboxConversation r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.social.InboxConversation r1 = (com.habitrpg.android.habitica.models.social.InboxConversation) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.social.InboxConversation> r2 = com.habitrpg.android.habitica.models.social.InboxConversation.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f17370e
            java.lang.String r5 = r10.realmGet$combinedID()
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
            io.realm.c5 r1 = new io.realm.c5     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.social.InboxConversation r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.social.InboxConversation r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.c5.d(io.realm.o0, io.realm.c5$a, com.habitrpg.android.habitica.models.social.InboxConversation, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.social.InboxConversation");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static InboxConversation f(InboxConversation inboxConversation, int i10, int i11, Map<a1, o.a<a1>> map) {
        InboxConversation inboxConversation2;
        if (i10 <= i11 && inboxConversation != null) {
            o.a<a1> aVar = map.get(inboxConversation);
            if (aVar == null) {
                inboxConversation2 = new InboxConversation();
                map.put(inboxConversation, new o.a<>(i10, inboxConversation2));
            } else if (i10 >= aVar.f17831a) {
                return (InboxConversation) aVar.f17832b;
            } else {
                InboxConversation inboxConversation3 = (InboxConversation) aVar.f17832b;
                aVar.f17831a = i10;
                inboxConversation2 = inboxConversation3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) inboxConversation).b().f();
            inboxConversation2.realmSet$combinedID(inboxConversation.realmGet$combinedID());
            inboxConversation2.realmSet$uuid(inboxConversation.realmGet$uuid());
            inboxConversation2.realmSet$userID(inboxConversation.realmGet$userID());
            inboxConversation2.realmSet$username(inboxConversation.realmGet$username());
            inboxConversation2.realmSet$user(inboxConversation.realmGet$user());
            inboxConversation2.realmSet$timestamp(inboxConversation.realmGet$timestamp());
            int i12 = i10 + 1;
            inboxConversation2.realmSet$contributor(e6.f(inboxConversation.realmGet$contributor(), i12, i11, map));
            inboxConversation2.realmSet$userStyles(g5.f(inboxConversation.realmGet$userStyles(), i12, i11, map));
            inboxConversation2.realmSet$text(inboxConversation.realmGet$text());
            return inboxConversation2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "InboxConversation", false, 9, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "combinedID", realmFieldType, true, false, true);
        bVar.b("", "uuid", realmFieldType, false, false, true);
        bVar.b("", "userID", realmFieldType, false, false, true);
        bVar.b("", "username", realmFieldType, false, false, false);
        bVar.b("", "user", realmFieldType, false, false, false);
        bVar.b("", "timestamp", RealmFieldType.DATE, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.OBJECT;
        bVar.a("", "contributor", realmFieldType2, "ContributorInfo");
        bVar.a("", "userStyles", realmFieldType2, "UserStyles");
        bVar.b("", "text", realmFieldType, false, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17367r;
    }

    public static long i(o0 o0Var, InboxConversation inboxConversation, Map<a1, Long> map) {
        long j10;
        long j11;
        a aVar;
        if ((inboxConversation instanceof io.realm.internal.o) && !d1.isFrozen(inboxConversation)) {
            io.realm.internal.o oVar = (io.realm.internal.o) inboxConversation;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(InboxConversation.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(InboxConversation.class);
        long j12 = aVar2.f17370e;
        String realmGet$combinedID = inboxConversation.realmGet$combinedID();
        if (realmGet$combinedID != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j12, realmGet$combinedID);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j12, realmGet$combinedID);
        }
        long j13 = j10;
        map.put(inboxConversation, Long.valueOf(j13));
        String realmGet$uuid = inboxConversation.realmGet$uuid();
        if (realmGet$uuid != null) {
            Table.nativeSetString(nativePtr, aVar2.f17371f, j13, realmGet$uuid, false);
            j11 = nativePtr;
        } else {
            j11 = nativePtr;
            Table.nativeSetNull(nativePtr, aVar2.f17371f, j13, false);
        }
        String realmGet$userID = inboxConversation.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(j11, aVar2.f17372g, j13, realmGet$userID, false);
        } else {
            Table.nativeSetNull(j11, aVar2.f17372g, j13, false);
        }
        String realmGet$username = inboxConversation.realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(j11, aVar2.f17373h, j13, realmGet$username, false);
        } else {
            Table.nativeSetNull(j11, aVar2.f17373h, j13, false);
        }
        String realmGet$user = inboxConversation.realmGet$user();
        if (realmGet$user != null) {
            Table.nativeSetString(j11, aVar2.f17374i, j13, realmGet$user, false);
        } else {
            Table.nativeSetNull(j11, aVar2.f17374i, j13, false);
        }
        Date realmGet$timestamp = inboxConversation.realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetTimestamp(j11, aVar2.f17375j, j13, realmGet$timestamp.getTime(), false);
        } else {
            Table.nativeSetNull(j11, aVar2.f17375j, j13, false);
        }
        ContributorInfo realmGet$contributor = inboxConversation.realmGet$contributor();
        if (realmGet$contributor != null) {
            Long l10 = map.get(realmGet$contributor);
            if (l10 == null) {
                aVar = aVar2;
                e6.i(o0Var, c12, aVar2.f17376k, j13, realmGet$contributor, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            aVar = aVar2;
            Table.nativeNullifyLink(j11, aVar.f17376k, j13);
        }
        UserStyles realmGet$userStyles = inboxConversation.realmGet$userStyles();
        if (realmGet$userStyles != null) {
            Long l11 = map.get(realmGet$userStyles);
            if (l11 == null) {
                g5.i(o0Var, c12, aVar.f17377l, j13, realmGet$userStyles, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(j11, aVar.f17377l, j13);
        }
        String realmGet$text = inboxConversation.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(j11, aVar.f17378m, j13, realmGet$text, false);
        } else {
            Table.nativeSetNull(j11, aVar.f17378m, j13, false);
        }
        return j13;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        InboxConversation inboxConversation;
        a aVar;
        Table c12 = o0Var.c1(InboxConversation.class);
        long nativePtr = c12.getNativePtr();
        a aVar2 = (a) o0Var.R().e(InboxConversation.class);
        long j14 = aVar2.f17370e;
        while (it.hasNext()) {
            InboxConversation inboxConversation2 = (InboxConversation) it.next();
            if (!map.containsKey(inboxConversation2)) {
                if ((inboxConversation2 instanceof io.realm.internal.o) && !d1.isFrozen(inboxConversation2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) inboxConversation2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(inboxConversation2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$combinedID = inboxConversation2.realmGet$combinedID();
                if (realmGet$combinedID != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j14, realmGet$combinedID);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j14, realmGet$combinedID);
                } else {
                    j11 = j10;
                }
                map.put(inboxConversation2, Long.valueOf(j11));
                String realmGet$uuid = inboxConversation2.realmGet$uuid();
                if (realmGet$uuid != null) {
                    Table.nativeSetString(nativePtr, aVar2.f17371f, j11, realmGet$uuid, false);
                    j12 = j14;
                    j13 = nativePtr;
                    inboxConversation = inboxConversation2;
                } else {
                    j12 = j14;
                    j13 = nativePtr;
                    inboxConversation = inboxConversation2;
                    Table.nativeSetNull(nativePtr, aVar2.f17371f, j11, false);
                }
                String realmGet$userID = inboxConversation.realmGet$userID();
                if (realmGet$userID != null) {
                    Table.nativeSetString(j13, aVar2.f17372g, j11, realmGet$userID, false);
                } else {
                    Table.nativeSetNull(j13, aVar2.f17372g, j11, false);
                }
                String realmGet$username = inboxConversation.realmGet$username();
                if (realmGet$username != null) {
                    Table.nativeSetString(j13, aVar2.f17373h, j11, realmGet$username, false);
                } else {
                    Table.nativeSetNull(j13, aVar2.f17373h, j11, false);
                }
                String realmGet$user = inboxConversation.realmGet$user();
                if (realmGet$user != null) {
                    Table.nativeSetString(j13, aVar2.f17374i, j11, realmGet$user, false);
                } else {
                    Table.nativeSetNull(j13, aVar2.f17374i, j11, false);
                }
                Date realmGet$timestamp = inboxConversation.realmGet$timestamp();
                if (realmGet$timestamp != null) {
                    Table.nativeSetTimestamp(j13, aVar2.f17375j, j11, realmGet$timestamp.getTime(), false);
                } else {
                    Table.nativeSetNull(j13, aVar2.f17375j, j11, false);
                }
                ContributorInfo realmGet$contributor = inboxConversation.realmGet$contributor();
                if (realmGet$contributor != null) {
                    Long l10 = map.get(realmGet$contributor);
                    if (l10 == null) {
                        aVar = aVar2;
                        e6.i(o0Var, c12, aVar2.f17376k, j11, realmGet$contributor, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                    }
                } else {
                    aVar = aVar2;
                    Table.nativeNullifyLink(j13, aVar.f17376k, j11);
                }
                UserStyles realmGet$userStyles = inboxConversation.realmGet$userStyles();
                if (realmGet$userStyles != null) {
                    Long l11 = map.get(realmGet$userStyles);
                    if (l11 == null) {
                        g5.i(o0Var, c12, aVar.f17377l, j11, realmGet$userStyles, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j13, aVar.f17377l, j11);
                }
                String realmGet$text = inboxConversation.realmGet$text();
                if (realmGet$text != null) {
                    aVar2 = aVar;
                    Table.nativeSetString(j13, aVar.f17378m, j11, realmGet$text, false);
                } else {
                    aVar2 = aVar;
                    Table.nativeSetNull(j13, aVar2.f17378m, j11, false);
                }
                j14 = j12;
                nativePtr = j13;
            }
        }
    }

    static c5 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(InboxConversation.class), false, Collections.emptyList());
        c5 c5Var = new c5();
        cVar.a();
        return c5Var;
    }

    static InboxConversation n(o0 o0Var, a aVar, InboxConversation inboxConversation, InboxConversation inboxConversation2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(InboxConversation.class), set);
        osObjectBuilder.c1(aVar.f17370e, inboxConversation2.realmGet$combinedID());
        osObjectBuilder.c1(aVar.f17371f, inboxConversation2.realmGet$uuid());
        osObjectBuilder.c1(aVar.f17372g, inboxConversation2.realmGet$userID());
        osObjectBuilder.c1(aVar.f17373h, inboxConversation2.realmGet$username());
        osObjectBuilder.c1(aVar.f17374i, inboxConversation2.realmGet$user());
        osObjectBuilder.I0(aVar.f17375j, inboxConversation2.realmGet$timestamp());
        ContributorInfo realmGet$contributor = inboxConversation2.realmGet$contributor();
        if (realmGet$contributor == null) {
            osObjectBuilder.Z0(aVar.f17376k);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k10 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(((io.realm.internal.o) inboxConversation).b().g().createEmbeddedObject(aVar.f17376k, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k10);
            e6.n(o0Var, realmGet$contributor, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        UserStyles realmGet$userStyles = inboxConversation2.realmGet$userStyles();
        if (realmGet$userStyles == null) {
            osObjectBuilder.Z0(aVar.f17377l);
        } else if (((UserStyles) map.get(realmGet$userStyles)) == null) {
            g5 k11 = g5.k(o0Var, o0Var.c1(UserStyles.class).s(((io.realm.internal.o) inboxConversation).b().g().createEmbeddedObject(aVar.f17377l, RealmFieldType.OBJECT)));
            map.put(realmGet$userStyles, k11);
            g5.n(o0Var, realmGet$userStyles, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheuserStyles.toString()");
        }
        osObjectBuilder.c1(aVar.f17378m, inboxConversation2.realmGet$text());
        osObjectBuilder.g1();
        return inboxConversation;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17369q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17368p = (a) cVar.c();
        l0<InboxConversation> l0Var = new l0<>(this);
        this.f17369q = l0Var;
        l0Var.r(cVar.e());
        this.f17369q.s(cVar.f());
        this.f17369q.o(cVar.b());
        this.f17369q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17369q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c5 c5Var = (c5) obj;
        io.realm.a f10 = this.f17369q.f();
        io.realm.a f11 = c5Var.f17369q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17369q.g().getTable().p();
        String p11 = c5Var.f17369q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17369q.g().getObjectKey() == c5Var.f17369q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17369q.f().getPath();
        String p10 = this.f17369q.g().getTable().p();
        long objectKey = this.f17369q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public String realmGet$combinedID() {
        this.f17369q.f().e();
        return this.f17369q.g().getString(this.f17368p.f17370e);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public ContributorInfo realmGet$contributor() {
        this.f17369q.f().e();
        if (this.f17369q.g().isNullLink(this.f17368p.f17376k)) {
            return null;
        }
        return (ContributorInfo) this.f17369q.f().B(ContributorInfo.class, this.f17369q.g().getLink(this.f17368p.f17376k), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public String realmGet$text() {
        this.f17369q.f().e();
        return this.f17369q.g().getString(this.f17368p.f17378m);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public Date realmGet$timestamp() {
        this.f17369q.f().e();
        if (this.f17369q.g().isNull(this.f17368p.f17375j)) {
            return null;
        }
        return this.f17369q.g().getDate(this.f17368p.f17375j);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public String realmGet$user() {
        this.f17369q.f().e();
        return this.f17369q.g().getString(this.f17368p.f17374i);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public String realmGet$userID() {
        this.f17369q.f().e();
        return this.f17369q.g().getString(this.f17368p.f17372g);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public UserStyles realmGet$userStyles() {
        this.f17369q.f().e();
        if (this.f17369q.g().isNullLink(this.f17368p.f17377l)) {
            return null;
        }
        return (UserStyles) this.f17369q.f().B(UserStyles.class, this.f17369q.g().getLink(this.f17368p.f17377l), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public String realmGet$username() {
        this.f17369q.f().e();
        return this.f17369q.g().getString(this.f17368p.f17373h);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public String realmGet$uuid() {
        this.f17369q.f().e();
        return this.f17369q.g().getString(this.f17368p.f17371f);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$combinedID(String str) {
        if (this.f17369q.i()) {
            return;
        }
        this.f17369q.f().e();
        throw new RealmException("Primary key field 'combinedID' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        o0 o0Var = (o0) this.f17369q.f();
        if (this.f17369q.i()) {
            if (!this.f17369q.d() || this.f17369q.e().contains("contributor")) {
                return;
            }
            if (contributorInfo != null && !d1.isManaged(contributorInfo)) {
                ContributorInfo contributorInfo2 = (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor");
                e6.n(o0Var, contributorInfo, contributorInfo2, new HashMap(), Collections.EMPTY_SET);
                contributorInfo = contributorInfo2;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (contributorInfo == null) {
                g10.nullifyLink(this.f17368p.f17376k);
                return;
            }
            this.f17369q.c(contributorInfo);
            g10.getTable().D(this.f17368p.f17376k, g10.getObjectKey(), ((io.realm.internal.o) contributorInfo).b().g().getObjectKey(), true);
            return;
        }
        this.f17369q.f().e();
        if (contributorInfo == null) {
            this.f17369q.g().nullifyLink(this.f17368p.f17376k);
            return;
        }
        if (d1.isManaged(contributorInfo)) {
            this.f17369q.c(contributorInfo);
        }
        e6.n(o0Var, contributorInfo, (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$text(String str) {
        if (this.f17369q.i()) {
            if (!this.f17369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (str == null) {
                g10.getTable().F(this.f17368p.f17378m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17368p.f17378m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17369q.f().e();
        if (str == null) {
            this.f17369q.g().setNull(this.f17368p.f17378m);
        } else {
            this.f17369q.g().setString(this.f17368p.f17378m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$timestamp(Date date) {
        if (this.f17369q.i()) {
            if (!this.f17369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (date == null) {
                g10.getTable().F(this.f17368p.f17375j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().A(this.f17368p.f17375j, g10.getObjectKey(), date, true);
                return;
            }
        }
        this.f17369q.f().e();
        if (date == null) {
            this.f17369q.g().setNull(this.f17368p.f17375j);
        } else {
            this.f17369q.g().setDate(this.f17368p.f17375j, date);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$user(String str) {
        if (this.f17369q.i()) {
            if (!this.f17369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (str == null) {
                g10.getTable().F(this.f17368p.f17374i, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17368p.f17374i, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17369q.f().e();
        if (str == null) {
            this.f17369q.g().setNull(this.f17368p.f17374i);
        } else {
            this.f17369q.g().setString(this.f17368p.f17374i, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$userID(String str) {
        if (this.f17369q.i()) {
            if (!this.f17369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (str != null) {
                g10.getTable().G(this.f17368p.f17372g, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'userID' to null.");
        }
        this.f17369q.f().e();
        if (str != null) {
            this.f17369q.g().setString(this.f17368p.f17372g, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'userID' to null.");
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$userStyles(UserStyles userStyles) {
        o0 o0Var = (o0) this.f17369q.f();
        if (this.f17369q.i()) {
            if (!this.f17369q.d() || this.f17369q.e().contains("userStyles")) {
                return;
            }
            if (userStyles != null && !d1.isManaged(userStyles)) {
                UserStyles userStyles2 = (UserStyles) o0Var.J0(UserStyles.class, this, "userStyles");
                g5.n(o0Var, userStyles, userStyles2, new HashMap(), Collections.EMPTY_SET);
                userStyles = userStyles2;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (userStyles == null) {
                g10.nullifyLink(this.f17368p.f17377l);
                return;
            }
            this.f17369q.c(userStyles);
            g10.getTable().D(this.f17368p.f17377l, g10.getObjectKey(), ((io.realm.internal.o) userStyles).b().g().getObjectKey(), true);
            return;
        }
        this.f17369q.f().e();
        if (userStyles == null) {
            this.f17369q.g().nullifyLink(this.f17368p.f17377l);
            return;
        }
        if (d1.isManaged(userStyles)) {
            this.f17369q.c(userStyles);
        }
        g5.n(o0Var, userStyles, (UserStyles) o0Var.J0(UserStyles.class, this, "userStyles"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$username(String str) {
        if (this.f17369q.i()) {
            if (!this.f17369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (str == null) {
                g10.getTable().F(this.f17368p.f17373h, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17368p.f17373h, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17369q.f().e();
        if (str == null) {
            this.f17369q.g().setNull(this.f17368p.f17373h);
        } else {
            this.f17369q.g().setString(this.f17368p.f17373h, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.InboxConversation, io.realm.d5
    public void realmSet$uuid(String str) {
        if (this.f17369q.i()) {
            if (!this.f17369q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17369q.g();
            if (str != null) {
                g10.getTable().G(this.f17368p.f17371f, g10.getObjectKey(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
        }
        this.f17369q.f().e();
        if (str != null) {
            this.f17369q.g().setString(this.f17368p.f17371f, str);
            return;
        }
        throw new IllegalArgumentException("Trying to set non-nullable field 'uuid' to null.");
    }

    public String toString() {
        String str;
        String str2;
        Date date;
        String str3;
        String str4;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("InboxConversation = proxy[");
        sb2.append("{combinedID:");
        sb2.append(realmGet$combinedID());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{uuid:");
        sb2.append(realmGet$uuid());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{userID:");
        sb2.append(realmGet$userID());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{username:");
        String str5 = "null";
        if (realmGet$username() == null) {
            str = "null";
        } else {
            str = realmGet$username();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{user:");
        if (realmGet$user() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$user();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{timestamp:");
        if (realmGet$timestamp() == null) {
            date = "null";
        } else {
            date = realmGet$timestamp();
        }
        sb2.append(date);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{contributor:");
        if (realmGet$contributor() == null) {
            str3 = "null";
        } else {
            str3 = "ContributorInfo";
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{userStyles:");
        if (realmGet$userStyles() == null) {
            str4 = "null";
        } else {
            str4 = "UserStyles";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        if (realmGet$text() != null) {
            str5 = realmGet$text();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
