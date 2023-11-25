package io.realm;

import com.habitrpg.android.habitica.models.user.EmailNotificationsPreference;
import com.habitrpg.android.habitica.models.user.Hair;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.PushNotificationsPreference;
import com.habitrpg.android.habitica.models.user.SuppressedModals;
import com.habitrpg.android.habitica.models.user.UserTaskPreferences;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import io.realm.a;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.o;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com_habitrpg_android_habitica_models_user_PreferencesRealmProxy.java */
/* loaded from: classes4.dex */
public class g7 extends Preferences implements io.realm.internal.o {

    /* renamed from: r  reason: collision with root package name */
    private static final OsObjectSchemaInfo f17586r = g();

    /* renamed from: p  reason: collision with root package name */
    private a f17587p;

    /* renamed from: q  reason: collision with root package name */
    private l0<Preferences> f17588q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com_habitrpg_android_habitica_models_user_PreferencesRealmProxy.java */
    /* loaded from: classes4.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        long f17589e;

        /* renamed from: f  reason: collision with root package name */
        long f17590f;

        /* renamed from: g  reason: collision with root package name */
        long f17591g;

        /* renamed from: h  reason: collision with root package name */
        long f17592h;

        /* renamed from: i  reason: collision with root package name */
        long f17593i;

        /* renamed from: j  reason: collision with root package name */
        long f17594j;

        /* renamed from: k  reason: collision with root package name */
        long f17595k;

        /* renamed from: l  reason: collision with root package name */
        long f17596l;

        /* renamed from: m  reason: collision with root package name */
        long f17597m;

        /* renamed from: n  reason: collision with root package name */
        long f17598n;

        /* renamed from: o  reason: collision with root package name */
        long f17599o;

        /* renamed from: p  reason: collision with root package name */
        long f17600p;

        /* renamed from: q  reason: collision with root package name */
        long f17601q;

        /* renamed from: r  reason: collision with root package name */
        long f17602r;

        /* renamed from: s  reason: collision with root package name */
        long f17603s;

        /* renamed from: t  reason: collision with root package name */
        long f17604t;

        /* renamed from: u  reason: collision with root package name */
        long f17605u;

        /* renamed from: v  reason: collision with root package name */
        long f17606v;

        /* renamed from: w  reason: collision with root package name */
        long f17607w;

        /* renamed from: x  reason: collision with root package name */
        long f17608x;

        /* renamed from: y  reason: collision with root package name */
        long f17609y;

        /* renamed from: z  reason: collision with root package name */
        long f17610z;

        a(OsSchemaInfo osSchemaInfo) {
            super(22);
            OsObjectSchemaInfo b10 = osSchemaInfo.b("Preferences");
            this.f17589e = a("hair", "hair", b10);
            this.f17590f = a("suppressModals", "suppressModals", b10);
            this.f17591g = a("costume", "costume", b10);
            this.f17592h = a("disableClasses", "disableClasses", b10);
            this.f17593i = a("sleep", "sleep", b10);
            this.f17594j = a("dailyDueDefaultView", "dailyDueDefaultView", b10);
            this.f17595k = a("automaticAllocation", "automaticAllocation", b10);
            this.f17596l = a("allocationMode", "allocationMode", b10);
            this.f17597m = a("shirt", "shirt", b10);
            this.f17598n = a("skin", "skin", b10);
            this.f17599o = a("size", "size", b10);
            this.f17600p = a("background", "background", b10);
            this.f17601q = a("chair", "chair", b10);
            this.f17602r = a("language", "language", b10);
            this.f17603s = a("sound", "sound", b10);
            this.f17604t = a("dayStart", "dayStart", b10);
            this.f17605u = a("timezoneOffset", "timezoneOffset", b10);
            this.f17606v = a("timezoneOffsetAtLastCron", "timezoneOffsetAtLastCron", b10);
            this.f17607w = a("pushNotifications", "pushNotifications", b10);
            this.f17608x = a("emailNotifications", "emailNotifications", b10);
            this.f17609y = a("autoEquip", "autoEquip", b10);
            this.f17610z = a(NavigationDrawerFragment.SIDEBAR_TASKS, NavigationDrawerFragment.SIDEBAR_TASKS, b10);
        }

        @Override // io.realm.internal.c
        protected final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f17589e = aVar.f17589e;
            aVar2.f17590f = aVar.f17590f;
            aVar2.f17591g = aVar.f17591g;
            aVar2.f17592h = aVar.f17592h;
            aVar2.f17593i = aVar.f17593i;
            aVar2.f17594j = aVar.f17594j;
            aVar2.f17595k = aVar.f17595k;
            aVar2.f17596l = aVar.f17596l;
            aVar2.f17597m = aVar.f17597m;
            aVar2.f17598n = aVar.f17598n;
            aVar2.f17599o = aVar.f17599o;
            aVar2.f17600p = aVar.f17600p;
            aVar2.f17601q = aVar.f17601q;
            aVar2.f17602r = aVar.f17602r;
            aVar2.f17603s = aVar.f17603s;
            aVar2.f17604t = aVar.f17604t;
            aVar2.f17605u = aVar.f17605u;
            aVar2.f17606v = aVar.f17606v;
            aVar2.f17607w = aVar.f17607w;
            aVar2.f17608x = aVar.f17608x;
            aVar2.f17609y = aVar.f17609y;
            aVar2.f17610z = aVar.f17610z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g7() {
        this.f17588q.p();
    }

