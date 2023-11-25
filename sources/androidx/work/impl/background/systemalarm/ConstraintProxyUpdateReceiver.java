package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.l;
import g4.j;
import o4.g;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f7470a = l.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Intent f7471f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Context f7472m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f7473p;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f7471f = intent;
            this.f7472m = context;
            this.f7473p = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f7471f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f7471f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f7471f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f7471f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                l.c().a(ConstraintProxyUpdateReceiver.f7470a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f7472m, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f7472m, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f7472m, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f7472m, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f7473p.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            l.c().a(f7470a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
        } else {
            j.k(context).p().b(new a(intent, context, goAsync()));
        }
    }
}
