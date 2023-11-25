package io.realm;

import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.models.user.EmailNotificationsPreference;
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

/* compiled from: com_habitrpg_android_habitica_models_user_EmailNotificationsPreferenceRealmProxy.java */
/* loaded from: classes4.dex */
public class g6 extends EmailNotificationsPreference implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17570r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17571p;

    /* renamed from: q  reason: collision with root package name */
    private l0<EmailNotificationsPreference> f17572q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_EmailNotificationsPreferenceRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17573e;

        /* renamed from: f  reason: collision with root package name */
        long f17574f;

        /* renamed from: g  reason: collision with root package name */
        long f17575g;

        /* renamed from: h  reason: collision with root package name */
        long f17576h;

        /* renamed from: i  reason: collision with root package name */
        long f17577i;

        /* renamed from: j  reason: collision with root package name */
        long f17578j;

        /* renamed from: k  reason: collision with root package name */
        long f17579k;

        /* renamed from: l  reason: collision with root package name */
        long f17580l;

        /* renamed from: m  reason: collision with root package name */
        long f17581m;

        /* renamed from: n  reason: collision with root package name */
        long f17582n;

        /* renamed from: o  reason: collision with root package name */
        long f17583o;

        /* renamed from: p  reason: collision with root package name */
        long f17584p;

        /* renamed from: q  reason: collision with root package name */
        long f17585q;

        a(OsSchemaInfo osSchemaInfo) {
            super(13);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("EmailNotificationsPreference");
            this.f17573e = a("unsubscribeFromAll", "unsubscribeFromAll", b10);
            this.f17574f = a(PushNotificationManager.PARTY_INVITE_PUSH_NOTIFICATION_KEY, PushNotificationManager.PARTY_INVITE_PUSH_NOTIFICATION_KEY, b10);
            this.f17575g = a("invitedQuest", "invitedQuest", b10);
            this.f17576h = a("majorUpdates", "majorUpdates", b10);
            this.f17577i = a(PushNotificationManager.WON_CHALLENGE_PUSH_NOTIFICATION_KEY, PushNotificationManager.WON_CHALLENGE_PUSH_NOTIFICATION_KEY, b10);
            this.f17578j = a(PushNotificationManager.GUILD_INVITE_PUSH_NOTIFICATION_KEY, PushNotificationManager.GUILD_INVITE_PUSH_NOTIFICATION_KEY, b10);
            this.f17579k = a(PushNotificationManager.RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY, PushNotificationManager.RECEIVED_PRIVATE_MESSAGE_PUSH_NOTIFICATION_KEY, b10);
            this.f17580l = a(PushNotificationManager.QUEST_BEGUN_PUSH_NOTIFICATION_KEY, PushNotificationManager.QUEST_BEGUN_PUSH_NOTIFICATION_KEY, b10);
            this.f17581m = a(PushNotificationManager.RECEIVED_GEMS_PUSH_NOTIFICATION_KEY, PushNotificationManager.RECEIVED_GEMS_PUSH_NOTIFICATION_KEY, b10);
            this.f17582n = a(PushNotificationManager.RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY, PushNotificationManager.RECEIVED_SUBSCRIPTION_GIFT_PUSH_NOTIFICATION_KEY, b10);
            this.f17583o = a("subscriptionReminders", "subscriptionReminders", b10);
            this.f17584p = a("onboarding", "onboarding", b10);
            this.f17585q = a("kickedGroup", "kickedGroup", b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17573e = aVar.f17573e;
            aVar2.f17574f = aVar.f17574f;
            aVar2.f17575g = aVar.f17575g;
            aVar2.f17576h = aVar.f17576h;
            aVar2.f17577i = aVar.f17577i;
            aVar2.f17578j = aVar.f17578j;
            aVar2.f17579k = aVar.f17579k;
            aVar2.f17580l = aVar.f17580l;
            aVar2.f17581m = aVar.f17581m;
            aVar2.f17582n = aVar.f17582n;
            aVar2.f17583o = aVar.f17583o;
            aVar2.f17584p = aVar.f17584p;
            aVar2.f17585q = aVar.f17585q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g6() {
        this.f17572q.p();
    }

    public static EmailNotificationsPreference c(o0 o0Var, a aVar, EmailNotificationsPreference emailNotificationsPreference, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(emailNotificationsPreference);
        if (oVar != null) {
            return (EmailNotificationsPreference) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(EmailNotificationsPreference.class), set);
        osObjectBuilder.F0(aVar.f17573e, Boolean.valueOf(emailNotificationsPreference.realmGet$unsubscribeFromAll()));
        osObjectBuilder.F0(aVar.f17574f, Boolean.valueOf(emailNotificationsPreference.realmGet$invitedParty()));
        osObjectBuilder.F0(aVar.f17575g, Boolean.valueOf(emailNotificationsPreference.realmGet$invitedQuest()));
        osObjectBuilder.F0(aVar.f17576h, Boolean.valueOf(emailNotificationsPreference.realmGet$majorUpdates()));
        osObjectBuilder.F0(aVar.f17577i, Boolean.valueOf(emailNotificationsPreference.realmGet$wonChallenge()));
        osObjectBuilder.F0(aVar.f17578j, Boolean.valueOf(emailNotificationsPreference.realmGet$invitedGuild()));
        osObjectBuilder.F0(aVar.f17579k, Boolean.valueOf(emailNotificationsPreference.realmGet$newPM()));
        osObjectBuilder.F0(aVar.f17580l, Boolean.valueOf(emailNotificationsPreference.realmGet$questStarted()));
        osObjectBuilder.F0(aVar.f17581m, Boolean.valueOf(emailNotificationsPreference.realmGet$giftedGems()));
        osObjectBuilder.F0(aVar.f17582n, Boolean.valueOf(emailNotificationsPreference.realmGet$giftedSubscription()));
        osObjectBuilder.F0(aVar.f17583o, Boolean.valueOf(emailNotificationsPreference.realmGet$subscriptionReminders()));
        osObjectBuilder.F0(aVar.f17584p, Boolean.valueOf(emailNotificationsPreference.realmGet$onboarding()));
        osObjectBuilder.F0(aVar.f17585q, Boolean.valueOf(emailNotificationsPreference.realmGet$kickedGroup()));
        g6 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(emailNotificationsPreference, k10);
        return k10;
    }

    public static EmailNotificationsPreference d(o0 o0Var, a aVar, EmailNotificationsPreference emailNotificationsPreference, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((emailNotificationsPreference instanceof io.realm.internal.o) && !d1.isFrozen(emailNotificationsPreference)) {
            io.realm.internal.o oVar = (io.realm.internal.o) emailNotificationsPreference;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return emailNotificationsPreference;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(emailNotificationsPreference);
        if (oVar2 != null) {
            return (EmailNotificationsPreference) oVar2;
        }
        return c(o0Var, aVar, emailNotificationsPreference, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static EmailNotificationsPreference f(EmailNotificationsPreference emailNotificationsPreference, int i10, int i11, Map<a1, o.a<a1>> map) {
        EmailNotificationsPreference emailNotificationsPreference2;
        if (i10 <= i11 && emailNotificationsPreference != null) {
            o.a<a1> aVar = map.get(emailNotificationsPreference);
            if (aVar == null) {
                emailNotificationsPreference2 = new EmailNotificationsPreference();
                map.put(emailNotificationsPreference, new o.a<>(i10, emailNotificationsPreference2));
            } else if (i10 >= aVar.f17831a) {
                return (EmailNotificationsPreference) aVar.f17832b;
            } else {
                EmailNotificationsPreference emailNotificationsPreference3 = (EmailNotificationsPreference) aVar.f17832b;
                aVar.f17831a = i10;
                emailNotificationsPreference2 = emailNotificationsPreference3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) emailNotificationsPreference).b().f();
            emailNotificationsPreference2.realmSet$unsubscribeFromAll(emailNotificationsPreference.realmGet$unsubscribeFromAll());
            emailNotificationsPreference2.realmSet$invitedParty(emailNotificationsPreference.realmGet$invitedParty());
            emailNotificationsPreference2.realmSet$invitedQuest(emailNotificationsPreference.realmGet$invitedQuest());
            emailNotificationsPreference2.realmSet$majorUpdates(emailNotificationsPreference.realmGet$majorUpdates());
            emailNotificationsPreference2.realmSet$wonChallenge(emailNotificationsPreference.realmGet$wonChallenge());
            emailNotificationsPreference2.realmSet$invitedGuild(emailNotificationsPreference.realmGet$invitedGuild());
            emailNotificationsPreference2.realmSet$newPM(emailNotificationsPreference.realmGet$newPM());
            emailNotificationsPreference2.realmSet$questStarted(emailNotificationsPreference.realmGet$questStarted());
            emailNotificationsPreference2.realmSet$giftedGems(emailNotificationsPreference.realmGet$giftedGems());
            emailNotificationsPreference2.realmSet$giftedSubscription(emailNotificationsPreference.realmGet$giftedSubscription());
            emailNotificationsPreference2.realmSet$subscriptionReminders(emailNotificationsPreference.realmGet$subscriptionReminders());
            emailNotificationsPreference2.realmSet$onboarding(emailNotificationsPreference.realmGet$onboarding());
            emailNotificationsPreference2.realmSet$kickedGroup(emailNotificationsPreference.realmGet$kickedGroup());
            return emailNotificationsPreference2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "EmailNotificationsPreference", true, 13, 0);
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
        bVar.b("", "subscriptionReminders", realmFieldType, false, false, true);
        bVar.b("", "onboarding", realmFieldType, false, false, true);
        bVar.b("", "kickedGroup", realmFieldType, false, false, true);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17570r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, EmailNotificationsPreference emailNotificationsPreference, Map<a1, Long> map) {
        if ((emailNotificationsPreference instanceof io.realm.internal.o) && !d1.isFrozen(emailNotificationsPreference)) {
            io.realm.internal.o oVar = (io.realm.internal.o) emailNotificationsPreference;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        long nativePtr = o0Var.c1(EmailNotificationsPreference.class).getNativePtr();
        a aVar = (a) o0Var.R().e(EmailNotificationsPreference.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(emailNotificationsPreference, Long.valueOf(createEmbeddedObject));
        Table.nativeSetBoolean(nativePtr, aVar.f17573e, createEmbeddedObject, emailNotificationsPreference.realmGet$unsubscribeFromAll(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17574f, createEmbeddedObject, emailNotificationsPreference.realmGet$invitedParty(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17575g, createEmbeddedObject, emailNotificationsPreference.realmGet$invitedQuest(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17576h, createEmbeddedObject, emailNotificationsPreference.realmGet$majorUpdates(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17577i, createEmbeddedObject, emailNotificationsPreference.realmGet$wonChallenge(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17578j, createEmbeddedObject, emailNotificationsPreference.realmGet$invitedGuild(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17579k, createEmbeddedObject, emailNotificationsPreference.realmGet$newPM(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17580l, createEmbeddedObject, emailNotificationsPreference.realmGet$questStarted(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17581m, createEmbeddedObject, emailNotificationsPreference.realmGet$giftedGems(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17582n, createEmbeddedObject, emailNotificationsPreference.realmGet$giftedSubscription(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17583o, createEmbeddedObject, emailNotificationsPreference.realmGet$subscriptionReminders(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17584p, createEmbeddedObject, emailNotificationsPreference.realmGet$onboarding(), false);
        Table.nativeSetBoolean(nativePtr, aVar.f17585q, createEmbeddedObject, emailNotificationsPreference.realmGet$kickedGroup(), false);
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g6 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(EmailNotificationsPreference.class), false, Collections.emptyList());
        g6 g6Var = new g6();
        cVar.a();
        return g6Var;
    }

    static EmailNotificationsPreference l(o0 o0Var, a aVar, EmailNotificationsPreference emailNotificationsPreference, EmailNotificationsPreference emailNotificationsPreference2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(EmailNotificationsPreference.class), set);
        osObjectBuilder.F0(aVar.f17573e, Boolean.valueOf(emailNotificationsPreference2.realmGet$unsubscribeFromAll()));
        osObjectBuilder.F0(aVar.f17574f, Boolean.valueOf(emailNotificationsPreference2.realmGet$invitedParty()));
        osObjectBuilder.F0(aVar.f17575g, Boolean.valueOf(emailNotificationsPreference2.realmGet$invitedQuest()));
        osObjectBuilder.F0(aVar.f17576h, Boolean.valueOf(emailNotificationsPreference2.realmGet$majorUpdates()));
        osObjectBuilder.F0(aVar.f17577i, Boolean.valueOf(emailNotificationsPreference2.realmGet$wonChallenge()));
        osObjectBuilder.F0(aVar.f17578j, Boolean.valueOf(emailNotificationsPreference2.realmGet$invitedGuild()));
        osObjectBuilder.F0(aVar.f17579k, Boolean.valueOf(emailNotificationsPreference2.realmGet$newPM()));
        osObjectBuilder.F0(aVar.f17580l, Boolean.valueOf(emailNotificationsPreference2.realmGet$questStarted()));
        osObjectBuilder.F0(aVar.f17581m, Boolean.valueOf(emailNotificationsPreference2.realmGet$giftedGems()));
        osObjectBuilder.F0(aVar.f17582n, Boolean.valueOf(emailNotificationsPreference2.realmGet$giftedSubscription()));
        osObjectBuilder.F0(aVar.f17583o, Boolean.valueOf(emailNotificationsPreference2.realmGet$subscriptionReminders()));
        osObjectBuilder.F0(aVar.f17584p, Boolean.valueOf(emailNotificationsPreference2.realmGet$onboarding()));
        osObjectBuilder.F0(aVar.f17585q, Boolean.valueOf(emailNotificationsPreference2.realmGet$kickedGroup()));
        osObjectBuilder.f1((io.realm.internal.o) emailNotificationsPreference);
        return emailNotificationsPreference;
    }

    public static void n(o0 o0Var, EmailNotificationsPreference emailNotificationsPreference, EmailNotificationsPreference emailNotificationsPreference2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(EmailNotificationsPreference.class), emailNotificationsPreference2, emailNotificationsPreference, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17572q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17571p = (a) cVar.c();
        l0<EmailNotificationsPreference> l0Var = new l0<>(this);
        this.f17572q = l0Var;
        l0Var.r(cVar.e());
        this.f17572q.s(cVar.f());
        this.f17572q.o(cVar.b());
        this.f17572q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17572q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g6 g6Var = (g6) obj;
        io.realm.a f10 = this.f17572q.f();
        io.realm.a f11 = g6Var.f17572q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17572q.g().getTable().p();
        String p11 = g6Var.f17572q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17572q.g().getObjectKey() == g6Var.f17572q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17572q.f().getPath();
        String p10 = this.f17572q.g().getTable().p();
        long objectKey = this.f17572q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$giftedGems() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17581m);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$giftedSubscription() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17582n);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$invitedGuild() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17578j);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$invitedParty() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17574f);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$invitedQuest() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17575g);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$kickedGroup() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17585q);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$majorUpdates() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17576h);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$newPM() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17579k);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$onboarding() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17584p);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$questStarted() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17580l);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$subscriptionReminders() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17583o);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$unsubscribeFromAll() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17573e);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public boolean realmGet$wonChallenge() {
        this.f17572q.f().e();
        return this.f17572q.g().getBoolean(this.f17571p.f17577i);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$giftedGems(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17581m, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17581m, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$giftedSubscription(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17582n, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17582n, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$invitedGuild(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17578j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17578j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$invitedParty(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17574f, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17574f, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$invitedQuest(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17575g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17575g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$kickedGroup(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17585q, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17585q, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$majorUpdates(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17576h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17576h, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$newPM(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17579k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17579k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$onboarding(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17584p, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17584p, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$questStarted(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17580l, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17580l, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$subscriptionReminders(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17583o, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17583o, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$unsubscribeFromAll(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17573e, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17573e, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.EmailNotificationsPreference, io.realm.h6
    public void realmSet$wonChallenge(boolean z10) {
        if (this.f17572q.i()) {
            if (!this.f17572q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17572q.g();
            g10.getTable().z(this.f17571p.f17577i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17572q.f().e();
        this.f17572q.g().setBoolean(this.f17571p.f17577i, z10);
    }

    public String toString() {
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        return "EmailNotificationsPreference = proxy[{unsubscribeFromAll:" + realmGet$unsubscribeFromAll() + "},{invitedParty:" + realmGet$invitedParty() + "},{invitedQuest:" + realmGet$invitedQuest() + "},{majorUpdates:" + realmGet$majorUpdates() + "},{wonChallenge:" + realmGet$wonChallenge() + "},{invitedGuild:" + realmGet$invitedGuild() + "},{newPM:" + realmGet$newPM() + "},{questStarted:" + realmGet$questStarted() + "},{giftedGems:" + realmGet$giftedGems() + "},{giftedSubscription:" + realmGet$giftedSubscription() + "},{subscriptionReminders:" + realmGet$subscriptionReminders() + "},{onboarding:" + realmGet$onboarding() + "},{kickedGroup:" + realmGet$kickedGroup() + "}]";
    }
}
