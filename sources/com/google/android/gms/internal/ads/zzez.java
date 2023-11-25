package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzez {
    private static zzez zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzez(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzey(this, null), intentFilter);
    }

    public static synchronized zzez zzb(Context context) {
        zzez zzezVar;
        synchronized (zzez.class) {
            if (zza == null) {
                zza = new zzez(context);
            }
            zzezVar = zza;
        }
        return zzezVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzez zzezVar, int i10) {
        synchronized (zzezVar.zzd) {
            if (zzezVar.zze == i10) {
                return;
            }
            zzezVar.zze = i10;
            Iterator it = zzezVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzxv zzxvVar = (zzxv) weakReference.get();
                if (zzxvVar != null) {
                    zzxvVar.zza.zzk(i10);
                } else {
                    zzezVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    public final void zzd(final zzxv zzxvVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzxvVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzev
            @Override // java.lang.Runnable
            public final void run() {
                zzez zzezVar = zzez.this;
                zzxv zzxvVar2 = zzxvVar;
                zzxvVar2.zza.zzk(zzezVar.zza());
            }
        });
    }
}
