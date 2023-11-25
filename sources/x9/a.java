package x9;

/* compiled from: FirebasePerfApplicationInfoValidator.java */
/* loaded from: classes3.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final v9.a f25878b = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final ba.c f25879a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ba.c cVar) {
        this.f25879a = cVar;
    }

    private boolean g() {
        ba.c cVar = this.f25879a;
        if (cVar == null) {
            f25878b.j("ApplicationInfo is null");
            return false;
        } else if (!cVar.c0()) {
            f25878b.j("GoogleAppId is null");
            return false;
        } else if (!this.f25879a.a0()) {
            f25878b.j("AppInstanceId is null");
            return false;
        } else if (!this.f25879a.b0()) {
            f25878b.j("ApplicationProcessState is null");
            return false;
        } else if (this.f25879a.Z()) {
            if (!this.f25879a.W().V()) {
                f25878b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (!this.f25879a.W().W()) {
                f25878b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override // x9.e
    public boolean c() {
        if (!g()) {
            f25878b.j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
