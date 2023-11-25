package bd;

import ad.i2;
import android.os.Looper;
import fd.u;
import java.util.List;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes4.dex */
public final class a implements u {
    @Override // fd.u
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [qc.h, java.lang.String] */
    @Override // fd.u
    public i2 b(List<? extends u> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            ?? r22 = 0;
            return new d(f.a(mainLooper, true), r22, 2, r22);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // fd.u
    public int c() {
        return 1073741823;
    }
}
