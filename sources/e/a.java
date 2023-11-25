package e;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import qc.q;

/* compiled from: ContextAwareHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f13565a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f13566b;

    public final void a(b bVar) {
        q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.f13566b;
        if (context != null) {
            bVar.onContextAvailable(context);
        }
        this.f13565a.add(bVar);
    }

    public final void b() {
        this.f13566b = null;
    }

    public final void c(Context context) {
        q.i(context, "context");
        this.f13566b = context;
        Iterator<b> it = this.f13565a.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public final Context d() {
        return this.f13566b;
    }

    public final void e(b bVar) {
        q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f13565a.remove(bVar);
    }
}
