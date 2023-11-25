package l4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;

/* compiled from: BroadcastReceiverConstraintTracker.java */
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f19527h = l.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f19528g;

    /* compiled from: BroadcastReceiverConstraintTracker.java */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, p4.a aVar) {
        super(context, aVar);
        this.f19528g = new a();
    }

    @Override // l4.d
    public void e() {
        l.c().a(f19527h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f19532b.registerReceiver(this.f19528g, g());
    }

    @Override // l4.d
    public void f() {
        l.c().a(f19527h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f19532b.unregisterReceiver(this.f19528g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
