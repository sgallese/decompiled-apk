package androidx.paging;

import androidx.paging.c2;
import kotlin.coroutines.Continuation;

/* compiled from: RemoteMediatorAccessor.kt */
/* loaded from: classes.dex */
public interface d2<Key, Value> extends e2<Key, Value> {
    Object c(Continuation<? super c2.a> continuation);

    dd.l0<s0> getState();
}
