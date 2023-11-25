package dd;

import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public interface b0<T> extends g<T> {
    List<T> a();

    @Override // dd.g
    Object collect(h<? super T> hVar, Continuation<?> continuation);
}
