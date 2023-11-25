package g5;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.Response;

/* compiled from: Calls.kt */
/* loaded from: classes.dex */
public final class b {
    public static final Object a(Call call, Continuation<? super Response> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        n nVar2 = new n(call, nVar);
        FirebasePerfOkHttpClient.enqueue(call, nVar2);
        nVar.n(nVar2);
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }
}
