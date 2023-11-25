package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzar extends CapabilityClient {
    public static final /* synthetic */ int zza = 0;
    private final CapabilityApi zzb;

    public zzar(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzb = new zzal();
    }

    private final Task zza(final ListenerHolder listenerHolder, final CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, final IntentFilter[] intentFilterArr) {
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzp(new zzif((TaskCompletionSource) obj2), CapabilityClient.OnCapabilityChangedListener.this, listenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzap
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzx(new zzie((TaskCompletionSource) obj2), CapabilityClient.OnCapabilityChangedListener.this);
            }
        }).setMethodKey(24013).build());
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, Uri uri, int i10) {
        boolean z10;
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(uri, "uri must not be null");
        if (i10 != 0) {
            if (i10 != 1) {
                z10 = false;
                Preconditions.checkArgument(z10, "invalid filter type");
                return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener"), onCapabilityChangedListener, new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i10)});
            }
            i10 = 1;
        }
        z10 = true;
        Preconditions.checkArgument(z10, "invalid filter type");
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener"), onCapabilityChangedListener, new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i10)});
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addLocalCapability(String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        CapabilityApi capabilityApi = this.zzb;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzab((zzal) capabilityApi, asGoogleApiClient, str)));
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Map<String, CapabilityInfo>> getAllCapabilities(int i10) {
        CapabilityApi capabilityApi = this.zzb;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                i10 = 1;
            } else {
                z10 = false;
            }
        }
        Preconditions.checkArgument(z10);
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzaa((zzal) capabilityApi, asGoogleApiClient, i10)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzan
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                return ((CapabilityApi.GetAllCapabilitiesResult) result).getAllCapabilities();
            }
        });
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<CapabilityInfo> getCapability(String str, int i10) {
        Asserts.checkNotNull(str, "capability must not be null");
        CapabilityApi capabilityApi = this.zzb;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                i10 = 1;
            } else {
                z10 = false;
            }
        }
        Preconditions.checkArgument(z10);
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzz((zzal) capabilityApi, asGoogleApiClient, str, i10)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzam
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                return ((CapabilityApi.GetCapabilityResult) result).getCapability();
            }
        });
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Boolean> removeListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        return doUnregisterEventListener((ListenerHolder.ListenerKey) Preconditions.checkNotNull(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener").getListenerKey(), "Key must not be null"), 24003);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> removeLocalCapability(String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        CapabilityApi capabilityApi = this.zzb;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzac((zzal) capabilityApi, asGoogleApiClient, str)));
    }

    public zzar(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zzb = new zzal();
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Boolean> removeListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(str, "capability must not be null");
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return doUnregisterEventListener((ListenerHolder.ListenerKey) Preconditions.checkNotNull(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener:".concat(String.valueOf(str))).getListenerKey(), "Key must not be null"), 24003);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(str, "capability must not be null");
        IntentFilter zza2 = zzih.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        zza2.addDataPath(str, 0);
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener:".concat(String.valueOf(str))), new zzaq(onCapabilityChangedListener, str), new IntentFilter[]{zza2});
    }
}
