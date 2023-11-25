package io.realm;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.ChatMessageLike;
import com.habitrpg.android.habitica.models.social.UserStyles;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_social_ChatMessageRealmProxy.java */
/* loaded from: classes4.dex */
public class u4 extends ChatMessage implements io.realm.internal.o {

    /* renamed from: u  reason: collision with root package name */
    private static final OsObjectSchemaInfo f18269u = g();

    /* renamed from: p  reason: collision with root package name */
    private a f18270p;

    /* renamed from: q  reason: collision with root package name */
    private l0<ChatMessage> f18271q;

    /* renamed from: r  reason: collision with root package name */
    private x0<ChatMessageLike> f18272r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_social_ChatMessageRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f18273e;

        /* renamed from: f  reason: collision with root package name */
        long f18274f;

        /* renamed from: g  reason: collision with root package name */
        long f18275g;

        /* renamed from: h  reason: collision with root package name */
        long f18276h;

        /* renamed from: i  reason: collision with root package name */
        long f18277i;

        /* renamed from: j  reason: collision with root package name */
        long f18278j;

        /* renamed from: k  reason: collision with root package name */
        long f18279k;

        /* renamed from: l  reason: collision with root package name */
        long f18280l;

        /* renamed from: m  reason: collision with root package name */
        long f18281m;

        /* renamed from: n  reason: collision with root package name */
        long f18282n;

        /* renamed from: o  reason: collision with root package name */
        long f18283o;

        /* renamed from: p  reason: collision with root package name */
        long f18284p;

        /* renamed from: q  reason: collision with root package name */
        long f18285q;

        /* renamed from: r  reason: collision with root package name */
        long f18286r;

        /* renamed from: s  reason: collision with root package name */
        long f18287s;

        /* renamed from: t  reason: collision with root package name */
        long f18288t;

        /* renamed from: u  reason: collision with root package name */
        long f18289u;

