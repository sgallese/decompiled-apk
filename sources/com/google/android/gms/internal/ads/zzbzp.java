package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbzp {
    public static final ThreadPoolExecutor zza = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzo("ClientDefault"));
    public static final ExecutorService zzb = Executors.newSingleThreadExecutor(new zzbzo("ClientSingle"));
}
