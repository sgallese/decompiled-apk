package io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import io.realm.internal.a;

@Keep
/* loaded from: classes4.dex */
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(OsSharedRealm osSharedRealm, a aVar) {
        super(osSharedRealm);
        if (aVar.a()) {
            this.handler = new Handler(Looper.myLooper());
        } else {
            this.handler = null;
        }
    }

    @Override // io.realm.internal.RealmNotifier
    public boolean post(Runnable runnable) {
        Handler handler = this.handler;
        if (handler != null && handler.post(runnable)) {
            return true;
        }
        return false;
    }
}
