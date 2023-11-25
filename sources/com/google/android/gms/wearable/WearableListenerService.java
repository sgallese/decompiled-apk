package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.NodeClient;
import com.google.android.gms.wearable.internal.zzbg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class WearableListenerService extends Service implements DataApi.DataListener, MessageApi.MessageListener, NodeClient.OnNodeMigratedListener, CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, MessageClient.RpcService {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName zza;
    private zzs zzb;
    private IBinder zzc;
    private Intent zzd;
    private Looper zze;
    private boolean zzg;
    private final Object zzf = new Object();
    private final zzbg zzh = new zzbg(new zzp(this, null));

    public Looper getLooper() {
        if (this.zze == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zze = handlerThread.getLooper();
        }
        return this.zze;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        char c10;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -1487371046:
                if (action.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1140095138:
                if (action.equals(MessageClient.ACTION_REQUEST_RECEIVED)) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -786751258:
                if (action.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 705066793:
                if (action.equals(NodeClient.ACTION_NODE_MIGRATED)) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 915816236:
                if (action.equals("com.google.android.gms.wearable.DATA_CHANGED")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1003809169:
                if (action.equals("com.google.android.gms.wearable.CHANNEL_EVENT")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1460975593:
                if (action.equals(BIND_LISTENER_INTENT_ACTION)) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return this.zzc;
            default:
                if (Log.isLoggable("WearableLS", 3)) {
                    Log.d("WearableLS", "onBind: Provided bind intent (" + intent.toString() + ") is not allowed");
                }
                return null;
        }
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelClosed(Channel channel, int i10, int i11) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelOpened(Channel channel) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zza = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.zza)));
        }
        this.zzb = new zzs(this, getLooper());
        Intent intent = new Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzd = intent;
        intent.setComponent(this.zza);
        this.zzc = new zzag(this, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.zza)));
        }
        synchronized (this.zzf) {
            this.zzg = true;
            zzs zzsVar = this.zzb;
            if (zzsVar != null) {
                zzsVar.zzb();
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.zza));
            }
        }
        super.onDestroy();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onInputClosed(Channel channel, int i10, int i11) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onOutputClosed(Channel channel, int i10, int i11) {
    }

    @Override // com.google.android.gms.wearable.MessageClient.RpcService
    public Task<byte[]> onRequest(String str, String str2, byte[] bArr) {
        return null;
    }

    public void onChannelClosed(ChannelClient.Channel channel, int i10, int i11) {
    }

    public void onChannelOpened(ChannelClient.Channel channel) {
    }

    public void onInputClosed(ChannelClient.Channel channel, int i10, int i11) {
    }

    public void onOutputClosed(ChannelClient.Channel channel, int i10, int i11) {
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    public void onConnectedNodes(List<Node> list) {
    }

    @Override // com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    @ShowFirstParty
    public void onEntityUpdate(zza zzaVar) {
    }

    @Override // com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
    }

    @ShowFirstParty
    public void onNotificationReceived(zzb zzbVar) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }

    @Override // com.google.android.gms.wearable.NodeClient.OnNodeMigratedListener
    public void onNodeMigrated(String str, DataItemBuffer dataItemBuffer) {
    }
}
