package k1;

import androidx.compose.ui.platform.g4;
import kotlin.coroutines.Continuation;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public interface e extends j2.e {
    long B0();

    r E();

    <T> Object N(long j10, pc.p<? super e, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation);

    <T> Object W(long j10, pc.p<? super e, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation);

    Object X(t tVar, Continuation<? super r> continuation);

    long a();

    g4 getViewConfiguration();
}