    public static Preferences c(o0 o0Var, a aVar, Preferences preferences, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        io.realm.internal.o oVar = map.get(preferences);
        if (oVar != null) {
            return (Preferences) oVar;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Preferences.class), set);
        osObjectBuilder.F0(aVar.f17591g, Boolean.valueOf(preferences.realmGet$costume()));
        osObjectBuilder.F0(aVar.f17592h, Boolean.valueOf(preferences.realmGet$disableClasses()));
        osObjectBuilder.F0(aVar.f17593i, Boolean.valueOf(preferences.realmGet$sleep()));
        osObjectBuilder.F0(aVar.f17594j, Boolean.valueOf(preferences.realmGet$dailyDueDefaultView()));
        osObjectBuilder.F0(aVar.f17595k, Boolean.valueOf(preferences.realmGet$automaticAllocation()));
        osObjectBuilder.c1(aVar.f17596l, preferences.realmGet$allocationMode());
        osObjectBuilder.c1(aVar.f17597m, preferences.realmGet$shirt());
        osObjectBuilder.c1(aVar.f17598n, preferences.realmGet$skin());
        osObjectBuilder.c1(aVar.f17599o, preferences.realmGet$size());
        osObjectBuilder.c1(aVar.f17600p, preferences.realmGet$background());
        osObjectBuilder.c1(aVar.f17601q, preferences.realmGet$chair());
        osObjectBuilder.c1(aVar.f17602r, preferences.realmGet$language());
        osObjectBuilder.c1(aVar.f17603s, preferences.realmGet$sound());
        osObjectBuilder.V0(aVar.f17604t, Integer.valueOf(preferences.realmGet$dayStart()));
        osObjectBuilder.V0(aVar.f17605u, Integer.valueOf(preferences.realmGet$timezoneOffset()));
        osObjectBuilder.V0(aVar.f17606v, Integer.valueOf(preferences.realmGet$timezoneOffsetAtLastCron()));
        osObjectBuilder.F0(aVar.f17609y, Boolean.valueOf(preferences.realmGet$autoEquip()));
        g7 k10 = k(o0Var, osObjectBuilder.e1());
        map.put(preferences, k10);
        Hair realmGet$hair = preferences.realmGet$hair();
        if (realmGet$hair == null) {
            k10.realmSet$hair(null);
        } else if (((Hair) map.get(realmGet$hair)) == null) {
            o6 k11 = o6.k(o0Var, o0Var.c1(Hair.class).s(k10.b().g().createEmbeddedObject(aVar.f17589e, RealmFieldType.OBJECT)));
            map.put(realmGet$hair, k11);
            o6.n(o0Var, realmGet$hair, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachehair.toString()");
        }
        SuppressedModals realmGet$suppressModals = preferences.realmGet$suppressModals();
        if (realmGet$suppressModals == null) {
            k10.realmSet$suppressModals(null);
        } else if (((SuppressedModals) map.get(realmGet$suppressModals)) == null) {
            u7 k12 = u7.k(o0Var, o0Var.c1(SuppressedModals.class).s(k10.b().g().createEmbeddedObject(aVar.f17590f, RealmFieldType.OBJECT)));
            map.put(realmGet$suppressModals, k12);
            u7.n(o0Var, realmGet$suppressModals, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachesuppressModals.toString()");
        }
        PushNotificationsPreference realmGet$pushNotifications = preferences.realmGet$pushNotifications();
        if (realmGet$pushNotifications == null) {
            k10.realmSet$pushNotifications(null);
        } else if (((PushNotificationsPreference) map.get(realmGet$pushNotifications)) == null) {
            m7 k13 = m7.k(o0Var, o0Var.c1(PushNotificationsPreference.class).s(k10.b().g().createEmbeddedObject(aVar.f17607w, RealmFieldType.OBJECT)));
            map.put(realmGet$pushNotifications, k13);
            m7.n(o0Var, realmGet$pushNotifications, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepushNotifications.toString()");
        }
        EmailNotificationsPreference realmGet$emailNotifications = preferences.realmGet$emailNotifications();
        if (realmGet$emailNotifications == null) {
            k10.realmSet$emailNotifications(null);
        } else if (((EmailNotificationsPreference) map.get(realmGet$emailNotifications)) == null) {
            g6 k14 = g6.k(o0Var, o0Var.c1(EmailNotificationsPreference.class).s(k10.b().g().createEmbeddedObject(aVar.f17608x, RealmFieldType.OBJECT)));
            map.put(realmGet$emailNotifications, k14);
            g6.n(o0Var, realmGet$emailNotifications, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheemailNotifications.toString()");
        }
        UserTaskPreferences realmGet$tasks = preferences.realmGet$tasks();
        if (realmGet$tasks == null) {
            k10.realmSet$tasks(null);
        } else if (((UserTaskPreferences) map.get(realmGet$tasks)) == null) {
            c8 k15 = c8.k(o0Var, o0Var.c1(UserTaskPreferences.class).s(k10.b().g().createEmbeddedObject(aVar.f17610z, RealmFieldType.OBJECT)));
            map.put(realmGet$tasks, k15);
            c8.n(o0Var, realmGet$tasks, k15, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetasks.toString()");
        }
        return k10;
    }

    public static Preferences d(o0 o0Var, a aVar, Preferences preferences, boolean z10, Map<a1, io.realm.internal.o> map, Set<v> set) {
        if ((preferences instanceof io.realm.internal.o) && !d1.isFrozen(preferences)) {
            io.realm.internal.o oVar = (io.realm.internal.o) preferences;
            if (oVar.b().f() != null) {
                io.realm.a f10 = oVar.b().f();
                if (f10.f17239m == o0Var.f17239m) {
                    if (f10.getPath().equals(o0Var.getPath())) {
                        return preferences;
                    }
                } else {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                }
            }
        }
        io.realm.a.f17237x.get();
        io.realm.internal.o oVar2 = map.get(preferences);
        if (oVar2 != null) {
            return (Preferences) oVar2;
        }
        return c(o0Var, aVar, preferences, z10, map, set);
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static Preferences f(Preferences preferences, int i10, int i11, Map<a1, o.a<a1>> map) {
        Preferences preferences2;
        if (i10 <= i11 && preferences != null) {
            o.a<a1> aVar = map.get(preferences);
            if (aVar == null) {
                preferences2 = new Preferences();
                map.put(preferences, new o.a<>(i10, preferences2));
            } else if (i10 >= aVar.f17831a) {
                return (Preferences) aVar.f17832b;
            } else {
                Preferences preferences3 = (Preferences) aVar.f17832b;
                aVar.f17831a = i10;
                preferences2 = preferences3;
            }
            o0 o0Var = (o0) ((io.realm.internal.o) preferences).b().f();
            int i12 = i10 + 1;
            preferences2.realmSet$hair(o6.f(preferences.realmGet$hair(), i12, i11, map));
            preferences2.realmSet$suppressModals(u7.f(preferences.realmGet$suppressModals(), i12, i11, map));
            preferences2.realmSet$costume(preferences.realmGet$costume());
            preferences2.realmSet$disableClasses(preferences.realmGet$disableClasses());
            preferences2.realmSet$sleep(preferences.realmGet$sleep());
            preferences2.realmSet$dailyDueDefaultView(preferences.realmGet$dailyDueDefaultView());
            preferences2.realmSet$automaticAllocation(preferences.realmGet$automaticAllocation());
            preferences2.realmSet$allocationMode(preferences.realmGet$allocationMode());
            preferences2.realmSet$shirt(preferences.realmGet$shirt());
            preferences2.realmSet$skin(preferences.realmGet$skin());
            preferences2.realmSet$size(preferences.realmGet$size());
            preferences2.realmSet$background(preferences.realmGet$background());
            preferences2.realmSet$chair(preferences.realmGet$chair());
            preferences2.realmSet$language(preferences.realmGet$language());
            preferences2.realmSet$sound(preferences.realmGet$sound());
            preferences2.realmSet$dayStart(preferences.realmGet$dayStart());
            preferences2.realmSet$timezoneOffset(preferences.realmGet$timezoneOffset());
            preferences2.realmSet$timezoneOffsetAtLastCron(preferences.realmGet$timezoneOffsetAtLastCron());
            preferences2.realmSet$pushNotifications(m7.f(preferences.realmGet$pushNotifications(), i12, i11, map));
            preferences2.realmSet$emailNotifications(g6.f(preferences.realmGet$emailNotifications(), i12, i11, map));
            preferences2.realmSet$autoEquip(preferences.realmGet$autoEquip());
            preferences2.realmSet$tasks(c8.f(preferences.realmGet$tasks(), i12, i11, map));
            return preferences2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "Preferences", true, 22, 0);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        bVar.a("", "hair", realmFieldType, "Hair");
        bVar.a("", "suppressModals", realmFieldType, "SuppressedModals");
        RealmFieldType realmFieldType2 = RealmFieldType.BOOLEAN;
        bVar.b("", "costume", realmFieldType2, false, false, true);
        bVar.b("", "disableClasses", realmFieldType2, false, false, true);
        bVar.b("", "sleep", realmFieldType2, false, false, true);
        bVar.b("", "dailyDueDefaultView", realmFieldType2, false, false, true);
        bVar.b("", "automaticAllocation", realmFieldType2, false, false, true);
        RealmFieldType realmFieldType3 = RealmFieldType.STRING;
        bVar.b("", "allocationMode", realmFieldType3, false, false, false);
        bVar.b("", "shirt", realmFieldType3, false, false, false);
        bVar.b("", "skin", realmFieldType3, false, false, false);
        bVar.b("", "size", realmFieldType3, false, false, false);
        bVar.b("", "background", realmFieldType3, false, false, false);
        bVar.b("", "chair", realmFieldType3, false, false, false);
        bVar.b("", "language", realmFieldType3, false, false, false);
        bVar.b("", "sound", realmFieldType3, false, false, false);
        RealmFieldType realmFieldType4 = RealmFieldType.INTEGER;
        bVar.b("", "dayStart", realmFieldType4, false, false, true);
        bVar.b("", "timezoneOffset", realmFieldType4, false, false, true);
        bVar.b("", "timezoneOffsetAtLastCron", realmFieldType4, false, false, true);
        bVar.a("", "pushNotifications", realmFieldType, "PushNotificationsPreference");
        bVar.a("", "emailNotifications", realmFieldType, "EmailNotificationsPreference");
        bVar.b("", "autoEquip", realmFieldType2, false, false, true);
        bVar.a("", NavigationDrawerFragment.SIDEBAR_TASKS, realmFieldType, "UserTaskPreferences");
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return f17586r;
    }

    public static long i(o0 o0Var, Table table, long j10, long j11, Preferences preferences, Map<a1, Long> map) {
        String str;
        a aVar;
        String str2;
        a aVar2;
        if ((preferences instanceof io.realm.internal.o) && !d1.isFrozen(preferences)) {
            io.realm.internal.o oVar = (io.realm.internal.o) preferences;
            if (oVar.b().f() != null && oVar.b().f().getPath().equals(o0Var.getPath())) {
                return oVar.b().g().getObjectKey();
            }
        }
        Table c12 = o0Var.c1(Preferences.class);
        long nativePtr = c12.getNativePtr();
        a aVar3 = (a) o0Var.R().e(Preferences.class);
        long createEmbeddedObject = OsObject.createEmbeddedObject(table, j11, j10);
        map.put(preferences, Long.valueOf(createEmbeddedObject));
        Hair realmGet$hair = preferences.realmGet$hair();
        if (realmGet$hair != null) {
            Long l10 = map.get(realmGet$hair);
            if (l10 == null) {
                o6.i(o0Var, c12, aVar3.f17589e, createEmbeddedObject, realmGet$hair, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l10.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar3.f17589e, createEmbeddedObject);
        }
        SuppressedModals realmGet$suppressModals = preferences.realmGet$suppressModals();
        if (realmGet$suppressModals != null) {
            Long l11 = map.get(realmGet$suppressModals);
            if (l11 == null) {
                u7.i(o0Var, c12, aVar3.f17590f, createEmbeddedObject, realmGet$suppressModals, map);
            } else {
                throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: " + l11.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar3.f17590f, createEmbeddedObject);
        }
        Table.nativeSetBoolean(nativePtr, aVar3.f17591g, createEmbeddedObject, preferences.realmGet$costume(), false);
        Table.nativeSetBoolean(nativePtr, aVar3.f17592h, createEmbeddedObject, preferences.realmGet$disableClasses(), false);
        Table.nativeSetBoolean(nativePtr, aVar3.f17593i, createEmbeddedObject, preferences.realmGet$sleep(), false);
        Table.nativeSetBoolean(nativePtr, aVar3.f17594j, createEmbeddedObject, preferences.realmGet$dailyDueDefaultView(), false);
        Table.nativeSetBoolean(nativePtr, aVar3.f17595k, createEmbeddedObject, preferences.realmGet$automaticAllocation(), false);
        String realmGet$allocationMode = preferences.realmGet$allocationMode();
        if (realmGet$allocationMode != null) {
            Table.nativeSetString(nativePtr, aVar3.f17596l, createEmbeddedObject, realmGet$allocationMode, false);
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar = aVar3;
        } else {
            long j12 = aVar3.f17596l;
            str = "Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: ";
            aVar = aVar3;
            Table.nativeSetNull(nativePtr, j12, createEmbeddedObject, false);
        }
        String realmGet$shirt = preferences.realmGet$shirt();
        if (realmGet$shirt != null) {
            Table.nativeSetString(nativePtr, aVar.f17597m, createEmbeddedObject, realmGet$shirt, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17597m, createEmbeddedObject, false);
        }
        String realmGet$skin = preferences.realmGet$skin();
        if (realmGet$skin != null) {
            Table.nativeSetString(nativePtr, aVar.f17598n, createEmbeddedObject, realmGet$skin, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17598n, createEmbeddedObject, false);
        }
        String realmGet$size = preferences.realmGet$size();
        if (realmGet$size != null) {
            Table.nativeSetString(nativePtr, aVar.f17599o, createEmbeddedObject, realmGet$size, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17599o, createEmbeddedObject, false);
        }
        String realmGet$background = preferences.realmGet$background();
        if (realmGet$background != null) {
            Table.nativeSetString(nativePtr, aVar.f17600p, createEmbeddedObject, realmGet$background, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17600p, createEmbeddedObject, false);
        }
        String realmGet$chair = preferences.realmGet$chair();
        if (realmGet$chair != null) {
            Table.nativeSetString(nativePtr, aVar.f17601q, createEmbeddedObject, realmGet$chair, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17601q, createEmbeddedObject, false);
        }
        String realmGet$language = preferences.realmGet$language();
        if (realmGet$language != null) {
            Table.nativeSetString(nativePtr, aVar.f17602r, createEmbeddedObject, realmGet$language, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17602r, createEmbeddedObject, false);
        }
        String realmGet$sound = preferences.realmGet$sound();
        if (realmGet$sound != null) {
            Table.nativeSetString(nativePtr, aVar.f17603s, createEmbeddedObject, realmGet$sound, false);
            str = str;
            aVar = aVar;
        } else {
            Table.nativeSetNull(nativePtr, aVar.f17603s, createEmbeddedObject, false);
        }
        String str3 = str;
        a aVar4 = aVar;
        Table.nativeSetLong(nativePtr, aVar.f17604t, createEmbeddedObject, preferences.realmGet$dayStart(), false);
        Table.nativeSetLong(nativePtr, aVar4.f17605u, createEmbeddedObject, preferences.realmGet$timezoneOffset(), false);
        Table.nativeSetLong(nativePtr, aVar4.f17606v, createEmbeddedObject, preferences.realmGet$timezoneOffsetAtLastCron(), false);
        PushNotificationsPreference realmGet$pushNotifications = preferences.realmGet$pushNotifications();
        if (realmGet$pushNotifications != null) {
            Long l12 = map.get(realmGet$pushNotifications);
            if (l12 == null) {
                str2 = str3;
                aVar2 = aVar4;
                m7.i(o0Var, c12, aVar4.f17607w, createEmbeddedObject, realmGet$pushNotifications, map);
            } else {
                throw new IllegalArgumentException(str3 + l12.toString());
            }
        } else {
            str2 = str3;
            aVar2 = aVar4;
            Table.nativeNullifyLink(nativePtr, aVar2.f17607w, createEmbeddedObject);
        }
        EmailNotificationsPreference realmGet$emailNotifications = preferences.realmGet$emailNotifications();
        if (realmGet$emailNotifications != null) {
            Long l13 = map.get(realmGet$emailNotifications);
            if (l13 == null) {
                g6.i(o0Var, c12, aVar2.f17608x, createEmbeddedObject, realmGet$emailNotifications, map);
            } else {
                throw new IllegalArgumentException(str2 + l13.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar2.f17608x, createEmbeddedObject);
        }
        String str4 = str2;
        a aVar5 = aVar2;
        Table.nativeSetBoolean(nativePtr, aVar2.f17609y, createEmbeddedObject, preferences.realmGet$autoEquip(), false);
        UserTaskPreferences realmGet$tasks = preferences.realmGet$tasks();
        if (realmGet$tasks != null) {
            Long l14 = map.get(realmGet$tasks);
            if (l14 == null) {
                c8.i(o0Var, c12, aVar5.f17610z, createEmbeddedObject, realmGet$tasks, map);
            } else {
                throw new IllegalArgumentException(str4 + l14.toString());
            }
        } else {
            Table.nativeNullifyLink(nativePtr, aVar5.f17610z, createEmbeddedObject);
        }
        return createEmbeddedObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g7 k(io.realm.a aVar, io.realm.internal.q qVar) {
        a.c cVar = io.realm.a.f17237x.get();
        cVar.g(aVar, qVar, aVar.R().e(Preferences.class), false, Collections.emptyList());
        g7 g7Var = new g7();
        cVar.a();
        return g7Var;
    }

    static Preferences l(o0 o0Var, a aVar, Preferences preferences, Preferences preferences2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(o0Var.c1(Preferences.class), set);
        Hair realmGet$hair = preferences2.realmGet$hair();
        if (realmGet$hair == null) {
            osObjectBuilder.Z0(aVar.f17589e);
        } else if (((Hair) map.get(realmGet$hair)) == null) {
            o6 k10 = o6.k(o0Var, o0Var.c1(Hair.class).s(((io.realm.internal.o) preferences).b().g().createEmbeddedObject(aVar.f17589e, RealmFieldType.OBJECT)));
            map.put(realmGet$hair, k10);
            o6.n(o0Var, realmGet$hair, k10, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachehair.toString()");
        }
        SuppressedModals realmGet$suppressModals = preferences2.realmGet$suppressModals();
        if (realmGet$suppressModals == null) {
            osObjectBuilder.Z0(aVar.f17590f);
        } else if (((SuppressedModals) map.get(realmGet$suppressModals)) == null) {
            u7 k11 = u7.k(o0Var, o0Var.c1(SuppressedModals.class).s(((io.realm.internal.o) preferences).b().g().createEmbeddedObject(aVar.f17590f, RealmFieldType.OBJECT)));
            map.put(realmGet$suppressModals, k11);
            u7.n(o0Var, realmGet$suppressModals, k11, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachesuppressModals.toString()");
        }
        osObjectBuilder.F0(aVar.f17591g, Boolean.valueOf(preferences2.realmGet$costume()));
        osObjectBuilder.F0(aVar.f17592h, Boolean.valueOf(preferences2.realmGet$disableClasses()));
        osObjectBuilder.F0(aVar.f17593i, Boolean.valueOf(preferences2.realmGet$sleep()));
        osObjectBuilder.F0(aVar.f17594j, Boolean.valueOf(preferences2.realmGet$dailyDueDefaultView()));
        osObjectBuilder.F0(aVar.f17595k, Boolean.valueOf(preferences2.realmGet$automaticAllocation()));
        osObjectBuilder.c1(aVar.f17596l, preferences2.realmGet$allocationMode());
        osObjectBuilder.c1(aVar.f17597m, preferences2.realmGet$shirt());
        osObjectBuilder.c1(aVar.f17598n, preferences2.realmGet$skin());
        osObjectBuilder.c1(aVar.f17599o, preferences2.realmGet$size());
        osObjectBuilder.c1(aVar.f17600p, preferences2.realmGet$background());
        osObjectBuilder.c1(aVar.f17601q, preferences2.realmGet$chair());
        osObjectBuilder.c1(aVar.f17602r, preferences2.realmGet$language());
        osObjectBuilder.c1(aVar.f17603s, preferences2.realmGet$sound());
        osObjectBuilder.V0(aVar.f17604t, Integer.valueOf(preferences2.realmGet$dayStart()));
        osObjectBuilder.V0(aVar.f17605u, Integer.valueOf(preferences2.realmGet$timezoneOffset()));
        osObjectBuilder.V0(aVar.f17606v, Integer.valueOf(preferences2.realmGet$timezoneOffsetAtLastCron()));
        PushNotificationsPreference realmGet$pushNotifications = preferences2.realmGet$pushNotifications();
        if (realmGet$pushNotifications == null) {
            osObjectBuilder.Z0(aVar.f17607w);
        } else if (((PushNotificationsPreference) map.get(realmGet$pushNotifications)) == null) {
            m7 k12 = m7.k(o0Var, o0Var.c1(PushNotificationsPreference.class).s(((io.realm.internal.o) preferences).b().g().createEmbeddedObject(aVar.f17607w, RealmFieldType.OBJECT)));
            map.put(realmGet$pushNotifications, k12);
            m7.n(o0Var, realmGet$pushNotifications, k12, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachepushNotifications.toString()");
        }
        EmailNotificationsPreference realmGet$emailNotifications = preferences2.realmGet$emailNotifications();
        if (realmGet$emailNotifications == null) {
            osObjectBuilder.Z0(aVar.f17608x);
        } else if (((EmailNotificationsPreference) map.get(realmGet$emailNotifications)) == null) {
            g6 k13 = g6.k(o0Var, o0Var.c1(EmailNotificationsPreference.class).s(((io.realm.internal.o) preferences).b().g().createEmbeddedObject(aVar.f17608x, RealmFieldType.OBJECT)));
            map.put(realmGet$emailNotifications, k13);
            g6.n(o0Var, realmGet$emailNotifications, k13, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cacheemailNotifications.toString()");
        }
        osObjectBuilder.F0(aVar.f17609y, Boolean.valueOf(preferences2.realmGet$autoEquip()));
        UserTaskPreferences realmGet$tasks = preferences2.realmGet$tasks();
        if (realmGet$tasks == null) {
            osObjectBuilder.Z0(aVar.f17610z);
        } else if (((UserTaskPreferences) map.get(realmGet$tasks)) == null) {
            c8 k14 = c8.k(o0Var, o0Var.c1(UserTaskPreferences.class).s(((io.realm.internal.o) preferences).b().g().createEmbeddedObject(aVar.f17610z, RealmFieldType.OBJECT)));
            map.put(realmGet$tasks, k14);
            c8.n(o0Var, realmGet$tasks, k14, map, set);
        } else {
            throw new IllegalArgumentException("Embedded objects can only have one parent pointing to them. This object was already copied, so another object is pointing to it: cachetasks.toString()");
        }
        osObjectBuilder.f1((io.realm.internal.o) preferences);
        return preferences;
    }

    public static void n(o0 o0Var, Preferences preferences, Preferences preferences2, Map<a1, io.realm.internal.o> map, Set<v> set) {
        l(o0Var, (a) o0Var.R().e(Preferences.class), preferences2, preferences, map, set);
    }

    @Override // io.realm.internal.o
    public void a() {
        if (this.f17588q != null) {
            return;
        }
        a.c cVar = io.realm.a.f17237x.get();
        this.f17587p = (a) cVar.c();
        l0<Preferences> l0Var = new l0<>(this);
        this.f17588q = l0Var;
        l0Var.r(cVar.e());
        this.f17588q.s(cVar.f());
        this.f17588q.o(cVar.b());
        this.f17588q.q(cVar.d());
    }

    @Override // io.realm.internal.o
    public l0<?> b() {
        return this.f17588q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g7 g7Var = (g7) obj;
        io.realm.a f10 = this.f17588q.f();
        io.realm.a f11 = g7Var.f17588q.f();
        String path = f10.getPath();
        String path2 = f11.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f10.Y() != f11.Y() || !f10.f17242r.getVersionID().equals(f11.f17242r.getVersionID())) {
            return false;
        }
        String p10 = this.f17588q.g().getTable().p();
        String p11 = g7Var.f17588q.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f17588q.g().getObjectKey() == g7Var.f17588q.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String path = this.f17588q.f().getPath();
        String p10 = this.f17588q.g().getTable().p();
        long objectKey = this.f17588q.g().getObjectKey();
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

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$allocationMode() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17596l);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public boolean realmGet$autoEquip() {
        this.f17588q.f().e();
        return this.f17588q.g().getBoolean(this.f17587p.f17609y);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public boolean realmGet$automaticAllocation() {
        this.f17588q.f().e();
        return this.f17588q.g().getBoolean(this.f17587p.f17595k);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$background() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17600p);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$chair() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17601q);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public boolean realmGet$costume() {
        this.f17588q.f().e();
        return this.f17588q.g().getBoolean(this.f17587p.f17591g);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public boolean realmGet$dailyDueDefaultView() {
        this.f17588q.f().e();
        return this.f17588q.g().getBoolean(this.f17587p.f17594j);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public int realmGet$dayStart() {
        this.f17588q.f().e();
        return (int) this.f17588q.g().getLong(this.f17587p.f17604t);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public boolean realmGet$disableClasses() {
        this.f17588q.f().e();
        return this.f17588q.g().getBoolean(this.f17587p.f17592h);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public EmailNotificationsPreference realmGet$emailNotifications() {
        this.f17588q.f().e();
        if (this.f17588q.g().isNullLink(this.f17587p.f17608x)) {
            return null;
        }
        return (EmailNotificationsPreference) this.f17588q.f().B(EmailNotificationsPreference.class, this.f17588q.g().getLink(this.f17587p.f17608x), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public Hair realmGet$hair() {
        this.f17588q.f().e();
        if (this.f17588q.g().isNullLink(this.f17587p.f17589e)) {
            return null;
        }
        return (Hair) this.f17588q.f().B(Hair.class, this.f17588q.g().getLink(this.f17587p.f17589e), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$language() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17602r);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public PushNotificationsPreference realmGet$pushNotifications() {
        this.f17588q.f().e();
        if (this.f17588q.g().isNullLink(this.f17587p.f17607w)) {
            return null;
        }
        return (PushNotificationsPreference) this.f17588q.f().B(PushNotificationsPreference.class, this.f17588q.g().getLink(this.f17587p.f17607w), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$shirt() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17597m);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$size() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17599o);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$skin() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17598n);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public boolean realmGet$sleep() {
        this.f17588q.f().e();
        return this.f17588q.g().getBoolean(this.f17587p.f17593i);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public String realmGet$sound() {
        this.f17588q.f().e();
        return this.f17588q.g().getString(this.f17587p.f17603s);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public SuppressedModals realmGet$suppressModals() {
        this.f17588q.f().e();
        if (this.f17588q.g().isNullLink(this.f17587p.f17590f)) {
            return null;
        }
        return (SuppressedModals) this.f17588q.f().B(SuppressedModals.class, this.f17588q.g().getLink(this.f17587p.f17590f), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public UserTaskPreferences realmGet$tasks() {
        this.f17588q.f().e();
        if (this.f17588q.g().isNullLink(this.f17587p.f17610z)) {
            return null;
        }
        return (UserTaskPreferences) this.f17588q.f().B(UserTaskPreferences.class, this.f17588q.g().getLink(this.f17587p.f17610z), false, Collections.emptyList());
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public int realmGet$timezoneOffset() {
        this.f17588q.f().e();
        return (int) this.f17588q.g().getLong(this.f17587p.f17605u);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public int realmGet$timezoneOffsetAtLastCron() {
        this.f17588q.f().e();
        return (int) this.f17588q.g().getLong(this.f17587p.f17606v);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$allocationMode(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17596l, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17596l, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17596l);
        } else {
            this.f17588q.g().setString(this.f17587p.f17596l, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$autoEquip(boolean z10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().z(this.f17587p.f17609y, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setBoolean(this.f17587p.f17609y, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$automaticAllocation(boolean z10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().z(this.f17587p.f17595k, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setBoolean(this.f17587p.f17595k, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$background(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17600p, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17600p, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17600p);
        } else {
            this.f17588q.g().setString(this.f17587p.f17600p, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$chair(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17601q, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17601q, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17601q);
        } else {
            this.f17588q.g().setString(this.f17587p.f17601q, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$costume(boolean z10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().z(this.f17587p.f17591g, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setBoolean(this.f17587p.f17591g, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$dailyDueDefaultView(boolean z10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().z(this.f17587p.f17594j, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setBoolean(this.f17587p.f17594j, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$dayStart(int i10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().E(this.f17587p.f17604t, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setLong(this.f17587p.f17604t, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$disableClasses(boolean z10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().z(this.f17587p.f17592h, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setBoolean(this.f17587p.f17592h, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$emailNotifications(EmailNotificationsPreference emailNotificationsPreference) {
        o0 o0Var = (o0) this.f17588q.f();
        if (this.f17588q.i()) {
            if (!this.f17588q.d() || this.f17588q.e().contains("emailNotifications")) {
                return;
            }
            if (emailNotificationsPreference != null && !d1.isManaged(emailNotificationsPreference)) {
                EmailNotificationsPreference emailNotificationsPreference2 = (EmailNotificationsPreference) o0Var.J0(EmailNotificationsPreference.class, this, "emailNotifications");
                g6.n(o0Var, emailNotificationsPreference, emailNotificationsPreference2, new HashMap(), Collections.EMPTY_SET);
                emailNotificationsPreference = emailNotificationsPreference2;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (emailNotificationsPreference == null) {
                g10.nullifyLink(this.f17587p.f17608x);
                return;
            }
            this.f17588q.c(emailNotificationsPreference);
            g10.getTable().D(this.f17587p.f17608x, g10.getObjectKey(), ((io.realm.internal.o) emailNotificationsPreference).b().g().getObjectKey(), true);
            return;
        }
        this.f17588q.f().e();
        if (emailNotificationsPreference == null) {
            this.f17588q.g().nullifyLink(this.f17587p.f17608x);
            return;
        }
        if (d1.isManaged(emailNotificationsPreference)) {
            this.f17588q.c(emailNotificationsPreference);
        }
        g6.n(o0Var, emailNotificationsPreference, (EmailNotificationsPreference) o0Var.J0(EmailNotificationsPreference.class, this, "emailNotifications"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$hair(Hair hair) {
        o0 o0Var = (o0) this.f17588q.f();
        if (this.f17588q.i()) {
            if (!this.f17588q.d() || this.f17588q.e().contains("hair")) {
                return;
            }
            if (hair != null && !d1.isManaged(hair)) {
                Hair hair2 = (Hair) o0Var.J0(Hair.class, this, "hair");
                o6.n(o0Var, hair, hair2, new HashMap(), Collections.EMPTY_SET);
                hair = hair2;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (hair == null) {
                g10.nullifyLink(this.f17587p.f17589e);
                return;
            }
            this.f17588q.c(hair);
            g10.getTable().D(this.f17587p.f17589e, g10.getObjectKey(), ((io.realm.internal.o) hair).b().g().getObjectKey(), true);
            return;
        }
        this.f17588q.f().e();
        if (hair == null) {
            this.f17588q.g().nullifyLink(this.f17587p.f17589e);
            return;
        }
        if (d1.isManaged(hair)) {
            this.f17588q.c(hair);
        }
        o6.n(o0Var, hair, (Hair) o0Var.J0(Hair.class, this, "hair"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$language(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17602r, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17602r, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17602r);
        } else {
            this.f17588q.g().setString(this.f17587p.f17602r, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$pushNotifications(PushNotificationsPreference pushNotificationsPreference) {
        o0 o0Var = (o0) this.f17588q.f();
        if (this.f17588q.i()) {
            if (!this.f17588q.d() || this.f17588q.e().contains("pushNotifications")) {
                return;
            }
            if (pushNotificationsPreference != null && !d1.isManaged(pushNotificationsPreference)) {
                PushNotificationsPreference pushNotificationsPreference2 = (PushNotificationsPreference) o0Var.J0(PushNotificationsPreference.class, this, "pushNotifications");
                m7.n(o0Var, pushNotificationsPreference, pushNotificationsPreference2, new HashMap(), Collections.EMPTY_SET);
                pushNotificationsPreference = pushNotificationsPreference2;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (pushNotificationsPreference == null) {
                g10.nullifyLink(this.f17587p.f17607w);
                return;
            }
            this.f17588q.c(pushNotificationsPreference);
            g10.getTable().D(this.f17587p.f17607w, g10.getObjectKey(), ((io.realm.internal.o) pushNotificationsPreference).b().g().getObjectKey(), true);
            return;
        }
        this.f17588q.f().e();
        if (pushNotificationsPreference == null) {
            this.f17588q.g().nullifyLink(this.f17587p.f17607w);
            return;
        }
        if (d1.isManaged(pushNotificationsPreference)) {
            this.f17588q.c(pushNotificationsPreference);
        }
        m7.n(o0Var, pushNotificationsPreference, (PushNotificationsPreference) o0Var.J0(PushNotificationsPreference.class, this, "pushNotifications"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$shirt(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17597m, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17597m, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17597m);
        } else {
            this.f17588q.g().setString(this.f17587p.f17597m, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$size(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17599o, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17599o, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17599o);
        } else {
            this.f17588q.g().setString(this.f17587p.f17599o, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$skin(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17598n, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17598n, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17598n);
        } else {
            this.f17588q.g().setString(this.f17587p.f17598n, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$sleep(boolean z10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().z(this.f17587p.f17593i, g10.getObjectKey(), z10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setBoolean(this.f17587p.f17593i, z10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$sound(String str) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (str == null) {
                g10.getTable().F(this.f17587p.f17603s, g10.getObjectKey(), true);
                return;
            } else {
                g10.getTable().G(this.f17587p.f17603s, g10.getObjectKey(), str, true);
                return;
            }
        }
        this.f17588q.f().e();
        if (str == null) {
            this.f17588q.g().setNull(this.f17587p.f17603s);
        } else {
            this.f17588q.g().setString(this.f17587p.f17603s, str);
        }
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$suppressModals(SuppressedModals suppressedModals) {
        o0 o0Var = (o0) this.f17588q.f();
        if (this.f17588q.i()) {
            if (!this.f17588q.d() || this.f17588q.e().contains("suppressModals")) {
                return;
            }
            if (suppressedModals != null && !d1.isManaged(suppressedModals)) {
                SuppressedModals suppressedModals2 = (SuppressedModals) o0Var.J0(SuppressedModals.class, this, "suppressModals");
                u7.n(o0Var, suppressedModals, suppressedModals2, new HashMap(), Collections.EMPTY_SET);
                suppressedModals = suppressedModals2;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (suppressedModals == null) {
                g10.nullifyLink(this.f17587p.f17590f);
                return;
            }
            this.f17588q.c(suppressedModals);
            g10.getTable().D(this.f17587p.f17590f, g10.getObjectKey(), ((io.realm.internal.o) suppressedModals).b().g().getObjectKey(), true);
            return;
        }
        this.f17588q.f().e();
        if (suppressedModals == null) {
            this.f17588q.g().nullifyLink(this.f17587p.f17590f);
            return;
        }
        if (d1.isManaged(suppressedModals)) {
            this.f17588q.c(suppressedModals);
        }
        u7.n(o0Var, suppressedModals, (SuppressedModals) o0Var.J0(SuppressedModals.class, this, "suppressModals"), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$tasks(UserTaskPreferences userTaskPreferences) {
        o0 o0Var = (o0) this.f17588q.f();
        if (this.f17588q.i()) {
            if (!this.f17588q.d() || this.f17588q.e().contains(NavigationDrawerFragment.SIDEBAR_TASKS)) {
                return;
            }
            if (userTaskPreferences != null && !d1.isManaged(userTaskPreferences)) {
                UserTaskPreferences userTaskPreferences2 = (UserTaskPreferences) o0Var.J0(UserTaskPreferences.class, this, NavigationDrawerFragment.SIDEBAR_TASKS);
                c8.n(o0Var, userTaskPreferences, userTaskPreferences2, new HashMap(), Collections.EMPTY_SET);
                userTaskPreferences = userTaskPreferences2;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            if (userTaskPreferences == null) {
                g10.nullifyLink(this.f17587p.f17610z);
                return;
            }
            this.f17588q.c(userTaskPreferences);
            g10.getTable().D(this.f17587p.f17610z, g10.getObjectKey(), ((io.realm.internal.o) userTaskPreferences).b().g().getObjectKey(), true);
            return;
        }
        this.f17588q.f().e();
        if (userTaskPreferences == null) {
            this.f17588q.g().nullifyLink(this.f17587p.f17610z);
            return;
        }
        if (d1.isManaged(userTaskPreferences)) {
            this.f17588q.c(userTaskPreferences);
        }
        c8.n(o0Var, userTaskPreferences, (UserTaskPreferences) o0Var.J0(UserTaskPreferences.class, this, NavigationDrawerFragment.SIDEBAR_TASKS), new HashMap(), Collections.EMPTY_SET);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$timezoneOffset(int i10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().E(this.f17587p.f17605u, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setLong(this.f17587p.f17605u, i10);
    }

    @Override // com.habitrpg.android.habitica.models.user.Preferences, io.realm.h7
    public void realmSet$timezoneOffsetAtLastCron(int i10) {
        if (this.f17588q.i()) {
            if (!this.f17588q.d()) {
                return;
            }
            io.realm.internal.q g10 = this.f17588q.g();
            g10.getTable().E(this.f17587p.f17606v, g10.getObjectKey(), i10, true);
            return;
        }
        this.f17588q.f().e();
        this.f17588q.g().setLong(this.f17587p.f17606v, i10);
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        if (!d1.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb2 = new StringBuilder("Preferences = proxy[");
        sb2.append("{hair:");
        String str13 = "null";
        if (realmGet$hair() == null) {
            str = "null";
        } else {
            str = "Hair";
        }
        sb2.append(str);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{suppressModals:");
        if (realmGet$suppressModals() == null) {
            str2 = "null";
        } else {
            str2 = "SuppressedModals";
        }
        sb2.append(str2);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{costume:");
        sb2.append(realmGet$costume());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{disableClasses:");
        sb2.append(realmGet$disableClasses());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{sleep:");
        sb2.append(realmGet$sleep());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dailyDueDefaultView:");
        sb2.append(realmGet$dailyDueDefaultView());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{automaticAllocation:");
        sb2.append(realmGet$automaticAllocation());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{allocationMode:");
        if (realmGet$allocationMode() == null) {
            str3 = "null";
        } else {
            str3 = realmGet$allocationMode();
        }
        sb2.append(str3);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{shirt:");
        if (realmGet$shirt() == null) {
            str4 = "null";
        } else {
            str4 = realmGet$shirt();
        }
        sb2.append(str4);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{skin:");
        if (realmGet$skin() == null) {
            str5 = "null";
        } else {
            str5 = realmGet$skin();
        }
        sb2.append(str5);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{size:");
        if (realmGet$size() == null) {
            str6 = "null";
        } else {
            str6 = realmGet$size();
        }
        sb2.append(str6);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{background:");
        if (realmGet$background() == null) {
            str7 = "null";
        } else {
            str7 = realmGet$background();
        }
        sb2.append(str7);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{chair:");
        if (realmGet$chair() == null) {
            str8 = "null";
        } else {
            str8 = realmGet$chair();
        }
        sb2.append(str8);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{language:");
        if (realmGet$language() == null) {
            str9 = "null";
        } else {
            str9 = realmGet$language();
        }
        sb2.append(str9);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{sound:");
        if (realmGet$sound() == null) {
            str10 = "null";
        } else {
            str10 = realmGet$sound();
        }
        sb2.append(str10);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{dayStart:");
        sb2.append(realmGet$dayStart());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{timezoneOffset:");
        sb2.append(realmGet$timezoneOffset());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{timezoneOffsetAtLastCron:");
        sb2.append(realmGet$timezoneOffsetAtLastCron());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{pushNotifications:");
        if (realmGet$pushNotifications() == null) {
            str11 = "null";
        } else {
            str11 = "PushNotificationsPreference";
        }
        sb2.append(str11);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{emailNotifications:");
        if (realmGet$emailNotifications() == null) {
            str12 = "null";
        } else {
            str12 = "EmailNotificationsPreference";
        }
        sb2.append(str12);
        sb2.append("}");
        sb2.append(",");
        sb2.append("{autoEquip:");
        sb2.append(realmGet$autoEquip());
        sb2.append("}");
        sb2.append(",");
        sb2.append("{tasks:");
        if (realmGet$tasks() != null) {
            str13 = "UserTaskPreferences";
        }
        sb2.append(str13);
        sb2.append("}");
        sb2.append("]");
        return sb2.toString();
    }
}
