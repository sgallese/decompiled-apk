package i8;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzio;
import com.google.firebase.analytics.connector.internal.f;
import com.google.firebase.e;
import i8.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
/* loaded from: classes3.dex */
public class b implements i8.a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile i8.a f17117c;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    final AppMeasurementSdk f17118a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final Map f17119b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.1 */
    /* loaded from: classes3.dex */
    class a implements a.InterfaceC0402a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17120a;

        a(String str) {
            this.f17120a = str;
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f17118a = appMeasurementSdk;
        this.f17119b = new ConcurrentHashMap();
    }

    @KeepForSdk
    public static i8.a h(e eVar, Context context, f9.d dVar) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f17117c == null) {
            synchronized (b.class) {
                if (f17117c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.t()) {
                        dVar.b(com.google.firebase.b.class, new Executor() { // from class: i8.c
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new f9.b() { // from class: i8.d
                            @Override // f9.b
                            public final void a(f9.a aVar) {
                                b.i(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.s());
                    }
                    f17117c = new b(zzef.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return f17117c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(f9.a aVar) {
        boolean z10 = ((com.google.firebase.b) aVar.a()).f11276a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f17117c)).f17118a.zza(z10);
        }
    }

    private final boolean j(String str) {
        if (!str.isEmpty() && this.f17119b.containsKey(str) && this.f17119b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // i8.a
    @KeepForSdk
    public Map<String, Object> a(boolean z10) {
        return this.f17118a.getUserProperties(null, null, z10);
    }

    @Override // i8.a
    @KeepForSdk
    public a.InterfaceC0402a b(String str, a.b bVar) {
        Object obj;
        Preconditions.checkNotNull(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.d(str) || j(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f17118a;
        if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
        } else if ("clx".equals(str)) {
            obj = new f(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f17119b.put(str, obj);
        return new a(str);
    }

    @Override // i8.a
    @KeepForSdk
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f17118a.logEvent(str, str2, bundle);
        }
    }

    @Override // i8.a
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 != null && !com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            return;
        }
        this.f17118a.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // i8.a
    @KeepForSdk
    public int d(String str) {
        return this.f17118a.getMaxUserProperties(str);
    }

    @Override // i8.a
    @KeepForSdk
    public List<a.c> e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f17118a.getConditionalUserProperties(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.b.f11266g;
            Preconditions.checkNotNull(bundle);
            a.c cVar = new a.c();
            cVar.f17102a = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, "origin", String.class, null));
            cVar.f17103b = (String) Preconditions.checkNotNull((String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            cVar.f17104c = zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            cVar.f17105d = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f17106e = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f17107f = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f17108g = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f17109h = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f17110i = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f17111j = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f17112k = (String) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f17113l = (Bundle) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f17115n = ((Boolean) zzgz.zza(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f17114m = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.f17116o = ((Long) zzgz.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // i8.a
    @KeepForSdk
    public void f(a.c cVar) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.b.f11266g;
        if (cVar != null && (str = cVar.f17102a) != null && !str.isEmpty()) {
            Object obj = cVar.f17104c;
            if ((obj == null || zzio.zza(obj) != null) && com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f17103b)) {
                String str2 = cVar.f17112k;
                if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, cVar.f17113l) && com.google.firebase.analytics.connector.internal.b.a(str, cVar.f17112k, cVar.f17113l))) {
                    String str3 = cVar.f17109h;
                    if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, cVar.f17110i) && com.google.firebase.analytics.connector.internal.b.a(str, cVar.f17109h, cVar.f17110i))) {
                        String str4 = cVar.f17107f;
                        if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, cVar.f17108g) && com.google.firebase.analytics.connector.internal.b.a(str, cVar.f17107f, cVar.f17108g))) {
                            AppMeasurementSdk appMeasurementSdk = this.f17118a;
                            Bundle bundle = new Bundle();
                            String str5 = cVar.f17102a;
                            if (str5 != null) {
                                bundle.putString("origin", str5);
                            }
                            String str6 = cVar.f17103b;
                            if (str6 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str6);
                            }
                            Object obj2 = cVar.f17104c;
                            if (obj2 != null) {
                                zzgz.zzb(bundle, obj2);
                            }
                            String str7 = cVar.f17105d;
                            if (str7 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                            }
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f17106e);
                            String str8 = cVar.f17107f;
                            if (str8 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                            }
                            Bundle bundle2 = cVar.f17108g;
                            if (bundle2 != null) {
                                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                            }
                            String str9 = cVar.f17109h;
                            if (str9 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                            }
                            Bundle bundle3 = cVar.f17110i;
                            if (bundle3 != null) {
                                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                            }
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f17111j);
                            String str10 = cVar.f17112k;
                            if (str10 != null) {
                                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                            }
                            Bundle bundle4 = cVar.f17113l;
                            if (bundle4 != null) {
                                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                            }
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f17114m);
                            bundle.putBoolean("active", cVar.f17115n);
                            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f17116o);
                            appMeasurementSdk.setConditionalUserProperty(bundle);
                        }
                    }
                }
            }
        }
    }

    @Override // i8.a
    @KeepForSdk
    public void g(String str, String str2, Object obj) {
        if (!com.google.firebase.analytics.connector.internal.b.d(str) || !com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            return;
        }
        this.f17118a.setUserProperty(str, str2, obj);
    }
}
