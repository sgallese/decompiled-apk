package com.habitrpg.android.habitica.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.BuildConfig;
import com.habitrpg.android.habitica.R;
import dc.l;
import dc.r;
import ec.m0;
import ec.n0;
import ec.p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qc.q;

/* compiled from: Analytics.kt */
/* loaded from: classes4.dex */
public final class Analytics {
    private static i5.a amplitude;
    private static FirebaseAnalytics firebase;
    public static final Analytics INSTANCE = new Analytics();
    public static final int $stable = 8;

    private Analytics() {
    }

    public static /* synthetic */ void sendEvent$default(Analytics analytics, String str, EventCategory eventCategory, HitType hitType, Map map, AnalyticsTarget analyticsTarget, int i10, Object obj) {
        Map map2;
        AnalyticsTarget analyticsTarget2;
        if ((i10 & 8) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i10 & 16) != 0) {
            analyticsTarget2 = null;
        } else {
            analyticsTarget2 = analyticsTarget;
        }
        analytics.sendEvent(str, eventCategory, hitType, map2, analyticsTarget2);
    }

    public final void identify(SharedPreferences sharedPreferences) {
        q.i(sharedPreferences, "sharedPrefs");
        q5.d d10 = new j5.a().d("androidStore", BuildConfig.STORE);
        String string = sharedPreferences.getString("launch_screen", "");
        if (string != null) {
            d10.c("launch_screen", string);
        }
        i5.a aVar = amplitude;
        if (aVar != null) {
            if (aVar == null) {
                q.z("amplitude");
                aVar = null;
            }
            p5.a.t(aVar, d10, null, 2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r16v1, types: [p5.d, q5.h, java.lang.String] */
    public final void initialize(Context context) {
        q.i(context, "context");
        String string = context.getString(R.string.amplitude_app_id);
        q.h(string, "getString(...)");
        ?? r16 = 0;
        amplitude = new i5.a(new i5.b(string, context, 0, 0, null, false, null, null, null, null, null, 0, false, r16, r16, r16, null, false, false, false, null, false, false, false, 0L, false, 67108860, null));
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        q.h(firebaseAnalytics, "getInstance(...)");
        firebase = firebaseAnalytics;
    }

    public final void logError(String str) {
        q.i(str, "msg");
        com.google.firebase.crashlytics.a.a().c(str);
    }

    public final void logException(Throwable th) {
        q.i(th, "t");
        com.google.firebase.crashlytics.a.a().d(th);
    }

    public final void sendEvent(String str, EventCategory eventCategory, HitType hitType) {
        sendEvent$default(this, str, eventCategory, hitType, null, null, 24, null);
    }

    public final void sendNavigationEvent(String str) {
        q.i(str, "page");
        HashMap hashMap = new HashMap();
        hashMap.put("page", str);
        sendEvent$default(this, "navigated " + str, EventCategory.NAVIGATION, HitType.PAGEVIEW, hashMap, null, 16, null);
    }

    public final void setUserID(String str) {
        q.i(str, "userID");
        i5.a aVar = amplitude;
        FirebaseAnalytics firebaseAnalytics = null;
        if (aVar != null) {
            if (aVar == null) {
                q.z("amplitude");
                aVar = null;
            }
            aVar.z(str);
        }
        com.google.firebase.crashlytics.a.a().g(str);
        FirebaseAnalytics firebaseAnalytics2 = firebase;
        if (firebaseAnalytics2 != null) {
            if (firebaseAnalytics2 == null) {
                q.z("firebase");
            } else {
                firebaseAnalytics = firebaseAnalytics2;
            }
            firebaseAnalytics.b(str);
        }
    }

    public final void setUserProperty(String str, Object obj) {
        Map e10;
        q.i(str, "identifier");
        i5.a aVar = amplitude;
        String str2 = null;
        if (aVar != null) {
            if (aVar == null) {
                q.z("amplitude");
                aVar = null;
            }
            e10 = m0.e(r.a(str, obj));
            p5.a.s(aVar, e10, null, 2, null);
        }
        FirebaseAnalytics firebaseAnalytics = firebase;
        if (firebaseAnalytics != null) {
            if (firebaseAnalytics == null) {
                q.z("firebase");
                firebaseAnalytics = null;
            }
            if (obj != null) {
                str2 = obj.toString();
            }
            firebaseAnalytics.c(str, str2);
        }
    }

    public final void sendEvent(String str, EventCategory eventCategory, HitType hitType, Map<String, ? extends Object> map) {
        sendEvent$default(this, str, eventCategory, hitType, map, null, 16, null);
    }

    public final void sendEvent(String str, EventCategory eventCategory, HitType hitType, Map<String, ? extends Object> map, AnalyticsTarget analyticsTarget) {
        Map l10;
        List v10;
        i5.a aVar;
        l[] lVarArr = new l[4];
        lVarArr[0] = r.a("eventAction", str);
        FirebaseAnalytics firebaseAnalytics = null;
        lVarArr[1] = r.a("eventCategory", eventCategory != null ? eventCategory.getKey() : null);
        lVarArr[2] = r.a("hitType", hitType != null ? hitType.getKey() : null);
        lVarArr[3] = r.a("status", "displayed");
        l10 = n0.l(lVarArr);
        if (map != null) {
            l10.putAll(map);
        }
        if (str != null) {
            if (amplitude != null && (analyticsTarget == null || analyticsTarget == AnalyticsTarget.AMPLITUDE)) {
                i5.a aVar2 = amplitude;
                if (aVar2 == null) {
                    q.z("amplitude");
                    aVar = null;
                } else {
                    aVar = aVar2;
                }
                p5.a.C(aVar, str, l10, null, 4, null);
            }
            if (firebase != null) {
                if (analyticsTarget == null || analyticsTarget == AnalyticsTarget.FIREBASE) {
                    FirebaseAnalytics firebaseAnalytics2 = firebase;
                    if (firebaseAnalytics2 == null) {
                        q.z("firebase");
                    } else {
                        firebaseAnalytics = firebaseAnalytics2;
                    }
                    v10 = p0.v(l10);
                    l[] lVarArr2 = (l[]) v10.toArray(new l[0]);
                    firebaseAnalytics.a(str, androidx.core.os.e.a((l[]) Arrays.copyOf(lVarArr2, lVarArr2.length)));
                }
            }
        }
    }
}
