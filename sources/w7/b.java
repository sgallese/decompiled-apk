package w7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map f25437a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f25438b = new AtomicBoolean(false);

    private final synchronized void b() {
        this.f25437a.put("assetOnlyUpdates", Boolean.FALSE);
    }

    public final synchronized boolean a(String str) {
        if (!this.f25438b.get()) {
            b();
        }
        Object obj = this.f25437a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
