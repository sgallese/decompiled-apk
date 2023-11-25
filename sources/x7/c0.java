package x7;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class c0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private f0 f25834a;

    public static void a(f0 f0Var, f0 f0Var2) {
        c0 c0Var = (c0) f0Var;
        if (c0Var.f25834a == null) {
            c0Var.f25834a = f0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // x7.f0
    public final Object zza() {
        f0 f0Var = this.f25834a;
        if (f0Var != null) {
            return f0Var.zza();
        }
        throw new IllegalStateException();
    }
}
