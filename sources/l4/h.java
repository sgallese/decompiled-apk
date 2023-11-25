package l4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;

/* compiled from: StorageNotLowTracker.java */
/* loaded from: classes.dex */
public class h extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f19544i = l.f("StorageNotLowTracker");

    public h(Context context, p4.a aVar) {
        super(context, aVar);
    }

    @Override // l4.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // l4.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        l.c().a(f19544i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                d(Boolean.TRUE);
                return;
            }
            return;
        }
        d(Boolean.FALSE);
    }

    @Override // l4.d
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public Boolean b() {
        Intent registerReceiver = this.f19532b.registerReceiver(null, g());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.hashCode();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
