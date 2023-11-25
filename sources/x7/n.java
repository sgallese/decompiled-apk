package x7;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class n extends g {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ IBinder f25849m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ q f25850p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(q qVar, IBinder iBinder) {
        this.f25850p = qVar;
        this.f25849m = iBinder;
    }

    @Override // x7.g
    public final void a() {
        m mVar;
        List list;
        List list2;
        r rVar = this.f25850p.f25852f;
        mVar = rVar.f25862i;
        rVar.f25867n = (IInterface) mVar.zza(this.f25849m);
        r.o(this.f25850p.f25852f);
        this.f25850p.f25852f.f25860g = false;
        list = this.f25850p.f25852f.f25857d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f25850p.f25852f.f25857d;
        list2.clear();
    }
}
