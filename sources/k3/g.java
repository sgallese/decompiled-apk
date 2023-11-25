package k3;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.Arrays;
import k3.f;

/* compiled from: NavArgsLazy.kt */
/* loaded from: classes.dex */
public final class g<Args extends f> implements dc.f<Args> {

    /* renamed from: f  reason: collision with root package name */
    private final wc.b<Args> f19308f;

    /* renamed from: m  reason: collision with root package name */
    private final pc.a<Bundle> f19309m;

    /* renamed from: p  reason: collision with root package name */
    private Args f19310p;

    public g(wc.b<Args> bVar, pc.a<Bundle> aVar) {
        qc.q.i(bVar, "navArgsClass");
        qc.q.i(aVar, "argumentProducer");
        this.f19308f = bVar;
        this.f19309m = aVar;
    }

    @Override // dc.f
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public Args getValue() {
        Args args = this.f19310p;
        if (args == null) {
            Bundle invoke = this.f19309m.invoke();
            Method method = h.a().get(this.f19308f);
            if (method == null) {
                Class a10 = oc.a.a(this.f19308f);
                Class<Bundle>[] b10 = h.b();
                method = a10.getMethod("fromBundle", (Class[]) Arrays.copyOf(b10, b10.length));
                h.a().put(this.f19308f, method);
                qc.q.h(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke2 = method.invoke(null, invoke);
            qc.q.g(invoke2, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            Args args2 = (Args) invoke2;
            this.f19310p = args2;
            return args2;
        }
        return args;
    }
}
