package kotlinx.coroutines;

import ad.x1;
import java.util.concurrent.CancellationException;

/* compiled from: Timeout.kt */
/* loaded from: classes4.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: f  reason: collision with root package name */
    public final transient x1 f19464f;

    public TimeoutCancellationException(String str, x1 x1Var) {
        super(str);
        this.f19464f = x1Var;
    }
}
