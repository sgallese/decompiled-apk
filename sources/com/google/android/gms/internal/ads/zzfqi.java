package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfqi {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfpx zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfpf zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfqa
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfqi.zzj(zzfqi.this);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfqi(Context context, zzfpx zzfpxVar, String str, Intent intent, zzfpf zzfpfVar, zzfqd zzfqdVar) {
        this.zzb = context;
        this.zzc = zzfpxVar;
        this.zzi = intent;
        this.zzo = zzfpfVar;
    }

    public static /* synthetic */ void zzj(zzfqi zzfqiVar) {
        zzfqiVar.zzc.zzc("reportBinderDeath", new Object[0]);
        zzfqd zzfqdVar = (zzfqd) zzfqiVar.zzj.get();
        if (zzfqdVar != null) {
            zzfqiVar.zzc.zzc("calling onBinderDied", new Object[0]);
            zzfqdVar.zza();
        } else {
            zzfqiVar.zzc.zzc("%s : Binder has died.", zzfqiVar.zzd);
            Iterator it = zzfqiVar.zze.iterator();
            while (it.hasNext()) {
                ((zzfpy) it.next()).zzc(zzfqiVar.zzv());
            }
            zzfqiVar.zze.clear();
        }
        synchronized (zzfqiVar.zzg) {
            zzfqiVar.zzw();
        }
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfqi zzfqiVar, final TaskCompletionSource taskCompletionSource) {
        zzfqiVar.zzf.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfpz
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzfqi.this.zzt(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void zzp(zzfqi zzfqiVar, zzfpy zzfpyVar) {
        if (zzfqiVar.zzn == null && !zzfqiVar.zzh) {
            zzfqiVar.zzc.zzc("Initiate binding to the service.", new Object[0]);
            zzfqiVar.zze.add(zzfpyVar);
            zzfqh zzfqhVar = new zzfqh(zzfqiVar, null);
            zzfqiVar.zzm = zzfqhVar;
            zzfqiVar.zzh = true;
            if (!zzfqiVar.zzb.bindService(zzfqiVar.zzi, zzfqhVar, 1)) {
                zzfqiVar.zzc.zzc("Failed to bind to the service.", new Object[0]);
                zzfqiVar.zzh = false;
                Iterator it = zzfqiVar.zze.iterator();
                while (it.hasNext()) {
                    ((zzfpy) it.next()).zzc(new zzfqj());
                }
                zzfqiVar.zze.clear();
            }
        } else if (zzfqiVar.zzh) {
            zzfqiVar.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            zzfqiVar.zze.add(zzfpyVar);
        } else {
            zzfpyVar.run();
        }
    }

    public static /* bridge */ /* synthetic */ void zzq(zzfqi zzfqiVar) {
        zzfqiVar.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfqiVar.zzn.asBinder().linkToDeath(zzfqiVar.zzk, 0);
        } catch (RemoteException e10) {
            zzfqiVar.zzc.zzb(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void zzr(zzfqi zzfqiVar) {
        zzfqiVar.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfqiVar.zzn.asBinder().unlinkToDeath(zzfqiVar.zzk, 0);
    }

    private final RemoteException zzv() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    public final void zzw() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(zzv());
        }
        this.zzf.clear();
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzs(zzfpy zzfpyVar, TaskCompletionSource taskCompletionSource) {
        zzc().post(new zzfqb(this, zzfpyVar.zzb(), taskCompletionSource, zzfpyVar));
    }

    public final /* synthetic */ void zzt(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzu() {
        zzc().post(new zzfqc(this));
    }
}
