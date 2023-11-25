package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfom {
    public static com.google.common.util.concurrent.a zza(Task task) {
        final zzfol zzfolVar = new zzfol(task);
        task.addOnCompleteListener(zzfyu.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfok
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfol zzfolVar2 = zzfol.this;
                if (task2.isCanceled()) {
                    zzfolVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfolVar2.zzc(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzfolVar2.zzd(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfolVar;
    }
}