        a(OsSchemaInfo osSchemaInfo) {
            super(17);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("ChatMessage");
            this.f18273e = a("id", "id", b10);
            this.f18274f = a("text", "text", b10);
            this.f18275g = a("timestamp", "timestamp", b10);
            this.f18276h = a("likes", "likes", b10);
            this.f18277i = a("flagCount", "flagCount", b10);
            this.f18278j = a("uuid", "uuid", b10);
            this.f18279k = a("userID", "userID", b10);
            this.f18280l = a("contributor", "contributor", b10);
            this.f18281m = a("backer", "backer", b10);
            this.f18282n = a("user", "user", b10);
            this.f18283o = a("sent", "sent", b10);
            this.f18284p = a(TaskFormActivity.GROUP_ID_KEY, TaskFormActivity.GROUP_ID_KEY, b10);
            this.f18285q = a("isInboxMessage", "isInboxMessage", b10);
            this.f18286r = a("userStyles", "userStyles", b10);
            this.f18287s = a("likeCount", "likeCount", b10);
            this.f18288t = a("username", "username", b10);
            this.f18289u = a("isSeen", "isSeen", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f18273e = aVar.f18273e;
            aVar2.f18274f = aVar.f18274f;
            aVar2.f18275g = aVar.f18275g;
            aVar2.f18276h = aVar.f18276h;
            aVar2.f18277i = aVar.f18277i;
            aVar2.f18278j = aVar.f18278j;
            aVar2.f18279k = aVar.f18279k;
            aVar2.f18280l = aVar.f18280l;
            aVar2.f18281m = aVar.f18281m;
            aVar2.f18282n = aVar.f18282n;
            aVar2.f18283o = aVar.f18283o;
            aVar2.f18284p = aVar.f18284p;
            aVar2.f18285q = aVar.f18285q;
            aVar2.f18286r = aVar.f18286r;
            aVar2.f18287s = aVar.f18287s;
            aVar2.f18288t = aVar.f18288t;
            aVar2.f18289u = aVar.f18289u;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4() {
        this.f18271q.p();
    }

    public static ChatMessage c(o0 o0Var, a aVar, ChatMessage chatMessage, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(chatMessage);
        if (oVar != null) {
            return (ChatMessage) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChatMessage.class), set);
        osObjectBuilder.c1(aVar.f18273e, chatMessage.realmGet$id());
        osObjectBuilder.c1(aVar.f18274f, chatMessage.realmGet$text());
        osObjectBuilder.X0(aVar.f18275g, chatMessage.realmGet$timestamp());
        osObjectBuilder.V0(aVar.f18277i, Integer.valueOf(chatMessage.realmGet$flagCount()));
        osObjectBuilder.c1(aVar.f18278j, chatMessage.realmGet$uuid());
        osObjectBuilder.c1(aVar.f18279k, chatMessage.realmGet$userID());
        osObjectBuilder.c1(aVar.f18282n, chatMessage.realmGet$user());
        osObjectBuilder.F0(aVar.f18283o, Boolean.valueOf(chatMessage.realmGet$sent()));
        osObjectBuilder.c1(aVar.f18284p, chatMessage.realmGet$groupId());
        osObjectBuilder.F0(aVar.f18285q, Boolean.valueOf(chatMessage.realmGet$isInboxMessage()));
        osObjectBuilder.V0(aVar.f18287s, Integer.valueOf(chatMessage.realmGet$likeCount()));
        osObjectBuilder.c1(aVar.f18288t, chatMessage.realmGet$username());
        osObjectBuilder.F0(aVar.f18289u, Boolean.valueOf(chatMessage.realmGet$isSeen()));
        u4 l10 = l(o0Var, osObjectBuilder.e1());
        map.put(chatMessage, l10);
        x0<ChatMessageLike> realmGet$likes = chatMessage.realmGet$likes();
        if (realmGet$likes != null) {
            x0<ChatMessageLike> realmGet$likes2 = l10.realmGet$likes();
            realmGet$likes2.clear();
            for (int i10 = 0; i10 < realmGet$likes.size(); i10++) {
                ChatMessageLike chatMessageLike = realmGet$likes.get(i10);
                if (((ChatMessageLike) map.get(chatMessageLike)) == null) {
                    s4 k10 = s4.k(o0Var, o0Var.c1(ChatMessageLike.class).s(realmGet$likes2.m().n()));
                    map.put(chatMessageLike, k10);
                    s4.n(o0Var, chatMessageLike, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachelikes.toString()");
                }
            }
        }
        ContributorInfo realmGet$contributor = chatMessage.realmGet$contributor();
        if (realmGet$contributor == null) {
            l10.realmSet$contributor(null);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k11 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(l10.b().g().createEmbeddedObject(aVar.f18280l, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k11);
            e6.n(o0Var, realmGet$contributor, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        Backer realmGet$backer = chatMessage.realmGet$backer();
        if (realmGet$backer == null) {
            l10.realmSet$backer(null);
        } else if (((Backer) map.get(realmGet$backer)) == null) {
            a6 k12 = a6.k(o0Var, o0Var.c1(Backer.class).s(l10.b().g().createEmbeddedObject(aVar.f18281m, RealmFieldType.OBJECT)));
            map.put(realmGet$backer, k12);
            a6.n(o0Var, realmGet$backer, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebacker.toString()");
        }
        UserStyles realmGet$userStyles = chatMessage.realmGet$userStyles();
        if (realmGet$userStyles == null) {
            l10.realmSet$userStyles(null);
        } else if (((UserStyles) map.get(realmGet$userStyles)) == null) {
            g5 k13 = g5.k(o0Var, o0Var.c1(UserStyles.class).s(l10.b().g().createEmbeddedObject(aVar.f18286r, RealmFieldType.OBJECT)));
            map.put(realmGet$userStyles, k13);
            g5.n(o0Var, realmGet$userStyles, k13, map, set);
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
    public static com.habitrpg.android.habitica.models.social.ChatMessage d(io.realm.o0 r8, io.realm.u4.a r9, com.habitrpg.android.habitica.models.social.ChatMessage r10, boolean r11, java.util.Map<io.realm.a1, io.realm.internal.o> r12, java.util.Set<io.realm.v> r13) {
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
            com.habitrpg.android.habitica.models.social.ChatMessage r1 = (com.habitrpg.android.habitica.models.social.ChatMessage) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8c
            java.lang.Class<com.habitrpg.android.habitica.models.social.ChatMessage> r2 = com.habitrpg.android.habitica.models.social.ChatMessage.class
            io.realm.internal.Table r2 = r8.c1(r2)
            long r3 = r9.f18273e
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
            io.realm.u4 r1 = new io.realm.u4     // Catch: java.lang.Throwable -> L87
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
            com.habitrpg.android.habitica.models.social.ChatMessage r8 = n(r1, r2, r3, r4, r5, r6)
            goto L9e
        L9a:
            com.habitrpg.android.habitica.models.social.ChatMessage r8 = c(r8, r9, r10, r11, r12, r13)
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.u4.d(io.realm.o0, io.realm.u4$a, com.habitrpg.android.habitica.models.social.ChatMessage, boolean, java.util.Map, java.util.Set):com.habitrpg.android.habitica.models.social.ChatMessage");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static ChatMessage f(ChatMessage chatMessage, int i10, int i11, Map<a1, o.a<a1>> map) {
        ChatMessage chatMessage2;
        if (i10 > i11 || chatMessage == null) {
            return null;
        }
        o.a<a1> aVar = map.get(chatMessage);
        if (aVar == null) {
            chatMessage2 = new ChatMessage();
            map.put(chatMessage, new o.a<>(i10, chatMessage2));
        } else if (i10 >= aVar.f17831a) {
            return (ChatMessage) aVar.f17832b;
        } else {
            ChatMessage chatMessage3 = (ChatMessage) aVar.f17832b;
            aVar.f17831a = i10;
            chatMessage2 = chatMessage3;
        }
        o0 o0Var = (o0) ((io.realm.internal.o) chatMessage).b().f();
        chatMessage2.realmSet$id(chatMessage.realmGet$id());
        chatMessage2.realmSet$text(chatMessage.realmGet$text());
        chatMessage2.realmSet$timestamp(chatMessage.realmGet$timestamp());
        if (i10 == i11) {
            chatMessage2.realmSet$likes(null);
        } else {
            x0<ChatMessageLike> realmGet$likes = chatMessage.realmGet$likes();
            x0<ChatMessageLike> x0Var = new x0<>();
            chatMessage2.realmSet$likes(x0Var);
            int i12 = i10 + 1;
            int size = realmGet$likes.size();
            for (int i13 = 0; i13 < size; i13++) {
                x0Var.add(s4.f(realmGet$likes.get(i13), i12, i11, map));
            }
        }
        chatMessage2.realmSet$flagCount(chatMessage.realmGet$flagCount());
        chatMessage2.realmSet$uuid(chatMessage.realmGet$uuid());
        chatMessage2.realmSet$userID(chatMessage.realmGet$userID());
        int i14 = i10 + 1;
        chatMessage2.realmSet$contributor(e6.f(chatMessage.realmGet$contributor(), i14, i11, map));
        chatMessage2.realmSet$backer(a6.f(chatMessage.realmGet$backer(), i14, i11, map));
        chatMessage2.realmSet$user(chatMessage.realmGet$user());
        chatMessage2.realmSet$sent(chatMessage.realmGet$sent());
        chatMessage2.realmSet$groupId(chatMessage.realmGet$groupId());
        chatMessage2.realmSet$isInboxMessage(chatMessage.realmGet$isInboxMessage());
        chatMessage2.realmSet$userStyles(g5.f(chatMessage.realmGet$userStyles(), i14, i11, map));
        chatMessage2.realmSet$likeCount(chatMessage.realmGet$likeCount());
        chatMessage2.realmSet$username(chatMessage.realmGet$username());
        chatMessage2.realmSet$isSeen(chatMessage.realmGet$isSeen());
        return chatMessage2;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "ChatMessage", false, 17, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.b("", "id", realmFieldType, true, false, true);
        bVar.b("", "text", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.b("", "timestamp", realmFieldType2, false, false, false);
        bVar.a("", "likes", RealmFieldType.LIST, "ChatMessageLike");
        bVar.b("", "flagCount", realmFieldType2, false, false, true);
        bVar.b("", "uuid", realmFieldType, false, false, false);
        bVar.b("", "userID", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
        bVar.a("", "contributor", realmFieldType3, "ContributorInfo");
        bVar.a("", "backer", realmFieldType3, "Backer");
        bVar.b("", "user", realmFieldType, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.BOOLEAN;
        bVar.b("", "sent", realmFieldType4, false, false, true);
        bVar.b("", TaskFormActivity.GROUP_ID_KEY, realmFieldType, false, false, false);
        bVar.b("", "isInboxMessage", realmFieldType4, false, false, true);
        bVar.a("", "userStyles", realmFieldType3, "UserStyles");
        bVar.b("", "likeCount", realmFieldType2, false, false, true);
        bVar.b("", "username", realmFieldType, false, false, false);
        bVar.b("", "isSeen", realmFieldType4, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f18269u;
    }

    public static long i(o0 o0Var, ChatMessage chatMessage, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        String str;
        String str2;
        if ((chatMessage instanceof io.realm.internal.o) && !d1.isFrozen(chatMessage)) {
            io.realm.internal.o oVar = (io.realm.internal.o) chatMessage;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(ChatMessage.class);
        long nativePtr = c12.getNativePtr();
        a aVar = (a) o0Var.R().e(ChatMessage.class);
        long j13 = aVar.f18273e;
        String realmGet$id = chatMessage.realmGet$id();
        if (realmGet$id != null) {
            j10 = Table.nativeFindFirstString(nativePtr, j13, realmGet$id);
        } else {
            j10 = -1;
        }
        if (j10 == -1) {
            j10 = OsObject.createRowWithPrimaryKey(c12, j13, realmGet$id);
        }
        long j14 = j10;
        map.put(chatMessage, Long.valueOf(j14));
        String realmGet$text = chatMessage.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, aVar.f18274f, j14, realmGet$text, false);
            j11 = j14;
            j12 = nativePtr;
        } else {
            j11 = j14;
            j12 = nativePtr;
            Table.nativeSetNull(nativePtr, aVar.f18274f, j11, false);
        }
        Long realmGet$timestamp = chatMessage.realmGet$timestamp();
        if (realmGet$timestamp != null) {
            long j15 = j11;
            Table.nativeSetLong(j12, aVar.f18275g, j15, realmGet$timestamp.longValue(), false);
            j11 = j15;
        } else {
            Table.nativeSetNull(j12, aVar.f18275g, j11, false);
        }
        OsList osList = new OsList(c12.s(j11), aVar.f18276h);
        x0<ChatMessageLike> realmGet$likes = chatMessage.realmGet$likes();
        osList.K();
        if (realmGet$likes != null) {
            Iterator<ChatMessageLike> it = realmGet$likes.iterator();
            while (it.hasNext()) {
                ChatMessageLike next = it.next();
                Long l10 = map.get(next);
                if (l10 == null) {
                    s4.i(o0Var, c12, aVar.f18276h, j11, next, map);
                    aVar = aVar;
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                }
            }
        }
        a aVar2 = aVar;
        long j16 = j11;
        Table.nativeSetLong(j12, aVar2.f18277i, j16, chatMessage.realmGet$flagCount(), false);
        String realmGet$uuid = chatMessage.realmGet$uuid();
        if (realmGet$uuid != null) {
            Table.nativeSetString(j12, aVar2.f18278j, j16, realmGet$uuid, false);
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
        } else {
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            Table.nativeSetNull(j12, aVar2.f18278j, j16, false);
        }
        String realmGet$userID = chatMessage.realmGet$userID();
        if (realmGet$userID != null) {
            Table.nativeSetString(j12, aVar2.f18279k, j16, realmGet$userID, false);
            str = str;
        } else {
            Table.nativeSetNull(j12, aVar2.f18279k, j16, false);
        }
        ContributorInfo realmGet$contributor = chatMessage.realmGet$contributor();
        if (realmGet$contributor != null) {
            Long l11 = map.get(realmGet$contributor);
            if (l11 == null) {
                e6.i(o0Var, c12, aVar2.f18280l, j16, realmGet$contributor, map);
            } else {
                throw new IllegalArgumentException(str + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(j12, aVar2.f18280l, j16);
        }
        Backer realmGet$backer = chatMessage.realmGet$backer();
        if (realmGet$backer != null) {
            Long l12 = map.get(realmGet$backer);
            if (l12 == null) {
                a6.i(o0Var, c12, aVar2.f18281m, j16, realmGet$backer, map);
            } else {
                throw new IllegalArgumentException(str + l12.toString());
            }
        } else {
            Table.nativeNullifyLink(j12, aVar2.f18281m, j16);
        }
        String realmGet$user = chatMessage.realmGet$user();
        if (realmGet$user != null) {
            Table.nativeSetString(j12, aVar2.f18282n, j16, realmGet$user, false);
            str = str;
        } else {
            Table.nativeSetNull(j12, aVar2.f18282n, j16, false);
        }
        String str3 = str;
        Table.nativeSetBoolean(j12, aVar2.f18283o, j16, chatMessage.realmGet$sent(), false);
        String realmGet$groupId = chatMessage.realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetString(j12, aVar2.f18284p, j16, realmGet$groupId, false);
            str2 = str3;
        } else {
            str2 = str3;
            Table.nativeSetNull(j12, aVar2.f18284p, j16, false);
        }
        String str4 = str2;
        Table.nativeSetBoolean(j12, aVar2.f18285q, j16, chatMessage.realmGet$isInboxMessage(), false);
        UserStyles realmGet$userStyles = chatMessage.realmGet$userStyles();
        if (realmGet$userStyles != null) {
            Long l13 = map.get(realmGet$userStyles);
            if (l13 == null) {
                g5.i(o0Var, c12, aVar2.f18286r, j16, realmGet$userStyles, map);
            } else {
                throw new IllegalArgumentException(str4 + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(j12, aVar2.f18286r, j16);
        }
        Table.nativeSetLong(j12, aVar2.f18287s, j16, chatMessage.realmGet$likeCount(), false);
        String realmGet$username = chatMessage.realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(j12, aVar2.f18288t, j16, realmGet$username, false);
        } else {
            Table.nativeSetNull(j12, aVar2.f18288t, j16, false);
        }
        Table.nativeSetBoolean(j12, aVar2.f18289u, j16, chatMessage.realmGet$isSeen(), false);
        return j16;
    }

    public static void k(o0 o0Var, Iterator<? extends a1> it, Map<a1, Long> map) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        ChatMessage chatMessage;
        long j15;
        a aVar;
        String str;
        a aVar2;
        String str2;
        String str3;
        a aVar3;
        a aVar4;
        Table c12 = o0Var.c1(ChatMessage.class);
        long nativePtr = c12.getNativePtr();
        a aVar5 = (a) o0Var.R().e(ChatMessage.class);
        long j16 = aVar5.f18273e;
        while (it.hasNext()) {
            ChatMessage chatMessage2 = (ChatMessage) it.next();
            if (!map.containsKey(chatMessage2)) {
                if ((chatMessage2 instanceof io.realm.internal.o) && !d1.isFrozen(chatMessage2)) {
                    io.realm.internal.o oVar = (io.realm.internal.o) chatMessage2;
                    if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                        map.put(chatMessage2, Long.valueOf(oVar.b().g().getObjectKey()));
                    }
                }
                String realmGet$id = chatMessage2.realmGet$id();
                if (realmGet$id != null) {
                    j10 = Table.nativeFindFirstString(nativePtr, j16, realmGet$id);
                } else {
                    j10 = -1;
                }
                if (j10 == -1) {
                    j11 = OsObject.createRowWithPrimaryKey(c12, j16, realmGet$id);
                } else {
                    j11 = j10;
                }
                map.put(chatMessage2, Long.valueOf(j11));
                String realmGet$text = chatMessage2.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, aVar5.f18274f, j11, realmGet$text, false);
                    j12 = j11;
                    j13 = j16;
                    j14 = nativePtr;
                    chatMessage = chatMessage2;
                } else {
                    j12 = j11;
                    j13 = j16;
                    j14 = nativePtr;
                    chatMessage = chatMessage2;
                    Table.nativeSetNull(nativePtr, aVar5.f18274f, j12, false);
                }
                Long realmGet$timestamp = chatMessage.realmGet$timestamp();
                if (realmGet$timestamp != null) {
                    long j17 = j12;
                    Table.nativeSetLong(j14, aVar5.f18275g, j17, realmGet$timestamp.longValue(), false);
                    j15 = j17;
                } else {
                    long j18 = j12;
                    j15 = j18;
                    Table.nativeSetNull(j14, aVar5.f18275g, j18, false);
                }
                OsList osList = new OsList(c12.s(j15), aVar5.f18276h);
                x0<ChatMessageLike> realmGet$likes = chatMessage.realmGet$likes();
                osList.K();
                if (realmGet$likes != null) {
                    Iterator<ChatMessageLike> it2 = realmGet$likes.iterator();
                    while (it2.hasNext()) {
                        ChatMessageLike next = it2.next();
                        Long l10 = map.get(next);
                        if (l10 == null) {
                            s4.i(o0Var, c12, aVar5.f18276h, j15, next, map);
                            aVar5 = aVar5;
                        } else {
                            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
                        }
                    }
                }
                a aVar6 = aVar5;
                long j19 = j15;
                Table.nativeSetLong(j14, aVar6.f18277i, j19, chatMessage.realmGet$flagCount(), false);
                String realmGet$uuid = chatMessage.realmGet$uuid();
                if (realmGet$uuid != null) {
                    Table.nativeSetString(j14, aVar6.f18278j, j19, realmGet$uuid, false);
                    aVar = aVar6;
                } else {
                    aVar = aVar6;
                    Table.nativeSetNull(j14, aVar6.f18278j, j19, false);
                }
                String realmGet$userID = chatMessage.realmGet$userID();
                if (realmGet$userID != null) {
                    Table.nativeSetString(j14, aVar.f18279k, j19, realmGet$userID, false);
                    aVar = aVar;
                } else {
                    Table.nativeSetNull(j14, aVar.f18279k, j19, false);
                }
                ContributorInfo realmGet$contributor = chatMessage.realmGet$contributor();
                if (realmGet$contributor == null) {
                    str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                    Table.nativeNullifyLink(j14, aVar.f18280l, j19);
                } else {
                    Long l11 = map.get(realmGet$contributor);
                    if (l11 == null) {
                        str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
                        e6.i(o0Var, c12, aVar.f18280l, j19, realmGet$contributor, map);
                    } else {
                        throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
                    }
                }
                Backer realmGet$backer = chatMessage.realmGet$backer();
                if (realmGet$backer != null) {
                    Long l12 = map.get(realmGet$backer);
                    if (l12 == null) {
                        a6.i(o0Var, c12, aVar.f18281m, j19, realmGet$backer, map);
                    } else {
                        throw new IllegalArgumentException(str + l12.toString());
                    }
                } else {
                    Table.nativeNullifyLink(j14, aVar.f18281m, j19);
                }
                String realmGet$user = chatMessage.realmGet$user();
                if (realmGet$user != null) {
                    aVar2 = aVar;
                    Table.nativeSetString(j14, aVar.f18282n, j19, realmGet$user, false);
                    str2 = str;
                } else {
                    aVar2 = aVar;
                    str2 = str;
                    Table.nativeSetNull(j14, aVar2.f18282n, j19, false);
                }
                String str4 = str2;
                Table.nativeSetBoolean(j14, aVar2.f18283o, j19, chatMessage.realmGet$sent(), false);
                String realmGet$groupId = chatMessage.realmGet$groupId();
                if (realmGet$groupId != null) {
                    Table.nativeSetString(j14, aVar2.f18284p, j19, realmGet$groupId, false);
                    str3 = str4;
                } else {
                    str3 = str4;
                    Table.nativeSetNull(j14, aVar2.f18284p, j19, false);
                }
                String str5 = str3;
                Table.nativeSetBoolean(j14, aVar2.f18285q, j19, chatMessage.realmGet$isInboxMessage(), false);
                UserStyles realmGet$userStyles = chatMessage.realmGet$userStyles();
                if (realmGet$userStyles != null) {
                    Long l13 = map.get(realmGet$userStyles);
                    if (l13 == null) {
                        aVar3 = aVar2;
                        g5.i(o0Var, c12, aVar2.f18286r, j19, realmGet$userStyles, map);
                    } else {
                        throw new IllegalArgumentException(str5 + l13.toString());
                    }
                } else {
                    aVar3 = aVar2;
                    Table.nativeNullifyLink(j14, aVar3.f18286r, j19);
                }
                a aVar7 = aVar3;
                Table.nativeSetLong(j14, aVar3.f18287s, j19, chatMessage.realmGet$likeCount(), false);
                String realmGet$username = chatMessage.realmGet$username();
                if (realmGet$username != null) {
                    Table.nativeSetString(j14, aVar7.f18288t, j19, realmGet$username, false);
                    aVar4 = aVar7;
                } else {
                    aVar4 = aVar7;
                    Table.nativeSetNull(j14, aVar7.f18288t, j19, false);
                }
                aVar5 = aVar4;
                Table.nativeSetBoolean(j14, aVar4.f18289u, j19, chatMessage.realmGet$isSeen(), false);
                j16 = j13;
                nativePtr = j14;
            }
        }
    }

    static u4 l(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(ChatMessage.class), false, Collections.emptyList());
        u4 u4Var = new u4();
        cVar.a();
        return u4Var;
    }

    static ChatMessage n(o0 o0Var, a aVar, ChatMessage chatMessage, ChatMessage chatMessage2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(ChatMessage.class), set);
        osObjectBuilder.c1(aVar.f18273e, chatMessage2.realmGet$id());
        osObjectBuilder.c1(aVar.f18274f, chatMessage2.realmGet$text());
        osObjectBuilder.X0(aVar.f18275g, chatMessage2.realmGet$timestamp());
        x0<ChatMessageLike> realmGet$likes = chatMessage2.realmGet$likes();
        if (realmGet$likes != null) {
            x0 x0Var = new x0();
            OsList m10 = chatMessage.realmGet$likes().m();
            m10.q();
            for (int i10 = 0; i10 < realmGet$likes.size(); i10++) {
                ChatMessageLike chatMessageLike = realmGet$likes.get(i10);
                if (((ChatMessageLike) map.get(chatMessageLike)) == null) {
                    s4 k10 = s4.k(o0Var, o0Var.c1(ChatMessageLike.class).s(m10.n()));
                    map.put(chatMessageLike, k10);
                    x0Var.add(k10);
                    s4.n(o0Var, chatMessageLike, k10, new HashMap(), Collections.EMPTY_SET);
                } else {
                    throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachelikes.toString()");
                }
            }
        } else {
            osObjectBuilder.b1(aVar.f18276h, new x0());
        }
        osObjectBuilder.V0(aVar.f18277i, Integer.valueOf(chatMessage2.realmGet$flagCount()));
        osObjectBuilder.c1(aVar.f18278j, chatMessage2.realmGet$uuid());
        osObjectBuilder.c1(aVar.f18279k, chatMessage2.realmGet$userID());
        ContributorInfo realmGet$contributor = chatMessage2.realmGet$contributor();
        if (realmGet$contributor == null) {
            osObjectBuilder.Z0(aVar.f18280l);
        } else if (((ContributorInfo) map.get(realmGet$contributor)) == null) {
            e6 k11 = e6.k(o0Var, o0Var.c1(ContributorInfo.class).s(((io.realm.internal.o) chatMessage).b().g().createEmbeddedObject(aVar.f18280l, RealmFieldType.OBJECT)));
            map.put(realmGet$contributor, k11);
            e6.n(o0Var, realmGet$contributor, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachecontributor.toString()");
        }
        Backer realmGet$backer = chatMessage2.realmGet$backer();
        if (realmGet$backer == null) {
            osObjectBuilder.Z0(aVar.f18281m);
        } else if (((Backer) map.get(realmGet$backer)) == null) {
            a6 k12 = a6.k(o0Var, o0Var.c1(Backer.class).s(((io.realm.internal.o) chatMessage).b().g().createEmbeddedObject(aVar.f18281m, RealmFieldType.OBJECT)));
            map.put(realmGet$backer, k12);
            a6.n(o0Var, realmGet$backer, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachebacker.toString()");
        }
        osObjectBuilder.c1(aVar.f18282n, chatMessage2.realmGet$user());
        osObjectBuilder.F0(aVar.f18283o, Boolean.valueOf(chatMessage2.realmGet$sent()));
        osObjectBuilder.c1(aVar.f18284p, chatMessage2.realmGet$groupId());
        osObjectBuilder.F0(aVar.f18285q, Boolean.valueOf(chatMessage2.realmGet$isInboxMessage()));
        UserStyles realmGet$userStyles = chatMessage2.realmGet$userStyles();
        if (realmGet$userStyles == null) {
            osObjectBuilder.Z0(aVar.f18286r);
        } else if (((UserStyles) map.get(realmGet$userStyles)) == null) {
            g5 k13 = g5.k(o0Var, o0Var.c1(UserStyles.class).s(((io.realm.internal.o) chatMessage).b().g().createEmbeddedObject(aVar.f18286r, RealmFieldType.OBJECT)));
            map.put(realmGet$userStyles, k13);
            g5.n(o0Var, realmGet$userStyles, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheuserStyles.toString()");
        }
        osObjectBuilder.V0(aVar.f18287s, Integer.valueOf(chatMessage2.realmGet$likeCount()));
        osObjectBuilder.c1(aVar.f18288t, chatMessage2.realmGet$username());
        osObjectBuilder.F0(aVar.f18289u, Boolean.valueOf(chatMessage2.realmGet$isSeen()));
        osObjectBuilder.g1();
        return chatMessage;
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f18271q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f18270p = (a) cVar.c();
        l0<ChatMessage> l0Var = new l0<>(this);
        this.f18271q = l0Var;
        l0Var.r(cVar.e());
        this.f18271q.s(cVar.f());
        this.f18271q.o(cVar.b());
        this.f18271q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f18271q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u4 u4Var = (u4) obj;
        io.realm.a f10 = this.f18271q.f();
        io.realm.a f11 = u4Var.f18271q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f18271q.g().getTable().p();
        String p11 = u4Var.f18271q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18271q.g().getObjectKey() == u4Var.f18271q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f18271q.f().getPath();
        String p10 = this.f18271q.g().getTable().p();
        long objectKey = this.f18271q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public Backer realmGet$backer() {
        this.f18271q.f().e();
        if (this.f18271q.g().isNullLink(this.f18270p.f18281m)) {
            return null;
        }
        return (Backer) this.f18271q.f().B(Backer.class, this.f18271q.g().getLink(this.f18270p.f18281m), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public ContributorInfo realmGet$contributor() {
        this.f18271q.f().e();
        if (this.f18271q.g().isNullLink(this.f18270p.f18280l)) {
            return null;
        }
        return (ContributorInfo) this.f18271q.f().B(ContributorInfo.class, this.f18271q.g().getLink(this.f18270p.f18280l), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public int realmGet$flagCount() {
        this.f18271q.f().e();
        return (int) this.f18271q.g().getLong(this.f18270p.f18277i);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$groupId() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18284p);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$id() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18273e);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public boolean realmGet$isInboxMessage() {
        this.f18271q.f().e();
        return this.f18271q.g().getBoolean(this.f18270p.f18285q);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public boolean realmGet$isSeen() {
        this.f18271q.f().e();
        return this.f18271q.g().getBoolean(this.f18270p.f18289u);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public int realmGet$likeCount() {
        this.f18271q.f().e();
        return (int) this.f18271q.g().getLong(this.f18270p.f18287s);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public x0<ChatMessageLike> realmGet$likes() {
        this.f18271q.f().e();
        x0<ChatMessageLike> x0Var = this.f18272r;
        if (x0Var != null) {
            return x0Var;
        }
        x0<ChatMessageLike> x0Var2 = new x0<>(ChatMessageLike.class, this.f18271q.g().getModelList(this.f18270p.f18276h), this.f18271q.f());
        this.f18272r = x0Var2;
        return x0Var2;
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public boolean realmGet$sent() {
        this.f18271q.f().e();
        return this.f18271q.g().getBoolean(this.f18270p.f18283o);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$text() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18274f);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public Long realmGet$timestamp() {
        this.f18271q.f().e();
        if (this.f18271q.g().isNull(this.f18270p.f18275g)) {
            return null;
        }
        return Long.valueOf(this.f18271q.g().getLong(this.f18270p.f18275g));
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$user() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18282n);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$userID() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18279k);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public UserStyles realmGet$userStyles() {
        this.f18271q.f().e();
        if (this.f18271q.g().isNullLink(this.f18270p.f18286r)) {
            return null;
        }
        return (UserStyles) this.f18271q.f().B(UserStyles.class, this.f18271q.g().getLink(this.f18270p.f18286r), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$username() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18288t);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public String realmGet$uuid() {
        this.f18271q.f().e();
        return this.f18271q.g().getString(this.f18270p.f18278j);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$backer(Backer backer) {
        o0 o0Var = (o0) this.f18271q.f();
        if (this.f18271q.i()) {
            if (!this.f18271q.d() || this.f18271q.e().contains("backer")) {
                return;
            }
            if (backer != null && !d1.isManaged(backer)) {
                Backer backer2 = (Backer) o0Var.J0(Backer.class, this, "backer");
                a6.n(o0Var, backer, backer2, new HashMap(), Collections.EMPTY_SET);
                backer = backer2;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (backer == null) {
                g10.nullifyLink(this.f18270p.f18281m);
                return;
            }
            this.f18271q.c(backer);
            g10.getTable().D(this.f18270p.f18281m, g10.getObjectKey(), ((io.realm.internal.o) backer).b().g().getObjectKey(), true);
            return;
        }
        this.f18271q.f().e();
        if (backer == null) {
            this.f18271q.g().nullifyLink(this.f18270p.f18281m);
            return;
        }
        if (d1.isManaged(backer)) {
            this.f18271q.c(backer);
        }
        a6.n(o0Var, backer, (Backer) o0Var.J0(Backer.class, this, "backer"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        o0 o0Var = (o0) this.f18271q.f();
        if (this.f18271q.i()) {
            if (!this.f18271q.d() || this.f18271q.e().contains("contributor")) {
                return;
            }
            if (contributorInfo != null && !d1.isManaged(contributorInfo)) {
                ContributorInfo contributorInfo2 = (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor");
                e6.n(o0Var, contributorInfo, contributorInfo2, new HashMap(), Collections.EMPTY_SET);
                contributorInfo = contributorInfo2;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (contributorInfo == null) {
                g10.nullifyLink(this.f18270p.f18280l);
                return;
            }
            this.f18271q.c(contributorInfo);
            g10.getTable().D(this.f18270p.f18280l, g10.getObjectKey(), ((io.realm.internal.o) contributorInfo).b().g().getObjectKey(), true);
            return;
        }
        this.f18271q.f().e();
        if (contributorInfo == null) {
            this.f18271q.g().nullifyLink(this.f18270p.f18280l);
            return;
        }
        if (d1.isManaged(contributorInfo)) {
            this.f18271q.c(contributorInfo);
        }
        e6.n(o0Var, contributorInfo, (ContributorInfo) o0Var.J0(ContributorInfo.class, this, "contributor"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$flagCount(int i10) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            g10.getTable().E(this.f18270p.f18277i, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18271q.f().e();
        this.f18271q.g().setLong(this.f18270p.f18277i, i10);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$groupId(String str) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (str == null) {
                g10.getTable().F(this.f18270p.f18284p, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18270p.f18284p, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18271q.f().e();
        if (str == null) {
            this.f18271q.g().setNull(this.f18270p.f18284p);
        } else {
            this.f18271q.g().setString(this.f18270p.f18284p, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$id(String str) {
        if (this.f18271q.i()) {
            return;
        }
        this.f18271q.f().e();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$isInboxMessage(boolean z10) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            g10.getTable().z(this.f18270p.f18285q, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18271q.f().e();
        this.f18271q.g().setBoolean(this.f18270p.f18285q, z10);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$isSeen(boolean z10) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            g10.getTable().z(this.f18270p.f18289u, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18271q.f().e();
        this.f18271q.g().setBoolean(this.f18270p.f18289u, z10);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$likeCount(int i10) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            g10.getTable().E(this.f18270p.f18287s, g10.getObjectKey(), i10, true);
            return;
        }
        this.f18271q.f().e();
        this.f18271q.g().setLong(this.f18270p.f18287s, i10);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$likes(x0<ChatMessageLike> x0Var) {
        int i10 = 0;
        if (this.f18271q.i()) {
            if (!this.f18271q.d() || this.f18271q.e().contains("likes")) {
                return;
            }
            if (x0Var != null && !x0Var.p()) {
                o0 o0Var = (o0) this.f18271q.f();
                x0<ChatMessageLike> x0Var2 = new x0<>();
                Iterator<ChatMessageLike> it = x0Var.iterator();
                while (it.hasNext()) {
                    ChatMessageLike next = it.next();
                    if (next != null && !d1.isManaged(next)) {
                        x0Var2.add((ChatMessageLike) o0Var.D0(next, new v[0]));
                    } else {
                        x0Var2.add(next);
                    }
                }
                x0Var = x0Var2;
            }
        }
        this.f18271q.f().e();
        OsList modelList = this.f18271q.g().getModelList(this.f18270p.f18276h);
        if (x0Var != null && x0Var.size() == modelList.Y()) {
            int size = x0Var.size();
            while (i10 < size) {
                ChatMessageLike chatMessageLike = x0Var.get(i10);
                this.f18271q.c(chatMessageLike);
                modelList.V(i10, ((io.realm.internal.o) chatMessageLike).b().g().getObjectKey());
                i10++;
            }
            return;
        }
        modelList.K();
        if (x0Var == null) {
            return;
        }
        int size2 = x0Var.size();
        while (i10 < size2) {
            ChatMessageLike chatMessageLike2 = x0Var.get(i10);
            this.f18271q.c(chatMessageLike2);
            modelList.k(((io.realm.internal.o) chatMessageLike2).b().g().getObjectKey());
            i10++;
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$sent(boolean z10) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            g10.getTable().z(this.f18270p.f18283o, g10.getObjectKey(), z10, true);
            return;
        }
        this.f18271q.f().e();
        this.f18271q.g().setBoolean(this.f18270p.f18283o, z10);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$text(String str) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (str == null) {
                g10.getTable().F(this.f18270p.f18274f, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18270p.f18274f, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18271q.f().e();
        if (str == null) {
            this.f18271q.g().setNull(this.f18270p.f18274f);
        } else {
            this.f18271q.g().setString(this.f18270p.f18274f, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$timestamp(Long l10) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (l10 == null) {
                g10.getTable().F(this.f18270p.f18275g, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().E(this.f18270p.f18275g, g10.getObjectKey(), l10.longValue(), true);
                return;
            }
        }
        this.f18271q.f().e();
        if (l10 == null) {
            this.f18271q.g().setNull(this.f18270p.f18275g);
        } else {
            this.f18271q.g().setLong(this.f18270p.f18275g, l10.longValue());
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$user(String str) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (str == null) {
                g10.getTable().F(this.f18270p.f18282n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18270p.f18282n, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18271q.f().e();
        if (str == null) {
            this.f18271q.g().setNull(this.f18270p.f18282n);
        } else {
            this.f18271q.g().setString(this.f18270p.f18282n, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$userID(String str) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (str == null) {
                g10.getTable().F(this.f18270p.f18279k, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18270p.f18279k, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18271q.f().e();
        if (str == null) {
            this.f18271q.g().setNull(this.f18270p.f18279k);
        } else {
            this.f18271q.g().setString(this.f18270p.f18279k, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$userStyles(UserStyles userStyles) {
        o0 o0Var = (o0) this.f18271q.f();
        if (this.f18271q.i()) {
            if (!this.f18271q.d() || this.f18271q.e().contains("userStyles")) {
                return;
            }
            if (userStyles != null && !d1.isManaged(userStyles)) {
                UserStyles userStyles2 = (UserStyles) o0Var.J0(UserStyles.class, this, "userStyles");
                g5.n(o0Var, userStyles, userStyles2, new HashMap(), Collections.EMPTY_SET);
                userStyles = userStyles2;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (userStyles == null) {
                g10.nullifyLink(this.f18270p.f18286r);
                return;
            }
            this.f18271q.c(userStyles);
            g10.getTable().D(this.f18270p.f18286r, g10.getObjectKey(), ((io.realm.internal.o) userStyles).b().g().getObjectKey(), true);
            return;
        }
        this.f18271q.f().e();
        if (userStyles == null) {
            this.f18271q.g().nullifyLink(this.f18270p.f18286r);
            return;
        }
        if (d1.isManaged(userStyles)) {
            this.f18271q.c(userStyles);
        }
        g5.n(o0Var, userStyles, (UserStyles) o0Var.J0(UserStyles.class, this, "userStyles"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$username(String str) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (str == null) {
                g10.getTable().F(this.f18270p.f18288t, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18270p.f18288t, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18271q.f().e();
        if (str == null) {
            this.f18271q.g().setNull(this.f18270p.f18288t);
        } else {
            this.f18271q.g().setString(this.f18270p.f18288t, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.social.ChatMessage, io.realm.v4
    public void realmSet$uuid(String str) {
        if (this.f18271q.i()) {
            if (!this.f18271q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f18271q.g();
            if (str == null) {
                g10.getTable().F(this.f18270p.f18278j, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f18270p.f18278j, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f18271q.f().e();
        if (str == null) {
            this.f18271q.g().setNull(this.f18270p.f18278j);
        } else {
            this.f18271q.g().setString(this.f18270p.f18278j, str);
        }
    }

    public String toString() {
        String str;
        Long l10;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("ChatMessage = proxy[");
        sb2.append("{id:");
        sb2.append(realmGet$id());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{text:");
        String str9 = "null";
        if (realmGet$text() == null) {
            str = "null";
        } else {
            str = realmGet$text();
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{timestamp:");
        if (realmGet$timestamp() == null) {
            l10 = "null";
        } else {
            l10 = realmGet$timestamp();
        }
        sb2.append(l10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{likes:");
        sb2.append("RealmList<ChatMessageLike>[");
        sb2.append(realmGet$likes().size());
        sb2.append("]");
        sb2.append("}");
        sb2.append(",");
        sb2.append("{flagCount:");
        sb2.append(realmGet$flagCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{uuid:");
        if (realmGet$uuid() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$uuid();
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{userID:");
        if (realmGet$userID() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$userID();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{contributor:");
        if (realmGet$contributor() == null) {
            str4 = "null";
        } else {
            str4 = "ContributorInfo";
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{backer:");
        if (realmGet$backer() == null) {
            str5 = "null";
        } else {
            str5 = "Backer";
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{user:");
        if (realmGet$user() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$user();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{sent:");
        sb2.append(realmGet$sent());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{groupId:");
        if (realmGet$groupId() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$groupId();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isInboxMessage:");
        sb2.append(realmGet$isInboxMessage());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{userStyles:");
        if (realmGet$userStyles() == null) {
            str8 = "null";
        } else {
            str8 = "UserStyles";
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{likeCount:");
        sb2.append(realmGet$likeCount());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{username:");
        if (realmGet$username() != null) {
            str9 = realmGet$username();
        }
        sb2.append(str9);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{isSeen:");
        sb2.append(realmGet$isSeen());
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
