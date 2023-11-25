package y7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x7.f;
import x7.t;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected final f f26277a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f26278b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f26279c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set f26280d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private c f26281e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f26282f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(f fVar, IntentFilter intentFilter, Context context) {
        this.f26277a = fVar;
        this.f26278b = intentFilter;
        this.f26279c = t.a(context);
    }

    private final void b() {
        c cVar;
        b bVar = null;
        if ((this.f26282f || !this.f26280d.isEmpty()) && this.f26281e == null) {
            c cVar2 = new c(this, bVar);
            this.f26281e = cVar2;
            this.f26279c.registerReceiver(cVar2, this.f26278b);
        }
        if (!this.f26282f && this.f26280d.isEmpty() && (cVar = this.f26281e) != null) {
            this.f26279c.unregisterReceiver(cVar);
            this.f26281e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void c(boolean z10) {
        this.f26282f = z10;
        b();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.f26280d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(obj);
        }
    }

    public final synchronized boolean e() {
        if (this.f26281e != null) {
            return true;
        }
        return false;
    }
}
