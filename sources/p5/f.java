package p5;

import ad.g0;
import ad.k0;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import t5.r;

/* compiled from: Storage.kt */
/* loaded from: classes.dex */
public interface f {

    /* compiled from: Storage.kt */
    /* loaded from: classes.dex */
    public enum a {
        LAST_EVENT_ID("last_event_id"),
        PREVIOUS_SESSION_ID("previous_session_id"),
        LAST_EVENT_TIME("last_event_time"),
        OPT_OUT("opt_out"),
        Events("events");

        private final String rawVal;

        a(String str) {
            this.rawVal = str;
        }

        public final String getRawVal() {
            return this.rawVal;
        }
    }

    List<Object> a();

    Object c(Object obj, Continuation<? super String> continuation);

    String f(a aVar);

    Object g(Continuation<? super w> continuation);

    r i(r5.b bVar, b bVar2, k0 k0Var, g0 g0Var, Object obj, String str);

    Object j(q5.a aVar, Continuation<? super w> continuation);

    Object k(a aVar, String str, Continuation<? super w> continuation);
}
