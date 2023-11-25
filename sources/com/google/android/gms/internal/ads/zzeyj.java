package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeyj {
    public static void zza(AtomicReference atomicReference, zzeyi zzeyiVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeyiVar.zza(obj);
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            zzcaa.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
