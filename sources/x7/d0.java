package x7;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class d0 implements f0, b0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f25835c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile f0 f25836a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f25837b = f25835c;

    private d0(f0 f0Var) {
        this.f25836a = f0Var;
    }

    public static b0 a(f0 f0Var) {
        if (f0Var instanceof b0) {
            return (b0) f0Var;
        }
        f0Var.getClass();
        return new d0(f0Var);
    }

    public static f0 b(f0 f0Var) {
        f0Var.getClass();
        if (f0Var instanceof d0) {
            return f0Var;
        }
        return new d0(f0Var);
    }

    @Override // x7.f0
    public final Object zza() {
        Object obj = this.f25837b;
        Object obj2 = f25835c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f25837b;
                if (obj == obj2) {
                    obj = this.f25836a.zza();
                    Object obj3 = this.f25837b;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f25837b = obj;
                    this.f25836a = null;
                }
            }
        }
        return obj;
    }
}
