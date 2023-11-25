package com.habitrpg.android.habitica;

import ad.k0;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.wearable.Wearable;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.ui.activities.LoginActivity;
import io.realm.o0;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaBaseApplication.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.HabiticaBaseApplication$Companion$logout$1", f = "HabiticaBaseApplication.kt", l = {297}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HabiticaBaseApplication$Companion$logout$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaBaseApplication$Companion$logout$1(Context context, Continuation<? super HabiticaBaseApplication$Companion$logout$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new HabiticaBaseApplication$Companion$logout$1(this.$context, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((HabiticaBaseApplication$Companion$logout$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        PushNotificationManager pushNotificationManager$Habitica_2311256681_prodRelease;
        ApiClient lazyApiHelper$Habitica_2311256681_prodRelease;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            HabiticaBaseApplication companion = HabiticaBaseApplication.Companion.getInstance(this.$context);
            if (companion != null && (pushNotificationManager$Habitica_2311256681_prodRelease = companion.getPushNotificationManager$Habitica_2311256681_prodRelease()) != null) {
                this.label = 1;
                if (pushNotificationManager$Habitica_2311256681_prodRelease.removePushDeviceUsingStoredToken(this) == d10) {
                    return d10;
                }
            }
        }
        o0 Z0 = o0.Z0();
        HabiticaBaseApplication.Companion companion2 = HabiticaBaseApplication.Companion;
        HabiticaBaseApplication companion3 = companion2.getInstance(this.$context);
        if (companion3 != null) {
            String path = Z0.getPath();
            qc.q.h(path, "getPath(...)");
            kotlin.coroutines.jvm.internal.b.a(companion3.deleteDatabase(path));
        }
        Z0.close();
        SharedPreferences b10 = androidx.preference.k.b(this.$context);
        boolean z10 = b10.getBoolean("use_reminder", false);
        String string = b10.getString("reminder_time", "19:00");
        String string2 = b10.getString("theme_mode", "system");
        String string3 = b10.getString("launch_screen", "");
        qc.q.f(b10);
        SharedPreferences.Editor edit = b10.edit();
        edit.clear();
        edit.putBoolean("use_reminder", z10);
        edit.putString("reminder_time", string);
        edit.putString("theme_mode", string2);
        edit.putString("launch_screen", string3);
        edit.apply();
        HabiticaBaseApplication companion4 = companion2.getInstance(this.$context);
        if (companion4 != null && (lazyApiHelper$Habitica_2311256681_prodRelease = companion4.getLazyApiHelper$Habitica_2311256681_prodRelease()) != null) {
            lazyApiHelper$Habitica_2311256681_prodRelease.updateAuthenticationCredentials(null, null);
        }
        Wearable.getCapabilityClient(this.$context).removeLocalCapability("provide_auth");
        companion2.startActivity(LoginActivity.class, this.$context);
        return dc.w.f13270a;
    }
}
