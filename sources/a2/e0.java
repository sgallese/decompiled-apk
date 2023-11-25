package a2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: FontFamily.kt */
/* loaded from: classes.dex */
public final class e0 extends s0 {

    /* renamed from: u  reason: collision with root package name */
    private final String f253u;

    /* renamed from: v  reason: collision with root package name */
    private final String f254v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, String str2) {
        super(null);
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(str2, "fontFamilyName");
        this.f253u = str;
        this.f254v = str2;
    }

    public final String j() {
        return this.f253u;
    }

    public String toString() {
        return this.f254v;
    }
}
