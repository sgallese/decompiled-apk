package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f  reason: collision with root package name */
    int f6954f = 0;

    /* renamed from: m  reason: collision with root package name */
    final HashMap<Integer, String> f6955m = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    final RemoteCallbackList<c> f6956p = new a();

    /* renamed from: q  reason: collision with root package name */
    private final d.a f6957q = new b();

    /* loaded from: classes.dex */
    class a extends RemoteCallbackList<c> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(c cVar, Object obj) {
            MultiInstanceInvalidationService.this.f6955m.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a {
        b() {
        }

        @Override // androidx.room.d
        public void B(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f6956p) {
                String str = MultiInstanceInvalidationService.this.f6955m.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f6956p.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f6956p.getBroadcastCookie(i11)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f6955m.get(Integer.valueOf(intValue));
                        if (i10 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f6956p.getBroadcastItem(i11).f(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f6956p.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.d
        public void H(c cVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f6956p) {
                MultiInstanceInvalidationService.this.f6956p.unregister(cVar);
                MultiInstanceInvalidationService.this.f6955m.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.d
        public int g(c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f6956p) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f6954f + 1;
                multiInstanceInvalidationService.f6954f = i10;
                if (multiInstanceInvalidationService.f6956p.register(cVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f6955m.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f6954f--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6957q;
    }
}
