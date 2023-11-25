package io.realm;

import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.models.user.PushNotificationsPreference;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_PushNotificationsPreferenceRealmProxy.java */
/* loaded from: classes4.dex */
public class m7 extends PushNotificationsPreference implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17979r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17980p;

    /* renamed from: q  reason: collision with root package name */
    private l0<PushNotificationsPreference> f17981q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_PushNotificationsPreferenceRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17982e;

        /* renamed from: f  reason: collision with root package name */
        long f17983f;

        /* renamed from: g  reason: collision with root package name */
        long f17984g;

        /* renamed from: h  reason: collision with root package name */
        long f17985h;

        /* renamed from: i  reason: collision with root package name */
        long f17986i;

        /* renamed from: j  reason: collision with root package name */
        long f17987j;

        /* renamed from: k  reason: collision with root package name */
        long f17988k;

        /* renamed from: l  reason: collision with root package name */
        long f17989l;

        /* renamed from: m  reason: collision with root package name */
        long f17990m;

        /* renamed from: n  reason: collision with root package name */
        long f17991n;

        /* renamed from: o  reason: collision with root package name */
        long f17992o;

        /* renamed from: p  reason: collision with root package name */
        long f17993p;

        /* renamed from: q  reason: collision with root package name */
        long f17994q;

        /* renamed from: r  reason: collision with root package name */
        long f17995r;

        a(OsSchemaInfo osSchemaInfo) {
            super(14);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("PushNotificationsPreference");
            this.f17982e = a("unsubscribeFromAll", "unsubscribeFromAll", b10);
            this.f17983f = a(PushNotificationManager.PARTY_INVITE_PUSH_NOTIFICATION_KEY, PushNotificationManager.PARTY_INVITE_PUSH_NOTIFICATION_KEY, b10);
            this.f17984g = a("invitedQuest", "invitedQuest", b10);
            this.f17985h = a("majorUpdates", "majorUpdates", b10);
            this.f17986i = a(PushNotificationManager.WON_CHALLENGE_PUSH_NOTIFICATION_KEY, PushNotificationManager.WON_CHALLENGE_PUSH_NOTIFICATION_KEY, b10);
            this.f17987j = a(PushNotificationManager.GUILD_INVITE_PUSH_NOTIFICATION_KEY, PushNotificationManager.GUILD_INVITE_PUSH_NOTIFICATION_KEY, b10);
            this.f17988k = a(PushNotificationManager.RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY, PushNotificationManager.RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY, b10);
            this.f17989l = a(PushNotificationManager.QUEST_BEGUN_PUSH_NOTIFICATION_KEY, PushNotificationManager.QUEST_BEGUN_PUSH_NOTIFICATION_KEY, b10);
            this.f17990m = a(PushNotificationManager.RECEIVED_GEMS_PUSH_NOTIFICATION_KEY, PushNotificationManager.RECEIVED_GEMS_PUSH_NOTIFICATION_KEY, b10);
            this.f17991n = a(PushNotificationManager.RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY, PushNotificationManager.RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY, b10);
            this.f17992o = a("partyActivity", "partyActivity", b10);
            this.f17993p = a("mentionParty", "mentionParty", b10);
            this.f17994q = a("mentionJoinedGuild", "mentionJoinedGuild", b10);
            this.f17995r = a("mentionUnjoinedGuild", "mentionUnjoinedGuild", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17982e = aVar.f17982e;
            aVar2.f17983f = aVar.f17983f;
            aVar2.f17984g = aVar.f17984g;
            aVar2.f17985h = aVar.f17985h;
            aVar2.f17986i = aVar.f17986i;
            aVar2.f17987j = aVar.f17987j;
            aVar2.f17988k = aVar.f17988k;
            aVar2.f17989l = aVar.f17989l;
            aVar2.f17990m = aVar.f17990m;
            aVar2.f17991n = aVar.f17991n;
            aVar2.f17992o = aVar.f17992o;
            aVar2.f17993p = aVar.f17993p;
            aVar2.f17994q = aVar.f17994q;
            aVar2.f17995r = aVar.f17995r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m7() {
        this.f17981q.p();
    }

    public static PushNotificationsPreference c(o0 o0Var, a aVar, PushNotificationsPreference pushNotificationsPreference, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(pushNotificationsPreference);
        if (oVar != null) {
            return (PushNotificationsPreference) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(PushNotificationsPreference.class), set);
        osObjectBuilder.F0(aVar.f17982e, Boolean.valueOf(pushNotificationsPreference.realmGet$unsubscribeFromAll()));
        osObjectBuilder.F0(aVar.f17983f, Boolean.valueOf(pushNotificationsPreference.realmGet$invitedParty()));
        osObjectBuilder.F0(aVar.f17984g, Boolean.valueOf(pushNotificationsPreference.realmGet$invitedQuest()));
        osObjectBuilder.F0(aVar.f17985h, Boolean.valueOf(pushNotificationsPreference.realmGet$majorUpdates()));
        osObjectBuilder.F0(aVar.f17986i, Boolean.valueOf(pushNotificationsPreference.realmGet$wonChallenge()));
        osObjectBuilder.F0(aVar.f17987j, Boolean.valueOf(pushNotificationsPreference.realmGet$invitedGuild()));
        osObjectBuilder.F0(aVar.f17988k, Boolean.valueOf(pushNotificationsPreference.realmGet$newPM()));
        osObjectBuilder.F0(aVar.f17989l, Boolean.valueOf(pushNotificationsPreference.realmGet$questStarted()));
        osObjectBuilder.F0(aVar.f17990m, Boolean.valueOf(pushNotificationsPreference.realmGet$giftedGems()));
        osObjectBuilder.F0(aVar.f17991n, Boolean.valueOf(pushNotificationsPreference.realmGet$giftedSubscription()));
        osObjectBuilder.F0(aVar.f17992o, Boolean.valueOf(pushNotificationsPreference.realmGet$partyActivity()));
        osObjectBuilder.F0(aVar.f17993p, Boolean.valueOf(pushNotificationsPreference.realmGet$mentionParty()));
        osObjectBuilder.F0(aVar.f17994q, Boolean.valueOf(pushNotificationsPreference.realmGet$mentionJoinedGuild()));
        osObjectBuilder.F0(aVar.f17995r, Boolean.valueOf(pushNotificationsPreference.realmGet$mentionUnjoinedGuild()));
        m7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(pushNotificationsPreference, k10);
        return k10;
    }

    public static PushNotificationsPreference d(o0 o0Var, a aVar, PushNotificationsPreference pushNotificationsPreference, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((pushNotificationsPreference instanceof io.realm.internal.o) && !d1.isFrozen(pushNotificationsPreference)) {
            io.realm.internal.o oVar = (io.realm.internal.o) pushNotificationsPreference;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return pushNotificationsPreference;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(pushNotificationsPreference);
        if (oVar2 != null) {
            return (PushNotificationsPreference) oVar2;
        }
        return c(o0Var, aVar, pushNotificationsPreference, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static PushNotificationsPreference f(PushNotificationsPreference pushNotificationsPreference, int i10, int i11, Map<a1, o.a<a1>> map) {
        PushNotificationsPreference pushNotificationsPreference2;
        if (i10 <= i11 && pushNotificationsPreference != null) {
            o.a<a1> aVar = map.get(pushNotificationsPreference);
            if (aVar == null) {
                pushNotificationsPreference2 = new PushNotificationsPreference();
                map.put(pushNotificationsPreference, new o.a<>(i10, pushNotificationsPreference2));
            } else if (i10 >= aVar.f17831a) {
                return (PushNotificationsPreference) aVar.f17832b;
            } else {
                PushNotificationsPreference pushNotificationsPreference3 = (PushNotificationsPreference) aVar.f17832b;
                aVar.f17831a = i10;
                pushNotificationsPreference2 = pushNotificationsPreference3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) pushNotificationsPreference).b().f();
            pushNotificationsPreference2.realmSet$unsubscribeFromAll(pushNotificationsPreference.realmGet$unsubscribeFromAll());
            pushNotificationsPreference2.realmSet$invitedParty(pushNotificationsPreference.realmGet$invitedParty());
            pushNotificationsPreference2.realmSet$invitedQuest(pushNotificationsPreference.realmGet$invitedQuest());
            pushNotificationsPreference2.realmSet$majorUpdates(pushNotificationsPreference.realmGet$majorUpdates());
            pushNotificationsPreference2.realmSet$wonChallenge(pushNotificationsPreference.realmGet$wonChallenge());
            pushNotificationsPreference2.realmSet$invitedGuild(pushNotificationsPreference.realmGet$invitedGuild());
            pushNotificationsPreference2.realmSet$newPM(pushNotificationsPreference.realmGet$newPM());
            pushNotificationsPreference2.realmSet$questStarted(pushNotificationsPreference.realmGet$questStarted());
            pushNotificationsPreference2.realmSet$giftedGems(pushNotificationsPreference.realmGet$giftedGems());
            pushNotificationsPreference2.realmSet$giftedSubscription(pushNotificationsPreference.realmGet$giftedSubscription());
            pushNotificationsPreference2.realmSet$partyActivity(pushNotificationsPreference.realmGet$partyActivity());
            pushNotificationsPreference2.realmSet$mentionParty(pushNotificationsPreference.realmGet$mentionParty());
            pushNotificationsPreference2.realmSet$mentionJoinedGuild(pushNotificationsPreference.realmGet$mentionJoinedGuild());
            pushNotificationsPreference2.realmSet$mentionUnjoinedGuild(pushNotificationsPreference.realmGet$mentionUnjoinedGuild());
            return pushNotificationsPreference2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "PushNotificationsPreference", true, 14, 0);
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        bVar.b("", "unsubscribeFromAll", realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.PARTY_INVITE_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", "invitedQuest", realmFieldType, false, false, true);
        bVar.b("", "majorUpdates", realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.WON_CHALLENGE_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.GUILD_INVITE_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.QUEST_BEGUN_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.RECEIVED_GEMS_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", PushNotificationManager.RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY, realmFieldType, false, false, true);
        bVar.b("", "partyActivity", realmFieldType, false, false, true);
        bVar.b("", "mentionParty", realmFieldType, false, false, true);
        bVar.b("", "mentionJoinedGuild", realmFieldType, false, false, true);
        bVar.b("", "mentionUnjoinedGuild", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17979r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, PushNotificationsPreference pushNotificationsPreference, Map<a1, Long> map) {
        if ((pushNotificationsPreference instanceof io.realm.internal.o) && !d1.isFrozen(pushNotificationsPreference)) {
            io.realm.internal.o oVar = (io.realm.internal.o) pushNotificationsPreference;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(PushNotificationsPreference.class).getNativePtr();
        a aVar = (a) o0Var.R().e(PushNotificationsPreference.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(pushNotificationsPreference, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f17982e, createEmbeddedObject, pushNotificationsPreference.realmGet$unsubscribeFromAll(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17983f, createEmbeddedObject, pushNotificationsPreference.realmGet$invitedParty(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17984g, createEmbeddedObject, pushNotificationsPreference.realmGet$invitedQuest(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17985h, createEmbeddedObject, pushNotificationsPreference.realmGet$majorUpdates(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17986i, createEmbeddedObject, pushNotificationsPreference.realmGet$wonChallenge(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17987j, createEmbeddedObject, pushNotificationsPreference.realmGet$invitedGuild(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17988k, createEmbeddedObject, pushNotificationsPreference.realmGet$newPM(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17989l, createEmbeddedObject, pushNotificationsPreference.realmGet$questStarted(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17990m, createEmbeddedObject, pushNotificationsPreference.realmGet$giftedGems(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17991n, createEmbeddedObject, pushNotificationsPreference.realmGet$giftedSubscription(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17992o, createEmbeddedObject, pushNotificationsPreference.realmGet$partyActivity(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17993p, createEmbeddedObject, pushNotificationsPreference.realmGet$mentionParty(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17994q, createEmbeddedObject, pushNotificationsPreference.realmGet$mentionJoinedGuild(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17995r, createEmbeddedObject, pushNotificationsPreference.realmGet$mentionUnjoinedGuild(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(PushNotificationsPreference.class), false, Collections.emptyList());
        m7 m7Var = new m7();
        cVar.a();
        return m7Var;
    }

    static PushNotificationsPreference l(o0 o0Var, a aVar, PushNotificationsPreference pushNotificationsPreference, PushNotificationsPreference pushNotificationsPreference2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(PushNotificationsPreference.class), set);
        osObjectBuilder.F0(aVar.f17982e, Boolean.valueOf(pushNotificationsPreference2.realmGet$unsubscribeFromAll()));
        osObjectBuilder.F0(aVar.f17983f, Boolean.valueOf(pushNotificationsPreference2.realmGet$invitedParty()));
        osObjectBuilder.F0(aVar.f17984g, Boolean.valueOf(pushNotificationsPreference2.realmGet$invitedQuest()));
        osObjectBuilder.F0(aVar.f17985h, Boolean.valueOf(pushNotificationsPreference2.realmGet$majorUpdates()));
        osObjectBuilder.F0(aVar.f17986i, Boolean.valueOf(pushNotificationsPreference2.realmGet$wonChallenge()));
        osObjectBuilder.F0(aVar.f17987j, Boolean.valueOf(pushNotificationsPreference2.realmGet$invitedGuild()));
        osObjectBuilder.F0(aVar.f17988k, Boolean.valueOf(pushNotificationsPreference2.realmGet$newPM()));
        osObjectBuilder.F0(aVar.f17989l, Boolean.valueOf(pushNotificationsPreference2.realmGet$questStarted()));
        osObjectBuilder.F0(aVar.f17990m, Boolean.valueOf(pushNotificationsPreference2.realmGet$giftedGems()));
        osObjectBuilder.F0(aVar.f17991n, Boolean.valueOf(pushNotificationsPreference2.realmGet$giftedSubscription()));
        osObjectBuilder.F0(aVar.f17992o, Boolean.valueOf(pushNotificationsPreference2.realmGet$partyActivity()));
        osObjectBuilder.F0(aVar.f17993p, Boolean.valueOf(pushNotificationsPreference2.realmGet$mentionParty()));
        osObjectBuilder.F0(aVar.f17994q, Boolean.valueOf(pushNotificationsPreference2.realmGet$mentionJoinedGuild()));
        osObjectBuilder.F0(aVar.f17995r, Boolean.valueOf(pushNotificationsPreference2.realmGet$mentionUnjoinedGuild()));
        osObjectBuilder.f1((io.realm.internal.o) pushNotificationsPreference);
        return pushNotificationsPreference;
    }

    public static void n(o0 o0Var, PushNotificationsPreference pushNotificationsPreference, PushNotificationsPreference pushNotificationsPreference2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(PushNotificationsPreference.class), pushNotificationsPreference2, pushNotificationsPreference, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17981q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17980p = (a) cVar.c();
        l0<PushNotificationsPreference> l0Var = new l0<>(this);
        this.f17981q = l0Var;
        l0Var.r(cVar.e());
        this.f17981q.s(cVar.f());
        this.f17981q.o(cVar.b());
        this.f17981q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17981q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m7 m7Var = (m7) obj;
        io.realm.a f10 = this.f17981q.f();
        io.realm.a f11 = m7Var.f17981q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17981q.g().getTable().p();
        String p11 = m7Var.f17981q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17981q.g().getObjectKey() == m7Var.f17981q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17981q.f().getPath();
        String p10 = this.f17981q.g().getTable().p();
        long objectKey = this.f17981q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$giftedGems() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17990m);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$giftedSubscription() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17991n);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$invitedGuild() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17987j);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$invitedParty() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17983f);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$invitedQuest() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17984g);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$majorUpdates() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17985h);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$mentionJoinedGuild() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17994q);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$mentionParty() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17993p);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$mentionUnjoinedGuild() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17995r);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$newPM() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17988k);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$partyActivity() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17992o);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$questStarted() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17989l);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$unsubscribeFromAll() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17982e);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public boolean realmGet$wonChallenge() {
        this.f17981q.f().e();
        return this.f17981q.g().getBoolean(this.f17980p.f17986i);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$giftedGems(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17990m, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17990m, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$giftedSubscription(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17991n, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17991n, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$invitedGuild(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17987j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17987j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$invitedParty(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17983f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17983f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$invitedQuest(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17984g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17984g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$majorUpdates(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17985h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17985h, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$mentionJoinedGuild(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17994q, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17994q, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$mentionParty(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17993p, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17993p, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$mentionUnjoinedGuild(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17995r, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17995r, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$newPM(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17988k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17988k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$partyActivity(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17992o, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17992o, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$questStarted(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17989l, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17989l, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$unsubscribeFromAll(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17982e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17982e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.PushNotificationsPreference, io.realm.n7
    public void realmSet$wonChallenge(boolean z10) {
        if (this.f17981q.i()) {
            if (!this.f17981q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17981q.g();
            g10.getTable().z(this.f17980p.f17986i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17981q.f().e();
        this.f17981q.g().setBoolean(this.f17980p.f17986i, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "PushNotificationsPreference = proxy[{unsubscribeFromAll:" + realmGet$unsubscribeFromAll() + "},{invitedParty:" + realmGet$invitedParty() + "},{invitedQuest:" + realmGet$invitedQuest() + "},{majorUpdates:" + realmGet$majorUpdates() + "},{wonChallenge:" + realmGet$wonChallenge() + "},{invitedGuild:" + realmGet$invitedGuild() + "},{newPM:" + realmGet$newPM() + "},{questStarted:" + realmGet$questStarted() + "},{giftedGems:" + realmGet$giftedGems() + "},{giftedSubscription:" + realmGet$giftedSubscription() + "},{partyActivity:" + realmGet$partyActivity() + "},{mentionParty:" + realmGet$mentionParty() + "},{mentionJoinedGuild:" + realmGet$mentionJoinedGuild() + "},{mentionUnjoinedGuild:" + realmGet$mentionUnjoinedGuild() + "}]";
    }
}
