package ad;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes4.dex */
public abstract class i2 extends g0 {
    @Override // ad.g0
    public g0 F0(int i10) {
        fd.o.a(i10);
        return this;
    }

    public abstract i2 I0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String J0() {
        i2 i2Var;
        i2 c10 = a1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            i2Var = c10.I0();
        } catch (UnsupportedOperationException unused) {
            i2Var = null;
        }
        if (this != i2Var) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // ad.g0
    public String toString() {
        String J0 = J0();
        if (J0 == null) {
            return o0.a(this) + '@' + o0.b(this);
        }
        return J0;
    }
}
