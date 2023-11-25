package dd;

import kotlin.coroutines.Continuation;

/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public interface w<T> extends b0<T>, h<T> {
    void c();

    boolean e(T t10);

    Object emit(T t10, Continuation<? super dc.w> continuation);

    l0<Integer> g();
}
