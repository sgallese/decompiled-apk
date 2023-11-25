package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder<L> zaa;
    private final Feature[] zab;
    private final boolean zac;
    private final int zad;

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public RegisterListenerMethod(ListenerHolder<L> listenerHolder, Feature[] featureArr, boolean z10, int i10) {
        this.zaa = listenerHolder;
        this.zab = featureArr;
        this.zac = z10;
        this.zad = i10;
    }

    @KeepForSdk
    public void clearListener() {
        this.zaa.clear();
    }

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa.getListenerKey();
    }

    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.zab;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @KeepForSdk
    public abstract void registerListener(A a10, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder, Feature[] featureArr, boolean z10) {
        this(listenerHolder, featureArr, z10, 0);
    }
}
