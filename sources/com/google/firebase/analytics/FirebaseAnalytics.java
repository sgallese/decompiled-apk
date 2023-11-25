package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    private static volatile FirebaseAnalytics f11256b;

    /* renamed from: a  reason: collision with root package name */
    private final zzef f11257a;

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.f11257a = zzefVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f11256b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f11256b == null) {
                    f11256b = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return f11256b;
    }

    @Keep
    public static zzij getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzg = zzef.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new a(zzg);
    }

    public void a(String str, Bundle bundle) {
        this.f11257a.zzy(str, bundle);
    }

    public void b(String str) {
        this.f11257a.zzN(str);
    }

    public void c(String str, String str2) {
        this.f11257a.zzO(null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f11257a.zzH(activity, str, str2);
    }
}
